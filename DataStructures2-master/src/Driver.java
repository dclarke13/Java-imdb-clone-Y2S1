/*
 * Darren Clarke - 20074525
 * Christopher Ryan - 20074584
 * Data Structures and Algorithms Assignment 2
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Driver 
{ 
	private Scanner input;
	private ActorList actorlist = new ActorList(); 
	public static void main (String[] args)
	{
		Driver app = new Driver();
		
		
	}
	
	public Driver()
	{
		try {
			//load data into actorlist
			actorlist = readInfo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input = new Scanner(System.in);
		runMainMenu();
	}
	
	 private int mainMenu()
	    { 
	        System.out.println("** Actor & Movie Menu **");
	        System.out.println("---------");     
	        System.out.println("  1) Add Actor");    
	        System.out.println("  2) List Actors");    
	        System.out.println("  3) Remove Actor"); 
	        System.out.println("  4) Add movie to actor");
	        System.out.println("---------");         
	        System.out.println("  0) Exit");
	        System.out.print("==>> ");
	        int option = input.nextInt();
	        return option;
	    }

	    
	    //run the main menu
	   private void runMainMenu()
	   {
	       int option = mainMenu();
	       while (option != 0)
	       {
	          
	           switch (option)
	           {
	              case 1:    addActor();
	           	             break;
	              case 2:    System.out.println(actorlist.listActors());
	                         break;
	              case 3:    removeActor();
	                         break;
	              case 4:    addMovie();
	              			 break;
	              case 5:    System.out.println ("not currently an option");
	              			 break;              
	              case 6:    System.out.println ("not currently an option");
	                         break;
	              case 7:    System.out.println ("not currently an option");
	                         break;
	              case 8:    System.out.print ("not currently an option");
	                         break;
	             default:    System.out.println("Invalid option entered: " + option);
	                         break;
	           }
	           
	           System.out.println("\nPress any key to continue...");
	           input.nextLine();
	           input.nextLine();
	           
	           
	           option = mainMenu();
	       }
	      
	       //if option 0 is picked exit
	       System.out.println("Exiting...");
	       try {
			writeInfo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       System.out.println("saved");
	       System.exit(0);
	   }
	
	
	
	private void addActor()
   	{  
   		String id = createID();
   		input.nextLine();
   		System.out.print("Enter Actors Name: ");
   		String name = input.nextLine();
   		System.out.print("Enter Date of Birth: ");
   		String dob = input.nextLine();
   		System.out.print("Enter Gender: ");
   		String gender = input.nextLine();
   		System.out.print("Enter Nationality: ");
   		String nationality = input.nextLine();
   		MovieList movielist = new MovieList();
   		CharacterList characterlist= new CharacterList();
   		System.out.println("Enter number of movies: ");
   		int movieno = input.nextInt();
   		
   		for(int i = 0; i < movieno; i++)
   		{
   			input.nextLine();
   			System.out.println("Enter Movie Name: ");
   			String mname= input.nextLine();
   			System.out.println("Enter Release Date: ");
   			String rdate = input.nextLine();
   			System.out.println("Enter running time (minutes)");
   			int runtime = input.nextInt();
   			input.nextLine();
   			System.out.println("Enter Genre: ");
   			String genre = input.nextLine();
   			System.out.println("Enter Plot Description");
   			String plot = input.nextLine();
   			Movies movie = new Movies(mname,rdate,runtime,genre,plot);
   			System.out.println("Enter Character Name: ");
   			String character = input.nextLine();
   			Characters thischaracter = new Characters(character);
   			//each actor has a movie list and character list inside it
   			movielist.addMovie(movie);
   			characterlist.addCharacter(thischaracter);
   		}
   		
   		Actors actor = new Actors(id, name, dob, gender, nationality, movielist, characterlist);
   		actorlist.addActor(actor);
   	}
	
	private void addMovie(){
		ActorNode chosen = actorlist.getHead();
   		//list actors
   		System.out.println(actorlist.listAName());
   		System.out.println("Select actor to add movie to: ");
   		input.nextLine();
   		//read in ID from user
   		String id = input.nextLine();
   			//while i is less than the length of the actor list
   			for(int i =1;i <= actorlist.countActors(); i++)
   			{
   				
   				//check if id matches
   					if (id.equals(chosen.getActors().getActorID()))
   					{
   						MovieList movielist = chosen.getActors().getMovielist();
   						CharacterList characterlist = chosen.getActors().getCharacterlist();
   						input.nextLine();
   						System.out.println("Enter Movie Name: ");
   						String mname= input.nextLine();
   						System.out.println("Enter Release Date: ");
   						String rdate = input.nextLine();
   						System.out.println("Enter running time (minutes)");
   						int runtime = input.nextInt();
   						input.nextLine();
   						System.out.println("Enter Genre: ");
   						String genre = input.nextLine();
   						System.out.println("Enter Plot Description");
   						String plot = input.nextLine();
   						System.out.println("Enter Character Name: ");
   			   			String character = input.nextLine();
   			   			Characters thischaracter = new Characters(character);
   						Movies newmovie = new Movies(mname,rdate,runtime,genre,plot);
   						movielist.addMovie(newmovie);
   						characterlist.addCharacter(thischaracter);
   					}
   					//otherwise check the next link
   					chosen=chosen.getNext();		
   							
   			}
   	}
		
	//TODO still crashes on tail
   	private void removeActor() 
   	{
   		//set selection to head 
   		ActorNode chosen = actorlist.getHead();
   		//list actors
   		System.out.println(actorlist.listAName());
   		System.out.println("Select ID of actor to remove: ");
   		input.nextLine();
   		//read in ID from user
   		String id = input.nextLine();
   			//while i is less than the length of the actor list
   			for(int i =1;i <= actorlist.countActors(); i++)
   			{
   				
   				//check if id matches
   					if (id.equals(chosen.getActors().getActorID()))
   					{
   						//if it does, remove
   						actorlist.removeActor(chosen);
   					}
   					//otherwise check the next link
   					chosen=chosen.getNext();		
   							
   			}
   	}
   	
   	//generates unique ID's for actors
   	public String createID()
   	{
   		String id = "";
   		ActorNode lastactor = actorlist.getTail();
   	    if (lastactor!=null){
   		int lastid = Integer.parseInt(lastactor.getActors().getActorID());
   	    int newid = lastid +1;
   	    id = String.valueOf(newid);
   	    }
   	    else {
   	    	id ="0";
   	    }
   	    
   	    return id;
   	}  
   	
   	
   	public ActorList readInfo() throws FileNotFoundException, IOException, ClassNotFoundException {
   		String path = "data.bin";
   		ActorList loadedList = new ActorList();
   	    //point to the data.bin file
   	    File fileToRead = new File(path);
   	    //input stream reads the info from the file
   	    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileToRead));
   	    //
   	    loadedList = (ActorList) objectInputStream.readObject();
   	    //close input stream
   	    objectInputStream.close();
   	    return loadedList;
   	}
	
   	
   	public void writeInfo() throws FileNotFoundException, IOException {
   		String path = "data.bin";
   	    File file =  new File(path);
   	    //OOS serializes objects into file
   	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
   	    objectOutputStream.writeObject(actorlist);
   	    objectOutputStream.close();
   	}
}
