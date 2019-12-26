## Jenkins CI Demo1

1.   Start jenkins and access its dashboard from http://localhost:8080

2.  Login with your admin user account

3.  Click on "New Item" button, choose "Freestyle project", enter project name "test1" click OK button.

4.  Goto "Build Triggers" use option "Build Periodically"
    set schedule as "H/2 * * * *" as a schedule.
    NOTE: Schedule means Every 2 minutes in every hour, every day of month, every month and every weekday.

5.  Goto "Build" tab, and then choose "Execute Windows Batch Command" (On linux use "Execute Shell") then enter command:
    ```
    echo "Hello World"
    ```

6.  Click Save
7.  Just wait for 2 minutes, a build should automatically be triggered.