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
		int counter = 0;
		int n = 2000;
		int x = 500;
		int y = 00;
		int width = 30;
		int height = 30;
		int yCount = 0;
		int disCount = 0;
		int vel = 2;
		int disMoved = 150;
		int [] yValues = {700,550,200,150,300,400,650,500,600,100,350,730,700,120,140};
		int [] dis = {50,100,150,200,75,175};
		
		while(x<n) {
			x+= 100;
			while(counter<=38) {
				if(counter%2 == 0) {
					add(new Runner(x,y,width,height,y-5,y+disMoved,vel));
					y = yValues[yCount];
					disMoved = dis[disCount];
					yCount = yCount +1;
					disCount = disCount +1;
					x+= 100;
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
	
	public void makeRunners1() {
	}
	
	public void makeRunners3() {
		int counter = 0;
		int n = 2000;
		int x = 500;
		int y = 00;
		int width = 30;
		int height = 30;
		int yCount = 0;
		int disCount = 0;
		int vel = 2;
		int disMoved = 150;
		int [] yValues = {700,550,200,150,300,400,650,500,600,100,350,730,700,120,140};
		int [] dis = {50,100,150,200,75,175};
		
		while(x<n) {
			x+= 100;
			while(counter<=52) {
				if(counter%2 == 0) {
					add(new Runner(x,y,width,height,y-5,y+disMoved,vel));
					y = yValues[yCount];
					disMoved = dis[disCount];
					yCount = yCount +1;
					disCount = disCount +1;
					x+= 30;
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
