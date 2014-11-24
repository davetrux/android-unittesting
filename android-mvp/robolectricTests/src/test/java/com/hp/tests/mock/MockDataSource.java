package com.hp.tests.mock;

import com.hp.mvp.data.DataProvider;
import com.hp.mvp.data.ToDo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 4/28/14.
 */
public class MockDataSource implements DataProvider {
    @Override
    public void addTask(ToDo item) {

    }

    @Override
    public long getNextId() {
        return 3;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteTask(long id) {

    }

    @Override
    public List<ToDo> findAll() {

        List<ToDo> data = new ArrayList<ToDo>();

        ToDo item = new ToDo();
        item.setId(11l);
        item.setTitle("Title 1");
        data.add(item);

        item = new ToDo();
        item.setId(16l);
        item.setTitle("Title 2");
        data.add(item);

        item = new ToDo();
        item.setId(16l);
        item.setTitle("Title 3");
        data.add(item);

        return data;
    }
}
