public class FormatadorCepExemplo {
    public static void main(String[] args) {
      try {
        String cepFormatado = formatarCep("65432123");
        System.out.println(cepFormatado);
      } catch (Exception e) {
        System.out.println("O cep não corresponde");
      }  
        
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }

}
