import java.util.Scanner;
public class User {
	private Scanner inputScanner; 
	public User(){
		inputScanner = new Scanner(System.in);
	}
	public Move getMove(){
		System.out.println( "Rock, Paper, or Scissors? ");
		String userInput = inputScanner.nextLine();
		userInput = userInput.toUpperCase();
		char firstLetter = userInput.charAt(0);
		if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S'){
			switch (firstLetter){
				case 'R':
					return Move.Rock;
				case 'P':
					return Move.Paper;
				case 'S': 
					return Move.Scissors;
			}
		}
		return getMove();
}
	public boolean playAgain(){
		System.out.println("Do you Want to play Again (Y/N)?");
		String userInput = inputScanner.nextLine();
		userInput = userInput.toUpperCase();
		return userInput.charAt(0) == 'Y'; 
		}
		

}

