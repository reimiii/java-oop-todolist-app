public class Main {

    public static String[] model = new String[10];

    public static void main(String[] args) {

    }

    // show todo list
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            } else {
                System.out.println("isNull?: " + no + ". " + todo);
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
    public static void addTodoList(String todo) {
        // check data full?
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // model still not full?
                isFull = false;
                break;
            }
        }

        // if full is true? then index length array resize 2*
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // add to position index == null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    // test for add todo to list
    public static void testAddTodoList() {
        for (var i = 0; i < 25; i++) {
            addTodoList("test tode ke. " + i);
        }

        showTodoList();
    }

    // remove todo from list
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (var i = (number - 1); i < model.length; i++) {
                // hmmm misal panjang nya 10 - 1 = 9, maka index ke 9 = null
                // jika i itu 10 - 1 = 9, panjang array 10 - 1 = 9 maka
                // model[9] = null, okay make sense, ngerti ngerti!
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    // else nya itu maka si model[8] value nya = model[8 + 1]
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    // test remove todo from list
    public static void testRemoveTodoList() {
        addTodoList("one");
        addTodoList("two");
        addTodoList("three");
        addTodoList("four");
        addTodoList("five");

        System.out.println("-------------------" + model.length);
        showTodoList();
        System.out.println("-------------------");

        var response = removeTodoList(20);
        System.out.println(response);

        response = removeTodoList(9);
        System.out.println(response);

        response = removeTodoList(2);
        System.out.println(response);

        showTodoList();
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
