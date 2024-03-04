
import java.util.Scanner;

class Hotel {
    private int roomNumber;
    private boolean isReserved;
    private String guestName;

    public Hotel(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isReserved = false;
        this.guestName = "";
    }

    public boolean reserveRoom(String guestName) {
        if (!isReserved) {
            this.isReserved = true;
            this.guestName = guestName;
            System.out.println("Room " + roomNumber + " reserved for " + guestName);
            return true;
        } else {
            System.out.println("Room " + roomNumber + " is already reserved.");
            return false;
        }
    }

    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        if (isReserved) {
            System.out.println("Reserved for: " + guestName);
        } else {
            System.out.println("Not reserved");
        }
    }
}

public class HotelReservationProgram {
    public static void main(String[] args) {
        // Creating an array of Hotel rooms
        Hotel[] rooms = new Hotel[5];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Hotel(i + 1);
        }
Scanner scanner= new Scanner(System.in);
        System.out.println("enter choice\n1:luxury room \n2:ac room\n3:non ac room\n4:deluxe");
        int ch=scanner.nextInt();
        switch(ch) {
        case 1:
        System.out.println("luxury ROOM -2500rs");
        break;
        case 2:
        System.out.println("Ac room-2000rs");
        break;
        case 3:
        System.out.println("Non ac room-1500rs");
        break;
        case 4:
        System.out.println("deluxe room-1000rs");
        break;
        default:
        System.out.println("invalid choice");
        break;
        }
        // Example usage of the hotel reservation system
        
        int roomNumber;

        // Display available rooms
        System.out.println("Available Rooms:");
        for (Hotel room : rooms) {
            room.displayRoomDetails();
        }

        // Reserving a room
        
        System.out.print("Enter room number to reserve: ");
        roomNumber = scanner.nextInt();
        if (roomNumber >= 1 && roomNumber <= rooms.length) {
            
            System.out.print("Enter guest name: ");
            scanner.nextLine(); // Consume the newline character
            String guestName = scanner.nextLine();
            rooms[roomNumber - 1].reserveRoom(guestName);
        } else {
            System.out.println("Invalid room number.");
        }

        // Display updated room details
        System.out.println("Updated Room Details:");
        for (Hotel room : rooms) {
            room.displayRoomDetails();
        }
        scanner.close();
    }
}