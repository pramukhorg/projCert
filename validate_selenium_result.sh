cd /root/eduproject/projCert

export result=`grep -i success output.txtbkp | wc -l`

if [ $result -eq 1 ]
then
   echo "Selenium test successful"
else
   echo "Selenium test failed stopping and deleting container"
   /usr/bin/docker stop $(docker ps -a -q)
   /usr/bin/docker rm $(docker ps -a -q) --force
fi
rm -f output.txtbkp
mv output.txt output.txtbkp
