
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String yOrN = "yes";
		while(yOrN.equalsIgnoreCase("yes")) {
		
		Movie film = new Movie();
		
		
		
		System.out.println("Please enter the title of the movie: ");
		String movieTitle = keyboard.nextLine();
		film.setTitle(movieTitle);
		
		System.out.println("Please enter the movie's rating: ");
		String rating = keyboard.nextLine();
		film.setRating(rating);
		
		System.out.println("Please enter the number of tickets sold: ");
		int ticketsSold = keyboard.nextInt();
		film.setSoldTickets(ticketsSold);
		
		System.out.println(film.toString());
		keyboard.nextLine();
		System.out.println("Do you want to continue (yes/no)? ");
		
		yOrN = keyboard.nextLine();
		
		}
		
		 keyboard.close();
		System.out.println("Goodbye");
		

	}

}
