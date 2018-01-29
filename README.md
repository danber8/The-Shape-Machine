# The-Shape-Machine

 Background


You have been assigned to construct a mathematical shape machine. This shape machine can provide a variety of functions. The machine takes a radius/side and will compute both the area and the perimeter/circumference. However, most of the menu only functions with words. Other than the input for the radius/sides, the machine will fail if it detects numbers. It is your job to construct this machine, to ensure that everyone in the world can learn about shapes.


Description


This project will be utilizing Strings and Math methods to perform several operations with shapes. The user will create a simple menu with multiple options. The input should be done using Strings. For example, if you wanted to perform functions for the square, the user would type ‘Square.' There will also be an exit command within the menu that lets the user close the program by typing in the word ‘Exit.'







Your Assignment


The first part of the assignment will involve the user entering a password to have access to the machine. The password will be in the form of the date. The user will have to parse the date String and concatenate the elements of the date together to be allowed access into the machine.


Next, the user will create a piece of code that takes in input from the user about the shape's radius/side length and have the program compute both the area and the perimeter/circumference. For instance if the user chooses circle and gives the radius of the circle, the program should output both the area and the circumference.

Rules


The user MUST check for input validation at the menu step (See test cases below).
The program should only run on the day it is being tested. NO HARD CODING THE DATES.
User Input

        Day - must be a positive 2 digit number between 01 and 31

        Month - must be a positive 2 digit number between 01 and 12

        Year - must be 2016

*Note: You do not have to check to ensure that valid dates for each month are entered (i.e. - Feb 31st)

Code Structure


Display login message “Shape Machine login”
Take input for the day (2 digits), the month (2 digits), and the year (4 digits) as Strings.
“What is today's day?”
“What is today's month?”
“What is today's year?
Compare it to the current date.
See notes at the end of this document how to get the exact date in the correct format
If it matches
Display “Correct date. Welcome!”
If input is not valid
Display “#ERROR Login attempt #[n] Invalid input. Please try again.”, where n is the login attempt number (message for 1st and 2nd login attempt)
Allow the user to input another date
If valid, display “Correct date. Welcome!” and continue program
If there are 3 total incorrect inputs, display an error message and terminate the program
“#ERROR 3rd invalid login attempt. Terminating program.” (message for 3rd login attempt)
Create the menu using String input as the only valid operation.
Make sure the input String matches exactly with the menu String for it to work (i.e. case sensitive).
The menu will have 4 options, “Circles”, “Rectangles”, “Triangles”, “Exit”
If a user inputs an option that is not valid, display an error message but do not terminate the program
Error message should read “#ERROR Invalid option. Please try again.”
If the user selects Circles
Display “Circles selected. Please enter the radius: ”
Take in user input
If the input is negative, display “#ERROR Negative input. Please input the radius again: ”
Check the new input and if it is correct then proceed. If not display the error message again and take in new input until it is valid
You do not need to worry about non-numerical input validation (the error should be generated only if the number is negative)
Using the circumference, calculate and display the area and perimeter of the circle (use Math.PI as a constant instead of 3.14159….)
“The circumference is: ____”
“The area is: ____”
Also display character length information for the perimeter and area. Total digits includes everything (for example for 23.0 the total number of digits is 3 because of 2, 3 decimal and the 0).
“Total number of digits in the circumference is: ____”
“Total number of digits in the area is: ____”
If the user selects Rectangles
Display “Rectangles selected. Please enter the 2 sides: ”
Take in the input for the 2 sides
If any of the 2 sides are negative or invalid, display “#ERROR Negative input. Please input the 2 sides again: ”
Continue to take in input until the 2 sides are valid
You do not need to worry about non-numerical input validation
Using the 2 input values, calculate the perimeter and the area
“The area is: ____”
“The perimeter is: ____”
Also display display character information for the perimeter and area
“Total number of digits in the area is: ____”
“Total number of digits in the perimeter is: ____”
If the user selects Triangles
Display “Triangles selected. Please enter the 3 sides: ”
Take in the input for the 3 sides
If any of the 3 input sides are negative, display “#ERROR Negative input. Please input the 3 sides again: ”
Continue to take in input until the 3 sides are valid
You do not need to worry about non-numerical input validation.
Once you have 3 positive inputs, determine if the 3 sides constitute a valid triangle
If the 3 sides to not generate a valid triangle, display the error message “#ERROR Triangle is not valid. Returning to menu.”, and return to the menu (Do not ask the user to reenter the 3 sides).
HINT: Look into the “continue” keyword in java and how it can be used to return to the start of a loop
Calculate the perimeter and the area of the triangle
Determine the type of triangle (options are: Equilateral, Isosceles, or Scalene)
The definition of Isosceles is debated. We are using the strict definition of Isosceles wherein, a triangle is Isosceles only if there are EXACTLY 2 sides that are equal.  (i.e. - an Equilateral triangle should not also be classified as Isosceles)
Display your results to the user
“The triangle is: “____”
“The perimeter is: “____”
“The area is: “____”
Also display display character information for the perimeter and area
“Total number of digits in the perimeter is: ____”
“Total number of digits in the area is: ____”

If the user selects Exit
Display message: “Terminating the program. Have a nice day!”
Terminate the program
