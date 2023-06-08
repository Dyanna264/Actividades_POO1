package Número_3;

public class Cachorro extends Mamifero {
    private String raca;
    
    public Cachorro(String nome, String cor, char sexo, String raca) {
        super(nome, cor, "Quadrúpede", sexo, "Racional");
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    

    @Override
    public String toString() {
        return super.toString() + ", Raca: " + raca;
    }
    
    
    
}
