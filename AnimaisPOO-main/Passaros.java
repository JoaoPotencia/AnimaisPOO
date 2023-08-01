public class Passaros extends Aves{

    private String cor;

    public Passaros(String cor, String nome, int idade){
        super(nome, idade); //método super que serve para chamar o construtor da superclasse
        this.cor = cor;
    }
    
    public String getCor(){
        return (cor);
    }

    public void construirNinho() {
        System.out.println("crusk crusk crusk (O pássaro construindo seu ninho!!)");
    }
    
}
