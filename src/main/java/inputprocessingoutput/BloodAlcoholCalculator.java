package inputprocessingoutput;

import utils.ScannerUtils;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {


        System.out.println("Please enter your weight");
        int W = weight(0);
        System.out.println("Please enter your gender");
        String G = gender("");
        System.out.println("Please enter amount of alcohol consumed");
        double A = alcoholConsumed(0);
        System.out.println("Please enter hours since last drink");
        int H = hourFromLastDrink(0);
//        BAC = (A × 5.14 /W × r) − .015 × H
//        r is the alcohol distribution ratio:
//              – 0.73 for men
//              – 0.66 for women
        double rM = 0.73;
        double rF = 0.66;
        double bac = 0;

        if (G.equals("M")){
            bac = ((A*5.14/W*rM) - .015*H);
        }
        if (G.equals("F")){
            bac = ((A*5.14/W*rF) - .015*H);
        }
        if (bac < 0) {
            System.out.println("Your BAC is " + "0.00." + "\nYou can drive, alcohol it's not present ");
        }
        else  if (bac > 0.02){
            System.out.println("Your BAC is " + bac + "\nIt is not legal for you to drive.");
        }
    }
    public static int weight (int w){
        try {
            w = ScannerUtils.nextSingleInt();
            if (w<0){
                System.out.println("Please enter a valid number");
                return weight(w);
            }
        }catch (Exception e){
            System.out.println("Please enter a valid number");
            return weight(w);
        }return w;
    }
    public static String gender (String g) {
        try {
            g = ScannerUtils.nextLine();
            if (!g.equals("M") && !g.equals("F")) {
                System.out.println("Please enter \"M\" for masculin or \"F\" for feminin");
                return gender(g);
            }
        } catch (Exception e) {
            System.out.println("Please enter \"M\" for masculin or \"F\" for feminin");
            return gender(g);
        }
        return g;
    }
    public static double alcoholConsumed (double a){
        try {
            a = ScannerUtils.nextSingleDouble();
        }catch (Exception e){
            System.out.println("Please enter a valid number");
            return alcoholConsumed(a);
        }return a;
    }
    public static int hourFromLastDrink (int h){
     try {
         h = ScannerUtils.nextSingleInt();
         if (h < 0 || h > 24) {
             System.out.println("Please enter hours since last drink!");
             return hourFromLastDrink(h);
            }
        }catch (Exception e){
         System.out.println("Please enter hours since last drink!");
         return hourFromLastDrink(h);
     }return h;

    }
}
