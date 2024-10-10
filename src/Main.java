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
        System.out.println();

        int[] num5={2,3,6,0,0,0,0,0,0};
        int[] product=ex3.multiplication(num5,2);
        for(int el:product)
            System.out.print(el+" ");
        System.out.println();

        int[] num6={2,3,6,0,0,0,0,0,0};
        int[] division=ex3.divide(num6,2);
        for(int el:division)
            System.out.print(el+" ");
        System.out.println();


        int[] price_keyboard={40,35,70,15,45};
        System.out.println(ex4.billigste_tastatur(price_keyboard));

        int[] price_keyboard1={15,20,10,35};
        int[] price_usb={20,15,40,15};
        System.out.println(ex4.teuerste(price_keyboard1,price_usb));

        int[] price_usb1={15,45,20};
        int budget=30;
        System.out.println(ex4.teuerste_usb(price_usb1,budget));


        int[] price_usb2={8,12};
        int[] price_keyboard2={40,50,60};
        budget*=2;
        System.out.println(ex4.max_spend(price_keyboard2,price_usb2,budget));
        int[] price_keyboard3={60};
        System.out.println(ex4.max_spend(price_keyboard3,price_usb2,budget));
        int[] price_keyboard4={40,60};
        System.out.println(ex4.max_spend(price_keyboard4,price_usb2,budget));
    }
}
