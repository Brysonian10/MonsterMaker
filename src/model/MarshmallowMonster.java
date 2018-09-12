package model;

public class MarshmallowMonster
{
	//-------- Data member sections --------
	//-------- Always Private ---------
	
	private String name;
	private double legCount;
	private boolean hasNoses;
	private int eyeCount;
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		//-------- Default values are 0 or null --------
	}
	
	public MarshmallowMonster(String name)
	{
		
	}
	
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	//--------- Getters ---------
	
	public String getName()
	{
		
		
		return name;
	}
	
	public double getlegCount()
	{
		
		
		return legCount;
	}
	
	public int getEyeCount()
	{
		
		
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		
		
		return hasNoses;
	}
	
	public int getArmCount()
	{
		
		
		return armCount;
	}
	
	//--------- Setters ---------
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legs)
	{
		this.legCount = legs;
	}
	
	public void setEyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	
 	public String toString()
	{
		String description = "My monsters name is " + name + " It has " + legCount
				 + " legs" + " and the scary thing is that it just stares at you,"
				 		+ " it literally does nothing but creepily stare at you."
				 		+ "";
		
		return description;
		
	}
}
