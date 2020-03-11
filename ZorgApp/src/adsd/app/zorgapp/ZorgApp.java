package adsd.app.zorgapp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

class ZorgApp
{
	//Zorgt voor userinput
	Scanner myScanner = new Scanner(System.in);
	private Profile profile;
    private ArrayList<Medicine> medicineList;
    private ArrayList<WeightMeasurePoint> weightMeasurePointList;
	
	 
	
	  public ZorgApp() 
      {
          //initialize class object and lists
          profile = new Profile();
          medicineList = new ArrayList<Medicine>();
          weightMeasurePointList = new ArrayList<WeightMeasurePoint>();

          //call startup methods
          AddStartData();
          DisplayMenu();
      }
	//Add static data to ZorgApp
	  private void AddStartData()
      {
          //Add Profile Data
          profile.setFirstName("Joel");
          profile.setLastName("Ipenburg");
          profile.setAge(27);
          profile.setWeight(80);
          profile.setLength(1.88);

          //Add Medicine Data to list as an new object
          medicineList.add(new Medicine(
              "Oxazepam",
              "Het werkt rustgevend, spierontspannend, vermindert angstgevoelens en beïnvloedt de overdracht van elektrische prikkels in de hersenen.",
              "Oxazepam behoort tot de benzodiazepinen.",
              "50 mg per 24 uur."));
          medicineList.add(new Medicine(
              "Diclofenac",
              "Het is te gebruiken bij pijn waarbij ook sprake is van een ontsteking, zoals bij gewrichtspijn, reumatoïde artritis (ontsteking van de gewrichten), ziekte van Bechterew en jicht (onsteking in uw gewricht).",
              "Dit soort (Diclofenac) pijnstillers wordt ook wel NSAID's genoemd.",
              "1 tablet per 6 uur."));

          //Add WeightMeasurePoint Data to list as a new object
          weightMeasurePointList.add(new WeightMeasurePoint("20-04-2019", "19:40", 76));
          weightMeasurePointList.add(new WeightMeasurePoint("22-02-2019", "18:35", 77.5));
      }
	  
	  //Display menu with numbers to choose from
      private void DisplayMenu() 
      {
          //keep the menu running
          while (true)
          {
              //show options with assigned numbers
              System.out.println();
              System.out.println("\nWelkom in het menu");
              System.out.println("\nKies een nummer: " +
                  "\n1) Profiel tonen." +
                  "\n2) Profiel bewerken." +
                  "\n3) Medicijn tonen." +
                  "\n4) Medicijn bewerken." +
                  "\n5) Gewicht tonen" +
                  "\n6) Gewicht bewerken");

              //call method depended on chosen number
              switch (myScanner.nextLine())
              {
                  case "1":
                      System.out.println(ShowProfile());
                      myScanner.nextLine();
                      break;
                  case "2":
                       System.out.println(ShowProfile());
                       System.out.println("\nKies een nummer om te bewerken: (1, 2, 3, 4, 5)");
                       
                       switch (myScanner.nextLine()) 
                       {    
                       		case "1": 
                       			System.out.println("Voer uw voornaam in: ");
                       			EditProfile(profile,1);
                       			break;
                       		case "2":
                       			System.out.println("Voer uw achternaam in: ");
                       			EditProfile(profile,2);
                       			break;
                       		case "3":
                       			System.out.println("Voer uw leeftijd in: ");
                       			EditProfile(profile,3);
                       			break;
                       		case "4":    
                       			System.out.println("Voer uw gewicht in met een comma: ");
                       			EditProfile(profile,4);
                       			break;
                       		case "5":    
                       			System.out.println("Voer uw lengte in met een comma: ");
                       			EditProfile(profile,5);
                       			break;
                       		default:
                       			break;
                       }
                       System.out.println(ShowProfile());
                       System.out.println("\nDruk op enter om terug naar het menu te gaan.");
                       myScanner.nextLine();
                       break;
                  case "3":
                      System.out.println(ShowMedicineList());
                      myScanner.nextLine();
                      break;
                  case "4":
                      System.out.println(ShowMedicineList());
                       System.out.println("\nMaak een keuze om te bewerken: ");
                      int medicineId = myScanner.nextInt();
                       myScanner.nextLine();
                       Medicine medicine = medicineList.get(medicineId -1);
                       System.out.println(ShowMedicine(medicine));
                       System.out.println("\nKies een nummer om te bewerken: (1, 2, 3, 4)");
                       
                       switch (myScanner.nextLine()) 
                       {
					   		case "1":
					   			EditMedicine(medicine, 1);
					   			break;
					   		case "2":
					   			EditMedicine(medicine, 2);	
					   			break;
					   		case "3":
					   			EditMedicine(medicine, 3);					
					   			break;
					   		case "4":
					   			EditMedicine(medicine, 4);	
					   			break;
					   		default:
					   			break;	
					   }
                       System.out.println(ShowMedicine(medicine));
                       System.out.println("\nDruk op enter om terug naar het menu te gaan.");
                       
                       myScanner.nextLine();
                      break;
                      
                   case "5":
                      System.out.println(ShowWeightList());
                      myScanner.nextLine();
                      break;  
                   case "6":
                       System.out.println(ShowWeightList());
                        System.out.println("\nMaak een keuze om te bewerken: ");
                       int weightId = myScanner.nextInt();
                        myScanner.nextLine();
                        WeightMeasurePoint weightMeasurePoint = weightMeasurePointList.get(weightId -1);
                        System.out.println(ShowWeight(weightMeasurePoint));
                        System.out.println("\nKies een nummer om te bewerken: (1, 2, 3)");
                        
                        switch (myScanner.nextLine()) 
                        {
 					   		case "1":
 					   			System.out.println("Voer de datum in: ");
 					   			EditWeight(weightMeasurePoint, 1);
 					   			break;
 					   		case "2":
 					   			System.out.println("Voer de tijd in: ");
 					   			EditWeight(weightMeasurePoint, 2);	
 					   			break;
 					   		case "3":
 					   			System.out.println("Voer uw gewicht in met een comma: ");
 					   			EditWeight(weightMeasurePoint, 3);					
 					   			break;
 					   		default:
 					   			break;	
 					   }
                        System.out.println(ShowWeight(weightMeasurePoint));
                        System.out.println("\nDruk op enter om terug naar het menu te gaan.");
                        
                        myScanner.nextLine();
                       break;
             
                  default:
                      System.out.println("Nummer niet herkent! Probeer nogmaals..");
                      myScanner.nextLine();
                      break;
              }
          }
      }
		
	
	
	
    private String ShowProfile() 
      {
          return
              "\n1)Voornaam: "+ profile.getFirstName() +
              "\n2)Achternaam: "+ profile.getLastName() +
              "\n3)Leeftijd: "+ profile.getAge() +
              "\n4)Gewicht: " + profile.getWeight() + " kg" +
              "\n5)Lengte: " + profile.getLength() + " m" +
              "\nBMI: " + profile.getBmi();
      }
    
    private String ShowMedicine(Medicine medicine) 
    {
           return
            	"\n\n" +	
                "\n1)Medicijn: " + medicine.getMedicineName() +
                "\n2)Beschrijving: " + medicine.getDescription() +
                "\n3)Soort: " + medicine.getSort()  +
                "\n4)Dosering: " + medicine.getDosage();
    
    }
    
	private String ShowMedicineList() 
	{
		String medicineListReturn = "";
		int id = 1;
        for (Medicine medicine : medicineList)
        {

            medicineListReturn += 
            	"\n\nKeuze: "+ id + ")" +	
                "\nMedicijn: " + medicine.getMedicineName() +
                "\nBeschrijving: " + medicine.getDescription() +
                "\nSoort: " + medicine.getSort()  +
                "\nDosering: " + medicine.getDosage();
            id++;
        }
		
		return medicineListReturn;
	}
	
	private String ShowWeight(WeightMeasurePoint weightMeasurePointList) 
	{
		return
				"\n1)Datum: " + weightMeasurePointList.getDate() +
                "\n2)Tijd: " + weightMeasurePointList.getTime() +
                "\n3)Gewicht: " + weightMeasurePointList.getWeight();
	}
	
	private String ShowWeightList()	
	{
		String weightMeasurePointListReturn = "";
		int id = 1;
        for (WeightMeasurePoint weightMeasurePoint : weightMeasurePointList)
        {

        	weightMeasurePointListReturn += 
            	"\n\nKeuze: "+ id + ")" +	
                "\nDatum: " + weightMeasurePoint.getDate() +
                "\nTijd: " + weightMeasurePoint.getTime() +
                "\nGewicht: " + weightMeasurePoint.getWeight();
            id++;
        }
		return weightMeasurePointListReturn;
	}
	
	private char[] getWeightGraph() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void EditProfile(Profile profile,int userInput) 
	{
		switch (userInput) 
		{
		case 1: 
		    profile.setFirstName(myScanner.nextLine());
			break;
		case 2:
		    profile.setLastName(myScanner.nextLine());	
			break;
		case 3: 
			profile.setAge(myScanner.nextInt());
	        myScanner.nextLine();
			break;
		case 4:
		    profile.setWeight(myScanner.nextDouble());
		    myScanner.nextLine();
		    break;
		case 5:
		     profile.setLength(myScanner.nextDouble());
		     myScanner.nextLine();
			break;
			
			
		
		default:
		    break;
		}
		
	
		
		
		return;
	}

	private void EditMedicine(Medicine medicine,int userInput) 
	{    //userInput = Chosen number from the display menu.
		switch(userInput) 
		{
		case 1:
		medicine.setMedicineName(myScanner.nextLine());
			break;
		case 2:
			medicine.setDescription(myScanner.nextLine());
			break;
		case 3:
			medicine.setSort(myScanner.nextLine());
			break;
		case 4:
			medicine.setDosage(myScanner.nextLine());
			break;
			
		default:
		    break;
		    
		}
		
		return;
	}
	
	private void EditWeight(WeightMeasurePoint weightMeasurePoint,int userInput) 
	{    //userInput = Chosen number from the display menu.
		switch(userInput) 
		{
		case 1:
		weightMeasurePoint.setDate(myScanner.nextLine());
			break;
		case 2:
			weightMeasurePoint.setTime(myScanner.nextLine());
			break;
		case 3:
			weightMeasurePoint.setWeight(myScanner.nextDouble());
			 myScanner.nextLine();
			break;
		
			
		default:
		    break;
		    
		}
		
		return;
	}
	
	
	
	
	
	
	
	
	
	
}
