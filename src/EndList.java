import java.util.ArrayList;

public class EndList extends ArrayList<End>
{
	//when avatar reaches the end wall the level is cleared
	public EndList(int level)
		{
		//creates level 1 end
		if(level == 1) {
			makeEnd1();
		}
		//creates level 2 end
		else if (level==2) {
			makeEnd2();
		}
		//creates level 3 end
		else if(level==3) {
			makeEnd3();
		}
		}
	
	//LevelOne
	public void makeEnd1() {
		add(new End(1990,0,20,820));
	}
	//LevelTwo
	public void makeEnd2() {
		add(new End(4490,0,20,820));
	}
	//LevelThree
	public void makeEnd3() {
		add(new End(4490,0,20,820));
	}
}
	