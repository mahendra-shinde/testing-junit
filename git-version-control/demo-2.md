## Link existing local repository with new remote repository

1.  Create a new PUBLIC/PRIVATE repository on GitHub.com
2.  On next screen, GitHub will provide follwing commands to link with local repository:

    ```bash
    $ git remote add origin https://github.com/mahendra-shinde/website1.git
    $ git push -u origin master
    $ git push origin dev
    ```

3.  Goto GitHub.com, open your repository, edit `index.html` file.

4.  Go back to your Git Bash terminal, run command:

    ```bash
    $ git pull origin master
    $ git pull origin dev
    ```

    