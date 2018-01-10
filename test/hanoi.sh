#!/bin/bash

DISCS=18

CMD="mvn exec:exec
  -pl examples
  -Dexec.executable=java
  -Dexec.classpathScope=test
  -Dexec.args=\"
    -Xmx4g -Xms4g
    -cp %classpath io.github.agentsoz.jill.Main
    --config
      \\\"{
        programOutputFile : '../test/hanoi.out',
        logFile : '../test/hanoi.log',
        logLevel : INFO,
        randomSeed : 123456,
        agents:
         [
          {
           classname : io.github.agentsoz.jill.example.hanoi.Player,
           args : [-discs, ${DISCS}],
           count: 1
          }
         ]
      }\\\"
  \""

echo $CMD; eval $CMD

MOVES=$(grep Moving test/hanoi.out | wc -l | tr -d '\n')
echo -e "\nSolved Towers of Hanoi with ${DISCS} discs in ${MOVES} moves\n"
