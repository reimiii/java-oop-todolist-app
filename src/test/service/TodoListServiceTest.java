package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testShowTodList();
    }

    public static void testShowTodList(){
//        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Malas");
        todoListRepository.data[1] = new TodoList("Tidak Malas");
        todoListRepository.data[2] = new TodoList("Lumayan Malas");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListService.showTodoList();
    }
}
