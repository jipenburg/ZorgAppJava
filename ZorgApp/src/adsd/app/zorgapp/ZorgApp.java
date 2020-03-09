package adsd.app.zorgapp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

class ZorgApp
{
	//Zorgt voor userinput
	Scanner myScanner = new Scanner(System.in);
	Profile profile1;
	Medicijn medicijn1;
	
	
	
	public ZorgApp() 
	{
		profile1 = new Profile("Joel","Ipenburg", 27, 80, 1.88);
		medicijn1 = new Medicijn("Ibruprofen", "Het werkt ontstekingsremmend,"
				+ " pijnstillend en koortsverlagend."," NSAID","maximaal 1200 mg per dag");
	    //profile2 = new Profile("Frank", "Krijnen",26, 65, 1.80);
		DisplayMenu();
	  
	}
	
	private void DisplayMenu() 
	{
		
		while(true) 
		{
			System.out.println("Welkom in het menu: ");
			System.out.println("Maak een keuze: \n1)Bewerken patientgegevens.");
			System.out.println("2)Overzicht medische gegevens");
			
			int userAnswer = myScanner.nextInt();
			
			
			if (userAnswer == 1) 
			{
				System.out.println("Wat wilt u bewerken: (1,2,3,4,5)");
				System.out.println("1) Voornaam: " + profile1.getVoornaam() 
				+"\n2) Achternaam: "+ profile1.getAchterNaam()  
				+"\n3) Leeftijd: "+ profile1.getLeeftijd()  
				+"\n4) Gewicht: "+ profile1.getGewicht()  
				+"\n5) Lengte: "+ profile1.getLengte());
				int userInput = myScanner.nextInt();
				myScanner.nextLine();
				EditPatient(profile1,userInput);
			}
			
			else if (userAnswer == 2) 
			{
				System.out.println("Patient gegevens: ");
				System.out.println("\n Voornaam: " + profile1.getVoornaam() 
				+"\n Achternaam: "+ profile1.getAchterNaam()  
				+"\n Leeftijd: "+ profile1.getLeeftijd()  
				+"\n Gewicht: "+ profile1.getGewicht()  
				+"\n Lengte: "+ profile1.getLengte() 
				+"\n Bmi: "+ profile1.getBmi()
				+"\n\n Huidige Medicatie: " + medicijn1.getmedicijnNaam()
				+"\n Omschrijving: " + medicijn1.getomschrijving()
				+"\n Soort: " + medicijn1.getsoort()
				+"\n Dosering: " + medicijn1.getdosering());
				break;
			}
			else 
			{
				myScanner.close();
			}
		}
		
	}
		
		
	
	
	private void EditPatient(Profile profile,int userInput) 
	{
		switch (userInput) 
		{
		case 1: 
			//System.out.println("Vul uw voornaam in: ");
		String inputVoornaam = myScanner.nextLine();
		profile.setVoorNaam(inputVoornaam);	
			break;
		case 2:
		profile.setAchterNaam(myScanner.nextLine());	
			break;
		case 3: 
			profile.setLeeftijd(myScanner.nextInt());
			break;
		case 4:
		profile.setGewicht(myScanner.nextDouble());
		    break;
		case 5:
		profile.setLengte(myScanner.nextDouble());
			break;
			
			
		
		default:
		   break;
		}
		
	
		
		
		return;
	
	}
	
	
	
	
	
	
	
	
	
}
