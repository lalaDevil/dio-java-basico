public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.30; //o "." indica o decimal
        // ERRADO
        //short numeroCurto = 1;
        //int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal;

        // CERTO
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // método chamado cast

        //Variável(consegue ser mudado)
        int numero = 1;
        numero = 2;
        System.out.println(numero);

        //Constante(não pode ser mudado)
        final int NUMERO_CONSTANTE = 3;
        //por convenção variável deverá ser escrita em caixa alta
        System.out.println(NUMERO_CONSTANTE);
    }
}
