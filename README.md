# rpg_characters

This is the first Java assignment in Noroff's Java course, and the purpose is learn basic object oriented programming.
It is a simple Java console application that creates and updates RPG characters according to the assignment
specifications given in [Assignment_1_Java_RPGCharacters.pdf](Assignment_1_Java_RPGCharacters.pdf).

## Installation

Clone or download the repository and open it in IntelliJ with JDK 17.

## Usage

'Main.java' contains a few example commands of the functionality. Run 'Main' in IntelliJ to see it in action. Try to
change or add command to try e.g. different Hero classes and different weapons or armor.

### Examples

```
// test new ranger
Ranger ranger = new Ranger("Cordell W. T. Ranger");
System.out.println(ranger);
// test level-up ranger
ranger.levelUp();
System.out.println(ranger);
// test level-up ranger again
ranger.levelUp();
System.out.println(ranger);
```

## Maintainer

Kasper Nielsen @kaspernie