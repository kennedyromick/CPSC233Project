
import java.util.ArrayList;

import javafx.animation.PathTransition;

import javafx.animation.Timeline;

import javafx.scene.paint.Color;

import javafx.scene.shape.CubicCurveTo;

import javafx.scene.shape.MoveTo;

import javafx.scene.shape.Path;

import javafx.util.Duration;


public class MeteorList extends ArrayList<Meteor>

{
	public MeteorList(int level)
	{
		//makes level 1
		if(level == 1) {
		}
		//makes level 2
		else if (level ==2) {
		}
		//makes level 3
		else if(level ==3) {
			makeMeteors();
		}
	}
	//creates the meteors
	public void makeMeteors()
	{
		int x = 300;
		int y = 0;
		int width = 40;
		int height = 40;
		int [] xstartValues = {500, 1000, 1400, 2700, 2200, 4500, 3300, 4100};
		int [] startyvalue = {2000, 3500, 500, 3500, 4000, 3000, 4000, 3500};
		int endyvalue = -30;
		int [] end = {1850, 1900, 1870, 1836, 1905, 1850, 1875, 1800};
		int [] velX = {5, 5, -5, 5, 5, -5, 5, -5};
		int velY = 5;
		//loops through xstartValues to creates meteors in new spots
		for(int i = 0; i <= xstartValues.length-1; i++) 
			{
				add(new Meteor(x,y,width,height, xstartValues[i], startyvalue[i], endyvalue, end[i], velX[i], velY));
			}
	}	

}