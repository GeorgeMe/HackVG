package com.hackvg.model.rest;

import com.hackvg.model.MediaDataSource;

/**
 * Created by George on 2015/8/13.
 */
public interface RestDataSource extends MediaDataSource {

    public void getMoviesByPage (int page);
}
