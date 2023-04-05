package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário
        // Tipo primitivo byte
        byte anosDeEmpresa = 23;
        // Tipo primitivo short
        short numeroDeVoos = 542;
        // Tipo primitivo int
        int id = 56789;
        // Tipo primitivo long
        long pontosAcumulados = 3_134_845_223L;
        // Tipo primitivo float
        float salario = 11_445.44F;
        // Tipo primitivo double
        double vendasAcumuladas = 2_991_797_103.01;
        // Tipo primitivo boolean
        boolean estaDeFerias = false;
        // Tipo primitivo char
        char status = 'A'; // ativo

        //test

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        // Número de viagens
        System.out.println(numeroDeVoos / 2);
        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
