import java.io.FileNotFoundException;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Driver extends Application{

	public static void main(String[] args){
		// TODO Auto-generated method stub

		

	}

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		// TODO Auto-generated method stub
		GridPane myPane = new GridPane();
		MazeCreation myMaze = new MazeCreation();
		int[][] myArray;
		Random rand = new Random();
		int randNum = rand.nextInt(((2 - 1) + 1) + 1);
		if (randNum == 1) {
			myArray = myMaze.array1();
		} else {
			myArray = myMaze.array2();
		}
		for(int i = 0; i < myArray.length; i++)
		{
			for(int j = 0; j < myArray[i].length; j++)
			{
				if(myArray[i][j] == 1) {
					myPane.add(null, i, j); //Add in the image Path for the blocks here
				}else {
					break;//spaces the player can move through
				}
			}
			
		}
		
		
	}
}
