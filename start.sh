#!/bin/bash
#cd /home/ec2-user/app
#nohup java -jar bloggerator.jar > /var/log/bloggerator.log 2>&1 &
#./gradlew bootRun
sudo systemctl start bloggerator.service