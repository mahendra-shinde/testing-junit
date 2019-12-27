Ubuntu :

### Update the application packages
sudo apt update -y

### Install Docker 
sudo apt install docker.io -y

### Allow CURRENT USER to access Docker CLI
sudo usermod -aG docker $USER

## pull tomcat:8 container image (Which contains JDK & Tomcat both!!)
docker pull tomcat:8

## create a new container with name tc1
docker run --name tc1 -d tomcat:8

## Get the IP Address of tc1
docker inspect tc1

## Use IP Address in web browser!
http://172.17.0.2:8080

## Stop the Container?
docker stop tc1

## Remove the container (Should be STOPPED)
docker rm tc1 