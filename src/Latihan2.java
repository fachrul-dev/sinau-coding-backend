public class Latihan2 {

    public static void main(String[] args) {
        for (int i=1; i<=20; i++) {
            int b =0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0)
                    b = b + 1;
            }
            if (b == 2) {
                System.out.println(i+ " bilangan prima ");
            }else {
                System.out.println(i+ " bukan bilangan prima");
            }
        }
    }
}
