package com.hp.mvp;

/**
 * Created by truxall on 11/25/2014.
 */
public interface ToDoPresenter {

    public void retrieveData();
    public void deleteToDo(long id, int position);
    public void addToDo(String item);
}
