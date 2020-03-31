import java.util.ArrayList;

import javafx.scene.paint.Color;

public class RunnerList extends ArrayList<Runner> {
	
	public RunnerList(int i)
	{
		if(i == 1) {
			makeRunners1();
		}
		else if (i==2) {
			makeRunners2();
		}
		else if(i==3) {
			makeRunners3();
		}
	}
	public void makeRunners2()
	{	
		Runner first = new Runner(150, 730, 30, 30, 150, 150, 600, 810, 0, 3);
		Runner second = new Runner(300, 460, 50, 30, 300, 300, 450, 547, 0, 2);
//		Runner third = new Runner(600, 547, 50, 30, 590, 680, 460, 460, 2, 0);
		Runner fourth = new Runner(500, 460, 50, 50, 500, 500, 450, 547, 0, 2);
		Runner fifth = new Runner(600, 660, 30, 30, 600, 600, 650, 800, 0, 2);
		Runner sixth = new Runner(300, 460, 50, 30, 300, 300, 450, 547, 0, 2);
		Runner seventh = new Runner(300, 460, 50, 30, 300, 300, 450, 547, 0, 2);
		Runner eighth = new Runner(300, 460, 50, 30, 300, 300, 450, 547, 0, 2);
		
		add(first);
		add(second);
//		add(third);
		add(fourth);
		add(fifth);
//		add(sixth);
//		add(seventh);
//		add(eighth);
	}
	
	public void makeRunners1() {
		Runner first = new Runner(0,0,0,0,0,0,0,0,0,0);
	}
	
	public void makeRunners3() {
		
	}


}
