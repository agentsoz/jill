#!/bin/bash

a=1000000

CMD="mvn exec:exec
  -pl jill
  -Dexec.executable=java
  -Dexec.classpathScope=test
  -Dexec.args=\"
    -Xmx4g -Xms4g
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
