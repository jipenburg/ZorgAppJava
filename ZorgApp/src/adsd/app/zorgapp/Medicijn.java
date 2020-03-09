package adsd.app.zorgapp;

import java.util.ArrayList;

public class Medicijn 
{
   private String medicijnNaam;
   private String omschrijving;
   private String soort;
   private String dosering;
   
   Medicijn(String medicijnNaam, String omschrijving, String soort, String dosering)
   {
	   this.medicijnNaam = medicijnNaam;
	   this.omschrijving = omschrijving;
	   this.soort = soort;
	   this.dosering = dosering;
	   
	   
   }
   
   public void setmedicijnNaam(String medicijnNaam) 
   {
	   this.medicijnNaam = medicijnNaam;
   }
   public String getmedicijnNaam() 
   {
	   return medicijnNaam;
   }
   public void setomschrijving(String omschrijving) 
   {
	   this.omschrijving = omschrijving;
   }
   public String getomschrijving() 
   {
	   return omschrijving;
   }
   public void setsoort(String soort) 
   {
	   this.soort = soort;
   }
   public String getsoort() 
   {
	   return soort;
   }
   public void setdosering(String dosering) 
   {
	   this.dosering = dosering;
   }
   public String getdosering() 
   {
	   return dosering;
   }
  /* 
   public class MedicijnLijst
	{

		public ArrayList <Medicijn> medicijnLijst;
		
		//Arraylist die de profiel klassen initieert met argumenten
		// idee voor de toekomstige sprint

	 public MedicijnLijst() 
		{
			ArrayList <Medicijn> medicijnArray = new ArrayList<Medicijn>();
			medicijnArray.add(new Medicijn ("Para", "Kleinen", "test", "1"));
			medicijnArray.add(new Medicijn ("Para", "Kleinen", "test", "1"));
			medicijnArray.add(new Medicijn ("Para", "Kleinen", "test", "1"));
		} 
	
	
	}*/
  // public MedicijnLijst <Medicijn> medicijnArray;
	

	

}
