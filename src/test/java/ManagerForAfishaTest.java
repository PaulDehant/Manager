import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class ManagerForAfishaTest {
        @Test
        public void testAddMovies() {
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
        public void testLessLimit() {
            ManagerForAfisha afisha = new ManagerForAfisha(5);
            afisha.addMovie("movie1");
            afisha.addMovie("movie2");
            afisha.addMovie("movie3");
            afisha.addMovie("movie4");

            String[] expected = {"movie4", "movie3", "movie2", "movie1"};
            String[] actual = afisha.findLast();
            Assertions.assertArrayEquals(expected, actual);

        }

        @Test
        public void testMoreLimit() {
            ManagerForAfisha afisha = new ManagerForAfisha(5);
            afisha.addMovie("movie1");
            afisha.addMovie("movie2");
            afisha.addMovie("movie3");
            afisha.addMovie("movie4");
            afisha.addMovie("movie5");
            afisha.addMovie("movie6");

            String[] expected = {"movie6", "movie5", "movie4", "movie3", "movie2"};
            String[] actual = afisha.findLast();
            Assertions.assertArrayEquals(expected, actual);
        }

    }

