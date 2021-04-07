package GTU_Practical_Programs;
/**
 * Write a program that displays a tic-tac-toe board. 
 * A cell may be X, O, or empty. 
 * What to display at each cell is randomly decided. 
 */
import java.util.Scanner;

public class GTU_Practical017_1 {
    public static void main(String[] args){
		
		String[] playerName = new String[2];
		char[][] game = new char[3][3];
		char sign;
		int currPlayer = 0,row,col,times=0,wins=-1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("Welcome to the game TicTacToe");
		System.out.println("=============================");
		System.out.print("Please enter Player 1 name: ");
		playerName[0] = input.next();
		System.out.println("Hi, "+playerName[0]+". Your sign is: O.");
		System.out.println("-----------------------------");
		System.out.print("Please enter Player 2 name: ");
		playerName[1] = input.next();
		System.out.println("Hi, "+playerName[1]+". Your sign is: X.");
		System.out.println("=============================");
		
		System.out.println("Current canvas of game is empty.");
		System.out.println("Let us start game now.");
		System.out.println();
		System.out.println("-----------------------------");
		
		while(true)
		{
			if(currPlayer==1) sign='x'; else sign='o';
			System.out.println(playerName[currPlayer]+" ("+sign+") shall enter a position:");
			System.out.print("Enter Row no: ");
			row = input.nextInt()-1;
			System.out.print("Enter Col no: ");
			col = input.nextInt()-1;
			if(row>=3 || row<0 || col>=3 || col<0 || game[row][col]!='\0'){
				System.out.println("Please enter any valid position from (3x3) empty cells.");
				continue;
			}
			times++;
			wins=setGame(game,row,col,currPlayer,sign);
			System.out.println("Game Status:");
			printGame(game);
			System.out.println("-----------------------------");
			if(wins!=-1 || times==9)
				break;
			if(currPlayer==0) currPlayer=1; else currPlayer=0;
		}
		System.out.println("=========End of Game=========");
		if(wins==-1)
			System.out.println("No one wins.");
		else
			System.out.println(playerName[wins]+" wins.");
		System.out.println("=============================");
	}
	public static int setGame(char[][] game,int row,int col,int currPlayer,char sign) {
		game[row][col]=sign;
		
		if(game[row][0]==game[row][1] && game[row][1]==game[row][2])
			return currPlayer;
		if(game[0][col]==game[1][col] && game[1][col]==game[2][col])
			return currPlayer;
		if(row==col)
			if(game[0][0]==game[1][1] && game[1][1]==game[2][2])
				return currPlayer;
		if(row==2-col)
			if(game[0][2]==game[1][1] && game[1][1]==game[2][0])
				return currPlayer;
				
		return -1;
	}
	public static void printGame(char[][] game){
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				if(game[i][j]!='\0')
					System.out.printf("%2c",game[i][j]);
				else
					System.out.printf("%2c",' ');
				if(j!=2)
					System.out.print(" |");
			}
			System.out.println();
			if(i!=2)
				System.out.println("---+---+---");
		}
	}
}