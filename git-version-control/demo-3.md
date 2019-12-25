### Clone the existing REMOTE repository 

1.  Login in GitHub.com and create new private repository
    `my-java-app`
    Make sure, you have selected `ReadMe` file.
2.  Open Git bash, and try following command:

    ```
    $ git clone https://github.com/mahendra-shinde/my-java-app.git
    $ cd my-java-app
    $ vi Readme.md
    #### Make some changes, save and close file
    $ git add .
    $ git commit -m "First Commit"  
    $ git status
    $ git push
    ```

3.  Launch eclipse with a new workspace `c:\git-ws` 

4.  Goto Window Menu -> Show View -> Others -> Git/Git Repositories View

5.  In `Git Repositories` view, use FIRST link `Add an existing local repository` and use location `c:\my-repos\my-java-app`

6.  Create a new maven project with `Application.java`

    ```java
    public class Application {

        public static void main(String[] args) {
            System.out.println("Hello WOrld");
            System.out.println("Hello India");
        }

    }
    ```

7.  Right click on projectname (Project/Package Explorer) > Team > Share project

8.  Choose local repository from drop down (step #5) and click OK/Finish.

9.  ProjectName > Team > Commit & Push, save all files, add all files to index and then put commit message and then click "Commit & Push" 

10. Check the repository in web browser.    