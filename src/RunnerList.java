import java.util.ArrayList;

import javafx.scene.paint.Color;

public class RunnerList extends ArrayList<Runner> {
	
	private int counter = 0;
	private int freq; //distance between each enemy
	private int end = 2000;
	private int x = 500;
	private int y = 0;
	private int width = 30;
	private int height = 30;
	private int yCount = 0;
	private int disCount = 0;
	//speed of the moveable enemies
	private int vel = 2;
	private int disMoved = 150;
	//limits how mant enemies are created (more enemies in level three than two)
	private int limit;
	//y start positions and range of movement lists that are looped through
	private int [] yValues = {700,550,200,150,300,400,650,500,600,100,350,730,700,120,140};
	private int [] dis = {50,100,150,200,75,175};
	
	
	public RunnerList(int level)
	{
		//creates level 1
		if(level == 1) {
		}
		//creates level 2
		else if (level==2) {
			limit = 38;
			freq = 100;
			makeRunners();
		}
		//creates level 3
		else if(level==3) {
			limit = 52;
			freq = 30;
			makeRunners();
		}
	}
	
	//creates moveable enemies
	public void makeRunners() {
		while(x<end) {
			x+= 100;
			while(counter<=limit) {
				if(counter%2 == 0) {
					add(new Runner(x,y,width,height,y-5,y+disMoved,vel));
					y = yValues[yCount];
					disMoved = dis[disCount];
					yCount = yCount +1;
					disCount = disCount +1;
					x+= freq;
					counter = counter +1;
					if(yCount == 15) {
						yCount = 0;
					}
					if(disCount == 6) {
						disCount = 0;
					}
				}
				else if(counter%2 == 1) {
					add(new Runner(x,y-disMoved,width,height,y-disMoved-1,y,vel));
					y = yValues[yCount];
					yCount = yCount +1;
					x+= 100;
					counter = counter +1;
					if(yCount == 11) {
						yCount = 0;
					}
				}
			}
			y=0;
		}
	}

}
