class User {
    private String name;
    private int age;
    private String city;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    public String toString() {
        return "User{name='" + name + "', age=" + age + ", city='" + city + "'}";
    }

    static class Builder {
        private String name;
        private int age;
        private String city;

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Builder setCity(String city) {
            this.city = city;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        User user = new User.Builder().setName("Kiran").setAge(25).setCity("Hyderabad").build();
        System.out.println(user);
    }
}
