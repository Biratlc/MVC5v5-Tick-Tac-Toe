public class Model {
	public static boolean hasWon( int [][] matrix ){
	     
	 boolean retVal = false;
	    for( int row = 0; row < matrix.length; row++ ){
	         int sum = 0;
	         for( int col = 0; col < matrix[0].length; col++ ){
	            sum += matrix[row][col];
	         }
	          if( sum == 5 ){
	            System.out.println("X wins.");
	            retVal = true;
	         } else if ( sum == -5 ) {
	            System.out.println("O wins.");
	            retVal = true;
	         }
	      }
	      
	    for( int col = 0; col < matrix[0].length; col++ ){
	         int sum = 0;
	         for( int row = 0; row < matrix.length; row++ ){
	            sum += matrix[row][col];
	         }
	         if( sum == 5 ){
	            System.out.println("X wins.");
	            retVal = true;
	         } else if ( sum == -5 ) {
	            System.out.println("O wins.");
	            retVal = true;
	         }
	      }
	      
	     if( (matrix[0][0] + matrix[1][1] + matrix[2][2]+matrix[3][3]+matrix[4][4]) == 5 ){
	         System.out.println("X wins.");
	         retVal = true;
	      } else if ( (matrix[0][0] + matrix[1][1] + matrix[2][2]+matrix[3][3]+matrix[4][4]) == -5 ) {
	         System.out.println("O wins.");
	         retVal = true;
	      }
	      if( (matrix[0][4] + matrix[1][3] + matrix[2][2]+ matrix[3][1]+ matrix[4][0]) == 5 ){
	         System.out.println("X wins.");
	         retVal = true;
	      } else if ( (matrix[0][4] + matrix[1][3] + matrix[2][2]+ matrix[3][1]+ matrix[4][0])==-5) {
	         System.out.println("O wins.");
	         retVal = true;
	      }
	      
	      
	      boolean foundSpace = false;
	      for( int row = 0; row < matrix.length; row++ ){
	         for( int col = 0; col < matrix[0].length; col++ ){
	            if( matrix[row][col] == 0 ) 
	               foundSpace = true;
	         }
	      }
	      if( foundSpace == false ){
	         System.out.println("Ends in tie.");
	         retVal = true;
	      }
	      return retVal;
	   }
}
