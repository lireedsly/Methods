public class App {
    public static void main(String[] args) throws Exception {
        // variables: h, height
        // parameters: no parameter for height
        // arguments: no argument for height, argument h for println
        // return statement on line 14
        /*
            1. Computer goes to main method
            2. Reads int h = height(); -> jumps to height method
            3. Read through height method -> ends up returning 10
            4. Sets height() to equal 10
            5. Sets int h = 10.
            6. Prints 10
            7. Ends program


        */
        int h = height(); // there's no argument inside the parantheses
        System.out.println(h); // argument h inside println method
    }

    public static int height() { // there's no parameter inside the paranetheses
        int height = 10; // height is a variable
        return height;
    }
}
