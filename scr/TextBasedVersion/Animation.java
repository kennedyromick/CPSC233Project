package CrazyCodingClub.TextBasedVersion;
import java.util.ArrayList;
import java.util.Scanner;

public class Animation {
	
	static ArrayList<Obstacle1> obstacles = new ArrayList<Obstacle1>();
	static Scanner scan = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		char[][] frame ={ {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}};
		
		Avatar1 avatar = new Avatar1(0,0);
		frame[avatar.getRow()][avatar.getColumn()] = '^';
	
		
		Obstacle1 o1 = new Obstacle1(2,4);
		frame[o1.getRow()][o1.getColumn()] = '*';
		obstacles.add(o1);
		Obstacle1 o2 = new Obstacle1(0,7);
		frame[o2.getRow()][o2.getColumn()] = '*';
		obstacles.add(o2);
		Obstacle1 o3 = new Obstacle1(5,4);
		frame[o3.getRow()][o3.getColumn()] = '*';
		obstacles.add(o3);
		Obstacle1 o4 = new Obstacle1(7,8);
		frame[o4.getRow()][o4.getColumn()] = '*';
		obstacles.add(o4);
		Obstacle1 o5 = new Obstacle1(4,7);
		frame[o5.getRow()][o5.getColumn()] = '*';
		obstacles.add(o5);
		Obstacle1 o6 = new Obstacle1(3,9);
		frame[o6.getRow()][o6.getColumn()] = '*';
		obstacles.add(o6);
		
		
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
		while(ascii != 101) {
			if(ascii == 100) {
				frame[avatar.getRow()][avatar.getColumn()] = '-';
				for(Obstacle1 o : obstacles) {
					avatar.collisionCheckRight(o);
				}
				avatar.right();
				avatar.collision = false;
				frame[avatar.getRow()][avatar.getColumn()] = '^';
			}
			else if(input == 97) {
				frame[avatar.getRow()][avatar.getColumn()] = '-';
				for(Obstacle1 o : obstacles) {
					avatar.collisionCheckLeft(o);
				}
				avatar.left();
				avatar.collision = false;
				frame[avatar.getRow()][avatar.getColumn()] = '^';
			}
			else if(input == 119) {
				frame[avatar.getRow()][avatar.getColumn()] = '-';
				for(Obstacle1 o : obstacles) {
					avatar.collisionCheckUp(o);
				}
				avatar.up();
				avatar.collision = false;
				frame[avatar.getRow()][avatar.getColumn()] = '^';
			}
			else if(input == 115) {
				frame[avatar.getRow()][avatar.getColumn()] = '-';
				for(Obstacle1 o : obstacles) {
					avatar.collisionCheckDown(o);
				}
				avatar.down();
				avatar.collision = false;
				frame[avatar.getRow()][avatar.getColumn()] = '^';
			}
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
		input = scan.next().charAt(0);
		ascii = (int)input;
		if(input == 101) {
			System.out.print("Done!");
		}
		}

	}
}



	
