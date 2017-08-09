#!/usr/bin/env bash

DIR=$(dirname "$0")

CMD="cd $DIR/.. && mvn -N com.gavinmogan:codacy-maven-plugin:coverage -DcoverageReportFile=target/coverage-reports/jacoco/jacoco.xml -DprojectToken=884cdc9110044d2e9efd91854ead6c82 -DapiToken=884cdc9110044d2e9efd91854ead6c82"
echo $CMD
eval $CMD
