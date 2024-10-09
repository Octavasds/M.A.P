import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};
        ArrayList<Integer> insuf_gr = ex1.insufficient_grades(grades);

        for (int gr : insuf_gr) {
            System.out.print(gr+" ");
        }

        System.out.println();

        System.out.printf("%.2f",ex1.mean_grades(grades));

        System.out.println();

        ArrayList<Integer> rounded_gr = ex1.rounded_grades(grades);
        for (int gr : rounded_gr) {
            System.out.print(gr+" ");
        }

        System.out.println();

        System.out.println(ex1.greatest(grades));
    }
}
