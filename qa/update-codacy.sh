#!/usr/bin/env bash

DIR=$(dirname "$0")

CMD="cd $DIR/../jill && mvn com.gavinmogan:codacy-maven-plugin:coverage -DcoverageReportFile=target/site/jacoco/jacoco.xml -DprojectToken=73e9a6917cbd4774a588aedf6ca55e93 -DapiToken=73e9a6917cbd4774a588aedf6ca55e93"
echo $CMD
eval $CMD
