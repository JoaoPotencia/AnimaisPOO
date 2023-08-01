public class Mamiferos{

    private String nome;
    private int idade; 

    public Mamiferos(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void EmitirSom(){
        System.out.println("Bruh bruh bruh");
        
    }

    public void mover(){
        System.out.println("crask crask crask (se movendo)");
    }

}