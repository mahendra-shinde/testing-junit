## Building your custom image


1.  Connect to remote system which is running docker

    http://192.168.3.XXX:9090/

    Username: user1
    Password: pass@1234

    Click on "Terminal"

2.  Create a new directory for your project

    ```bash
    $ mkdir -p mahendra\myapp
    $ cd mahendra\myapp
    $ vi index.html
    ### Contents
    <html>
    <body>
    <h1>hello world</h1>
    </body>
    </html>
    ## Save and close ESC : wq
    ```

3.  Create a dockerfile

    ```bash
    $ vi Dockerfile
    ### Contents
    FROM nginx:alpine
    COPY index.html /usr/share/nginx/html/
    ### Save and close ESC : wq
    ```

4.  Build an image

    ```bash
    $ docker build -t mahendraapp   . 
    ```

    NOTE: There is a SPACE between last DOT and Image name

5.  Test Run the container

    ```bash
    $ docker run -d -p 80 mahendraapp
    ## Docker would print container id here
    $ docker ps | grep <container-id>
    ## Docker would display PORT like 32768
    ```

6.  Try visiting web page using port printed by last command

    http://192.168.3.XXX:32768


7.  Stop and delete YOUR container

    ```bash
    $ docker stop <container-id>
    $ docker rm <container-id>
    ```