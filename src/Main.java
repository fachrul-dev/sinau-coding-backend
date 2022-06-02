public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("n habis dibagi 3");
            } else if (i % 5 == 0) {
                System.out.println("n habis dibagi 5");
            } else {
                System.out.println(i);
            }
        }
    }
}
