import java.util.ArrayList;
import java.util.Scanner;

public class TextBasedLevelThree {
	

	static ArrayList<TextBasedObstacle> obstacles = new ArrayList<TextBasedObstacle>();
	static ArrayList<TextBasedEnemies> enemies = new ArrayList<TextBasedEnemies>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("level three");
		char[][] frame ={ {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}};

		TextBasedAvatar avatar = new TextBasedAvatar(0,0);
		frame[avatar.getRow()][avatar.getColumn()] = '^';
		
		TextBasedObstacle o1 = new TextBasedObstacle(1,4);
		frame[o1.getRow()][o1.getColumn()] = '*';
		obstacles.add(o1);
		TextBasedObstacle o2 = new TextBasedObstacle(0,7);
		frame[o2.getRow()][o2.getColumn()] = '*';
		obstacles.add(o2);
		TextBasedObstacle o3 = new TextBasedObstacle(5,4);
		frame[o3.getRow()][o3.getColumn()] = '*';
		obstacles.add(o3);
		TextBasedObstacle o4 = new TextBasedObstacle(0,1);
		frame[o4.getRow()][o4.getColumn()] = '*';
		obstacles.add(o4);
		TextBasedObstacle o5 = new TextBasedObstacle(8,6);
		frame[o5.getRow()][o5.getColumn()] = '*';
		obstacles.add(o5);
		TextBasedObstacle o6 = new TextBasedObstacle(3,3);
		frame[o6.getRow()][o6.getColumn()] = '*';
		obstacles.add(o6);
		TextBasedObstacle o7 = new TextBasedObstacle(6,2);
		frame[o7.getRow()][o7.getColumn()] = '*';
		obstacles.add(o7);
		
		
		TextBasedEnemies e1 = new TextBasedEnemies(2,6);
		frame[e1.getRow()][e1.getColumn()] = '#';
		enemies.add(e1);
		TextBasedEnemies e2 = new TextBasedEnemies(2,2);
		frame[e2.getRow()][e2.getColumn()] = '#';
		enemies.add(e2);
		TextBasedEnemies e3 = new TextBasedEnemies(4,5);
		frame[e3.getRow()][e3.getColumn()] = '#';
		enemies.add(e3);
		TextBasedEnemies e4 = new TextBasedEnemies(6,7);
		frame[e4.getRow()][e4.getColumn()] = '#';
		enemies.add(e4);
		TextBasedEnemies e5 = new TextBasedEnemies(7,3);
		frame[e5.getRow()][e5.getColumn()] = '#';
		enemies.add(e5);
		TextBasedEnemies e6 = new TextBasedEnemies(8,7);
		frame[e6.getRow()][e6.getColumn()] = '#';
		enemies.add(e6);

		System.out.println(frame[0][0] + " " + frame[0][1] + " " + frame[0][2] + " " + frame[0][3] + " " + frame[0][4] + " " + frame[0][5] + " " + frame[0][6] + " " + frame[0][7] + " " + frame[0][8] + " " + frame[0][9]);
		System.out.println(frame[1][0] + " " + frame[1][1] + " " + frame[1][2] + " " + frame[1][3] + " " + frame[1][4] + " " + frame[1][5] + " " + frame[1][6] + " " + frame[1][7] + " " + frame[1][8] + " " + frame[1][9]);
		System.out.println(frame[2][0] + " " + frame[2][1] + " " + frame[2][2] + " " + frame[2][3] + " " + frame[2][4] + " " + frame[2][5] + " " + frame[2][6] + " " + frame[2][7] + " " + frame[2][8] + " " + frame[2][9]);
		System.out.println(frame[3][0] + " " + frame[3][1] + " " + frame[3][2] + " " + frame[3][3] + " " + frame[3][4] + " " + frame[3][5] + " " + frame[3][6] + " " + frame[3][7] + " " + frame[3][8] + " " + frame[3][9]);
		System.out.println(frame[4][0] + " " + frame[4][1] + " " + frame[4][2] + " " + frame[4][3] + " " + frame[4][4] + " " + frame[4][5] + " " + frame[4][6] + " " + frame[4][7] + " " + frame[4][8] + " " + frame[4][9]);
		System.out.println(frame[5][0] + " " + frame[5][1] + " " + frame[5][2] + " " + frame[5][3] + " " + frame[5][4] + " " + frame[5][5] + " " + frame[5][6] + " " + frame[5][7] + " " + frame[5][8] + " " + frame[5][9]);
		System.out.println(frame[6][0] + " " + frame[6][1] + " " + frame[6][2] + " " + frame[6][3] + " " + frame[6][4] + " " + frame[6][5] + " " + frame[6][6] + " " + frame[6][7] + " " + frame[6][8] + " " + frame[6][9]);
		System.out.println(frame[7][0] + " " + frame[7][1] + " " + frame[7][2] + " " + frame[7][3] + " " + frame[7][4] + " " + frame[7][5] + " " + frame[7][6] + " " + frame[7][7] + " " + frame[7][8] + " " + frame[7][9]);
		System.out.println(frame[8][0] + " " + frame[8][1] + " " + frame[8][2] + " " + frame[8][3] + " " + frame[8][4] + " " + frame[8][5] + " " + frame[8][6] + " " + frame[8][7] + " " + frame[8][8] + " " + frame[8][9]);
		System.out.println(frame[9][0] + " " + frame[9][1] + " " + frame[9][2] + " " + frame[9][3] + " " + frame[9][4] + " " + frame[9][5] + " " + frame[9][6] + " " + frame[9][7] + " " + frame[9][8] + " " + frame[9][9]);
		System.out.print("Enter in move ");
		char input = scan.next().charAt(0);
		int ascii = (int)input;
		while(ascii != 101 && avatar.getGameOver() == false) {
			if(avatar.getComplete() == true) {
				System.out.println("Game Complete!");
			}
			if(avatar.getGameOver() == true) {
				break;
			}
			else if(ascii == 100) {
				frame[avatar.getRow()][avatar.getColumn()] = '-';
				for(TextBasedObstacle o : obstacles) {
					avatar.collisionCheckRight(o);
				}
				avatar.right();
				for(TextBasedEnemies e: enemies) {
					avatar.collisionCheck(e);
				}
				if(avatar.getGameOver() == false) {
					avatar.setCollision(false);
					frame[avatar.getRow()][avatar.getColumn()] = '^';
				}
				else {
					System.out.println("Game Over!");
				}
			}
			else if(input == 97) {
				frame[avatar.getRow()][avatar.getColumn()] = '-';
				for(TextBasedObstacle o : obstacles) {
					avatar.collisionCheckLeft(o);
				}
				avatar.left();
				for(TextBasedEnemies e: enemies) {
					avatar.collisionCheck(e);
				}
				if(avatar.getGameOver() == false) {
					avatar.setCollision(false);
					frame[avatar.getRow()][avatar.getColumn()] = '^';
				}
				else {
					System.out.println("Game Over!");
				}
			}
			else if(input == 119) {
				frame[avatar.getRow()][avatar.getColumn()] = '-';
				for(TextBasedObstacle o : obstacles) {
					avatar.collisionCheckUp(o);
				}
				avatar.up();
				for(TextBasedEnemies e: enemies) {
					avatar.collisionCheck(e);
				}
				if(avatar.getGameOver() == false) {
					avatar.setCollision(false);
					frame[avatar.getRow()][avatar.getColumn()] = '^';
				}
				else {
					System.out.println("Game Over!");
				}

			}
			else if(input == 115) {
				frame[avatar.getRow()][avatar.getColumn()] = '-';
				for(TextBasedObstacle o : obstacles) {
					avatar.collisionCheckDown(o);
				}
				avatar.down();
				for(TextBasedEnemies e: enemies) {
					avatar.collisionCheck(e);
				}
				if(avatar.getGameOver() == false) {
					avatar.setCollision(false);
					frame[avatar.getRow()][avatar.getColumn()] = '^';
				}
				else {
					System.out.println("Game Over!");
				}
			}
		if(avatar.getGameOver() == false && avatar.getComplete() == false) {
		System.out.println(frame[0][0] + " " + frame[0][1] + " " + frame[0][2] + " " + frame[0][3] + " " + frame[0][4] + " " + frame[0][5] + " " + frame[0][6] + " " + frame[0][7] + " " + frame[0][8] + " " + frame[0][9]);
		System.out.println(frame[1][0] + " " + frame[1][1] + " " + frame[1][2] + " " + frame[1][3] + " " + frame[1][4] + " " + frame[1][5] + " " + frame[1][6] + " " + frame[1][7] + " " + frame[1][8] + " " + frame[1][9]);
		System.out.println(frame[2][0] + " " + frame[2][1] + " " + frame[2][2] + " " + frame[2][3] + " " + frame[2][4] + " " + frame[2][5] + " " + frame[2][6] + " " + frame[2][7] + " " + frame[2][8] + " " + frame[2][9]);
		System.out.println(frame[3][0] + " " + frame[3][1] + " " + frame[3][2] + " " + frame[3][3] + " " + frame[3][4] + " " + frame[3][5] + " " + frame[3][6] + " " + frame[3][7] + " " + frame[3][8] + " " + frame[3][9]);
		System.out.println(frame[4][0] + " " + frame[4][1] + " " + frame[4][2] + " " + frame[4][3] + " " + frame[4][4] + " " + frame[4][5] + " " + frame[4][6] + " " + frame[4][7] + " " + frame[4][8] + " " + frame[4][9]);
		System.out.println(frame[5][0] + " " + frame[5][1] + " " + frame[5][2] + " " + frame[5][3] + " " + frame[5][4] + " " + frame[5][5] + " " + frame[5][6] + " " + frame[5][7] + " " + frame[5][8] + " " + frame[5][9]);
		System.out.println(frame[6][0] + " " + frame[6][1] + " " + frame[6][2] + " " + frame[6][3] + " " + frame[6][4] + " " + frame[6][5] + " " + frame[6][6] + " " + frame[6][7] + " " + frame[6][8] + " " + frame[6][9]);
		System.out.println(frame[7][0] + " " + frame[7][1] + " " + frame[7][2] + " " + frame[7][3] + " " + frame[7][4] + " " + frame[7][5] + " " + frame[7][6] + " " + frame[7][7] + " " + frame[7][8] + " " + frame[7][9]);
		System.out.println(frame[8][0] + " " + frame[8][1] + " " + frame[8][2] + " " + frame[8][3] + " " + frame[8][4] + " " + frame[8][5] + " " + frame[8][6] + " " + frame[8][7] + " " + frame[8][8] + " " + frame[8][9]);
		System.out.println(frame[9][0] + " " + frame[9][1] + " " + frame[9][2] + " " + frame[9][3] + " " + frame[9][4] + " " + frame[9][5] + " " + frame[9][6] + " " + frame[9][7] + " " + frame[9][8] + " " + frame[9][9]);
		System.out.print("Enter in move ");
		}
		input = scan.next().charAt(0);
		ascii = (int)input;
		if(input == 101) {
			System.out.print("Done!");
		}
		}

	}

}
	
