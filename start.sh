#!/bin/bash
cd /home/ec2-user/app
#java -jar bloggerator.jar > /dev/null 2> /dev/null < /dev/null &
./gradlew bootRun