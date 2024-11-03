package projetoleitura;
public class Pessoa {
    private String nome;
    private int idade;
    private String gênero;

    public Pessoa(String nome, int idade, String gênero) {
        this.nome = nome;
        this.idade = idade;
        this.gênero = gênero;
    }
    
    
    
    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGênero() {
        return gênero;
    }

    public void setGênero(String gênero) {
        this.gênero = gênero;
    }
    
    
}
