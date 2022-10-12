public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getDiscriminant(1,-2,1));
        Fraction fraction=new Fraction(10,10);
        Fraction fraction2=new Fraction(4,10);
        System.out.println(Fraction.simplify(fraction));
        System.out.println(Fraction.multiply(fraction,fraction2));
        System.out.println(Fraction.sum(fraction,fraction2));



    }





    public static double getDiscriminant(double a,double b,double c){
        return b*b-4*a*c;

    }
    public static String minLength(String[]strings){
        String a=strings[0];
        for (String string : strings) {
            if (a.length() > string.length()) {
                a = string;
            }
        }
        return a;
    }
}

