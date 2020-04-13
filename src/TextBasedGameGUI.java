import java.util.ArrayList;
import java.util.Scanner;

public class TextBasedGameGUI {
	

	static ArrayList<TextBasedObstacle> obstacles = new ArrayList<TextBasedObstacle>();
	static ArrayList<TextBasedEnemies> enemies = new ArrayList<TextBasedEnemies>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		TextBasedLevelOne.main(args);
	}
}
