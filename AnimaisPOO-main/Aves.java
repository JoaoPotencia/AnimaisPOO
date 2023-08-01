public class Aves {

    private String nome;
    private int idade;

    public Aves(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
            return idade;
    }

    public void emitirSom() {
        System.out.println("vu vu vu (emitindo som)");
    }

    public void voar() {
        System.out.println("scru scru scru (ave voando)");
    }
}