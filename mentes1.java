package mentes1;

import java.util.Scanner;

public class mentes1 {

 public static void main(String[] args) {

 

 Scanner sc = new Scanner(System.in);

 System.out.println("\u001B[32m===============================\u001B[0m");

 System.out.println("\u001B[33m   WELCOME TO JUDE'S HOTEL\u001B[0m");

 System.out.println("\u001B[32m===============================\u001B[0m" + "\n");

 

 int hotel[][] = new int[7][5];

 int choice = 0;

 while (choice != 4) {

 System.out.println("\u001B[35m-----------------------------\u001B[0m");

 System.out.println("Hotel Reservation. Choose(1-4)" 

 + "\n\u001B[35m[1]\u001B[0m" + " View all rooms" 

 + "\n\u001B[35m[2]\u001B[0m" + " Check-in (reserve a room)"

 + "\n\u001B[35m[3]\u001B[0m" + " Check-out (free a room)" 

 + "\n\u001B[31m[4] Exit program\u001B[0m");

 System.out.print("Enter here: ");

 choice = sc.nextInt();

 System.out.println();

 switch (choice) {

 case 1:

 for (int i = hotel.length -1 ;i >= 0; i--) {

 System.out.print("Floor " + (i + 1) + ": " );

 

 for (int x = 0; x < hotel[i].length; x++) {

 System.out.print("[" + hotel[i][x] + "] ");

 

 

 

 }

 System.out.println();

 }

 System.out.println();

 

 break;

 

 case 2:

 System.out.println("\u001B[35m-----------------------------\u001B[0m");

 System.out.print("Enter Floor (1-7): ");

 int floor = - 1 + sc.nextInt(); 

 System.out.print("Enter Room (1-5): ");

 int room = -1 + sc.nextInt(); 

 

 if(hotel[floor][room] == 0 ) {

 hotel[floor][room]= 1;

 System.out.println("\n" + "\u001B[32mCheck-in Successful!\u001B[0m");

 

 }else {

 System.err.println("Room is occupied!");

 }

 System.out.println();

 break;

 

 case 3:

 System.out.println("\u001B[35m-----------------------------\u001B[0m");

 System.out.print("Enter Floor (1-7): ");

 int floorOut=  sc.nextInt() -1; 

 System.out.print("Enter Room (1-5): ");

 int roomOut =  sc.nextInt() -1 ; 
 


 if(hotel[floorOut][roomOut] == 0) {
System.err.println("\nThe floor and room number you input is not occupied! Try again.");
 

 }else if (hotel[floorOut][roomOut] == 1) 
	  
	 System.err.println("\n" + "\u001B[32mThe room is now empty\u001B[0m");

 
    
 
 
 System.out.println();

 break;

 

 case 4:

 System.out.println("\u001B[36mThankyou for staying with us!\u001B[0m");

 

 

 }

 
 }
 }
 

 
 }


 







 

