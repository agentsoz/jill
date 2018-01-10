#!/bin/bash

function runit() {
  CMD="mvn exec:exec
    -pl examples
    -Dexec.executable=java
    -Dexec.classpathScope=test
    -Dexec.args=\"
      -Xmx4g -Xms4g
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
b=5
ID=greeter-${a}a-${b}b
runit

a=50000
b=100
ID=greeter-${a}a-${b}b
runit

a=10000
b=500
ID=greeter-${a}a-${b}b
runit
