package fundamentos;

public class ConversorTemperatura {
    public static void main(String[] args) {
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;
        //test for a branch
        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        
        System.out.println("O resultado é " + celsius + "°C.");
    }
}
