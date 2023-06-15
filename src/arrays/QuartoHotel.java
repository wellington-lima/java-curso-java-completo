package arrays;

import java.util.Locale;
import java.util.Scanner;

public class QuartoHotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Guest[] rooms = new Guest[10];
		
		System.out.print("Quantos hóspedes vão entrar? ");
		int totalRent = sc.nextInt();
		
		for(int i = 0; i < totalRent; i++) {
			sc.nextLine();
			System.out.println("\nRent #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rooms[room] = new Guest(name, email, room);
		}
		
		System.out.println("\nBusy rooms:");
		
		for(Guest guest: rooms) {
			if(guest != null) {
				System.out.println(guest.toString());
			}
		}
		
		sc.close();
	}
}
