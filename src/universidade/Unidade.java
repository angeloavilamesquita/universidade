package universidade;

import java.util.ArrayList;


public class Unidade {
    private String nome;
    private String gestor;
    private ArrayList<Curso> cursos = new ArrayList<>();
    
    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }
    
    public void exibeCursos() {
        System.out.println("CURSOS:");
        System.out.println("===================================");
        for (Curso curso : cursos) {
            System.out.println(curso.getNome());
        }
        System.out.println("===================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }
}
