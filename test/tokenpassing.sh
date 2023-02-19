#!/bin/bash

dir=$(dirname "$0")

function runit() {
  CMD="$dir/../mvnw exec:exec
    -pl examples
    -Dexec.executable=java
    -Dexec.classpathScope=test
    -Dexec.args=\"
      -Xmx12g -Xms12g
      -cp %classpath io.github.agentsoz.jill.Main
      --config
        \\\"{
          programOutputFile : '../test/${ID}.out',
          logFile : '../test/${ID}.log',
          logLevel : INFO,
          randomSeed : 123456,
          agents:
           [
            {
              classname : io.github.agentsoz.jill.example.tokenpassing.TokenAgent$v,
              args : [-rounds, $r],
             count: $a
            }
           ]
        }\\\"
    \""
    echo -e "\nRunning token passing version $v between $a agents for $r rounds (see ${ID}.*)\n"
    echo $CMD; eval $CMD
}


a=10000
r=100
v=1
ID=tokenpassing${v}-${a}a-${r}r
runit

v=2
ID=tokenpassing${v}-${a}a-${r}r
runit

a=100
r=5000
v=1
ID=tokenpassing${v}-${a}a-${r}r
runit

v=2
ID=tokenpassing${v}-${a}a-${r}r
runit
