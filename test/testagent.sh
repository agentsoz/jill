#!/bin/bash

dir=$(dirname "$0")

a=10000000

CMD="$dir/../mvnw exec:exec
  -pl jill
  -Dexec.executable=java
  -Dexec.classpathScope=test
  -Dexec.args=\"
    -Xmx12g -Xms12g
    -cp %classpath io.github.agentsoz.jill.Main
    --config
      \\\"{
        programOutputFile : '../test/testagent-$a.out',
        logFile : '../test/testagent-$a.log',
        logLevel : INFO,
        randomSeed : 123456,
        agents:
         [
          {
           classname : io.github.agentsoz.jill.testprogram.TestAgent,
           args : [''],
           count: $a
          }
         ]
      }\\\"
  \""

echo $CMD; eval $CMD
