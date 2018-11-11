import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Player {
	private int x;
	private int y;
	private ImageView playerImage;
	private Stage primaryStage;
	private int[][] myArray;
	private Scene gameScreen;

	public void setMovement(int x, int y, ImageView playerImage, Stage primaryStage, Scene gameScreen,
			int[][] myArray) {
		this.playerImage = playerImage;
		this.x = x;
		this.y = y;
		this.primaryStage = primaryStage;
		this.gameScreen = gameScreen;
		this.myArray = myArray;
	}

	public String getPlayerImg() {
		return "file:src/infernape.png";
	}

	public void playerMovement(Scene gameScreen) {
		gameScreen.setOnKeyPressed(this::listenUp);

	}

	public void listenUp(KeyEvent event) {
		KeyCode myCode = event.getCode();
		int row = 0;
		int column = 0;
		if (myCode == KeyCode.LEFT) {
			if (myArray[row][column - 1] == 1) {
				x -= 0;
			} else {
				x -= 20;
				column -= 1;
			}
		} else if (myCode == KeyCode.RIGHT) {
			if (myArray[row][column + 1] == 1) {
				x += 0;
			} else {
				x += 20;
				column += 1;
			}
		} else if (myCode == KeyCode.DOWN) {
			if (myArray[row + 1][column] == 1) {
				y += 0;
			} else {
				y += 20;
				row += 1;
			}
		} else if (myCode == KeyCode.UP) {
			if(myArray[row - 1][column] == 1) {
				y -= 0;
			}else {
			y -= 20;
			row -= 1;
			}
		}
		playerImage.setX(x);
		playerImage.setY(y);

	}

}
