# CSC 215 — DS Extra Credit 1

Inside the source folder is the `Student` class that we designed together in our discussion session, along with
the `Course` and `Name` class.

`CSStudent` is a child of `Student`, containing one extra field, `favoriteLanguages`.

## Instructions

The provided main method has an instance of `CSStudent` and `Student` created for you.

Only update **two methods**. Nothing else.

### First, update `getUnits()` in `Student` (2 points)

Update this method to calculate the number of units based on the classes they're taking.

> 1 point for attempt. 2 points for correct implementation.

### Second, update `printStudent()` in `Main` (3 points)

The method already prints out the student's name and the courses they're taking. Update this method so that it prints
the student's favorite language if they are a `CSStudent`.

> 1 point for attempt. 3 points for correct implementation.

When complete, you should see the following as the output:

```
Name: Alice Wonderland
Favorite language: Java
CSC 215    Units:  4
MATH 225   Units:  3
ANTH 100   Units:  3
Total units:      10
----------------------
Name: Bob McKendrick
ROK 193    Units:  3
ART 221    Units:  3
Total units:       6
```

## Setting up

To download the code, click on "Code" button above and click "Download ZIP." Extract the folder and copy the contents of
the src to your IDE.

Alternatively in IntelliJ, you can import this file by going to `File` > `New` > `Project from Version Control...`.
In the URL field, paste in `https://github.com/mosguinz/CSC215ExtraCredit_OOP`.

