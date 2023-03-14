package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {
    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull() {
        // check data full?
        var isFull = true;
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                // model still not full?
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void reSizeIfFull() {
        // if full is true? then index length array resize 2*
        if (isFull()) {
            var temp = data;
            data = new TodoList[data.length * 2];

            for (var i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todoList) {
        reSizeIfFull();

        // add to position index == null
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todoList;
                break;
            }
        }
    }

    @Override
    public void remove(Integer number) {

    }
}
