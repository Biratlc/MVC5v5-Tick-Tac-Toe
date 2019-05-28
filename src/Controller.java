import java.util.Scanner;

public class Controller {
	
 Model newmodel = new Model();
 View newview = new View();
	static final int X = 1;
	static final int O = -1;
	  public void function(){
	      Scanner input = new Scanner(System.in);
	      int [][] board = new int[5][5];
	      
	      while( Model.hasWon(board) == false){
	         System.out.print("X, enter row: ");
	         int row = input.nextInt();
	         System.out.print("X, enter column:");
	         int col = input.nextInt();

	         if( board[row][col] == 0 )
	            board[row][col] = X;
	            
	         View.printBoard(board);
	         
	         if( Model.hasWon(board) == true )
	            break;
	         
	        
	         System.out.print("O, enter row: ");
	         row = input.nextInt();
	         System.out.print("O, enter column: ");
	         col = input.nextInt();
	         if( board[row][col] == 0 )
	            board[row][col] = O;
	         
	         View.printBoard(board);
	       }
	      input.close();
	      
	      System.out.println("Game over.");
	   }
	 
}
