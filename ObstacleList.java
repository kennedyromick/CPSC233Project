package FinalProject;

import java.util.ArrayList;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class ObstacleList extends ArrayList<Obstacle>
{
	public ObstacleList()
		{
			makeObstacles();
		}

	public void makeObstacles()
	{
	Obstacle i = new Obstacle(0,800,1350,50); //floor
	Obstacle ii = new Obstacle(0,0,1350,50);  //ceiling
	Obstacle iii = new Obstacle(1450,150,100,10);
		TranslateTransition trans3 = new TranslateTransition(Duration.millis(6000), iii);
		trans3.setFromX(1450);
		trans3.setToX(-3000);
		trans3.setFromY(150); 
		trans3.setToY(150);
		trans3.setCycleCount(Timeline.INDEFINITE);
		trans3.setAutoReverse(false);
		trans3.play();
	Obstacle iv = new Obstacle(1350,350,100,10);
		TranslateTransition trans4 = new TranslateTransition(Duration.millis(5870), iv);
		trans4.setFromX(1350);
		trans4.setToX(-3000);
		trans4.setFromY(350);
		trans4.setToY(350);
		trans4.setCycleCount(Timeline.INDEFINITE);
		trans4.setAutoReverse(false);
		trans4.play();
	Obstacle v = new Obstacle(1400,300,200,10);
		TranslateTransition trans5 = new TranslateTransition(Duration.millis(5938), v);
		trans5.setFromX(1400);
		trans5.setToX(-3000);
		trans5.setFromY(300);
		trans5.setToY(300);
		trans5.setCycleCount(Timeline.INDEFINITE);
		trans5.setAutoReverse(false);
		trans5.play();
	Obstacle vi = new Obstacle(1200,100,200,10);
		TranslateTransition trans6 = new TranslateTransition(Duration.millis(5668), vi);
		trans6.setFromX(1200);
		trans6.setToX(-3000);
		trans6.setFromY(100);
		trans6.setToY(100);
		trans6.setCycleCount(Timeline.INDEFINITE);
		trans6.setAutoReverse(false);
		trans6.play();
	Obstacle vii = new Obstacle(1800,250,100,10);
		TranslateTransition trans7 = new TranslateTransition(Duration.millis(6478), vii);
		trans7.setFromX(1800);
		trans7.setToX(-3000);
		trans7.setFromY(250);
		trans7.setToY(250);
		trans7.setCycleCount(Timeline.INDEFINITE);
		trans7.setAutoReverse(false);
		trans7.play();
	Obstacle viii = new Obstacle(1500,200,100,10);
		TranslateTransition trans8 = new TranslateTransition(Duration.millis(6073), viii);
		trans8.setFromX(1500);
		trans8.setToX(-3000);
		trans8.setFromY(200);
		trans8.setToY(200);
		trans8.setCycleCount(Timeline.INDEFINITE);
		trans8.setAutoReverse(false);
		trans8.play();
	Obstacle ix = new Obstacle(1900,150,100,10);
		TranslateTransition trans9 = new TranslateTransition(Duration.millis(6613), ix);
		trans9.setFromX(1900);
		trans9.setToX(-3000);
		trans9.setFromY(150);
		trans9.setToY(150);
		trans9.setCycleCount(Timeline.INDEFINITE);
		trans9.setAutoReverse(false);
		trans9.play();
	Obstacle x = new Obstacle(2400,50,100,10);
		TranslateTransition trans10 = new TranslateTransition(Duration.millis(7287), x);
		trans10.setFromX(2400);
		trans10.setToX(-3000);
		trans10.setFromY(50);
		trans10.setToY(50);
		trans10.setCycleCount(Timeline.INDEFINITE);
		trans10.setAutoReverse(false);
		trans10.play();
	Obstacle xi = new Obstacle(2800,350,100,10);
		TranslateTransition trans11 = new TranslateTransition(Duration.millis(7827), xi);
		trans11.setFromX(2800);
		trans11.setToX(-3000);
		trans11.setFromY(350);
		trans11.setToY(350);
		trans11.setCycleCount(Timeline.INDEFINITE);
		trans11.setAutoReverse(false);
		trans11.play();
	Obstacle xii = new Obstacle(2900,300,100,10);
		TranslateTransition trans12 = new TranslateTransition(Duration.millis(9277), xii);
		trans12.setFromX(2900);
		trans12.setToX(-4000);
		trans12.setFromY(350);
		trans12.setToY(350);
		trans12.setCycleCount(Timeline.INDEFINITE);
		trans12.setAutoReverse(false);
		trans12.play();
	Obstacle xiii = new Obstacle(3000,200,100,10);
		TranslateTransition trans13 = new TranslateTransition(Duration.millis(9447), xiii);
		trans13.setFromX(3000);
		trans13.setToX(-4000);
		trans13.setFromY(200);
		trans13.setToY(200);
		trans13.setCycleCount(Timeline.INDEFINITE);
		trans13.setAutoReverse(false);
		trans13.play();
		
	add(i);
	add(ii);
	add(iii);
	add(iv);
	add(v);
	add(vi);
	add(vii);
	add(viii);
	add(ix);
	add(x);
	add(xi);
	add(xii);
	add(xiii);
	

	}

}
