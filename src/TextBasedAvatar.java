
public class TextBasedAvatar{

	boolean collision = false;
	boolean health = true;
	boolean gameOver = false;
	int row;
	int column;

	public TextBasedAvatar(int row, int column){
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	public void up() {
		if(collision == false) {
			if(row>=1) {
				row = row-1;
			}
		}
	}

	public void down() {
		if(collision == false) {
			if(row <=8) {
				row = row+1;
			}
		}
	}

	public void left() {
		if(collision == false) {
			if(column >= 1) {
				column = column -1;
			}
		}
	}

	public void right() {
		if(collision == false) {
			if(column <= 8) {
				column = column +1;
			}
		}
	}
	
	public void collisionCheckRight(TextBasedObstacle o){
		if(row == o.getRow() && column+1 == o.getColumn()) {
			collision = true;
		}
	}

	public void collisionCheckLeft(TextBasedObstacle o){
		if(row == o.getRow() && column-1 == o.getColumn()) {
			collision = true;
		}
	}

	public void collisionCheckUp(TextBasedObstacle o){
		if(row-1 == o.getRow() && column == o.getColumn()) {
			collision = true;
		}
	}

	public void collisionCheckDown(TextBasedObstacle o){
		if(row+1 == o.getRow() && column == o.getColumn()) {
			collision = true;
		}
	}
	
	public boolean collisionCheck(TextBasedEnemies o){
		if(row == o.getRow() && column == o.getColumn()) {
			gameOver = true;
		}
		return gameOver;
	}



}