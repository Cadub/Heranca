package Heranca3;

public class TesteLecionar {
    static public void main (String[] args) {
        ProfessorPesquisador pp = new ProfessorPesquisador();

        pp.setNome("João");
        pp.lecionar();
        pp.pesquisar();
    }
}
