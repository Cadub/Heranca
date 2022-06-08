package Heranca3;

//Bloco de cogio que entra em execução quando tem um objeto = Construtor
/*Exemplo: public Pessoa() {
    System.out.println("Construindo uma pessoa...")
}*/
/*Construtor padrão: tem a lista de parametros vazia
public Pessoa(){

}*/


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
