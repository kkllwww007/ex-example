#!/bin/sh

export JAVA_HOME=/root/jdk1.8.0_144
export MVN_HOME=/root/apache-maven-3.3.3
export PATH=$JAVA_HOME/bin:$MVN_HOME/bin:$PATH

mvn clean package -Dmaven.test.skip=true dockerfile:build

# mvn clean package -U -T 4 -B -Dmaven.test.skip=false