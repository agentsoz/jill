#!/bin/bash

TEST=SimpleAgent
BIN=${TEST}.bin
rm -rf ${BIN}; mkdir ${BIN}
javac -source 1.7 -target 1.7 -cp ../mocabdi.jar -d ./${BIN} SimpleAgent/*.java
java -Xms1g -Xmx1g -cp ../mocabdi.jar:${BIN} mocabdi.Main -d INFO -l ${TEST}.log -c SimpleAgent.TestAgent -n 1000000 -i 20
rm -rf ${BIN}
