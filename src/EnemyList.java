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
	PathTransition pathTransition1 = new PathTransition();
	pathTransition1.setDuration(Duration.millis(5000));
	pathTransition1.setPath(path1);
	pathTransition1.setNode(e1);
	pathTransition1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
	pathTransition1.setCycleCount(Timeline.INDEFINITE);
	pathTransition1.setAutoReverse(false);
	pathTransition1.play();

add(e1);
}

}