package Número_3;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    protected String nome;
    protected  String habitat;
    protected String cor;
    protected String tipoLocomocao;
    protected char sexo;
    protected String alimentacao;
    protected String capacidadeIntelectual;

    public Animal(String nome,String habitat, String cor, String tipoLocomocao, char sexo, String alimentacao, String capacidadeIntelectual) {
        this.nome = nome;
        this.habitat = habitat;
        this.cor = cor;
        this.tipoLocomocao = tipoLocomocao;
        this.sexo = sexo;
        this.alimentacao = alimentacao;
        this.capacidadeIntelectual = capacidadeIntelectual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLocomocao() {
        return tipoLocomocao;
    }

    public void setTipoLocomocao(String tipoLocomocao) {
        this.tipoLocomocao = tipoLocomocao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public String getCapacidadeIntelectual() {
        return capacidadeIntelectual;
    }
    
    
    
    
    

    @Override
    public String toString() {
        return "Nome: " + nome + ", Habitat: " + habitat + ", Cor: " + cor + ", Tipo de Locomocao: " + tipoLocomocao + ",Sexo: "+ sexo + ", Alimentacao: " + alimentacao + ", Capacidade Intelecual: " + capacidadeIntelectual;
    }
    
    
}
