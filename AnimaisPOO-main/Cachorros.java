public class Cachorros extends Mamiferos {
    
    private String raca;

    public Cachorros(String raca, String nome, int idade){
        super(nome, idade); //método super que serve para chamar o construtor da superclasse
        this.raca = raca;
    }


    public String getRaca(){
        return this.raca;
    }



    public void setRaca(String racaa){
        this.raca = racaa;
    }




    public void abanarRabo(){
        System.out.println("Vu Vu Vu (abanando o rabo).");
    }


    
}
