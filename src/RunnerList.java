import java.util.ArrayList;

import javafx.scene.paint.Color;

public class RunnerList extends ArrayList<Runner> {
	
	public RunnerList()
	{
		makeRunners();
	}
	public void makeRunners()
	{	
		Runner first = new Runner(50, 730, 30, 30, 50, 50, 600, 810, 0, 3);
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


}
