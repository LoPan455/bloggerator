#!/bin/bash
cd /home/ec2-user/app/build/libs
nohup java -jar bloggerator.jar > /var/log/bloggerator.log 2>&1 &
#./gradlew bootRun