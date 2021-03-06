package com.hackvg.hackvg.mvp.views;
import com.hackvg.model.entities.Movie;
import java.util.List;
/**
 * Created by George on 2015/8/13.
 */
public interface MoviesView extends MVPView {

    void showMovies(List<Movie> movieList);

    void showLoading ();

    void hideLoading ();

    void showLoadingLabel();

    void hideActionLabel ();

    boolean isTheListEmpty ();

    void appendMovies (List<Movie> movieList);
}
