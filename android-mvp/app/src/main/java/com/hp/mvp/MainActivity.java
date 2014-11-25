package com.hp.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.hp.mvp.data.ToDo;

import java.util.List;


public class MainActivity extends Activity implements ToDoView {

    private TextView mNewTaskText;
    private ListView mTaskView;

    private ToDoPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTaskView = (ListView) findViewById(R.id.taskList);

        mNewTaskText = (TextView) findViewById(R.id.taskText);

        Button action = (Button) findViewById(R.id.newTask);
        action.setOnClickListener(this.handleNewTaskEvent);

        mPresenter = new MainPresenter(this);

        mPresenter.retrieveData();
    }


    private final View.OnClickListener handleNewTaskEvent = new View.OnClickListener() {
        @Override
        public void onClick(final View view) {
            mPresenter.addToDo(mNewTaskText.getText().toString());

            mNewTaskText.setText("");
        }
    };

    public MainApplication getMainApplication(){
        return (MainApplication) getApplication();
    }

    /**
     * Helper method to put the list of items into the ListView
     */
    public void bindToDoList(final List<ToDo> data) {
        final ToDoAdapter adapter = new ToDoAdapter(this, data);
        mTaskView.setAdapter(adapter);

        mTaskView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(final AdapterView<?> parent, final View view, final int position, final long id) {

                final TextView v = (TextView) view;

                final long todoId = (Long) v.getTag();

                mPresenter.deleteToDo(todoId, position);
            }
        });
    }
}
