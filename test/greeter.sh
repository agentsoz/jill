#!/bin/bash

DIR=`dirname "$0"`

CP=${DIR}/../jill/target/jill-0.3.3-SNAPSHOT-jar-with-dependencies.jar:${DIR}/../examples/target/jill-examples-0.3.3-SNAPSHOT.jar

# Connect the BDI system
CMD="java -cp ${CP} io.github.agentsoz.jill.Main --help"
echo $CMD; $CMD

a=10000
b=5
ID=greeter-${a}a-${b}b
echo ""
echo "Running $a agents with $b neighbours each (see ${ID}.*)"
CFG='"{
programOutputFile : \"'${DIR}'/'${ID}'.out\",
logFile : \"'${DIR}'/'${ID}'.log\",
logLevel : \"INFO\",
agents:
 [
  {
   classname : io.github.agentsoz.jill.example.greeter.Greeter, 
   args : [-neighbourhoodSize, '$b'], 
   count: '$a'
  }
 ]
}"'
CMD="java -cp ${CP} io.github.agentsoz.jill.Main --plan-selection-policy FIRST --config $CFG" 
echo "Started at " `date`
echo $CMD; eval $CMD > ${DIR}/${ID}.out
echo "Finished at" `date`

a=50000
b=100
ID=greeter-${a}a-${b}b
echo ""
echo "Running $a agents with $b neighbours each (see ${ID}.*)"
CFG='"{
programOutputFile : \"'${DIR}'/'${ID}'.out\",
logFile : \"'${DIR}'/'${ID}'.log\",
logLevel : \"INFO\",
agents:
 [
  {
   classname : io.github.agentsoz.jill.example.greeter.Greeter, 
   args : [-neighbourhoodSize, '$b'], 
   count: '$a'
  }
 ]
}"'
CMD="java -cp ${CP} io.github.agentsoz.jill.Main --plan-selection-policy FIRST --config $CFG" 
echo "Started at " `date`
echo $CMD; eval $CMD > ${DIR}/${ID}.out
echo "Finished at" `date`

a=10000
b=500
ID=greeter-${a}a-${b}b
echo ""
echo "Running $a agents with $b neighbours each (see ${ID}.*)"
CFG='"{
programOutputFile : \"'${DIR}'/'${ID}'.out\",
logFile : \"'${DIR}'/'${ID}'.log\",
logLevel : \"INFO\",
agents:
 [
  {
   classname : io.github.agentsoz.jill.example.greeter.Greeter, 
   args : [-neighbourhoodSize, '$b'], 
   count: '$a'
  }
 ]
}"'
CMD="java -cp ${CP} io.github.agentsoz.jill.Main --plan-selection-policy FIRST --config $CFG" 
echo "Started at " `date`
echo $CMD; eval $CMD > ${DIR}/${ID}.out
echo "Finished at" `date`

