package adsd.app.zorgapp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

class ZorgApp
{
	//Zorgt voor userinput
	Scanner myObj = new Scanner(System.in);
	Profile profile1;
	Medicijn medicijn;
	
	
	public ZorgApp() 
	{
		profile1 = new Profile("Joel","Ipenburg", 27, 80, 1.88);
	    //profile2 = new Profile("Frank", "Krijnen",26, 65, 1.80);
		DisplayMenu();
	  
	}
	
	private void DisplayMenu() 
	{
		while(true) 
		{
		
			System.out.println("Welkom in het menu");
			System.out.println("Maak een keuze: \n1)Bewerken patientgegevens.");
			//String userInput = myObj.nextLine();
			
			// weergeeft patientgegevens voor het bewerken.
			if (myObj.nextInt() == 1) 
			{
				
				System.out.println("Wat wilt u bewerken: (1,2,3,4,5)");
				System.out.println("1) Voornaam: " + profile1.getVoornaam() 
						+"\n2) Achternaam: "+ profile1.getAchterNaam()  
						+"\n3) Leeftijd: "+ profile1.getLeeftijd()  
						+"\n4) Gewicht: "+ profile1.getGewicht()  
						+"\n5) Lengte: "+ profile1.getLengte());
				int userInput = myObj.nextInt();
				myObj.nextLine();
				EditPatient(profile1,userInput);
				//System.out.println("2): dhr. " + profile2.getAchterNaam());
			}
			
			
			else 
			{
				break;
			}
		
		
		}
		
		
	}
	
	private void EditPatient(Profile profile,int userInput) 
	{
		switch (userInput) 
		{
		case 1: 
			//System.out.println("Vul uw voornaam in: ");
		String inputVoornaam = myObj.nextLine();
		profile.setVoorNaam(inputVoornaam);	
			break;
		case 2:
		profile.setAchterNaam(myObj.nextLine());	
			break;
		case 3: 
			profile.setLeeftijd(myObj.nextInt());
			break;
		case 4:
		profile.setGewicht(myObj.nextDouble());
		    break;
		case 5:
		profile.setLengte(myObj.nextDouble());
			break;
			
			
		
		default:
		   break;
		}
		
		
		return;
	
	}
	
	
	
	
	
	
	
	
	
}
