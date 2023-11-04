Calculator Explanation

In this java program of basic calculator that allows you to perform some simple arithmetic calculations (addition, subtraction, multiplication, and division) on two digits. This README provide instructions on how to compile and run the program, along with an explanation of the design and implementation:
Instructions:
1.Welcome Message: Upon running the program, you will be greeted with a welcome message, and you can start entering expressions.
2.Enter an Expression: You'll be prompted to enter a mathematical expression in the following: "number operator number" (e.g., "5 + 10"). Here we performed four basic operators: '+', '-', '*', and last one is '/'. If in case you entered invalid expression, than you will be prompted to enter it again.
3.Calculation: The code will calculate the whole result and show it on the screen.
4.Continue or Exit: After the calculation, definitely you will be asked if you want to continue. To continue, yes so you type ‘Y’ (case-insensitive). And to exit, press any key other than 'Y'.
5.Error Handling: Like this, way program handles errors such as invalid expression and divide by zero. If an error occurs, you'll receive an error message.
6.Multiple Calculations: You can continue your program by performing calculation as long as you want, and you ever want to exit your program. Whenever you're done.
Design and Implementation:
Program is designed as a simple console-based calculator with the following implementation choices:
•In this we use Scanner to read input from the user and a while loop to keep the calculator running until the exit done by user.
•The program checks if the entered expression is valid by splitting it into parts, ensuring it has three parts (two numbers and an operator), and checking if the operator is one of '+', '-', '*', or '/'.
•It uses a set of functions to improve modularity and readability. These functions include isValidExpression, performCalculation, and isDouble.
•The program calculates the total number of students, average marks, and identifies students with the highest and lowest scores, all while keeping track of the highest and lowest scores.
How to Compile and Run:
There are some few steps to compile and run the program.
1.Ensure you have Java installed on your system.
2.Save the Java code in a file with a ".java" extension, for example, "BasicCalculator.java".
3.Open a command prompt or terminal and navigate to the directory where you saved the "BasicCalculator.java" file.
4.Compile the Java program using the javac command:
	javac calc.java 
5.Run the compiled program using the java command:
	java calc 
6.Follow the on-screen instructions to perform calculations and use the calculator. To exit the program, simply press any key other than 'Y' when asked if you want to continue.
