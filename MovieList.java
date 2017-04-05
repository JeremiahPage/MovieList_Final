
public class MovieList {
	
	private String movieTitle;	// Title of movie
	private String type;  //BluRay, DVD, 3D 
	private String releaseYear;		// 1995 etc
	
	/*public Movies(){	// generic constructor, no arguments
		
	}*/
	
	public MovieList(String title, String type, String year){		// constructor accepting title, type and year of movie
		this.movieTitle = title;
		this.type = type;
		this.releaseYear = year;
	}
	
	public void displayList(){		// method to display the list
		System.out.println("Title: " + movieTitle + ", is a " + " movie, from " + releaseYear);
	}
	
}
