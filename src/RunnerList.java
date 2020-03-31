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
		Runner first = new Runner(150, 730, 30, 30, 600, 810, 3);
		Runner second = new Runner(300, 460, 50, 30, 450, 547, 2);
		Runner third = new Runner(740, 500, 50, 30, 450, 510, 3);
		Runner fourth = new Runner(500, 460, 50, 50, 450, 547, 2);
		Runner fifth = new Runner(400,300,30,20,250,350,2);
		Runner sixth = new Runner(700,790,20,20,720,810,3);
		Runner seventh = new Runner(750,720,20,20,720,810,2);
		Runner eighth = new Runner(770,150,50,50,0,200,3);
		Runner nineth = new Runner(820,600,40,40,590,670,2);
		Runner tenth = new Runner(870,400,50,50,350,450,3);
		Runner eleventh = new Runner(1000,150,60,20,0,300,3);
		Runner twelfth = new Runner(950,350,50,50,325,550,2);
		Runner thirteenth = new Runner(1100,770,30,40,675,810,3);
		Runner fourteenth = new Runner(1250,200,50,50,180,470,2);
		Runner fifteenth = new Runner(1400,500,50,50,450,650,3);
		Runner sixteenth = new Runner(1450,200,40,40,190,330,2);
		Runner seventeenth = new Runner(1510,600,30,30,590,810,3);
		Runner eighteenth = new Runner(1600,510,50,50,500,810,3);
		Runner nineteenth = new Runner(1650,10,60,30,0,300,3);
		Runner twenty = new Runner(1750,700,50,50,500,810,2);
		Runner twentyone = new Runner(1775,450,40,40,300,500,3);
		Runner twentytwo = new Runner(1850,100,50,50,50,300,2);
		Runner twentythree = new Runner(1975,770,40,40,700,810,2);
		Runner twentyfour = new Runner(2100,400,50,50,250,410,2);
		Runner twentyfive = new Runner(2150,700,30,30,600,810,2);
		Runner twentysix = new Runner(2250,500,40,40,400,600,3);
		Runner twentyseven = new Runner(2350,400,50,50,300,500,2);
		Runner twentyeight = new Runner(2300,150,60,60,0,300,3);
		Runner twentynine = new Runner(2450,250,30,50,150,350,2);
		Runner thirty = new Runner(2600,650,50,50,550,700,2);
		Runner thirtyone = new Runner(2650,150,40,40,100,400,2);
		Runner thirtytwo = new Runner(2750,510,30,30,450,600,3);
		Runner thirtythree = new Runner(2850,700,50,50,500,810,3);
		Runner thirtyfour = new Runner(3000,100,60,60,0,250,2);
		Runner thirtyfive = new Runner(2950,500,40,50,400,700,3);
		Runner thirtysix = new Runner(3070,600,40,50,500,810,2);
		Runner thirtyseven = new Runner(3200,100,30,30,50,400,2);
		Runner thirtyeight = new Runner(3300,400,40,40,390,750,3);
		Runner thirtynine = new Runner(3400,700,60,30,650,810,2);
		Runner forty = new Runner(3460,750,60,30,600,810,2);
		Runner fortyone = new Runner(3550,400,50,50,350,550,3);
		Runner fortytwo = new Runner(3600,100,60,60,0,300,2);
		Runner fortythree = new Runner(3670,200,40,40,100,400,3);
		Runner fortyfour = new Runner(3700,500,50,50,450,750,3);
		Runner fortyfive = new Runner(3800,100,50,50,0,300,3);
		Runner fortysix = new Runner(3800,500,40,40,400,600,2);
		Runner fortyseven = new Runner(3900,400,50,50,300,600,3);
		Runner fortyeight = new Runner(3900,100,40,40,50,250,2);
		Runner fortynine = new Runner(3850,700,30,30,600,810,3);
		Runner fifty = new Runner(3070,20,30,30,0,200,2);
		
		
		add(first);
		add(second);
		add(third);
		add(fourth);
		add(fifth);
		add(sixth);
		add(seventh);
		add(eighth);
		add(nineth);
		add(tenth);
		add(eleventh);
		add(twelfth);
		add(thirteenth);
		add(fourteenth);
		add(fifteenth);
		add(sixteenth);
		add(seventeenth);
		add(eighteenth);
		add(nineteenth);
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
		add(fortyone);
		add(fortytwo);
		add(fortythree);
		add(fortyfour);
		add(fortyfive);
		add(fortysix);
		add(fortyseven);
		add(fortyeight);
		add(fortynine);
		add(fifty);
		
	}
	
	public void makeRunners1() {
	}
	
	public void makeRunners3() {
		
	}


}
