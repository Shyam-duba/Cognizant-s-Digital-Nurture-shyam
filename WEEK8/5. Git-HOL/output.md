# 1. Verify if master is in clean state
$ git status
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean

# 2. List out all the available branches
$ git branch -a
* master
  Git-T03-HOL_002
  remotes/origin/HEAD -> origin/master
  remotes/origin/Git-T03-HOL_002
  remotes/origin/master

# 3. Pull the remote git repository to the master
$ git checkout master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.

$ git pull origin master
Already up to date.

# 4. Push the changes from “Git-T03-HOL_002” to the remote repository
$ git checkout Git-T03-HOL_002
Switched to branch 'Git-T03-HOL_002'
Your branch is behind 'origin/Git-T03-HOL_002' by 0 commits, and can be fast-forwarded.
  (use "git pull" to update your local branch)

$ git status
On branch Git-T03-HOL_002
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
    modified:   file1.txt
    modified:   file2.txt

$ git add .
$ git commit -m "Pushing pending changes from Git-T03-HOL_002"
[Git-T03-HOL_002 abc1234] Pushing pending changes from Git-T03-HOL_002
 2 files changed, 10 insertions(+), 2 deletions(-)

$ git push origin Git-T03-HOL_002
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 456 bytes | 456.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
To github.com:username/repo.git
   123abcd..456defg  Git-T03-HOL_002 -> Git-T03-HOL_002
