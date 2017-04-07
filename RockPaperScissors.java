import java.util.Scanner;
	
public class RockPaperScissors {
	
	private User You;
	private Computer TheComputer;
	private double UserScore;
	private double ComputerScore;
	private double numberOfGames;
	public RockPaperScissors() {
		You = new User();
		TheComputer = new Computer();
		UserScore = 0;
		ComputerScore = 0;
		numberOfGames = 0;
	}
	public static void main(String[]args){
		RockPaperScissors game = new RockPaperScissors();
		game.StartGame();
		
	}
	public void StartGame(){
		System.out.println("Rock, Paper, Scissors Shoot!");
		Move userMove = You.getMove();
		Move computerMove = TheComputer.getMove();
		System.out.println("You played " + userMove + ".");
		System.out.println("The Computer played " + computerMove + "." );
	int compareMoves = userMove.compareMoves(computerMove);
		switch(compareMoves){
		case 0:
			System.out.println("Tie!");
			break;
		case 1:
			System.out.println(userMove + " beats " + computerMove + ". You Win!");
			UserScore++;
			break;
		case -1:
			System.out.println(computerMove + " beats " + userMove + ". Computer Wins.  ");
			ComputerScore++;
			break;
		}
		numberOfGames++;
		
		if (You.playAgain()) {
		    System.out.println();
		    StartGame();
		} else {
		    printGameStats();
		}
	
	}
	
	public void printGameStats(){
		double wins = UserScore;
		double losses = ComputerScore;
		double tie = numberOfGames - UserScore - ComputerScore;
		double percentOfGamesWon = UserScore/numberOfGames*100;
		double percentOfGamesLost = ComputerScore/numberOfGames*100;
		double round1 = Math.round(percentOfGamesWon*100)/100;
		double round2 = Math.round(percentOfGamesLost*100)/100;
		System.out.println("Number of Games Played: " + numberOfGames + "   You Won " + wins + " time/s (" + round1 + " %). The Computer won " + 
		ComputerScore + " time/s( " + round2 + " %). There was " + tie + " tie/s.");

		
		
	}
}
		