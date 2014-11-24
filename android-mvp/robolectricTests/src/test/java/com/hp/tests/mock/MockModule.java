package com.hp.tests.mock;

/**
 * Created by david on 11/23/14.
 */


import com.hp.mvp.MainActivity;
import com.hp.mvp.data.DataProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by david on 5/5/14.
 */

@Module(
        injects = {
                MainActivity.class
        }
)

public class MockModule {

    @Provides
    @Singleton
    DataProvider provideDataProvider(){
        return new MockDataSource();
    }
}