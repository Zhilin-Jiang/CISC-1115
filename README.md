# CISC-1115
## Homework-Topic 6-Calculator

Write a program which allows the user to perform simple tasks on a
calculator. A series of methods allows the user to select an
operation to perform and then enter operands.

```
 The first method displays a menu, giving the user the choice of typing in any one of the following:

+, -, *, /, or %      representing the usual arithmetic operators
   A                  representing the average of two numbers
   X                  representing the maximum of two numbers
   M                  representing the minimum of two numbers
   S                  representing the square of a number
   Q                  indicating the user wants to quit the program
 ```
The program reads the user's response into a variable of type <ins>char</ins>. Using a <ins>switch</ins> statement, the program determines which method to call to process the user's request. For example, if the user enters **+, a method is called which prompts the user to enter two integers. The method then finds the sum of the two integers and the method prints the results of the operation.** If the user enters **X**, a method asks for two integers and finds the larger of the two. If the user enters **S**, a method asks for one value and finds the square of that value. If the user enters **Q**, the program stops.
