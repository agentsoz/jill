#!/bin/bash

DIR=`dirname "$0"`

CP=${DIR}/../jill/target/jill-0.0.1-SNAPSHOT-jar-with-dependencies.jar:${DIR}/../examples/target/jill-examples-0.0.1-SNAPSHOT.jar:

CMD="java -cp ${CP} agentsoz.jill.Main -h"
echo $CMD; eval $CMD

DISCS=9
OUTFILE=${DIR}/hanoi.out
echo ""
echo "Solving Towers of Hanoi with ${DISCS} discs (see ${OUTFILE})"
CMD="java -cp ${CP} agentsoz.jill.Main --agent-class agentsoz.jill.example.hanoi.Player --logfile ${DIR}/hanoi.log --debug-level WARN --program-args \"-discs ${DISCS}\" --num-agents 1 --outfile ${OUTFILE}" 
echo "Started at " `date`
echo $CMD; eval $CMD
echo "Finished at" `date`

