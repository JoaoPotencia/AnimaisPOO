public class Main {

    public static void main(String[] args) {
        
        Cachorros cachorro = new Cachorros("Pitbull","Thor",3);
        cachorro.EmitirSom();
        cachorro.mover();
        cachorro.abanarRabo();
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getIdade());    
        System.out.println(cachorro.getRaca());
        
        System.out.println("===================================================="); 
        
        Passaros passaro = new Passaros("Preto", "Pica Pau", 5);
        passaro.emitirSom();
        passaro.voar();
        passaro.construirNinho();
        System.out.println(passaro.getNome());
        System.out.println(passaro.getIdade());
        System.out.println(passaro.getCor());
        
    }
}
        


    
