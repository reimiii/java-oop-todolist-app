public class Main {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodoList();
    }

    // show todo list
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    // test for show todo in list
    public static void testShowTodoList() {
        model[0] = "Java Dasar";
        model[1] = "Java Dasar TodoList";
        model[2] = "Java OOP";
        model[3] = "Java Lanjutan";
        showTodoList();
    }

    // add todo ke list
    public static void addTodoList() {

    }

    // remove todo from list
    public static void removeTodoList() {

    }

    // view todo list
    public static void viewShowTodoList() {

    }

    // view for add todo list
    public static void viewAddTodoList() {

    }

    // view for remove todo from list
    public static void viewRemoveTodoList() {

    }
}
