
public class Movies {
	
	public String movieTitle;	// Title of movie
	public String type;  //BluRay, DVD, 3D 
	public String releaseYear;		// 1995 etc
	public Movies next;
	
	
	public Movies(String movieTitle, String type, String releaseYear){
		this.movieTitle = movieTitle;
		this.type = type;
		this.releaseYear = releaseYear;
	}
	
	public Movies(String movieTitle, String type, String releaseYear, Movies next){
		this.movieTitle = movieTitle;
		this.type = type;
		this.releaseYear = releaseYear;
		this.next = next;
	}
	
	public Movies(String title, Movies next2) {
		// TODO Auto-generated constructor stub
	}

	public void displayMovie(){
		System.out.println("Title: " + this.movieTitle + ", is a " + this.type + " movie, from " + this.releaseYear);
	}
}
