package com.bawp.todoList.adapter;

import com.bawp.todoList.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);

}
