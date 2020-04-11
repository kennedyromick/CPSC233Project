package FinalProject;
import java.util.ArrayList;

public class ObstacleList extends ArrayList<Obstacle>
{
	
	public ObstacleList(int i)
		{
		if(i == 1) {
			makeObstaclesV1();
			makeObstaclesH1();
		}
		else if (i==2) {
			makeObstaclesV2();
			makeObstaclesH2();
		}
		else if(i==3) {
			makeObstacles3();
			makeGaps();
		}
		}
	
	public void makeObstaclesH1() {
		int counter = 0;
		int n = 2500;
		int x = 500;
		int y = 700;
		int width = 10;
		int height = 100;
		int yCount = 0;
		int [] yValues = {0,0,700,0,0,700,700,0,700,0,700};
		
		while(x<n) {
			x+= 100;
			while(counter<=6) {
				add(new Obstacle(x,y,width,height));
				y = yValues[yCount];
				yCount = yCount +1;
				x+= 200;
				counter = counter +1;
				if(yCount == 11) {
					yCount = 0;
				}
			}
			y=0;
		}
	}

	public void makeObstaclesV1()
	{	
	int counter = 0;
	Obstacle i = new Obstacle(0,800,2000,20); //floor
	Obstacle ii = new Obstacle(0,0,2000,20);  //ceiling
	add(ii);
	add(i);
	int n = 2500;
	int x = 500;
	int y = 00;
	int width = 200;
	int height = 10;
	int yCount = 0;
	int [] yValues = {685,550,200,150,300,400,650,500,600,130,350};
	
	while(x<n) {
		x+= 100;
		while(counter<=12) {
			add(new Obstacle(x,y,width,height));
			y = yValues[yCount];
			yCount = yCount +1;
			x+= 100;
			counter = counter +1;
			if(yCount == 11) {
				yCount = 0;
			}
		}
		y=0;
	}
	}

	public void makeObstaclesH2() {
		int counter = 0;
		int n = 2500;
		int x = 500;
		int y = 700;
		int width = 10;
		int height = 100;
		int yCount = 0;
		int [] yValues = {0,0,700,0,0,700,0,700,700,0,700};
		
		while(x<n) {
			x+= 100;
			while(counter<=17) {
				add(new Obstacle(x,y,width,height));
				y = yValues[yCount];
				yCount = yCount +1;
				x+= 200;
				counter = counter +1;
				if(yCount == 11) {
					yCount = 0;
				}
			}
			y=0;
		}
	}

	
	public void makeObstaclesV2() {
		int counter = 0;
		Obstacle i = new Obstacle(0,800,4500,20); //floor
		Obstacle ii = new Obstacle(0,0,4500,20);  //ceiling
		add(ii);
		add(i);
		int n = 4500;
		int x = 500;
		int y = 00;
		int width = 200;
		int height = 10;
		int yCount = 0;
		int [] yValues = {685,550,200,150,300,400,650,500,600,130,350};
		
		while(x<n) {
			x+= 100;
			while(counter<=35) {
				add(new Obstacle(x,y,width,height));
				y = yValues[yCount];
				yCount = yCount +1;
				x+= 100;
				counter = counter +1;
				if(yCount == 11) {
					yCount = 0;
				}
			}
			y=0;
		}
	}
	
	public void makeObstacles3() {
		int counter = 0;
		Obstacle i = new Obstacle(0,780,615,20); //floor
		add(i);
		int n = 4500;
		int x = 500;
		int y = 200;
		int width = 200;
		int height = 10;
		int yCount = 0;
		int [] yValues = {700,550,150,250,300,400,650,500,600,170,350};	
		
		while(x<n) {
			x+= 100;
			while(counter<=35) {
				add(new Obstacle(x,y,width,height));
				y = yValues[yCount];
				yCount = yCount +1;
				x+= 100;
				counter = counter +1;
				if(yCount == 11) {
					yCount = 0;
				}
			}
			y=0;
		}
	}
	
	public void makeGaps() {
		int counter = 0;
		int n = 4000;
		int x = -50;
		int y = 00;
		int width = 120;
		int height = 20;
		int yCount = 0;
		int [] yValues = {0,780,0,800,0,780,0,780,0,780,0};	
		
		while(x<n) {
			x+= 100;
			while(counter<=43) {
				add(new Obstacle(x,y,width,height));
				y = yValues[yCount];
				yCount = yCount +1;
				x+= 100;
				counter = counter +1;
				if(yCount == 11) {
					yCount = 0;
				}
			}
			y=0;
		}
	}
	


}
