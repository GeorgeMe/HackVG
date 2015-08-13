package com.hackvg.hackvg.di.modules;
import com.hackvg.domain.ConfigurationUsecase;
import com.hackvg.domain.ConfigurationUsecaseController;
import com.hackvg.model.rest.RestMovieSource;
import com.squareup.otto.Bus;

import dagger.Module;
import dagger.Provides;
/**
 * Created by George on 2015/8/13.
 */
@Module
public class UsecaseModule {

    @Provides
    ConfigurationUsecase provideConfigurationUsecase (Bus bus, RestMovieSource restMovieSource) {
        return new ConfigurationUsecaseController(restMovieSource, bus);
    }
}
