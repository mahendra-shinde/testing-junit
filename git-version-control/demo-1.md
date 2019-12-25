## Git Local repository demo 1

1.  Open Git Bash and create a new empty local repository

    ```bash
    $ cd /c/
    $ mkdir my-repos/
    $ cd my-repos
    $ git init website1
    ```

2.  Create one HTML file with name `index.html`

    ```bash
    $ cd /c/my-repos/website1
    $ code index.html
    ```

3.  Save the changes to file and add file to STAGE and then COMMIT

    ```bash
    $ git status
    ### GIT Should report filename `index.html` in RED
    ## Add file to STAGE/INDEX
    $ git add index.html
    $ git status
    ## Git should report filename in GREEN 
    $ git commit -m "First commit"
    $ git status
    ## Git should report `Nothing to commit`
    ```

4.  Try creating a seperate branch `dev` to implement CSS

    ```bash
    $ cd /c/my-repos/website1/
    $ git checkout -b dev
    $ git status
    ```

5.  Modify the file `index.html` (add some CSS) and save the changes.
    Then try to commit changes

    ```bash
    $ git add index.html
    $ git commit -m "CSS"
    $ git status
    $ git log
    ```

6.  Switch between master & dev branches and view the changes in file.

    ```bash
    $ cat index.html
    $ git checkout master
    $ cat index.html
    $ git checkout dev
    $ cat index.html
    ```