export JAVA_HOME=~/Library/Java/JavaVirtualMachines/corretto-17.0.8.1/Contents/Home
echo $JAVA_HOME
mvn -DskipTests clean package -U -s ~/.m2/settings-read.xml

#zip -rj target/lib.zip target/lib/


#mvn  -v
