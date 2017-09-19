// PROGRAM TO PRINT THE X PATTERN
/*
*   *
 * * 
  *  
 * * 
*   *
 */
public class XPattern {

	//Main Method for Class X Pattern
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum =5; // Declare the length of Length of pattern
		int intStart = 0; // Start of the pattern
		int intEnd = intNum-1;  // End of the pattern
		for (int i = 0; i < intNum; i++)  // LOOP FOR PRINT PATTERN MOVE VERTICALLY 
		{ 
			for (int j = 0; j < intNum; j++) //LOOP FOR PRINT PATTERN MOVE HORIZONTALLY
			{ 
				if (intStart == intEnd && j == i) // PRINT SINGLE STAR IF ALL THE VALUES MATCHES
				System.out.print('*'); 
				else if (intStart == j || intEnd == j) //PRINT CHAR MATCHING EITHER START OR END
				System.out.print('*'); 
				else 
				System.out.print(' ');  //PRINT THE SPACE 
			} 
			intStart++;  // INCREASE START 
			intEnd--;  // REDUCE END
			System.out.println(); //PRINT THE EMPTY LINE 
		} 
	}
}
