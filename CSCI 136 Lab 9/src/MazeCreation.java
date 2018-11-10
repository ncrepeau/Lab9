import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MazeCreation {
	Random rand = new Random();
	int[][] myArray = new int[5][10];
	

	public int[][] array() throws FileNotFoundException {
		
		File myFile = new File("./src/Maze1.txt");
		Scanner myFileScanner = new Scanner(myFile);
		for (int row = 0; row < myArray.length; row++) {
		    String line = myFileScanner.nextLine();
		    Scanner myLineScanner = new Scanner(line);
		    for (int column = 0; column < myArray[row].length; column++) {
		        myArray[row][column] = myLineScanner.nextInt();
		    }
		}
		
	
		return myArray;
	}
}