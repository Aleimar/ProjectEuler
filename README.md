# ProjectEuler
Solutions to project euler problems.


I want to practice and enhance my computer programming thinking. I created this repository to practice and master the art of computer programming.


Each folder will contain a txt file for the problem definition and the solution in another programming file; which could be written in any programming language randomly chosen by randomizer.py.

## How to compile and run in each language

Assume that *test.ext* is the programming file where *.ext* is the file extension.

# C

```
gcc test.c -o test
./test
```
C will create an executable file called test. The *-o* parameter stands for *output*.


# C++

```
clang++ -o test test.cpp
./test
```
C++ will create an executable file called test.

# C#

Navigate to directory where *test.cs* is located

```
dotnet new console
dotnet run
```
C# will create a console containing the solution.

In cases where there are multiple *.cs* files in the directory and a specific one is needed to run, use the following command:
```
dotnet script test1.cs
```


# Java

```
javac test.java
java test
```
Java will create a program called test.

# Python

```
python test.py
```
Python, as a scripting language, will not create program/executable files.

# JavaScript (Node.js)

```
node test.js
```
JavaScript, as a scripting language, will not create program/executable files.

# Scala

```
scalac test.scala
scala test
```
Scala will create a program called test.