
public class TextBasedEnemies {

	int row;
	int column;
	boolean collision = false;
	int counter = 0;
	int move = 1;

	public TextBasedEnemies(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}
	public void setRow(int i) {
		row = i;
	}

	public int getColumn() {
		return column;
	}
	
	public void move() {
		if(counter<=1) {
			counter = counter +1;
			setRow(getRow()+move);
		}
		else {
			counter = 0;
			move = move*(-1);
		}
		}
	}


