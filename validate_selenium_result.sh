export CLASSPATH=".:selenium-server-standalone-3.13.0.jar:testng-6.8.7.jar"

cd /root/eduproject/projCert

export result=`grep -i success output.txt | wc -l`

if [ $result == 1 ]
then
   echo "Selenium test successful"
else
   echo "Selenium test failed stopping and deleting container"
   /usr/bin/docker stop $(docker ps -a -q)
   /usr/bin/docker rm $(docker ps -a -q) --force
fi
