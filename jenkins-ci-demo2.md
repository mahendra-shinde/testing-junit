## Build Maven/Java project on Jenkins

1. Launch the Jenkins dashboard
    1. Import bitnami-jenkins.ova file into VirtualBox
    2. Once import is complete (might take 10 mins), start the VM.
    3. The VM Screen should display URL, Username and Password for Login

2.  Open Web Browser and Use the URL, Username & Password to login into Jenkins 
    dashboard.

3.  Click on "New Item" and then enter the project name "japp1", 
    select project type "Freestyle project" and then click OK

4.  Goto "Source Code Management" tab and choose "GIT" 
    Use repository URL : https://github.com/mahendra-shinde/ci-servlet-demo.git

5.  Goto "Build Triggers" tab and set Build trigger "Poll SCM"
    Use schedule "H/2 * * * *" to ping git repository every 2 minutes.

6.  Goto "Build" tab and click on "Add build step" then choose "Build Top Level maven target"
    Choose maven version "M3" and goal "package"

7.  Click on "Save" button to save the project.

8.  To Test run the build by using button "Build Now"
