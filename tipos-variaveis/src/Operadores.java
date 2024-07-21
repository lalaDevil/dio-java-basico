public class Operadores {
    public static void main(String[] args) {
        // classe Operadores.java
        
        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1"; //31

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1; //1111
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1"; //1111
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; //1111
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); //13 (primeiro foi realizado a soma e depois a concatenação)
        System.out.println(concatenacao);
    }
}
