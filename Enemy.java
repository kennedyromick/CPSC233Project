package TeamProject;

public class Enemy extends Moveable
{
	private double velocityX, velocityY, maxHealth, currentHealth, power, centreX, centreY;
	//private Background bg = StartingClass.getBg1();
	
	public Enemy(double x, double y, double width, double height) 
	{
		super(x, y, width, height);
		double velocityX = 0;
		double velocityY = 0;
	}
	
	public void update()
	{
		centreX += velocityX;
		//velocityX = bg.getVelocityX();
	}
	
	public void die()
	{

	}
	
	public void attack()
	{
		
	}
	
	public double getMaxHealth()
	{
		return maxHealth;
	}
	
	public double getCurrentHealth()
	{
		return currentHealth;
	}
	
	public double getPower()
	{
		return power;
	}
	
	public double getVelocityX()
	{
		return velocityX;
	}
	
	public double getCentreX()
	{
		return centreX;
	}
	
	public double getCentreY()
	{
		return centreY;
	}
	
	/*public Background getBg()
	{
		return bg;
	}
	*/
	public void setCurrentHealth(double currentHealth)
	{
		this.currentHealth = currentHealth;
	}
	
	public void setPower(double power)
	{
		this.power = power;
	}
	
	public void setVelocityX(double velocityX)
	{
		this.velocityX = velocityX;
	}
	
	public void setCentreX(double centreX)
	{
		this.centreX = centreX;
	}
	
	public void setCentreY(double centreY)
	{
		this.centreY = centreY;
	}

	/*public void setBg(Background bg)
	{
		this.bg = bg;
	}
	*/
}
	
