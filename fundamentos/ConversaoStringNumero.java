package fundamentos;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        int a = 3;
        String s = a + "";
        System.out.println(s);

        String s2 = Integer.toString(a);
        System.out.println(s2);

        String s3 = "10";
        int b = Integer.parseInt(s3);
        System.out.println(b);

        double c = Double.parseDouble(s3);
        System.out.println(c);

        Integer i = Integer.valueOf(3);
        System.out.println(i);

        int d = i.intValue();
        System.out.println(d);

        System.out.println("Fim :)");

        // BigDecimal PRECISÃO
    }
}
