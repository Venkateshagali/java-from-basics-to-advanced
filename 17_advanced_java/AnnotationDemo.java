import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyMarker {
    String value();
}

class Service {
    @MyMarker("demo")
    public void run() {
        System.out.println("Service running");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) throws Exception {
        Service s = new Service();
        s.run();

        java.lang.reflect.Method method = Service.class.getMethod("run");
        if (method.isAnnotationPresent(MyMarker.class)) {
            MyMarker m = method.getAnnotation(MyMarker.class);
            System.out.println("Annotation value: " + m.value());
        }
    }
}
