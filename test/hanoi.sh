#!/bin/bash

DIR=`dirname "$0"`

CP=${DIR}/../jill/target/jill-0.3.2-SNAPSHOT-jar-with-dependencies.jar:${DIR}/../examples/target/jill-examples-0.3.2-SNAPSHOT.jar

CMD="java -cp ${CP} io.github.agentsoz.jill.Main --help"
echo $CMD; eval $CMD

DISCS=15
OUTFILE=${DIR}/hanoi.out
echo ""
echo "Solving Towers of Hanoi with ${DISCS} discs (see ${OUTFILE})"

CFG='"{
programOutputFile : \"'${OUTFILE}'\",
logFile : \"'${DIR}'/hanoi.log\",
logLevel : \"INFO\",
agents:
 [
  {
   classname : io.github.agentsoz.jill.example.hanoi.Player, 
   args : [-discs, '${DISCS}'], 
   count: 1
  }
 ]
}"'

CMD="java -cp ${CP} io.github.agentsoz.jill.Main --config $CFG" 
echo "Started at " `date`
echo $CMD; eval $CMD > /dev/null
echo "Finished at" `date`

