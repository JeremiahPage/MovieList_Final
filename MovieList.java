// Jeremiah Page
public class MovieList {
	private Movies first;
	private Movies current;
	private Movies previous;
	
	public MovieList(){	// generic constructor, no arguments
		first = null;
	}
	
	/*public MovieList(String title, String type, String year){		// constructor accepting title, type and year of movie
		this.movieTitle = title;
		this.type = type;
		this.releaseYear = year;
	}*/
	
	public void insert(String title, String type, String year){
		current = first;
		while (current != null && !(current.movieTitle == (title))) {
			current = current.next;
		}
		if (current != null) {
			current.next = new Movies(title, current.next);
		}
	}
	
	/*public void displayList(){		// method to display the list
		
		//System.out.println("Title: " + movieTitle + ", is a " + type + " movie, from " + releaseYear);
	}*/
	public void displayList() {	// method to display the contents of the list
		//System.out.print("List: {");
		Movies current = first;
		while (current != null) {
			current.displayMovie();
			System.out.print(",");
			current = current.next;
		}
		//System.out.print("}");
	}
	
}
