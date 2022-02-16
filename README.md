# rpg_characters

This is a submission for the first Java assignment in Noroff's Java course. The purpose of the assignment is to get
familiar with fundamental object oriented programming.

It is a simple Java console application that creates and updates RPG characters according to the assignment
specifications given in [Assignment_1_Java_RPGCharacters.pdf](Assignment_1_Java_RPGCharacters.pdf).

## Installation

Clone or download the repository and open it in IntelliJ with JDK 17.

## Usage

'Main.java' contains a few example commands of the functionality. Run 'Main' in IntelliJ to see it in action. Change or
add commands in 'Main.java' to try e.g. different Hero classes and different weapons or armor.

### Examples

```
// test creating new Ranger
Ranger myRanger = new Ranger("Cordell W. T. Ranger");
System.out.println(myRanger);

// test level-up myRanger
myRanger.levelUp();
System.out.println(myRanger);

// test level-up myRanger again
myRanger.levelUp();
System.out.println(myRanger);
```

## Maintainer

Kasper Nielsen ([@kaspernie](https://github.com/kaspernie))