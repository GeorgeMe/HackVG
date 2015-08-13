package com.hackvg.hackvg.di.components;
import com.hackvg.hackvg.di.modules.MovieUsecasesModule;
import com.hackvg.hackvg.di.scopes.PerActivity;
import com.hackvg.hackvg.views.activities.MovieDetailActivity;

import dagger.Component;
/**
 * Created by George on 2015/8/13.
 */

@PerActivity @Component(dependencies = AppComponent.class, modules = MovieUsecasesModule.class)
public interface MovieUsecasesComponent {

    void inject (MovieDetailActivity movieDetailActivity);
}
