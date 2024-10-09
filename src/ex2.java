public class ex2 {
    public static int find_max(int[] grades){
        int max=0;
        for(int gr:grades)
            if(gr>max)
                max=gr;
        return max;
    }
    public static int find_min(int[] grades){
        int min=grades[0];
        for(int gr:grades)
            if(gr<min)
                min=gr;
        return min;
    }
    public static int max_sum(int[] grades){
        int sum=0;
        for(int gr:grades)
            sum+=gr;
        return sum-find_min(grades);
    }
    public static int min_sum(int[] grades){
        int sum=0;
        for(int gr:grades)
            sum+=gr;
        return sum-find_max(grades);
    }
}
