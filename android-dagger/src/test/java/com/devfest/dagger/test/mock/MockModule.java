package com.devfest.dagger.test.mock;

import com.devfest.dagger.app.MainActivity;
import com.devfest.dagger.data.DataProvider;
import com.devfest.dagger.data.SqlLiteProvider;

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
