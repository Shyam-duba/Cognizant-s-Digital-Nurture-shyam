# 1. Verify if master is in clean state
$ git status
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean

# 2. Create branch GitWork
$ git checkout -b GitWork
Switched to a new branch 'GitWork'

$ echo "<message>Hello from GitWork</message>" > hello.xml
$ git status
Untracked files:
  (use "git add <file>..." to include in what will be committed)
    hello.xml

# 3. Update hello.xml
$ echo "<message>Hello updated in GitWork branch</message>" > hello.xml
$ git status
Changes not staged for commit:
  modified: hello.xml

# 4. Commit changes
$ git add hello.xml
$ git commit -m "Added and updated hello.xml in GitWork"
[GitWork abc1234] Added and updated hello.xml in GitWork
 1 file changed, 1 insertion(+)

# 5. Switch to master
$ git checkout master
Switched to branch 'master'

# 6. Add hello.xml to master
$ echo "<message>Hello from Master</message>" > hello.xml
$ git status
Untracked files:
  hello.xml

# 7. Commit changes
$ git add hello.xml
$ git commit -m "Added hello.xml in master with different content"
[master def5678] Added hello.xml in master with different content
 1 file changed, 1 insertion(+)

# 8. Git log
$ git log --oneline --graph --decorate --all
* abc1234 (GitWork) Added and updated hello.xml in GitWork
| * def5678 (HEAD -> master) Added hello.xml in master with different content
|/

# 9. Git diff
$ git diff GitWork
diff --git a/hello.xml b/hello.xml
index 123abcd..456defg 100644
--- a/hello.xml
+++ b/hello.xml
@@ -1 +1 @@
-<message>Hello from GitWork</message>
+<message>Hello from Master</message>

# 10. P4Merge visualization
$ git difftool -t p4merge master GitWork
# (P4Merge UI opens)

# 11. Merge branch
$ git merge GitWork
Auto-merging hello.xml
CONFLICT (content): Merge conflict in hello.xml
Automatic merge failed; fix conflicts and commit the result.

# 12. Conflict markers
<<<<<<< HEAD
<message>Hello from Master</message>
=======
<message>Hello updated in GitWork branch</message>
>>>>>>> GitWork

# 13. Resolve with P4Merge
$ git mergetool -t p4merge
# (P4Merge 3-way merge UI opens)

# 14. Commit after resolving
$ git add hello.xml
$ git commit -m "Merged GitWork into master and resolved conflict"

# 15. Status & add .gitignore
$ git status
On branch master
nothing to commit, working tree clean

$ echo "*.bak" >> .gitignore

# 16. Commit .gitignore
$ git add .gitignore
$ git commit -m "Added backup file pattern to .gitignore"

# 17. List branches
$ git branch -a
* master
  remotes/origin/master
  remotes/origin/GitWork

# 18. Delete branch
$ git branch -d GitWork
Deleted branch GitWork (was abc1234).

# 19. Final log
$ git log --oneline --graph --decorate
* 789xyz1 (HEAD -> master) Added backup file pattern to .gitignore
* 456lmno Merged GitWork into master and resolved conflict
* def5678 Added hello.xml in master with different content
| * abc1234 Added and updated hello.xml in GitWork
|/
