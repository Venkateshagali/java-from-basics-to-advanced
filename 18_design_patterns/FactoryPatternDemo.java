interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending email");
    }
}

class SmsNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS");
    }
}

class NotificationFactory {
    public static Notification create(String type) {
        if ("email".equalsIgnoreCase(type)) {
            return new EmailNotification();
        }
        if ("sms".equalsIgnoreCase(type)) {
            return new SmsNotification();
        }
        throw new IllegalArgumentException("Unknown type");
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Notification n = NotificationFactory.create("email");
        n.notifyUser();
    }
}
