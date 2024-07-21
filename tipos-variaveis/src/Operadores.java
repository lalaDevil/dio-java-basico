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
        // para numeros pode ser usado operadores relacionais
        int n1, n2;
        n1 = 1;
        n2 = 2;
        boolean simNao = n1 == n2;

        System.out.println("numero 1 = 2?" + simNao);

        simNao = n1 != n2;

        System.out.println("Numero 1 é diferente do numero 2?" + simNao);
        /*
         * para objetos em alguns casos é necessário usar .equals EX:
         * String nomeUm = "GLEYSON";
         * String nomeDois = "GLEYSON";
         * 
         * System.out.println(nomeUm == nomeDois); //RETORNARA VERDADEIRO
         * 
         * String nomeUm = "GLEYSON";
         * String nomeDois = new String("GLEYSON");
         * 
         * System.out.println(nomeUm == nomeDois); //RETORNARA FALSE
         * 
         */

        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON"); // metodo .euquals compara conteúdos

        System.out.println(nomeUm.equals(nomeDois)); //RETORNA VERDADEIRO
    }
}
