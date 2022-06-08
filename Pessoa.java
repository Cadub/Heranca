package Heranca3;

public abstract class Pessoa {
    String nome;
    int idade;
    //Para todos terem a mesma Instituição
    static String instituicao = "Maua";

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
