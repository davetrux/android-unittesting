package com.hp.es.usps.testable.data;

import java.util.List;

/**
 * Created by david on 11/23/14.
 */
public interface DataProvider {
    void addTask(ToDo item);
    long getNextId();
    void deleteAll();
    void deleteTask(final long id);
    List<ToDo> findAll();
}