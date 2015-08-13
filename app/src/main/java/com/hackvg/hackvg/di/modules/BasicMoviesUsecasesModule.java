package com.hackvg.hackvg.di.modules;
import com.hackvg.domain.ConfigurationUsecase;
import com.hackvg.domain.ConfigurationUsecaseController;
import com.hackvg.domain.GetMoviesUsecase;
import com.hackvg.domain.GetMoviesUsecaseController;
import com.hackvg.model.rest.RestMovieSource;
import com.squareup.otto.Bus;

import dagger.Module;
import dagger.Provides;
/**
 * Created by George on 2015/8/13.
 */

@Module
public class BasicMoviesUsecasesModule {

    @Provides ConfigurationUsecase provideConfigurationUsecase (Bus bus, RestMovieSource moviesSource) {
        return new ConfigurationUsecaseController(moviesSource, bus);
    }

    @Provides GetMoviesUsecase provideMoviesUsecase (Bus bus, RestMovieSource movieSource) {
        return new GetMoviesUsecaseController(movieSource, bus);
    }
}
