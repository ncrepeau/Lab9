import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeCreation {
	int[][] myArray = new int[5][10];

	public int[][] Array() throws FileNotFoundException {

		File myFile = new File("./src/Maze1.txt");
		Scanner myFileScanner = new Scanner(myFile);
		while (myFileScanner.hasNextLine()) {
			String line = myFileScanner.nextLine();
			Scanner myLineScanner = new Scanner(line);
			int row = 0;
			while (myLineScanner.hasNext()) {
			    int x = myLineScanner.nextInt();
			    for (int column = 0; column < myArray[0].length; column++) {
			        myArray[row][column] = x;

			    }
			    row =+ 1;
			}

		}
		return myArray;
	}
}