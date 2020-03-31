package FinalProject;
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
		Obstacle i = new Obstacle(0,800,8000,20); //floor
		Obstacle ii = new Obstacle(0,0,8000,20);  //ceiling
		Obstacle one = new Obstacle(1300,700,200,10);
		Obstacle two = new Obstacle(2000,500,200,10);
		Obstacle three = new Obstacle(3400,450,100,10);
		Obstacle four = new Obstacle(3500,200,200,10);
		Obstacle five = new Obstacle(3700,600,200,10);
		Obstacle six = new Obstacle(3900,500,150,10);
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
		Obstacle twentythree = new Obstacle(1000,350,250,10);
		Obstacle twentyfour = new Obstacle(3350,675,150,10);
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
		Obstacle forty = new Obstacle(7990,0,10,800);
		Obstacle o41 = new Obstacle(7300,700,200,10);
		Obstacle o42 = new Obstacle(7000,500,200,10);
		Obstacle o43 = new Obstacle(7400,450,100,10);
		Obstacle o44 = new Obstacle(7500,200,200,10);
		Obstacle o45 = new Obstacle(7700,600,200,10);
		Obstacle o46 = new Obstacle(7900,500,150,10);
		Obstacle o47 = new Obstacle(4050,200,250,10);
		Obstacle o48 = new Obstacle(4200,700,150,10);
		Obstacle o49 = new Obstacle(4350,300,200,10);
		Obstacle o50 = new Obstacle(4550,200,250,10);
		Obstacle o51 = new Obstacle(4750,400,150,10);
		Obstacle o52 = new Obstacle(4900,300,200,10);
		Obstacle o53 = new Obstacle(5100,200,200,10);
		Obstacle o54 = new Obstacle(5300,600,200,10);
		Obstacle o55 = new Obstacle(5500,700,200,10);
		Obstacle o56 = new Obstacle(5700,100,100,10);
		Obstacle o57 = new Obstacle(5800,700,250,10);
		Obstacle o58 = new Obstacle(6050,200,150,10);
		Obstacle o59 = new Obstacle(3300,300,200,10);
		Obstacle o60 = new Obstacle(6500,400,200,10);
		Obstacle o61 = new Obstacle(6700,500,150,10);
		Obstacle o62 = new Obstacle(6850,400,150,10);
		Obstacle o63 = new Obstacle(4000,350,250,10);
		Obstacle o64 = new Obstacle(6350,675,150,10);
		Obstacle o65 = new Obstacle(4000,750,100,10);
		Obstacle o66 = new Obstacle(4750,150,200,10);
		Obstacle o67 = new Obstacle(4550,600,150,10);
		Obstacle o68 = new Obstacle(4700,700,100,10);
		Obstacle o69 = new Obstacle(4400,500,220,10);
		Obstacle o70 = new Obstacle(5100,500,150,10);
		Obstacle o71 = new Obstacle(5300,400,250,10);
		Obstacle o72 = new Obstacle(5500,550,150,10);
		Obstacle o73 = new Obstacle(5650,600,100,10);
		Obstacle o74 = new Obstacle(5800,500,200,10);
		Obstacle o75 = new Obstacle(5900,700,300,10);
		Obstacle o76 = new Obstacle(7000,400,200,10);
		Obstacle o77 = new Obstacle(7200,600,150,10);
		Obstacle o78 = new Obstacle(7500,700,200,10);
		Obstacle o79 = new Obstacle(7700,600,100,10);

			
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
		add(o41);
		add(o42);
		add(o43);
		add(o44);
		add(o45);
	//	add(o46);
		add(o47);
		add(o48);
		add(o49);
		add(o50);
		add(o51);
		add(o52);
		add(o53);
		add(o54);
		add(o55);
		add(o56);
		add(o57);
		add(o58);
		add(o59);
		add(o60);
		add(o61);
		add(o62);
		add(o63);
		add(o64);
		add(o65);
		add(o66);
		add(o67);
		add(o68);
		add(o69);
		add(o70);
		add(o71);
		add(o72);
		add(o73);
		add(o74);
		add(o75);
		add(o76);
		add(o77);
		add(o78);
		add(o79);
		
	
	}
	
	public void makeObstacles2() {
		Obstacle i = new Obstacle(0,800,8000,20); //floor
		Obstacle ii = new Obstacle(0,0,8000,20);  //ceiling
		Obstacle one = new Obstacle(1300,700,200,10);
		Obstacle two = new Obstacle(2000,500,200,10);
		Obstacle three = new Obstacle(3400,450,100,10);
		Obstacle four = new Obstacle(3500,200,200,10);
		Obstacle five = new Obstacle(3700,600,200,10);
		Obstacle six = new Obstacle(3900,500,150,10);
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
		Obstacle twentythree = new Obstacle(1000,350,250,10);
		Obstacle twentyfour = new Obstacle(3350,675,150,10);
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
		Obstacle forty = new Obstacle(7990,0,10,800);
		Obstacle o41 = new Obstacle(7300,700,200,10);
		Obstacle o42 = new Obstacle(7000,500,200,10);
		Obstacle o43 = new Obstacle(7400,450,100,10);
		Obstacle o44 = new Obstacle(7500,200,200,10);
		Obstacle o45 = new Obstacle(7700,600,200,10);
		Obstacle o46 = new Obstacle(7900,500,150,10);
		Obstacle o47 = new Obstacle(4050,200,250,10);
		Obstacle o48 = new Obstacle(4200,700,150,10);
		Obstacle o49 = new Obstacle(4350,300,200,10);
		Obstacle o50 = new Obstacle(4550,200,250,10);
		Obstacle o51 = new Obstacle(4750,400,150,10);
		Obstacle o52 = new Obstacle(4900,300,200,10);
		Obstacle o53 = new Obstacle(5100,200,200,10);
		Obstacle o54 = new Obstacle(5300,600,200,10);
		Obstacle o55 = new Obstacle(5500,700,200,10);
		Obstacle o56 = new Obstacle(5700,100,100,10);
		Obstacle o57 = new Obstacle(5800,700,250,10);
		Obstacle o58 = new Obstacle(6050,200,150,10);
		Obstacle o59 = new Obstacle(3300,300,200,10);
		Obstacle o60 = new Obstacle(6500,400,200,10);
		Obstacle o61 = new Obstacle(6700,500,150,10);
		Obstacle o62 = new Obstacle(6850,400,150,10);
		Obstacle o63 = new Obstacle(4000,350,250,10);
		Obstacle o64 = new Obstacle(6350,675,150,10);
		Obstacle o65 = new Obstacle(4000,750,100,10);
		Obstacle o66 = new Obstacle(4750,150,200,10);
		Obstacle o67 = new Obstacle(4550,600,150,10);
		Obstacle o68 = new Obstacle(4700,700,100,10);
		Obstacle o69 = new Obstacle(4400,500,220,10);
		Obstacle o70 = new Obstacle(5100,500,150,10);
		Obstacle o71 = new Obstacle(5300,400,250,10);
		Obstacle o72 = new Obstacle(5500,550,150,10);
		Obstacle o73 = new Obstacle(5650,600,100,10);
		Obstacle o74 = new Obstacle(5800,500,200,10);
		Obstacle o75 = new Obstacle(5900,700,300,10);
		Obstacle o76 = new Obstacle(7000,400,200,10);
		Obstacle o77 = new Obstacle(7200,600,150,10);
		Obstacle o78 = new Obstacle(7500,700,200,10);
		Obstacle o79 = new Obstacle(7700,600,100,10);

			
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
		add(o41);
		add(o42);
		add(o43);
		add(o44);
		add(o45);
//		add(o46);
		add(o47);
		add(o48);
		add(o49);
		add(o50);
		add(o51);
		add(o52);
		add(o53);
		add(o54);
		add(o55);
		add(o56);
		add(o57);
		add(o58);
		add(o59);
		add(o60);
		add(o61);
		add(o62);
		add(o63);
		add(o64);
		add(o65);
		add(o66);
		add(o67);
		add(o68);
		add(o69);
		add(o70);
		add(o71);
		add(o72);
		add(o73);
		add(o74);
		add(o75);
		add(o76);
		add(o77);
		add(o78);
		add(o79);
		
	}
	
	public void makeObstacles3() {
		
	}


}
