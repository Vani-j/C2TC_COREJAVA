public class NestedIfDemo {
    public static void main(String[] args) {
        int age = 25;
        int income = 50000;

        if (age >= 18) {
            if (income >= 30000) {
                System.out.println("You are eligible for a loan.");
            } else {
                System.out.println("Your income is too low for a loan.");
            }
        } else {
            System.out.println("You must be at least 18 years old.");
        }
    }
}