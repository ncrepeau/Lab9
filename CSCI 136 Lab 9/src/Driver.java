import java.io.FileNotFoundException;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Driver extends Application{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		launch(args);
		

	}

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Blocks myBlock = new Blocks();
		Image image = new Image(myBlock.getTreeImg());
		ImageView treeImage = new ImageView(image); 
		Player myPlayer = new Player();
		Image myImage = new Image(myPlayer.getPlayerImg());
		ImageView playerImage = new ImageView(myImage);
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
					treeImage.setX(i);
					treeImage.setY(j);
				}else {
					break;//spaces the player can move through
				}
			}
			
		}
		Group root = new Group(playerImage, treeImage);
		Scene gameScreen = new Scene(root);
		int x = 0;
		int y = 0;
		playerImage.setX(x);
		playerImage.setY(y);
		myPlayer.setMovement(x, y, playerImage, primaryStage, gameScreen);
		myPlayer.playerMovement(gameScreen);
		primaryStage.setScene(gameScreen);
		primaryStage.show();
		
		
	}
}
