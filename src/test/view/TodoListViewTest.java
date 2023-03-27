package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testAddTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository repository = new TodoListRepositoryImpl();
        TodoListService service = new TodoListServiceImpl(repository);
        TodoListView view = new TodoListView(service);

        service.addTodoList("Tidur Siang");
        service.addTodoList("Tidur Malam");
        service.addTodoList("Tidur Sore");

        view.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository repository = new TodoListRepositoryImpl();
        TodoListService service = new TodoListServiceImpl(repository);
        TodoListView view = new TodoListView(service);

        view.addTodoList();
        service.showTodoList();

        view.addTodoList();
        service.showTodoList();
    }

    public static void testDeleteTodoList() {
        TodoListRepository repository = new TodoListRepositoryImpl();
        TodoListService service = new TodoListServiceImpl(repository);
        TodoListView view = new TodoListView(service);

        service.addTodoList("Tidur Siang");
        service.addTodoList("Tidur Malam");
        service.addTodoList("Tidur Sore");

        view.showTodoList();
    }
}
