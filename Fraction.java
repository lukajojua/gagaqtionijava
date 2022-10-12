public class Fraction {
    public int dividend ;
    public int divisor;

    public Fraction(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

   static public Fraction simplify(Fraction fraction){
        int dividend=fraction.dividend;
        int divisor=fraction.divisor;
        int i =2;
        int res=1;
        while (i<Math.min(divisor,dividend)){
            if (dividend%i==0&&divisor%i==0){
                res=i;
            }
            i++;

        }
        return (new Fraction(dividend/res,divisor/res));
    }

    static public Fraction multiply(Fraction fraction1,Fraction fraction2){
        return simplify(new Fraction(fraction1.dividend*fraction2.dividend,fraction1.divisor*fraction2.divisor));
    }


    static public Fraction sum(Fraction fraction1,Fraction fraction2){
        return simplify(new Fraction(fraction1.dividend*fraction2.divisor+fraction2.dividend*fraction1.divisor,fraction1.divisor*fraction2.divisor));

    }

    @Override
    public String toString() {
        return dividend+"/"+divisor;
    }
}
