# [gradle-learning](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html)

```bash
$ which gradle
/usr/local/bin/gradle
$ rm -f /usr/local/bin/gradle
$ ln -s /Users/wyd/soft/gradle-6.5/bin/gradle /usr/local/bin/gradle
$ gradle -v

------------------------------------------------------------
Gradle 6.5
------------------------------------------------------------

Build time:   2020-06-02 20:46:21 UTC
Revision:     a27f41e4ae5e8a41ab9b19f8dd6d86d7b384dad4

Kotlin:       1.3.72
Groovy:       2.5.11
Ant:          Apache Ant(TM) version 1.10.7 compiled on September 1 2019
JVM:          1.8.0_172 (Oracle Corporation 25.172-b11)
OS:           Mac OS X 10.14 x86_64
```

```bash
# build.gradle文件需要拷贝到项目外执行
$ cat build.gradle
task hello {
    doLast {
        println 'Hello world!'
    }
}
$ gradle -q hello
Hello world!
$ gradle -q upper
Original: mY_nAmE
Upper case: MY_NAME
$ gradle -q intro
Hello world!
I'm Gradle
$ gradle -q taskX
taskY
taskX

# times 从0开始
$ gradle -q task0
I'm task number 0
$ gradle -q task1
I'm task number 1
$ gradle -q task2
I'm task number 2
$ gradle -q task3
I'm task number 3

$ gradle -q myTask0
I'm task number 2
I'm task number 3
I'm task number 0

$ gradle -q helloA
Hello Venus
Hello Earth
Hello Mars
Hello Jupiter

$ gradle -q helloB
Hello world!
Greetings from the helloB task.

$ gradle -q printTaskProperties
myValue
$ gradle -q
Default Cleaning!
Default Running!
$ gradle -q distribution
We build the zip with version=1.0-SNAPSHOT
$ gradle -q release
We build the zip with version=1.0
We release now

$ gradle -q encode
aGVsbG8gd29ybGQK
```

