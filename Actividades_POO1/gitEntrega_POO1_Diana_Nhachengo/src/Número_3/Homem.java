package Número_3;

public class Homem extends Mamifero {
    private String endereco;
    private int nuit;


    public Homem(String nome, String cor, char sexo, String endereco, int nuit) {
        super(nome, cor, "Bípede", sexo, "Racional");
        this.endereco = endereco;
        this.nuit = nuit; 
    }

    Homem(String diana, String castanho_Escuro, char c, String estudante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public int getNuit() {
        return nuit;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", Endereco: " + endereco + ", Nuit: " +nuit;
    }
    
    
}
