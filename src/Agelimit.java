public class Agelimit {
    public static void main(String[] args) {
        int age = 20;
        try {
            if (age < 18) {
                throw new ArithmeticException("you must be atleast 18");
            } else {
                System.out.println("access declined");
            }
        } catch (Exception e) {
            System.out.println("try declined");
        }
    }
}

