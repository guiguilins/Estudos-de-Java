package Introduction.DolarStaticPOO.util;

public class CurrecyConverter {
    
    public static double dolar;

    public static double converterReal(double dolar, double dolarBuy){
        double taxDolar = dolar * 6/100;
       
        return (dolar + taxDolar) * dolarBuy;
    }
}
