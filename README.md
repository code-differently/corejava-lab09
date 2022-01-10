# Return Ready Lab 09

* Part A - Foundations 3.4
* Part B - Foundations 3.5
* Part C - Instructor Challenge

## Part A

### Example and Activity 01

#### Step 01

In the package `lab09.part_a.examples` look at the file `Example01_LossOfDecimal` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab09.part_a.activity` complete the `Activity01_KeepTheDecimal` per the following:

    Create a variable of type double and assign it a value with two decimal places
    Create a variable of type int and assign it the variable you just created - fix the error it gives you
    Print the variable of datatype double
    Print the variable of datatype integer 

Your program is working correctly, if when run, the following is the output:

```
My double value: 12.45
My integer value: 12
```

> Use Example01_LossOfDecimal for reference.

### Example and Activity 02

#### Step 01

In the package `lab09.part_a.examples` look at the file `Example02_Parsing` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab09.part_a.activity` complete the `Activity02_Parsing` per the following:

        Create a variable of datatype String and assign it a numeric value
        Print out the message that is expected per the example below
        Create a variable to parse the String into the appropriate data type
        Print out the message that is expected per the example below

Your program is working correctly, if when run, the following is the output:

```
The string value is: 37.5
The integer value is: 37.5
```

> Use Example02_Parsing for reference.

### Example and Activity 03

#### Step 01

In the package `lab09.part_a.examples` look at the file `Example03_TypeCasting` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab09.part_a.activity` complete the `Activity03_TypeCasting` per the following:

        Declare and initialize a byte with a value of 128
        Declare and initialize a short with a value of 128
        Create a print statement that casts this short to a byte
        Declare and initialize a byte with a value of 127
        Add 1 to this variable and print it
        Add 1 to this variable again and print it again
        *** PLEASE NOTE *** The steps will give you an error, 
        the point of the lab is for you to properly cast to make this run corretly. ***

Your program is working correctly, if when run, the following is the output:

```
The value of the short variable is: -128
The value of the byte variable is: -127
```

> Use Example03_TypeCasting for reference.

## Part B

### Example and Activity 01

#### Step 01

In the package `lab09.part_b.examples` look at the file `Example01_Scanner` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab09.part_b.activity` complete the `Activity01_Scanner` per the following:

    Create a Scanner - name it anything other than scanner
    Ask the user to pass in a number but store it as a String
    Store the user input appropriately and print it out
    Parse the input as an integer
    Print its value +1

Your program is working correctly, if when run, the following is the output:
```
Please enter a number: 
27
Your number increased by one is: 28
```

> Use Example01_Scanner for reference.

### Example and Activity 02

#### Step 01

In the package `lab09.part_b.examples` look at the file `Example02_MoreScanning` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab09.part_b.activity` complete the `Activity02_MoreScanning` per the following:

    Create a scanner
    Ask the user to enter three integers and store each of them
    Print the sum of all three of the integers the user entered
    Remember to close the Scanner

Your program is working correctly, if when run, the following is the output:
```
Enter 3 Numbers: 
2
6
2
The sum of your inputs equals: 10
```

> Use Example02_MoreScanning for reference.


### Example and Activity 03

#### Step 01

In the package `lab09.part_b.examples` look at the file `Example03_EvenMoreScanning` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab09.part_b.activity` complete the `Activity03_EvenMoreScanning` per the following:

    Create a scanner
    Ask the user to enter their name, age, salary
    Store each of these inputs in variables that have appropriate datatypes (pay attention to how salary is displayed)
    Per the example below, return to the user each of their inputs on different lines confirming what they entered

Your program is working correctly, if when run, the following is the output:
```
    Enter name, age and salary:
    Gio
    28
    6.65
    Name: Gio
    Age: 28
    Salary: 6.65
```

> Use Example03_EvenMoreScanning for reference.

## Part C

In this part of the lab you will complete `GuessingGame` , the objective of your program should be to generate a random number between 1 and 100. Then give the user 10 attempts to try and guess the number.

If the users guess is higher than the number, your output should be `Too High`. 

If the users guess is lower than the number, your output should be `Too Low`.

After each unsuccessful attemp, you should up date the user on how many attemps they have left.

At the end of each game the user should be asked `Do you want to Play Again?`. If the answer is yes, a new round of High Low should start.

```
Welcome to Too High / Too Low.
The Object of this game is to guess a number between 1 and 100 in 10 tries or less.
This is the start of the Round you have 10 guesses left
99
Too High, you have 9 attempts left
89
Too High, you have 8 attempts left
80
Too Low, you have 7 attempts left
85
Too High, you have 6 attempts left
84
Success, that was the magic number.
Would you like to play again?
no

Process finished with exit code 0
```

You must complete the Spiral Document BEFORE starting to code.

> Hint on generating [random numbers](https://www.delftstack.com/howto/java/java-random-number-between-1-and-10/) 
