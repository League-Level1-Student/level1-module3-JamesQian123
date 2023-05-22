package _04_netflix;

public class Netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie movie1 = new Movie("Finding Nemo", 3);
Movie movie2 = new Movie("Toy Story", 3);
Movie movie3 = new Movie("Star Wars", 4);
Movie movie4 = new Movie("James Bond", 5);
Movie movie5 = new Movie("Spider Man", 6);

System.out.println(movie5.getTicketPrice());
System.out.println(movie1.getTicketPrice());
System.out.println(movie2.getTicketPrice());
System.out.println(movie3.getTicketPrice());
System.out.println(movie4.getTicketPrice());
NetflixQueue queue = new NetflixQueue();
queue.addMovie(movie1);
queue.addMovie(movie5);
queue.addMovie(movie4);
queue.addMovie(movie3);
queue.addMovie(movie2);
System.out.println("the best movie is"+  queue.getBestMovie());
System.out.println("the second best movie is" + queue.getSecondBestMovie());
queue.printMovies();

}

}
