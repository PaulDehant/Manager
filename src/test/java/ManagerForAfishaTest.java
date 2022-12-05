import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerForAfishaTest {

    @Test
    public void testAddMovie() {
        ManagerForAfisha afisha = new ManagerForAfisha();
        afisha.addMovie("movie1");
        afisha.addMovie("movie2");
        afisha.addMovie("movie3");

        String[] expected = {"movie1", "movie2", "movie3"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testLast() {
        ManagerForAfisha afisha = new ManagerForAfisha(5);
        afisha.addMovie("movie1");
        afisha.addMovie("movie2");
        afisha.addMovie("movie3");
        afisha.addMovie("movie4");
        afisha.addMovie("movie5");


        String[] expected = {"movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLesslimit() {
        ManagerForAfisha afisha = new ManagerForAfisha(5);
        afisha.addMovie("movie1");
        afisha.addMovie("movie2");
        afisha.addMovie("movie3");
        afisha.addMovie("movie4");


        String[] expected = {"movie1", "movie2", "movie3", "movie4"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
}

    @Test
    public void testMorelimit() {
        ManagerForAfisha afisha = new ManagerForAfisha(5);
        afisha.findMovieLimit("movie1");
        afisha.findMovieLimit("movie2");
        afisha.findMovieLimit("movie3");
        afisha.findMovieLimit("movie4");
        afisha.findMovieLimit("movie5");
        afisha.findMovieLimit("movie6");

        String[] expected = {"movie1", "movie2", "movie3", "movie4","movie5"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
}
}
