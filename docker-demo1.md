## Running & Debugging a container

1.  Connect to remote system which is running docker

    http://192.168.3.XXX:9090/

    Username: user1
    Password: pass@1234

    Click on "Terminal"

2.  Try running a new container with YOURNAME

    ```bash
    $ docker run -d -p 8080:80  --name mahendra-web nginx:alpine
    ```

    NOTE: The application (nginx) would now be accessible from 
    http://192.168.3.XXX:8080

3.  Try ENTERING inside the running container for debugging.

    ```bash
    $ docker exec -it mahendra-web sh
    $ top
    q   ##PRESS Q to Quit from TOP command
    $ cd /usr/share/nginx/html
    $ vi index.html
    ```

4.  Make changes and save the file.

5.  try revisiting http://192.168.3.XXX:8080 (You should get UPDATED index.html)

6.  Stop and delete the container

    ```bash
    $ docker stop mahendra-web 
    $ docker rm mahendra-web
    ```