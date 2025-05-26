package at.ac.fhcampuswien.fhmdb.sorting;

import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class UnsortedState implements SortState {
    private List<Movie> allMovies;

    @Override
    public void sort(List<Movie> movies) {
        System.out.println("NO SORTING");
        movies.clear();
        movies.addAll(allMovies);
    }

    @Override
    public void setMovieList(List<Movie> movies) {
        this.allMovies = new ArrayList<>(movies);
    }

    @Override
    public SortState nextState() {
        return new AscendingState(); // oder z. B. return this;
    }
}