import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShapeMachine {


	static Scanner input = new Scanner(System.in); 

	//this boolean is used inside nested loops
	static boolean x = true;
//rectangle sides
	static double rectangleSide1;
	static double rectangleSide2;

	//rectangle area
	public static double rectangleArea(){
		return rectangleSide1 * rectangleSide2;
	}

	//rectangle perimeter
	public static double rectanglePerimeter(){
		return ((2*rectangleSide1)+(2*rectangleSide2));
	}

	//circle radius to be used in methods
	static double radius;

	//Calculates the Area of the Circle
	public static double circleArea(){
		return Math.PI*radius*radius; 
	}

	//Calculates circumference of the circle
	public static double circleCircumference(){
		return 2*Math.PI*radius;
	}

	//These variables are declared inside the loops
	static double triangleSide1;
	static double triangleSide2;
	static double triangleSide3;

	public static double trianglePerimeter(){
		return triangleSide1 + triangleSide2 + triangleSide3;
	}

	//formula for triangle area using Heron's formula
	//This is used for every triangle
	public static double triangleArea(){
		double s = (triangleSide1 + triangleSide2 + triangleSide3)/2;
		return Math.sqrt(s * (s - triangleSide1) * (s - triangleSide2) * (s - triangleSide3));
	}

	public static void main(String[] args){

		System.out.println("Shape Machine login");
		// variables declared to find number of digits
		//These variavles will be converted to strings to count the characters
		String rectangleAreaDigits;
		String rectanglePerimeterDigits;
		
		String circleAreaDigits;
		String circleCircumferenceDigits;

		String triangleAreaDigits;
		String trianglePerimeterDigits;

		//used to represent the length of strings
		int lengthOfMeasurement;

		//helps me import the date
		String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

		//System.out.println(date);

		//random varibable created to make the for loop run 
		int numberForDateLoop;

		for (numberForDateLoop = 1; numberForDateLoop <5; numberForDateLoop++){
			System.out.print("What is today's day? ");
			String day = input.next();
			System.out.print("What is today's month? ");
			String month = input.next();
			System.out.print("What is today's year? ");
			String year = input.next();
			
			//I take the user input for date and turn it into something the 
			// computer expects by adding dashes
			String userInputDate = day + "-" +  month + "-" + year;


			// if the user has the right date
			//The loop will stop after 3 tries
			if (userInputDate.equals(date)){
				System.out.println("Correct date. Welcome!");
				break;
			}
			//limit of 3 tries
			else if (numberForDateLoop == 3){
				System.out.println("#ERROR 3rd invalid login attempt. Terminating program.");
				System.exit(0);
			}
			//tells them what try they are on
			else
			{System.out.println("#ERROR Login attempt #" + numberForDateLoop + 
					" Invalid input. Please try again.");
			
			}
		}
		//The user will enter pickAShape
		String typeOfTriangle = "Triangle";
		String pickAShape;
		
		//another random variable to make this an infinite loop unless they select exit
		int i = 5;

		//infinute loop except when the user enters Exit
		while (i>0){
			System.out.println("---Welcome to the Shape Machine---");
			System.out.println("Available Options:");
			System.out.println("Circles");
			System.out.println("Rectangles");
			System.out.println("Triangles");
			System.out.println("Exit");
			//System.out.println("Please pick a shape");
			pickAShape = input.next();
			x = true;


			//only condition where loop will end
			if (pickAShape.equals("Exit")){
				System.out.println("Terminating the program. Have a nice day!");
				System.exit(0);
			}

			//if they don't select one of the choices the user will be prompted to try again
			if (!(pickAShape.equals("Circles")) && !(pickAShape.equals("Rectangles"))
					&& !(pickAShape.equals("Triangles"))){
				System.out.println("#ERROR Invalid option. Please try again.");
				x = false;
			}

			//when they select rectangles
			while (x==true){
				if(pickAShape.equals("Rectangles")){
					System.out.print("Rectangles selected. Please enter the 2 sides: ");
					rectangleSide1 = input.nextDouble(); 
					rectangleSide2 = input.nextDouble();
				}

				//If they give valid inputs
				if (pickAShape.equals("Rectangles") && rectangleSide1 > 0 && rectangleSide2 > 0){
					System.out.println("The area is: " + rectangleArea());
					System.out.println("The perimeter is: " + rectanglePerimeter());
				
					//converts the area to a string and then I take the length of that 
					//and make it an int
					//I do the same for perimeter everywhere
					rectangleAreaDigits = Double.toString(Math.abs(rectangleArea()));
					lengthOfMeasurement = rectangleAreaDigits.length()-1;
					System.out.println("Total number of digits in the area is: " + lengthOfMeasurement);

					rectanglePerimeterDigits = Double.toString(Math.abs(rectanglePerimeter()));
					lengthOfMeasurement = rectanglePerimeterDigits.length()-1;
					System.out.println("Total number of digits in the perimeter is: " + lengthOfMeasurement);

					//false means it exits the loop
					x = false;
				}

				//if they give negative input they have to try again
				//This is an infinite loop until they give 2 positive values
				while (pickAShape.equals("Rectangles") && (rectangleSide1 < 0 || rectangleSide2 < 0)){
					System.out.print("#ERROR Negative input. Please input the 2 sides again: ");
					rectangleSide1 = input.nextDouble(); 
					rectangleSide2 = input.nextDouble();

					if (rectangleSide1 > 0 && rectangleSide2 > 0){
						System.out.println("The area is: " + rectangleArea());
						System.out.println("The perimeter is: " + rectanglePerimeter());

						rectangleAreaDigits = Double.toString(Math.abs(rectangleArea()));
						lengthOfMeasurement = rectangleAreaDigits.length()-1;
						System.out.println("Total number of digits in the area is: " + lengthOfMeasurement);

						rectanglePerimeterDigits = Double.toString(Math.abs(rectanglePerimeter()));
						lengthOfMeasurement = rectanglePerimeterDigits.length()-1;
						System.out.println("Total number of digits in the perimeter is: " + lengthOfMeasurement);

						//false means exit the loop
						x = false;
					}
				}
				
				while (x == true){
					if (pickAShape.equals("Circles")){
						System.out.print("Circles selected. Please enter the radius: ");
						radius = input.nextDouble();
						}
					//If the user enters a positive radius
					if (pickAShape.equals("Circles") && radius > 0){

						System.out.println("The circumference is: " + circleCircumference());
						System.out.println("The area is: " + circleArea());
						
						circleCircumferenceDigits = Double.toString(Math.abs(circleCircumference()));
						lengthOfMeasurement = circleCircumferenceDigits.length()-1;
						System.out.println("Total number of digits in the circumference is: " + lengthOfMeasurement);

						circleAreaDigits = Double.toString(Math.abs(circleArea()));
						lengthOfMeasurement = circleAreaDigits.length()-1;
						System.out.println("Total number of digits in the area is: "+ lengthOfMeasurement);

						x = false;			
					}
					
					// if the user enters negative or invalid input
					while (pickAShape.equals("Circles") && radius < 0){
						System.out.print("#ERROR Negative input. Please input the radius again: ");
						radius = input.nextDouble();

						if (radius > 0){

							System.out.println("The circumference is: " + circleCircumference());
							System.out.println("The area is: " + circleArea());
							
							//same process as before
							circleCircumferenceDigits = Double.toString(Math.abs(circleCircumference()));
							lengthOfMeasurement = circleCircumferenceDigits.length()-1;
							System.out.println("Total number of digits in the circumference is: " + lengthOfMeasurement);

							circleAreaDigits = Double.toString(Math.abs(circleArea()));
							lengthOfMeasurement = circleAreaDigits.length()-1;
							System.out.println("Total number of digits in the area is: "+ lengthOfMeasurement);

							x = false;

						}
					}


					while (x==true){
						if (pickAShape.equals("Triangles")){
							System.out.print("Triangles selected. Please enter the 3 sides: ");
							triangleSide1 = input.nextDouble();
							triangleSide2 = input.nextDouble();
							triangleSide3 = input.nextDouble();
						}
						//neg input
						while (pickAShape.equals("Triangles") && (triangleSide1 <0 || triangleSide2 <0 || triangleSide3 < 0)){
							System.out.print("#ERROR Negative input. Please input the 3 sides again: ");

							triangleSide1 = input.nextDouble();
							triangleSide2 = input.nextDouble();
							triangleSide3 = input.nextDouble();			
						}
						//if not a valid triangle as in sides are not possible
						if (pickAShape.equals("Triangles") && (triangleSide1 + triangleSide2 < triangleSide3
								|| triangleSide1 + triangleSide3 < triangleSide2 || 
								triangleSide2 + triangleSide3 < triangleSide1)){
							System.out.println("#ERROR Triangle is not valid. Returning to menu.");

							x = false;

						}
						if (pickAShape.equals("Triangles") && (triangleSide1 <0 || triangleSide2 <0 || triangleSide3 < 0)){
							x = true;
							System.out.println("#ERROR Negative input. Please input the 3 sides again:");
						}
						
						//equilateral triange
						if (pickAShape.equals("Triangles")&& triangleSide1 == triangleSide2 && triangleSide1 == triangleSide2
								&& triangleSide1 == triangleSide3 && 
								triangleSide2 == triangleSide3){
							typeOfTriangle = "Equilateral";
							System.out.println("The triangle is: " + typeOfTriangle);
							System.out.println("The perimeter is: " + trianglePerimeter());
							System.out.println("The area is: " + triangleArea());


							trianglePerimeterDigits = Double.toString(Math.abs(trianglePerimeter()));
							lengthOfMeasurement = trianglePerimeterDigits.length()-1;
							System.out.println("Total number of digits in the perimeter is: " + lengthOfMeasurement);

							triangleAreaDigits = Double.toString(Math.abs(triangleArea()));
							lengthOfMeasurement = triangleAreaDigits.length()-1;
							System.out.println("Total number of digits in the area is: " + lengthOfMeasurement);

							x = false;
						}
						
						//isocoles triangle 
						//The three different types of isoceles triangles are because
						//different sides are equal
						if (pickAShape.equals("Triangles") && triangleSide1 == triangleSide2 && triangleSide1 != triangleSide3
								&& (triangleSide1 + triangleSide2) > triangleSide3
								){
							typeOfTriangle = "Isosceles";
							System.out.println("The triangle is: " + typeOfTriangle);
							System.out.println("The perimeter is: " + trianglePerimeter());
							System.out.println("The area is: " + triangleArea());


							trianglePerimeterDigits = Double.toString(Math.abs(trianglePerimeter()));
							lengthOfMeasurement = trianglePerimeterDigits.length()-1;
							System.out.println("Total number of digits in the perimeter is: " + lengthOfMeasurement);

							triangleAreaDigits = Double.toString(Math.abs(triangleArea()));
							lengthOfMeasurement = triangleAreaDigits.length()-1;
							System.out.println("Total number of digits in the area is: " + lengthOfMeasurement);

							x = false;
						}
						
						//isocoles triangle
						else if(pickAShape.equals("Triangles") && triangleSide1 == triangleSide3 && triangleSide1 != triangleSide2
								&& (triangleSide1 + triangleSide3) > triangleSide2){
							typeOfTriangle = "Isosceles";
							System.out.println("The triangle is: " + typeOfTriangle);
							System.out.println("The perimeter is: " + trianglePerimeter());
							System.out.println("The area is: " + triangleArea());


							trianglePerimeterDigits = Double.toString(Math.abs(trianglePerimeter()));
							lengthOfMeasurement = trianglePerimeterDigits.length()-1;
							System.out.println("Total number of digits in the perimeter is: " + lengthOfMeasurement);

							triangleAreaDigits = Double.toString(Math.abs(triangleArea()));
							lengthOfMeasurement = triangleAreaDigits.length()-1;
							System.out.println("Total number of digits in the area is: "+ lengthOfMeasurement);
							
							
							
							x = false;
						}
						
						//isocoles triangle
						else if(pickAShape.equals("Triangles") && triangleSide2 == triangleSide3 && triangleSide1 != triangleSide2
								&& (triangleSide2 + triangleSide3) > triangleSide1){
							typeOfTriangle = "Isosceles";
							System.out.println("The triangle is: " + typeOfTriangle);
							System.out.println("The perimeter is: " + trianglePerimeter());
							System.out.println("The area is: " + triangleArea());


							trianglePerimeterDigits = Double.toString(Math.abs(trianglePerimeter()));
							lengthOfMeasurement = trianglePerimeterDigits.length()-1;
							System.out.println("Total number of digits in the perimeter is: " + lengthOfMeasurement);

							triangleAreaDigits = Double.toString(Math.abs(triangleArea()));
							lengthOfMeasurement = triangleAreaDigits.length()-1;
							System.out.println("Total number of digits in the area is: " + lengthOfMeasurement);

							x = false;
						}

						//scalene triangle
						if (pickAShape.equals("Triangles") && triangleSide1 != triangleSide2 && triangleSide2 != triangleSide3
								&&  triangleSide1 != triangleSide3 &&(triangleSide1 + triangleSide2) > triangleSide3
								&& (triangleSide1 + triangleSide3) > triangleSide2 && 
								(triangleSide2 + triangleSide3) > triangleSide1){
							typeOfTriangle = "Scalene";
							System.out.println("The triangle is: " + typeOfTriangle);
							System.out.println("The perimeter is: " + trianglePerimeter());
							System.out.println("The area is: " + triangleArea());


							trianglePerimeterDigits = Double.toString(Math.abs(trianglePerimeter()));
							lengthOfMeasurement = trianglePerimeterDigits.length()-1;
							System.out.println("Total number of digits in the perimeter is: " + lengthOfMeasurement);

							triangleAreaDigits = Double.toString(Math.abs(triangleArea()));
							lengthOfMeasurement = triangleAreaDigits.length()-1;
							System.out.println("Total number of digits in the area is: " + lengthOfMeasurement);

							x = false;
						}
					}
				}
			}
		}
	}
}








