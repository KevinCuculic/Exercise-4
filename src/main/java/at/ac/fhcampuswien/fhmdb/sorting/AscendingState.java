package at.ac.fhcampuswien.fhmdb.sorting;

import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AscendingState implements SortState {
    private List<Movie> allMovies;

    @Override
    public void sort(List<Movie> movies) {
        System.out.println("SORTING ASC");
        movies.clear();
        movies.addAll(allMovies);
        movies.sort(Comparator.comparing(Movie::getTitle));
    }

    @Override
    public void setMovieList(List<Movie> movies) {
        this.allMovies = new ArrayList<>(movies);
    }

    @Override
    public SortState nextState() {
        return new DescendingState();
    }
}

