#!/bin/bash

DIR=`dirname "$0"`

OUTDIR=${DIR}/tokenpassing-results
mkdir -p ${OUTDIR}

CP=${DIR}/../jill/target/jill-0.3.1-SNAPSHOT-jar-with-dependencies.jar:${DIR}/../examples/target/jill-examples-0.3.1-SNAPSHOT.jar

CMD="java -cp ${CP} io.github.agentsoz.jill.Main --help"
echo $CMD; $CMD

a=10000
r=100
v=1
ID=tokenpassing${v}-${a}a-${r}r
echo ""
echo "Running token passing version $v between $a agents for $r rounds (see ${ID}.*)"
CFG='"{
programOutputFile : \"'${OUTDIR}'/'${ID}'.out\",
logFile : \"'${OUTDIR}'/'${ID}'.log\",
logLevel : \"INFO\",
agents:
 [
  {
   classname : io.github.agentsoz.jill.example.tokenpassing.TokenAgent'$v', 
   args : [-rounds, '$r'], 
   count: '$a'
  }
 ]
}"'
CMD="java -cp ${CP} io.github.agentsoz.jill.Main --config $CFG" 
echo "Started at " `date`
echo $CMD; eval $CMD > /dev/null
echo "Finished at" `date`

v=2
ID=tokenpassing${v}-${a}a-${r}r
echo ""
echo "Running token passing version $v between $a agents for $r rounds (see ${ID}.*)"
CFG='"{
programOutputFile : \"'${OUTDIR}'/'${ID}'.out\",
logFile : \"'${OUTDIR}'/'${ID}'.log\",
logLevel : \"INFO\",
agents:
 [
  {
   classname : io.github.agentsoz.jill.example.tokenpassing.TokenAgent'$v', 
   args : [-rounds, '$r'], 
   count: '$a'
  }
 ]
}"'
CMD="java -cp ${CP} io.github.agentsoz.jill.Main --config $CFG" 
echo "Started at " `date`
echo $CMD; eval $CMD > /dev/null
echo "Finished at" `date`


a=100
r=5000
v=1
ID=tokenpassing${v}-${a}a-${r}r
echo ""
echo "Running token passing version $v between $a agents for $r rounds (see ${ID}.*)"
CFG='"{
programOutputFile : \"'${OUTDIR}'/'${ID}'.out\",
logFile : \"'${OUTDIR}'/'${ID}'.log\",
logLevel : \"INFO\",
agents:
 [
  {
   classname : io.github.agentsoz.jill.example.tokenpassing.TokenAgent'$v', 
   args : [-rounds, '$r'], 
   count: '$a'
  }
 ]
}"'
CMD="java -cp ${CP} io.github.agentsoz.jill.Main --config $CFG" 
echo "Started at " `date`
echo $CMD; eval $CMD > /dev/null
echo "Finished at" `date`

v=2
ID=tokenpassing${v}-${a}a-${r}r
echo ""
echo "Running token passing version $v between $a agents for $r rounds (see ${ID}.*)"
CFG='"{
programOutputFile : \"'${OUTDIR}'/'${ID}'.out\",
logFile : \"'${OUTDIR}'/'${ID}'.log\",
logLevel : \"INFO\",
agents:
 [
  {
   classname : io.github.agentsoz.jill.example.tokenpassing.TokenAgent'$v', 
   args : [-rounds, '$r'], 
   count: '$a'
  }
 ]
}"'
CMD="java -cp ${CP} io.github.agentsoz.jill.Main --config $CFG" 
echo "Started at " `date`
echo $CMD; eval $CMD > /dev/null
echo "Finished at" `date`

