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

        int[] grades2={4,8,3,10,17};
        System.out.println(ex2.find_max(grades2));
        System.out.println(ex2.find_min(grades2));
        System.out.println(ex2.max_sum(grades2));
        System.out.println(ex2.min_sum(grades2));

        int[] num1={8,7,0,0,0,0,0,0,0};
        int[] num2={1,3,0,0,0,0,0,0,0};
        int[] sum=ex3.sumArrays(num1,num2);
        for(int el:sum)
            System.out.print(el+" ");
        System.out.println();
        int[] num3={8,3,0,0,0,0,0,0,0};
        int[] num4={5,4,0,0,0,0,0,0,0};
        int[] diff=ex3.subtractArrays(num3,num4);
        for(int el:diff)
            System.out.print(el+" ");
    }
}
