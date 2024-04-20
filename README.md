# Project #3: Turing Machine

* Author: Karter Melad & Hunter Walp
* Class: CS361 Section #002
* Semester: Spring 2024

## Overview

The Turing Machine project is a Java-based simulation of a Turing Machine, a major
concept in computer science. The machine is created using states, symbols, and
transitions, which are loaded from a text file. It works by reading symbols from a
tape, fetching the transition, and applying it. This process continues until the
machine reaches a halt.

## Reflection

### Karter's Reflection

The Turing Machine Project was enjoyable to work on, just as the last two projects
were. We originally wrote the machine without much object orientation implemented, 
then took the time to do so after it was working. At first the machine worked great
but the simulation process was taking far too long. Funny enough I had seen a video
on social media that said 'When in doubt use a hash map', and that is exactly what 
I did. These cut our simulation process significantly. The project helped me grasp a
better understanding for Turing Machines and why they are of great use. I liked being
able to have a project where the design and implementation was souly up to Hunter and 
I. 

I got an early start on the project which helped us both immensly. This gave us valuable
time to test our machine and make changes as needed. Overall this project was challenging
and rewarding. One of the major changes while working on the machine was making it
bi-infinite.

### Hunter's Reflection

The turing machine was an interesting culmination of all of the previous projects
and assignments. I have found turing machines to be a little bit more intuitive than
some of the other state machines, especially PDAs. Karter got the project started
early, which helped us to plan ahead and test fairly comprehensively. With the added
challenge of getting a turing machine to run effeciently, we (mostly karter, actually)
figured that we may be able to use a hash map. This increased the effeciency of our TM 
by many times over. 

With Karter's early work on the TM implementation, it made it really easy for me to 
start testing and re-working some of our functionality. I think that I enjoyed this 
project the most out of all 3, as TMs seem to work more intuitively in my brain than
some of the other state machines. Overall, I think this project was the easiest, even
though Turing machines can be quite complicated.

## Compiling and Using

First, compile the .java files by running the 'javac *.java' command. Run
the simulation after compiling by using the following command 'java TM filename'.
Filename is the name of the file containing the TM's configuration. This file
will determine the number of states, number of symbols, transition function, and
tape contents.

## Sources used

https://www.geeksforgeeks.org/turing-machine-in-toc/