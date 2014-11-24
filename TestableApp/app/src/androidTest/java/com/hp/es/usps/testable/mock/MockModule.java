package com.hp.es.usps.testable.mock;

/**
 * Created by david on 11/23/14.
 */

import com.hp.es.usps.testable.data.DataProvider;
import com.hp.es.usps.testable.testableapp.MainActivity;

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