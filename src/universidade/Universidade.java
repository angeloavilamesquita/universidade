package universidade;

import java.util.ArrayList;


public class Universidade {
    private String nome;
    private String endereco;
    private String cidade;
    private ArrayList<Unidade> unidades = new ArrayList<>();
    
    public void addUnidade(Unidade unidade) {
        this.unidades.add(unidade);
    }
    
    public void exibeUnidades() {
        System.out.println("UNIDADES:");
        System.out.println("===================================");
        for (Unidade unidade : unidades) {
            System.out.println(unidade.getNome());
        }
        System.out.println("===================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
