#!/bin/bash

DIR=`dirname "$0"`

CP=${DIR}/../jill/target/jill-0.3.2-jar-with-dependencies.jar:${DIR}/../examples/target/jill-examples-0.3.2.jar:${DIR}/../jill/target/test-classes

CMD="java -cp ${CP} io.github.agentsoz.jill.Main --help"
echo $CMD; eval $CMD

a=1000000
CFG='"{
programOutputFile : \"'${DIR}'/testagent-'$a'.out\",
logFile : \"'${DIR}'/testagent-'$a'.log\",
logLevel : \"INFO\",
randomSeed : \"123456\",
agents:
 [
  {
   classname : io.github.agentsoz.jill.testprogram.TestAgent, 
   args : [\"\"], 
   count: '$a'
  }
 ]
}"'
#CMD="java -Xmx2g -Xms2g -cp ${CP} io.github.agentsoz.jill.Main --agent-class io.github.agentsoz.jill.testprogram.TestAgent --logfile ${DIR}/testagent-$a.log --outfile ${DIR}/testagent-$a.out --debug-level INFO --num-agents $a"
CMD="java -Xmx2g -Xms2g -cp ${CP} io.github.agentsoz.jill.Main --config $CFG" 
echo "Started at " `date`
echo $CMD; eval $CMD > /dev/null
echo "Finished at" `date`

