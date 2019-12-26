## Setup Jenkins

1. Download Jenkins WAR file from http://mirrors.jenkins.io/war-stable/latest/jenkins.war

2. Run the downloaded WAR file from command prompt

    ```bash
    $ cd Downloads/
    $ java -jar jenkins.war
    ```

3.  Open WEB Browser and URL http://localhost:8080. Jenkins would prompt you 
    to enter ONE TIME PASSWORD.
    Use Command prompt from Step#2 to copy the initial password.
    Paste the password in text field and click "Continue"

4.  Now, Jenkins would give you TWO options for Plugin Installation:
    4.1  Install Suggested (NOt now! it's time consuming)
    4.2  Select Plugins to Install (Choose This)

5.  In Plug Selection screen use button/link "None" to deselect all plugins.
    Then click "Install" button.

6.  Create a new Admin user (provide username, password and email)

7.  To stop jenkins, go back to terminal/command prompt from step#2 
    and press CTRL+C to stop jenkins.

8.  To Start again, repeate the command from step#2.

