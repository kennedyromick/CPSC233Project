import java.util.ArrayList;

public class ObstacleList extends ArrayList<Obstacle>
{
	private int counterH = 0;
	private int counterV = 0;
	private int end; //length of level
	private int xH = 500;
	private int yH = 700;
	private int yV = 0;
	private int xV = 500;
	private int widthV = 200;
	private int heightV = 10;
	private int yCountV = 0;
	private int [] yValuesH = {0,0,700,0,0,700,700,0,700,0,700}; //yvalues for horizontal platforms (looped through)
	private int [] yValuesV = {685,550,200,150,300,400,650,500,600,130,350}; //yvalues for vertical platforms (looped through)
	private int widthH = 10;
	private int heightH = 100;
	private int yCountH = 0;
	//limits how many obstacles are made
	private int limitV; 
	private int limitH;
	
	public ObstacleList(int level)
		{
		//creates level one
		if(level == 1) {
			setEnd(2500);
			setLimitH(6);
			setLimitV(12);
			makeObstaclesV();
			makeObstaclesH();
			makeFloors();
		}
		//creates level 2
		else if (level==2) {
			setEnd(5000);
			setLimitH(17);
			setLimitV(35);
			makeObstaclesV();
			makeObstaclesH();
			makeFloors();
		}
		//creates level 3
		else if(level==3) {
			setEnd(5000);
			setLimitV(35);
			makeObstaclesV();
			makeGaps();
		}
		}
	
	public void setLimitV(int limit) {
		limitV = limit;
	}
	public void setLimitH(int limit) {
		limitH = limit;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	//makes horizontal platforms
	public void makeObstaclesH() {
		while(xH<end) {
			xH+= 100;
			while(counterH<=limitH) {
				add(new Obstacle(xH,yH,widthH,heightH));
				yH = yValuesH[yCountH];
				yCountH = yCountH +1;
				xH+= 200;
				counterH = counterH +1;
				if(yCountH == 11) {
					yCountH = 0;
				}
			}
			yH=0;
		}
	}
	
	//makes vertical platforms
	public void makeObstaclesV() {
		while(xV<end) {
			xV+= 100;
			while(counterV<=limitV) {
				add(new Obstacle(xV,yV,widthV,heightV));
				yV = yValuesV[yCountV];
				yCountV = yCountV +1;
				xV+= 100;
				counterV = counterV +1;
				if(yCountV == 11) {
					yCountV = 0;
				}
			}
			yV=0;
		}
	}
	
	//makes floors and ceilings for levels 1 and 2
	public void makeFloors() {
		Obstacle i = new Obstacle(0,800,end-500,20); //floor
		Obstacle ii = new Obstacle(0,0,end-500,20);  //ceiling
		add(ii);
		add(i);
	}
	
	//makes gapped floors for level 3
	public void makeGaps() {
		int counter = 0;
		int n = 4000;
		int x = -50;
		int y = 00;
		int width = 120;
		int height = 20;
		int yCount = 0;
		int [] yValues = {0,780,0,780,0,780,0,780,0,780,0};	
		
		Obstacle i = new Obstacle(0,780,600,20); //starting platform
		add(i);
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
