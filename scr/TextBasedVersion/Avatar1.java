package CrazyCodingClub.TextBasedVersion;


public class Avatar1{
	
	boolean collision = false;
	boolean health = true;
	int row;
	int column;
	
	
	Avatar1(int row, int column){
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
	
	public void collisionCheckRight(Obstacle1 o){
		if(row == o.getRow() && column+1 == o.getColumn()) {
			collision = true;
		}
	}
	public void collisionCheckLeft(Obstacle1 o){
		if(row == o.getRow() && column-1 == o.getColumn()) {
			collision = true;
		}
	}
	public void collisionCheckUp(Obstacle1 o){
		if(row-1 == o.getRow() && column == o.getColumn()) {
			collision = true;
		}
	}
	public void collisionCheckDown(Obstacle1 o){
		if(row+1 == o.getRow() && column == o.getColumn()) {
			collision = true;
		}
	}

}
