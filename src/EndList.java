package FinalProject;
import java.util.ArrayList;

public class EndList extends ArrayList<End>
{
	
	public EndList(int i)
		{
		if(i == 1) {
			makeEnd1();
		}
		else if (i==2) {
			makeEnd2();
		}
		else if(i==3) {
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
	