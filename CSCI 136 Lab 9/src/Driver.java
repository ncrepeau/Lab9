import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		MazeCreation myMaze = new MazeCreation();
		int[][] myArray = myMaze.array();
		for(int i = 0; i < myArray.length; i++)
		{
			for(int j = 0; j < myArray[i].length; j++)
			{
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
		
		}
	

