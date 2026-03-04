class ParentLoader {
    static {
        System.out.println("Parent class static block loaded");
    }
}

class ChildLoader extends ParentLoader {
    static {
        System.out.println("Child class static block loaded");
    }
}

public class ClassLoadingProcessDemo {
    public static void main(String[] args) {
        System.out.println("Main method started");
        ChildLoader obj = new ChildLoader();
        System.out.println("Object created: " + obj.getClass().getSimpleName());
    }
}
