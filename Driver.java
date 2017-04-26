import java.util.List;
import java.util.LinkedList;

//Jeremiah Page

/*
 *  This program will take a list of movie titles and return the list sort in alphabetical order
 *  it uses built in List & LinkedList to accomplish this, it uses .add() to insert and .remove()
 *  to delete, the .contains() method will return a boolean value for if the movie is in the list 
 *  at the time of the search
 * 
 * */

public class Driver {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>(); // create empty list
		// add movies to the list using getSortedIndex to place in order
		list.add (getSortedIndex ("Top Gun", list), "Top Gun");
	    list.add (getSortedIndex ("Don Jon", list), "Don Jon");
	    list.add (getSortedIndex ("Trolls", list), "Trolls");
	    list.add (getSortedIndex ("Home", list), "Home");
	    list.add (getSortedIndex ("Pan", list), "Pan");
	    list.add (getSortedIndex ("The Martian", list), "The Martian");
	    list.add (getSortedIndex ("Rush", list), "Rush");
	    list.add (getSortedIndex ("The Family", list), "The Family");
	    list.add (getSortedIndex ("RoboCop", list), "RoboCop");
	    list.add (getSortedIndex ("Horrible Bosses", list), "Horrible Bosses");
	    list.add (getSortedIndex ("This is 40", list), "This is 40");
	    list.add (getSortedIndex ("American Hustle", list), "American Hustle");
	    
	    // Print complete list in alphabetical order
	    System.out.println("List: " +list);
	    // can remove items by name or index #
	    list.remove("Rush");
	    // can search for items by name, this returns t/f if movie found
	    System.out.println(list.contains("Trolls"));
	}
	
	// method for getting the index to sort the list
	private static int getSortedIndex(String name, List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (name.compareTo(list.get(i)) < 0) {
				return i;
			}
		}
		// name should be inserted at end.
		return list.size();
	}

}
