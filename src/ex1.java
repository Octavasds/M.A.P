import java.util.ArrayList;

public class ex1 {
    public static ArrayList<Integer> insufficient_grades(int[] grades){
        ArrayList<Integer> aux = new ArrayList<>();
        for (int grade : grades)
            if (grade < 40)
                aux.add(grade);
        return aux;
    }
    public static float mean_grades(int[] grades){
        int sum=0;
        for(int gr: grades)
            sum+=gr;
        return (float) sum /grades.length;
    }
    public static ArrayList<Integer> rounded_grades(int[] grades){
        ArrayList<Integer> aux = new ArrayList<>();
        for(int gr: grades)
            if(gr<38)
                aux.add(gr);
            else{
                int round_gr=gr;
                while(round_gr%5!=0)
                    round_gr++;
                if(round_gr-gr<3)
                    aux.add(round_gr);
                else
                    aux.add(gr);
            }
        return aux;
    }
    public static int greatest(int[] grades){
        ArrayList<Integer> aux = rounded_grades(grades);
        int max=0;
        for(int gr: aux)
            if(gr>max)
                max=gr;
        return max;
    }

}
