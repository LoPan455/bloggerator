#!/bin/bash
cd /home/ec2-user/app/build/libs
java -jar bloggerator.jar > /dev/null 2> /dev/null < /dev/null &