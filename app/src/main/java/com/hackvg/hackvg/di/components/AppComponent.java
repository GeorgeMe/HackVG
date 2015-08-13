package com.hackvg.hackvg.di.components;
import com.hackvg.hackvg.di.modules.ApplicationModule;
import com.hackvg.hackvg.di.modules.DomainModule;
import com.hackvg.model.rest.RestMovieSource;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;
/**
 * Created by George on 2015/8/13.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        DomainModule.class,
})

public interface AppComponent {

    Bus bus();
    RestMovieSource restMovieSource();
}
