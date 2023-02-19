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
              classname : io.github.agentsoz.jill.example.greeter.Greeter,
              args : [-neighbourhoodSize, $b, -seed, 123456],
             count: $a
            }
           ]
        }\\\"
    \""
    echo -e "\nRunning $a agents with $b neighbours each (see ${ID}.*)\n"
    echo $CMD; eval $CMD
}

a=10000
b=10
ID=greeter-${a}a-${b}b
runit

a=50000
b=50
ID=greeter-${a}a-${b}b
runit

a=100000
b=100
ID=greeter-${a}a-${b}b
runit
