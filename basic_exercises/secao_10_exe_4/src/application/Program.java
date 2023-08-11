package application;

import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("How many rooms will be rented? ");
		int n_rented_rooms = scan.nextInt();
		
		Room[] rooms_vect = new Room[10];
		
		System.out.println();
		
		for(int k = 0; k < n_rented_rooms; k++) {
			System.out.printf("Rent #%d:%n", k + 1);
			scan.nextLine();
			System.out.printf("Name: ");
			String name = scan.nextLine();
			System.out.printf("Email: ");
			String email = scan.nextLine();
			System.out.printf("Room: ");
			int room = scan.nextInt();
			rooms_vect[room] = new Room(name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		
		for(int k = 0; k < 10; k++) {
			if(rooms_vect[k] != null) {
				System.out.printf("%d: %s, %s%n", k, rooms_vect[k].getName(), rooms_vect[k].getEmail());
			}
		}
		
		scan.close();
	}

}
