package fundamentos;

public class Wrapper {
    public static void main(String[] args) {
        //Wrapper versão objeto do tipo primitivo
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; // int
        Long l = 100000L; // converte apenas de long para long por isso o L

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.booleanValue());
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // char
        System.out.println(c + "...");

    }
}
