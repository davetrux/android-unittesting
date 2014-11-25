package com.hp.mvp;

import com.hp.mvp.data.ToDo;

import java.util.List;

/**
 * Interface for the View in our MVP example. Allows the Presenter to bind the data to the ListView
 */
public interface ToDoView {

    void bindToDoList(List<ToDo> data);
    MainApplication getMainApplication();
}
