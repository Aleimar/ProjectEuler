# ProjectEuler
Solutions to [Project Euler](https://projecteuler.net/archives) problems.

I want to get better at computer programming. So, I made this special place where I can practice and really understand how to do it well.

I believe good computer programming should be able to work with any language. So, to make things more interesting, I'll solve these problems using different languages I know, such as C, Java, Python, Scala, and maybe some others.

In every folder, you'll find a text file explaining the problem and another file with the solution, written in a programming language randomly selected by a tool called randomizer.py.

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
Python, as a scripting language, doesn't produce standalone program or executable files.

# JavaScript (Node.js)

```
node test.js
```
JavaScript, as a scripting language, doesn't produce standalone program or executable files.

# Scala

```
scalac test.scala
scala test
```
Scala will create a program called test.