public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
                //se fosse continue
                //saída seria 1...2...4...5
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ?
        //R: 1...2
    }
    
}
