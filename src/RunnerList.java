package FinalProject;
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
		Runner e1 = new Runner(1300, 730, 30, 30, 50, 50, 600, 810, 0, 3);
		Runner e2 = new Runner(3000, 460, 50, 30, 300, 300, 450, 547, 0, 2);
		Runner e3 = new Runner(6000, 547, 50, 30, 590, 680, 460, 460, 2, 0);
		Runner e4 = new Runner(1200, 460, 50, 50, 500, 500, 450, 547, 0, 2);
		Runner e5 = new Runner(2500, 660, 30, 30, 600, 600, 650, 800, 0, 2);
		Runner e6 = new Runner(4000, 460, 50, 30, 300, 300, 450, 547, 0, 2);
		Runner e7 = new Runner(3000, 460, 50, 30, 300, 300, 450, 547, 0, 2);
		Runner e8 = new Runner(3300, 460, 50, 30, 300, 300, 450, 547, 0, 2);
		Runner e9 = new Runner(3300, 460, 50, 30, 300, 300, 450, 547, 0, 2);
		Runner e10 = new Runner(4000, 600, 50, 30, 300, 300, 450, 547, 0, 2);
		Runner e11 = new Runner(4200, 460, 50, 30, 300, 300, 450, 547, 0, 2);
		Runner e12 = new Runner(6000, 547, 50, 30, 590, 680, 460, 460, 2, 0);
		Runner e13 = new Runner(5000, 460, 50, 50, 500, 500, 450, 547, 0, 2);
		Runner e14 = new Runner(5500, 660, 30, 30, 600, 600, 650, 800, 0, 2);
		
		add(e1);
		add(e2);
		add(e3);
		add(e4);
		add(e5);
		add(e6);
		add(e7);
		add(e8);
		add(e9);
		add(e10);
		add(e11);
		add(e12);
		add(e13);
		add(e14);
	}
	
	public void makeRunners1() {
		Runner first = new Runner(0,0,0,0,0,0,0,0,0,0);
	}
	
	public void makeRunners3() {
		
	}


}
