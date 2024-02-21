public class HelloWold {
    public static void main(String[] args) {
        Hello_World(5);  // calling the function in the main.
    }
    public static void Hello_World(int n) {
        if (n > 0) {           // if n is greater than 0
            Hello_World(n - 1);
            System.out.println("Hello World");      // print hello world.

        }
    }
}
