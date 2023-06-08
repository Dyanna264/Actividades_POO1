package Número_3;

public abstract class Mamifero extends Animal {

    public Mamifero(String nome, String cor, String tipoLocomocao, char sexo, String capacidadeIntelectual) {
        super(nome, "Terrestre ou Aquático ou Aéreo", cor, tipoLocomocao, sexo, "Carnívoro ou Herbívoro", capacidadeIntelectual);
    }
}
