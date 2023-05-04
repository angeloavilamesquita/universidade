package universidade;

public class App {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina();
        d1.setNome("Programação para web");
        d1.setCargaHoraria(60);
        d1.setProfessor("Prof. Angelo");
        
        Disciplina d2 = new Disciplina();
        d2.setNome("Interface Humano Computador");
        d2.setCargaHoraria(60);
        d2.setProfessor("Prof. Alberane");
        
        Disciplina d3 = new Disciplina();
        d3.setNome("Programação Orientada a Objetos");
        d3.setCargaHoraria(60);
        d3.setProfessor("Prof. Angelo");
        
        Curso c1 = new Curso();
        c1.setNome("ADS/SI/Ciência da Computação");
        c1.setCoordenador("Coordenador Alberane");
        c1.addDisciplinas(d1);
        c1.addDisciplinas(d2);
        c1.addDisciplinas(d3);
        
        Aluno aluno = new Aluno();
        aluno.setNome("Othavyo Luccas");
        aluno.setMatricula("2023011231");
        aluno.setCurso(c1);
        
        Unidade unidade = new Unidade();
        unidade.setNome("GEAT");
        unidade.setGestor("Ivan Jr.");
        unidade.addCurso(c1);
        
        Universidade universidade = new Universidade();
        universidade.setNome("UNIS");
        universidade.setEndereco("Avenida Alzira Barra Gazzola, s/n");
        universidade.setCidade("Varginha");
        universidade.addUnidade(unidade);
        
        System.out.println("Universidade: " + universidade.getNome());
        universidade.exibeUnidades();
        System.out.println("Unidade: " + unidade.getNome());
        unidade.exibeCursos();
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("CURSO: " + aluno.getCurso().getNome());
        aluno.getCurso().exibeDisciplinas();
    }
}
