package mentes;
import javax.swing.*;
public class mentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int hotel[][] = new int[7][5];
		 
		 JOptionPane.showMessageDialog(null, " WELCOME TO JUDE'S HOTEL\n" , 
		            "Jude's Hotel", JOptionPane.INFORMATION_MESSAGE);
		 
		 int choice = 0;
		 while (choice != 4) {
			 String menu = "Hotel Reservation System\n\n" +
                     "[1] View all rooms\n" +
                     "[2] Check-in (reserve a room)\n" +
                     "[3] Check-out (free a room)\n" +
                     "[4] Exit program\n\n" +
                     "Enter your choice (1-4):";
			 
			  String choices = JOptionPane.showInputDialog(null, menu, "Main Menu", JOptionPane.QUESTION_MESSAGE);
			 
			  if (choices == null) { // User clicked cancel
	                choice = 4;
	                continue;
		 }
			  
			   try {
	                choice = Integer.parseInt(choices);
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Please enter a valid number (1-4)!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	                continue;
	            }
	            
			   if (choice == 1) {
	                // View all rooms
	                String roomsDisplay = "Hotel Room Status (Floors 7 to 1):\n";
	                    roomsDisplay += "Floor 7: ";
	                for (int x = 0; x < 5; x++) 
	                	roomsDisplay += (hotel[6][x] == 0 ? "[0] " : "[1] ");
	                    roomsDisplay += "\nFloor 6: ";
	                for (int x = 0; x < 5; x++) 
	                	roomsDisplay += (hotel[5][x] == 0 ? "[0] " : "[1] ");
	                    roomsDisplay += "\nFloor 5: ";
	                for (int x = 0; x < 5; x++) 
	                	roomsDisplay += (hotel[4][x] == 0 ? "[0] " : "[1] ");
	                    roomsDisplay += "\nFloor 4: ";
	                for (int x = 0; x < 5; x++) 
	                	roomsDisplay += (hotel[3][x] == 0 ? "[0] " : "[1] ");
	                    roomsDisplay += "\nFloor 3: ";
	                for (int x = 0; x < 5; x++) 
	                	roomsDisplay += (hotel[2][x] == 0 ? "[0] " : "[1] ");
	                    roomsDisplay += "\nFloor 2: ";
	                for (int x = 0; x < 5; x++) 
	                	roomsDisplay += (hotel[1][x] == 0 ? "[0] " : "[1] ");
	                    roomsDisplay += "\nFloor 1: ";
	                for (int x = 0; x < 5; x++) 
	                	roomsDisplay += (hotel[0][x] == 0 ? "[0] " : "[1] ");
	                
	                JOptionPane.showMessageDialog(null, roomsDisplay, "All Rooms", JOptionPane.INFORMATION_MESSAGE);
	                
	                
	            } else if (choice == 2) {
	                // Check-in
	                String floors = JOptionPane.showInputDialog(null, "Enter Floor (1-7):", "Check-in - Floor", JOptionPane.QUESTION_MESSAGE);
	                if (floors == null) continue;
	                
	                String rooms = JOptionPane.showInputDialog(null, "Enter Room (1-5):", "Check-in - Room", JOptionPane.QUESTION_MESSAGE);
	                if (rooms == null) continue;
	                
	                try {
	                    int floor = Integer.parseInt(floors) - 1;
	                    int room = Integer.parseInt(rooms) - 1;
	                    
	                    if (floor < 0 || floor >= 7 || room < 0 || room >= 5) {
	                        JOptionPane.showMessageDialog(null, "Invalid floor or room number!\nFloor: 1-7, Room: 1-5", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	                        continue;
	                    }
	                    
	                    if (hotel[floor][room] == 0) {
	                        hotel[floor][room] = 1;
	                        JOptionPane.showMessageDialog(null, 
	                            "✓ Check-in Successful!\nFloor " + (floor + 1) + ", Room " + (room + 1) + " is now occupied.", 
	                            "Check-in Success", JOptionPane.INFORMATION_MESSAGE);
	                    } else {
	                        JOptionPane.showMessageDialog(null, 
	                            "✗ Room is already occupied!\nFloor " + (floor + 1) + ", Room " + (room + 1), 
	                            "Room Occupied", JOptionPane.ERROR_MESSAGE);
	                    }
	                } catch (NumberFormatException e) {
	                    JOptionPane.showMessageDialog(null, "Please enter valid numbers!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	                }
	                
	            } else if (choice == 3) {
	                // Check-out
	                String floors = JOptionPane.showInputDialog(null, "Enter Floor (1-7):", "Check-out - Floor", JOptionPane.QUESTION_MESSAGE);
	                if (floors == null) continue;
	                
	                String rooms = JOptionPane.showInputDialog(null, "Enter Room (1-5):", "Check-out - Room", JOptionPane.QUESTION_MESSAGE);
	                if (rooms == null) continue;
	                
	                try {
	                    int floor = Integer.parseInt(floors) - 1;
	                    int room = Integer.parseInt(rooms) - 1;
	                    
	                    if (floor < 0 || floor >= 7 || room < 0 || room >= 5) {
	                        JOptionPane.showMessageDialog(null, "Invalid floor or room number!\nFloor: 1-7, Room: 1-5", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	                        continue;
	                    }
	                    
	                    if (hotel[floor][room] == 0) {
	                        JOptionPane.showMessageDialog(null, 
	                            "✗ Room is already empty!\nFloor " + (floor + 1) + ", Room " + (room + 1), 
	                            "Room Empty", JOptionPane.WARNING_MESSAGE); 	
	                    
	                    } else {
	                        hotel[floor][room] = 0;
	                        JOptionPane.showMessageDialog(null, 
	                            "✓ Check-out Successful!\nFloor " + (floor + 1) + ", Room " + (room + 1) + " is now empty.", 
	                            "Check-out Success", JOptionPane.INFORMATION_MESSAGE);
	                    }
	                } catch (NumberFormatException e) {
	                    JOptionPane.showMessageDialog(null, "Please enter valid numbers!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	                }
	                
	            } else if (choice == 4) { //exit
	                JOptionPane.showMessageDialog(null, "Thank you for staying with us!", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
	                
	            } else {
	                JOptionPane.showMessageDialog(null, "Invalid choice! Please enter 1-4.", "Invalid Option", JOptionPane.WARNING_MESSAGE);
	            }
	        }
	        System.exit(0);
	                    
	                    
	                   
	            
	            }
		 
	}

