public class App {
    public static void main(String[] args) throws Exception {
        int h = height(); // there's no argument inside the parantheses
        System.out.println(h); // argument h inside println method
        greeting("everyone");
    }

    public static int height() { // there's no parameter inside the paranetheses
        int height = 10; // height is a variable
        return height;
    }

    public static void greeting(String name) {
        System.out.println("Hi " + name);
    }
}
