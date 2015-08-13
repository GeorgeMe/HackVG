package com.hackvg.hackvg.di.components;
import com.hackvg.hackvg.di.modules.BasicMoviesUsecasesModule;
import com.hackvg.hackvg.di.scopes.PerActivity;
import com.hackvg.hackvg.views.activities.MoviesActivity;

import dagger.Component;
/**
 * Created by George on 2015/8/13.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = BasicMoviesUsecasesModule.class)
public interface BasicMoviesUsecasesComponent {

    void inject (MoviesActivity moviesActivity);
}
