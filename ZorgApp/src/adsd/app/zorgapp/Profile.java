package adsd.app.zorgapp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

public class Profile 
{

	private String voorNaam;
	private String achterNaam;
	private int leeftijd;
	private double gewicht;
	private double lengte;
	
	
	//constructor 
	// voornaam, achternaam, leeftijd, gewicht, lengte
	public Profile() 
	{
		this(null, null, 0, 0.0, 0.0);
	}
	
	public Profile(String voorNaam, String achterNaam) 
	{
		this(voorNaam, achterNaam, 0, 0.0, 0.0);
	}
	
	public Profile(String voorNaam, 
			       String achterNaam, 
			       int leeftijd,
			       double gewicht, 
			       double lengte) 
	{
		this.voorNaam = voorNaam;
		this.achterNaam = achterNaam;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
		
	}
	
	public void setVoorNaam(String voorNaam) 
	{
		this.voorNaam = voorNaam;
	}
	
	public String getVoornaam() 
	{
		return voorNaam;
	}
	
	public void setAchterNaam(String achterNaam) 
	{
		this.achterNaam = achterNaam;
	}
	
	public String getAchterNaam() 
	{
		return achterNaam;
	}
	
	public void setLeeftijd(int leeftijd) 
	{
		this.leeftijd = leeftijd;
	}
	
	public int getLeeftijd() 
	{
		return this.leeftijd;
	}
	
	public void setGewicht(double gewicht) 
	{
		this.gewicht = gewicht;
	}
	
	public double getGewicht() 
	{
		return gewicht;
	}
	
	public void setLengte(double lengte) 
	{
		this.lengte = lengte;
	}
	
	public double getLengte() 
	{
		return lengte;
	}
	
	public String getBmi() 
	{
		double bmi = gewicht / (lengte * lengte);
		
		return String.format("%.2f", bmi);
	}
	
	public class ProfileList 
	{

		public ArrayList <Profile> profileArray;
		
		//Arraylist die de profiel klassen initieert met argumenten
		// idee voor de toekomstige sprint

		public ProfileList() 
		{
			ArrayList <Profile> profileArray = new ArrayList<Profile>();
			profileArray.add(new Profile ("Frank", "Kleinen", 26, 88 , 1.88));
			profileArray.add(new Profile ("Joel", "Ipman", 21, 70, 1.92));
			profileArray.add(new Profile ("Georgi", "Dobrev", 19, 25, 1.70));
		}
		
		
	
	
	}
}