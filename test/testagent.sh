#!/bin/bash

DIR=`dirname "$0"`

CP=${DIR}/../jill/target/jill-0.0.1-SNAPSHOT-jar-with-dependencies.jar:${DIR}/../examples/target/jill-examples-0.0.1-SNAPSHOT.jar:${DIR}/../jill/target/test-classes

CMD="java -cp ${CP} agentsoz.jill.Main -h"
echo $CMD; eval $CMD

a=1000000
CMD="java -Xmx2g -Xms2g -cp ${CP} agentsoz.jill.Main --agent-class agentsoz.jill.testprogram.TestAgent --logfile ${DIR}/testagent-$a.log --outfile ${DIR}/testagent-$a.out --debug-level INFO --num-agents $a" 
echo "Started at " `date`
echo $CMD; eval $CMD > /dev/null
echo "Finished at" `date`

