import java.util.ArrayList;



import javafx.animation.PathTransition;

import javafx.animation.Timeline;

import javafx.scene.paint.Color;

import javafx.scene.shape.CubicCurveTo;

import javafx.scene.shape.MoveTo;

import javafx.scene.shape.Path;

import javafx.util.Duration;



public class EnemyList extends ArrayList<Enemy>

{



	public EnemyList(int i)
	{
		if(i == 1) {
			makeEnemies1();
		}
		else if (i==2) {
			makeEnemies2();
		}
		else if(i==3) {
			makeEnemies3();
		}
	}

	
public void makeEnemies1() {	
}
public void makeEnemies2() {	
}
	
public void makeEnemies3()
{
	final Enemy e1 = new Enemy(0, 0, 40, 40);
	e1.setFill(Color.RED);
	Path path1 = new Path();
	path1.getElements().add(new MoveTo(50,50));
	path1.getElements().add(new CubicCurveTo(500, 300, 700, 500, 900, 1950));
	//path1.getElements().add(new CubicCurveTo(100, 700, 100, 200, 400, 200));
	PathTransition pathTransition1 = new PathTransition();
	pathTransition1.setDuration(Duration.millis(5000));
	pathTransition1.setPath(path1);
	pathTransition1.setNode(e1);
	pathTransition1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
	pathTransition1.setCycleCount(Timeline.INDEFINITE);
	pathTransition1.setAutoReverse(false);
	pathTransition1.play();

//final Enemy e2 = new Enemy (0, 0, 40, 40);
//e2.setFill(Color.RED);
//Path path2 = new Path();
//path2.getElements().add(new MoveTo(450,750));
//path2.getElements().add(new CubicCurveTo(700, 0, 200, 800, 30, 10));
//path2.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
//PathTransition pathTransition2 = new PathTransition();
//pathTransition2.setDuration(Duration.millis(4500));
//pathTransition2.setPath(path2);
//pathTransition2.setNode(e2);
//pathTransition2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//pathTransition2.setCycleCount(Timeline.INDEFINITE);
//pathTransition2.setAutoReverse(true);
//pathTransition2.play();
//
//final Enemy e3 = new Enemy (0, 0, 40, 40);
//e3.setFill(Color.RED);
//Path path3 = new Path();
//path3.getElements().add(new MoveTo(1350,800));
//path3.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
//path3.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
//PathTransition pathTransition3 = new PathTransition();
//pathTransition3.setDuration(Duration.millis(3500));
//pathTransition3.setPath(path3);
//pathTransition3.setNode(e3);
//pathTransition3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//pathTransition3.setCycleCount(Timeline.INDEFINITE);
//pathTransition3.setAutoReverse(true);
//pathTransition3.play();
//
//
//final Enemy e4 = new Enemy(300, 300, 40, 40);
//e4.setFill(Color.RED);
//Path path4 = new Path();
//path4.getElements().add(new MoveTo(100, 800));
//path4.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
//path4.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
//PathTransition pathTransition4 = new PathTransition();
//pathTransition4.setDuration(Duration.millis(2000));
//pathTransition4.setPath(path4);
//pathTransition4.setNode(e4);
//pathTransition4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//pathTransition4.setCycleCount(Timeline.INDEFINITE);
//pathTransition4.setAutoReverse(true);
//pathTransition4.play();

add(e1);
//add(e2);
//add(e3);
//add(e4);
}

}