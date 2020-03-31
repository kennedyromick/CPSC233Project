import java.util.ArrayList;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class ObstacleList extends ArrayList<Obstacle>
{
	
	
	public ObstacleList(int i)
		{
		if(i == 1) {
			makeObstacles1();
		}
		else if (i==2) {
			makeObstacles2();
		}
		else if(i==3) {
			makeObstacles3();
		}
		}

	public void makeObstacles1()
	{	
	Obstacle i = new Obstacle(0,800,4000,20); //floor
	Obstacle ii = new Obstacle(0,0,4000,20);  //ceiling
	Obstacle one = new Obstacle(0,700,200,10);
	Obstacle two = new Obstacle(200,500,200,10);
	Obstacle three = new Obstacle(400,450,100,10);
	Obstacle four = new Obstacle(500,200,200,10);
	Obstacle five = new Obstacle(700,600,200,10);
	Obstacle six = new Obstacle(900,500,150,10);
	Obstacle seven = new Obstacle(1050,200,250,10);
	Obstacle eight = new Obstacle(1200,700,150,10);
	Obstacle nine = new Obstacle(1350,300,200,10);
	Obstacle ten = new Obstacle(1550,200,250,10);
	Obstacle eleven = new Obstacle(1750,400,150,10);
	Obstacle twelve = new Obstacle(1900,300,200,10);
	Obstacle thirteen = new Obstacle(2100,200,200,10);
	Obstacle fourteen = new Obstacle(2300,600,200,10);
	Obstacle fifteen = new Obstacle(2500,700,200,10);
	Obstacle sixteen = new Obstacle(2700,100,100,10);
	Obstacle seventeen = new Obstacle(2800,700,250,10);
	Obstacle eighteen = new Obstacle(3050,200,150,10);
	Obstacle nineteen = new Obstacle(3300,300,200,10);
	Obstacle twenty = new Obstacle(3500,400,200,10);
	Obstacle twentyone = new Obstacle(3700,500,150,10);
	Obstacle twentytwo = new Obstacle(3850,400,150,10);
	Obstacle twentythree = new Obstacle(0,350,250,10);
	Obstacle twentyfour = new Obstacle(350,675,150,10);
	Obstacle twentyfive = new Obstacle(700,750,100,10);
	Obstacle twentysix = new Obstacle(750,150,200,10);
	Obstacle twentyseven = new Obstacle(1550,600,150,10);
	Obstacle twentyeight = new Obstacle(1700,700,100,10);
	Obstacle twentynine = new Obstacle(1400,500,220,10);
	Obstacle thirty = new Obstacle(2100,500,150,10);
	Obstacle thirtyone = new Obstacle(2300,400,250,10);
	Obstacle thirtytwo = new Obstacle(2500,550,150,10);
	Obstacle thirtythree = new Obstacle(2650,600,100,10);
	Obstacle thirtyfour = new Obstacle(2800,500,200,10);
	Obstacle thirtyfive = new Obstacle(2900,700,300,10);
	Obstacle thirtysix = new Obstacle(3000,400,200,10);
	Obstacle thirtyseven = new Obstacle(3200,600,150,10);
	Obstacle thirtyeight = new Obstacle(3500,700,200,10);
	Obstacle thirtynine = new Obstacle(3700,600,100,10);
	Obstacle forty = new Obstacle(3990,0,20,810);
		
	add(ii);
	add(i);
	add(one);
	add(two);
	add(three);
	add(four);
	add(five);
	add(six);
	add(seven);
	add(eight);
	add(nine);
	add(ten);
	add(eleven);
	add(twelve);
	add(thirteen);
	add(fourteen);
	add(fifteen);
	add(sixteen);
	add(seventeen);
	add(eighteen);
	add(nineteen);
	add(twenty);
	add(twentyone);
	add(twentytwo);
	add(twentythree);
	add(twentyfour);
	add(twentyfive);
	add(twentysix);
	add(twentyseven);
	add(twentyeight);
	add(twentynine);
	add(thirty);
	add(thirtyone);
	add(thirtytwo);
	add(thirtythree);
	add(thirtyfour);
	add(thirtyfive);
	add(thirtysix);
	add(thirtyseven);
	add(thirtyeight);
	add(thirtynine);
	add(forty);
	
	}
	
	public void makeObstacles2() {
		Obstacle i = new Obstacle(0,800,4000,20); //floor
		Obstacle ii = new Obstacle(0,0,4000,20);  //ceiling
		Obstacle one = new Obstacle(0,700,200,10);
		Obstacle two = new Obstacle(200,500,200,10);
		Obstacle three = new Obstacle(400,450,100,10);
		Obstacle four = new Obstacle(500,200,200,10);
		Obstacle five = new Obstacle(700,600,200,10);
		Obstacle six = new Obstacle(900,500,150,10);
		Obstacle seven = new Obstacle(1050,200,250,10);
		Obstacle eight = new Obstacle(1200,700,150,10);
		Obstacle nine = new Obstacle(1350,300,200,10);
		Obstacle ten = new Obstacle(1550,200,250,10);
		Obstacle eleven = new Obstacle(1750,400,150,10);
		Obstacle twelve = new Obstacle(1900,300,200,10);
		Obstacle thirteen = new Obstacle(2100,200,200,10);
		Obstacle fourteen = new Obstacle(2300,600,200,10);
		Obstacle fifteen = new Obstacle(2500,700,200,10);
		Obstacle sixteen = new Obstacle(2700,100,100,10);
		Obstacle seventeen = new Obstacle(2800,700,250,10);
		Obstacle eighteen = new Obstacle(3050,200,150,10);
		Obstacle nineteen = new Obstacle(3300,300,200,10);
		Obstacle twenty = new Obstacle(3500,400,200,10);
		Obstacle twentyone = new Obstacle(3700,500,150,10);
		Obstacle twentytwo = new Obstacle(3850,400,150,10);
		Obstacle twentythree = new Obstacle(0,350,250,10);
		Obstacle twentyfour = new Obstacle(350,675,150,10);
		Obstacle twentyfive = new Obstacle(700,750,100,10);
		Obstacle twentysix = new Obstacle(750,150,200,10);
		Obstacle twentyseven = new Obstacle(1550,600,150,10);
		Obstacle twentyeight = new Obstacle(1700,700,100,10);
		Obstacle twentynine = new Obstacle(1400,500,220,10);
		Obstacle thirty = new Obstacle(2100,500,150,10);
		Obstacle thirtyone = new Obstacle(2300,400,250,10);
		Obstacle thirtytwo = new Obstacle(2500,550,150,10);
		Obstacle thirtythree = new Obstacle(2650,600,100,10);
		Obstacle thirtyfour = new Obstacle(2800,500,200,10);
		Obstacle thirtyfive = new Obstacle(2900,700,300,10);
		Obstacle thirtysix = new Obstacle(3000,400,200,10);
		Obstacle thirtyseven = new Obstacle(3200,600,150,10);
		Obstacle thirtyeight = new Obstacle(3500,700,200,10);
		Obstacle thirtynine = new Obstacle(3700,600,100,10);
		Obstacle forty = new Obstacle(3990,0,10,800);
		
		add(ii);
		add(i);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(ten);
		add(eleven);
		add(twelve);
		add(thirteen);
		add(fourteen);
		add(fifteen);
		add(sixteen);
		add(seventeen);
		add(eighteen);
		add(nineteen);
		add(twenty);
		add(twentyone);
		add(twentytwo);
		add(twentythree);
		add(twentyfour);
		add(twentyfive);
		add(twentysix);
		add(twentyseven);
		add(twentyeight);
		add(twentynine);
		add(thirty);
		add(thirtyone);
		add(thirtytwo);
		add(thirtythree);
		add(thirtyfour);
		add(thirtyfive);
		add(thirtysix);
		add(thirtyseven);
		add(thirtyeight);
		add(thirtynine);
		add(forty);
	}
	
	public void makeObstacles3() {
		
	}


}
