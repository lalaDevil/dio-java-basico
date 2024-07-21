public class Operadores {
    public static void main(String[] args) {
        // classe Operadores.java

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1"; // 31

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1; // 1111
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1"; // 1111
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; // 1111
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); // 13 (primeiro foi realizado a soma e depois a concatenação)
        System.out.println(concatenacao);

        // TERNÁRIO
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }
}
