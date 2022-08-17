package Exercise2;

public class Question3 {

    public static void main(String args[]) {

        System.out.println("\nDivided by 5: ");
        for (int i=200; i<=300; i++) {
            if (i%5==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 7: ");
        for (int i=200; i<300; i++) {
            if (i%7==0) System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i=200; i<300; i++) {
            if (i%5==0 && i%7==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}