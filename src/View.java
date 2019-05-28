public class View {
 static final int X = 1;
 static final int O = -1;
	   
  public static void printBoard( int [][] matrix ){
	for( int row = 0; row < matrix.length; row++ ){
	    for( int col = 0; col < matrix[row].length; col++ ){
	            
	            if( matrix[row][col] == X )
	               System.out.print("X ");
	            else if(matrix[row][col] == O )
	               System.out.print("O ");
	            else 
	               System.out.print(". ");
	             }
	            System.out.println("");
	       }
	   }
}
