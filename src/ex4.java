public class ex4 {
    public static int billigste_tastatur(int[] price_keyboard){
        int min=price_keyboard[0];
        for(int el:price_keyboard)
            if(el<min)
                min=el;
        return min;
    }
    public static int teuerste(int[] price_keyboard, int[] price_usb){
        int max=0;
        for(int el:price_keyboard)
            if(el>max)
                max=el;
        for(int el:price_usb)
            if(el>max)
                max=el;
        return max;
    }
    public static int teuerste_usb(int[] price_usb, int budget){
        int max=0;
        for(int el:price_usb)
            if(el>max && el<=budget)
                max=el;
        return max;
    }
    public static int max_spend(int[] price_keyboard, int[] price_usb,int budget){
        int max=-1;
        for(int usb:price_usb)
            for(int keyb:price_keyboard)
                if(usb+keyb<=budget && usb+keyb>max)
                    max=usb+keyb;
        return max;
    }

}
