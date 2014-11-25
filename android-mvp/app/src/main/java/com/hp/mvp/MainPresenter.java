package com.hp.mvp;

import com.hp.mvp.data.DataProvider;
import com.hp.mvp.data.ToDo;

import java.util.List;

import javax.inject.Inject;

/**
 * the Presenter object in our MVP model
 */
public class MainPresenter implements ToDoPresenter {

    private List<ToDo> mData;
    private ToDoView mView;

    @Inject
    DataProvider mProvider;


    public MainPresenter(ToDoView view) {
        mView = view;

        MainApplication app = mView.getMainApplication();
        app.getObjectGraph().inject(this);
    }

    @Override
    public void retrieveData() {
        mData = mProvider.findAll();
        mView.bindToDoList(mData);
    }

    @Override
    public void deleteToDo(long id, int position) {

        //Remove from the local database
        mProvider.deleteTask(id);
        mData.remove(position);
        mView.bindToDoList(mData);
    }

    @Override
    public void addToDo(String item) {
        ToDo newItem = new ToDo();
        newItem.setTitle(item);
        newItem.setId(mProvider.getNextId());
        mProvider.addTask(newItem);

        mData.add(newItem);
        mView.bindToDoList(mData);
    }
}
