public class Movie {
    String name;
    String language;
    double rating;

    public Movie(String name, String language, double rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    public void displayMovieDetails() {
        System.out.println("Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Intersellor", "English", 4.5);
        Movie movie2 = new Movie("krish", "Hindi", 4.8);
        Movie movie3 = new Movie("Avengers", "English", 4.7);
        Movie movie4 = new Movie("Anime", "Japanese", 4.9);

        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
        movie3.displayMovieDetails();
        movie4.displayMovieDetails();
    }
}