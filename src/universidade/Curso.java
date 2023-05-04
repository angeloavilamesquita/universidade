package universidade;

import java.util.ArrayList;


public class Curso {
    private String nome;
    private String coordenador;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    
    public void addDisciplinas(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    
    public void exibeDisciplinas() {
        System.out.println("DISCIPLINAS:");
        System.out.println("===================================");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
        System.out.println("===================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    
    
}
