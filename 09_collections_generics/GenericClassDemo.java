class Box<T> {
    private T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class GenericClassDemo {
    public static void main(String[] args) {
        Box<String> strBox = new Box<String>();
        strBox.setValue("Hello");

        Box<Integer> intBox = new Box<Integer>();
        intBox.setValue(100);

        System.out.println(strBox.getValue());
        System.out.println(intBox.getValue());
    }
}
