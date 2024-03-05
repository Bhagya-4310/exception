public class Exceptionhandling {
    public static void main(String[] args) {
        try {
            int array[] = {1, 2, 3, 4};
            System.out.println(array[10]);
        } catch(Exception e) {
            System.out.println ("10 is not in the array");
        }
        finally {
            System.out.println("final block");
        }
    }
}