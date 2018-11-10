import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MazeCreation {
	Random rand = new Random();
	private int[][] array1 = new int[5][10];
	private int[][] array2 = new int[5][10];

	public int[][] array1() throws FileNotFoundException {
		int randNum = rand.nextInt(((2 - 1) + 1) + 1);
		if (randNum == 1) {
			File myFile = new File("./src/Maze1.txt");
			Scanner myFileScanner = new Scanner(myFile);
			for (int row = 0; row < array1.length; row++) {
				String line = myFileScanner.nextLine();
				Scanner myLineScanner = new Scanner(line);
				for (int column = 0; column < array1[row].length; column++) {
					array1[row][column] = myLineScanner.nextInt();
				}
			}

			return array1;

		}
		if (randNum == 2) {
			{
				File myFile = new File("./src/Maze2.txt");
				Scanner myFileScanner = new Scanner(myFile);
				for (int row = 0; row < array2.length; row++) {
					String line = myFileScanner.nextLine();
					Scanner myLineScanner = new Scanner(line);
					for (int column = 0; column < array2[row].length; column++) {
						array2[row][column] = myLineScanner.nextInt();
					}
				}

				return array2;
			}
		}
	}
}
