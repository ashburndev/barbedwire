# barbedwire

```
show databases;
create database development_barbedwire;
create database test_barbedwire;
create database production_barbedwire;
create database barbedwire_development;
create database barbedwire_test;
create database barbedwire_production;
show databases;

CREATE USER 'barbedwire'@'localhost' IDENTIFIED BY 'emeraldtortoise';
GRANT ALL ON development_barbedwire.* TO 'barbedwire'@'localhost' WITH GRANT OPTION;
GRANT ALL ON test_barbedwire.*        TO 'barbedwire'@'localhost' WITH GRANT OPTION;
GRANT ALL ON production_barbedwire.*  TO 'barbedwire'@'localhost' WITH GRANT OPTION;
GRANT ALL ON barbedwire_development.* TO 'barbedwire'@'localhost' WITH GRANT OPTION;
GRANT ALL ON barbedwire_test.*        TO 'barbedwire'@'localhost' WITH GRANT OPTION;
GRANT ALL ON barbedwire_production.*  TO 'barbedwire'@'localhost' WITH GRANT OPTION;
SHOW GRANTS FOR 'barbedwire'@'localhost';
```

```
mysql> show databases;
+------------------------+
| Database               |
+------------------------+
| barbedwire_development |
| barbedwire_production  |
| barbedwire_test        |
| development_barbedwire |
| information_schema     |
| inspire                |
| menagerie              |
| mysql                  |
| performance_schema     |
| production_barbedwire  |
| sys                    |
| test_barbedwire        |
+------------------------+
12 rows in set (0.00 sec)

mysql>
mysql> SHOW GRANTS FOR 'barbedwire'@'localhost';
+--------------------------------------------------------------------------------------------------+
| Grants for barbedwire@localhost                                                                  |
+--------------------------------------------------------------------------------------------------+
| GRANT USAGE ON *.* TO `barbedwire`@`localhost`                                                   |
| GRANT ALL PRIVILEGES ON `barbedwire_development`.* TO `barbedwire`@`localhost` WITH GRANT OPTION |
| GRANT ALL PRIVILEGES ON `barbedwire_production`.* TO `barbedwire`@`localhost` WITH GRANT OPTION  |
| GRANT ALL PRIVILEGES ON `barbedwire_test`.* TO `barbedwire`@`localhost` WITH GRANT OPTION        |
| GRANT ALL PRIVILEGES ON `development_barbedwire`.* TO `barbedwire`@`localhost` WITH GRANT OPTION |
| GRANT ALL PRIVILEGES ON `production_barbedwire`.* TO `barbedwire`@`localhost` WITH GRANT OPTION  |
| GRANT ALL PRIVILEGES ON `test_barbedwire`.* TO `barbedwire`@`localhost` WITH GRANT OPTION        |
+--------------------------------------------------------------------------------------------------+
7 rows in set (0.00 sec)

mysql>

C:\Users\David Holberton>mysql -u root -p
Enter password: *******
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 15
Server version: 8.0.26 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+------------------------+
| Database               |
+------------------------+
| barbedwire_development |
| barbedwire_production  |
| barbedwire_test        |
| development_barbedwire |
| information_schema     |
| inspire                |
| menagerie              |
| mysql                  |
| performance_schema     |
| production_barbedwire  |
| sys                    |
| test_barbedwire        |
+------------------------+
12 rows in set (0.00 sec)

mysql> use barbedwire_production;
Database changed
mysql> show tables;
+---------------------------------+
| Tables_in_barbedwire_production |
+---------------------------------+
| comment                         |
| document                        |
+---------------------------------+
2 rows in set (0.00 sec)

mysql> select * from document;
+----+---------+---------------+-------------+
| id | version | summary       | title       |
+----+---------+---------------+-------------+
|  1 |       0 | doc 1 summary | doc 1 title |
+----+---------+---------------+-------------+
1 row in set (0.00 sec)

mysql> select * from comment;
+----+---------+-----------------+-------------+
| id | version | body            | document_id |
+----+---------+-----------------+-------------+
|  1 |       0 | doc 1 comment 1 |           1 |
|  2 |       0 | doc 1 comment 2 |           1 |
+----+---------+-----------------+-------------+
2 rows in set (0.00 sec)

mysql>
mysql> desc document;
+---------+--------------+------+-----+---------+----------------+
| Field   | Type         | Null | Key | Default | Extra          |
+---------+--------------+------+-----+---------+----------------+
| id      | bigint       | NO   | PRI | NULL    | auto_increment |
| version | bigint       | NO   |     | NULL    |                |
| summary | varchar(255) | NO   |     | NULL    |                |
| title   | varchar(255) | NO   |     | NULL    |                |
+---------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> desc comment;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| id          | bigint       | NO   | PRI | NULL    | auto_increment |
| version     | bigint       | NO   |     | NULL    |                |
| body        | varchar(255) | NO   |     | NULL    |                |
| document_id | bigint       | NO   | MUL | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql>

C:\Users\David Holberton>mysqldump
Usage: mysqldump [OPTIONS] database [tables]
OR     mysqldump [OPTIONS] --databases [OPTIONS] DB1 [DB2 DB3...]
OR     mysqldump [OPTIONS] --all-databases [OPTIONS]
For more options, use mysqldump --help

C:\Users\David Holberton>mysqldump barbedwire_production > barbedwire-production-20220412.sql
mysqldump: Got error: 1045: Access denied for user 'ODBC'@'localhost' (using password: NO) when trying to connect

C:\Users\David Holberton>mysqldump -u root -p barbedwire_production > barbedwire-production-20220412.sql
Enter password: *******

C:\Users\David Holberton>
```

```
grails create-app barbedwire
cd barbedwire
dir /o:gd
tree /a
notepad .gitinit
git init
git add .
git commit -a -m "first commit"
git status
grails create-domain-class Document
grails create-domain-class Comment
code .
type grails-app\domain\barbedwire\Document.groovy
type grails-app\domain\barbedwire\Comment.groovy
grails generate-all barbedwire.Document
grails generate-all barbedwire.Comment
REM changes to use MySQL instead of H2
copy grails-app\conf\DataSource.groovy grails-app\conf\DataSource.groovy.orig
copy grails-app\conf\BuildConfig.groovy grails-app\conf\BuildConfig.groovy.orig
copy grails-app\conf\Config.groovy grails-app\conf\Config.groovy.orig
git status
git add .
git commit -a -m "changes to use MySQL instead of H2"
grails war target\barbedwire.war
dir /o:gd target
copy target\barbedwire.war C:\LocalApps\apache-tomcat-8.5.61\webapps
mysqldump -u root -p barbedwire_production > barbedwire-production-20220412.sql

…or push an existing repository from the command line [SSH]

git remote add origin git@github.com:ashburndev/barbedwire.git
git branch -M main
git push -u origin main

…or push an existing repository from the command line [HTTPS]

git remote add origin https://github.com/ashburndev/barbedwire.git
git branch -M main
git push -u origin main
```

```
C:\Users\David Holberton\myprojs\barbedwire>
C:\Users\David Holberton\myprojs\barbedwire>dir /o:gd
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\Users\David Holberton\myprojs\barbedwire

04/12/2022  06:04 AM    <DIR>          src
04/12/2022  06:04 AM    <DIR>          test
04/12/2022  06:04 AM    <DIR>          scripts
04/12/2022  06:04 AM    <DIR>          lib
04/12/2022  06:04 AM    <DIR>          web-app
04/12/2022  06:04 AM    <DIR>          grails-app
04/12/2022  06:04 AM    <DIR>          wrapper
04/12/2022  06:04 AM    <DIR>          .
04/12/2022  06:04 AM    <DIR>          ..
04/12/2022  06:04 AM             1,003 .classpath
04/12/2022  06:04 AM               483 .project
04/12/2022  06:04 AM               118 application.properties
04/12/2022  06:04 AM             9,604 grailsw
04/12/2022  06:04 AM             5,972 grailsw.bat
               5 File(s)         17,180 bytes
               9 Dir(s)  126,978,228,224 bytes free

C:\Users\David Holberton\myprojs\barbedwire>
C:\Users\David Holberton\myprojs\barbedwire>tree /a
Folder PATH listing
Volume serial number is 4603-A8D3
C:.
+---grails-app
|   +---assets
|   |   +---images
|   |   |   \---skin
|   |   +---javascripts
|   |   \---stylesheets
|   +---conf
|   |   +---hibernate
|   |   \---spring
|   +---controllers
|   +---domain
|   +---i18n
|   +---services
|   +---taglib
|   +---utils
|   \---views
|       \---layouts
+---lib
+---scripts
+---src
|   +---groovy
|   \---java
+---test
|   +---integration
|   \---unit
+---web-app
|   +---css
|   +---images
|   +---js
|   +---META-INF
|   \---WEB-INF
|       \---tld
\---wrapper

C:\Users\David Holberton\myprojs\barbedwire>
C:\Users\David Holberton\myprojs\barbedwire>type grails-app\domain\barbedwire\Document.groovy
package barbedwire
class Document {
    String title
    String summary
    static hasMany = [comments:Comment]
    static constraints = {
    }
}

C:\Users\David Holberton\myprojs\barbedwire>type grails-app\domain\barbedwire\Comment.groovy
package barbedwire
class Comment {
    String body
    static belongsTo = [document:Document]
    static constraints = {
    }
}

C:\Users\David Holberton\myprojs\barbedwire>

C:\Users\David Holberton\myprojs\barbedwire>git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   grails-app/conf/BuildConfig.groovy
        modified:   grails-app/conf/DataSource.groovy

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        grails-app/conf/BuildConfig.groovy.orig
        grails-app/conf/Config.groovy.orig
        grails-app/conf/DataSource.groovy.orig
        grails-app/controllers/
        grails-app/domain/
        grails-app/views/comment/
        grails-app/views/document/
        test/
        web-app/WEB-INF/tld/c.tld
        web-app/WEB-INF/tld/fmt.tld

no changes added to commit (use "git add" and/or "git commit -a")

C:\Users\David Holberton\myprojs\barbedwire>git add .
warning: LF will be replaced by CRLF in grails-app/conf/BuildConfig.groovy.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/conf/DataSource.groovy.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/conf/BuildConfig.groovy.orig.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/conf/Config.groovy.orig.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/conf/DataSource.groovy.orig.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/controllers/barbedwire/CommentController.groovy.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/controllers/barbedwire/DocumentController.groovy.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/comment/_form.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/comment/create.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/comment/edit.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/comment/index.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/comment/show.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/document/_form.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/document/create.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/document/edit.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/document/index.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in grails-app/views/document/show.gsp.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in test/unit/barbedwire/CommentControllerSpec.groovy.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in test/unit/barbedwire/DocumentControllerSpec.groovy.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in web-app/WEB-INF/tld/c.tld.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in web-app/WEB-INF/tld/fmt.tld.
The file will have its original line endings in your working directory

C:\Users\David Holberton\myprojs\barbedwire>git commit -a -m "changes to use MySQL instead of H2"
[main a1f6f06] changes to use MySQL instead of H2
 25 files changed, 2561 insertions(+), 28 deletions(-)
 create mode 100644 grails-app/conf/BuildConfig.groovy.orig
 create mode 100644 grails-app/conf/Config.groovy.orig
 create mode 100644 grails-app/conf/DataSource.groovy.orig
 create mode 100644 grails-app/controllers/barbedwire/CommentController.groovy
 create mode 100644 grails-app/controllers/barbedwire/DocumentController.groovy
 create mode 100644 grails-app/domain/barbedwire/Comment.groovy
 create mode 100644 grails-app/domain/barbedwire/Document.groovy
 create mode 100644 grails-app/views/comment/_form.gsp
 create mode 100644 grails-app/views/comment/create.gsp
 create mode 100644 grails-app/views/comment/edit.gsp
 create mode 100644 grails-app/views/comment/index.gsp
 create mode 100644 grails-app/views/comment/show.gsp
 create mode 100644 grails-app/views/document/_form.gsp
 create mode 100644 grails-app/views/document/create.gsp
 create mode 100644 grails-app/views/document/edit.gsp
 create mode 100644 grails-app/views/document/index.gsp
 create mode 100644 grails-app/views/document/show.gsp
 create mode 100644 test/unit/barbedwire/CommentControllerSpec.groovy
 create mode 100644 test/unit/barbedwire/CommentSpec.groovy
 create mode 100644 test/unit/barbedwire/DocumentControllerSpec.groovy
 create mode 100644 test/unit/barbedwire/DocumentSpec.groovy
 create mode 100644 web-app/WEB-INF/tld/c.tld
 create mode 100644 web-app/WEB-INF/tld/fmt.tld

C:\Users\David Holberton\myprojs\barbedwire>
C:\Users\David Holberton\myprojs\barbedwire>dir /o:gd target
 Volume in drive C has no label.
 Volume Serial Number is 4603-A8D3

 Directory of C:\Users\David Holberton\myprojs\barbedwire\target

04/12/2022  06:15 AM    <DIR>          eclipseclasses
04/12/2022  06:17 AM    <DIR>          assets
04/12/2022  06:17 AM    <DIR>          ..
04/12/2022  06:17 AM    <DIR>          .
04/12/2022  06:26 AM    <DIR>          classes
04/12/2022  06:26 AM    <DIR>          work
04/12/2022  06:12 AM                 0 stacktrace.log
04/12/2022  06:26 AM        53,280,486 barbedwire.war
               2 File(s)     53,280,486 bytes
               6 Dir(s)  126,877,892,608 bytes free

C:\Users\David Holberton\myprojs\barbedwire>

C:\Users\David Holberton\myprojs\barbedwire>git remote add origin git@github.com:ashburndev/barbedwire.git

C:\Users\David Holberton\myprojs\barbedwire>git branch -M main

C:\Users\David Holberton\myprojs\barbedwire>git push -u origin main
Enumerating objects: 119, done.
Counting objects: 100% (119/119), done.
Delta compression using up to 8 threads
Compressing objects: 100% (109/109), done.
Writing objects: 100% (119/119), 505.58 KiB | 3.56 MiB/s, done.
Total 119 (delta 20), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (20/20), done.
To github.com:ashburndev/barbedwire.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

C:\Users\David Holberton\myprojs\barbedwire>
```
