public class CommandLineArgsDemo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Pass arguments like: java CommandLineArgsDemo one two");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "] = " + args[i]);
        }
    }
}
