package aula07;
public final class Lutadores {
 
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
//Métodos Especiais
    public void apresentar() {
        System.out.println("--------APRESENTAÇÃO-----------");
        System.out.println("LUTADOR " + this.getNome());
        System.out.println("País de origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + "anos.");
        System.out.println("Altura: " + this.getAltura() + "m de altura.");
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Categoria: peso " + this.getCategoria());
        System.out.println("Total de vitórias: " + this.getVitorias());
        System.out.println("Total de derrotas: " + this.getDerrotas());
        System.out.println("Total de empates: " + this.getEmpates());
    }

    public Lutadores(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
    public void status() {
        System.out.println("-----STATUS------");
        System.out.println("LUTADOR " + this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + "---VITÓRIAS ||| DERROTAS---" + this.getDerrotas());
    }
    public void ganharLuta(){
       this.setVitorias(this.getVitorias() + 1); 
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
//Métodos Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria("");
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (this.getPeso()<52.2) {
            this.categoria = "inválido";
        } else if (this.getPeso()<= 70.3) {
            this.categoria = "leve";
        } else if (this.getPeso()<=83.9) {
            this.categoria = "médio";
        } else if (this.getPeso()<=120.2) {
            this.categoria = "pesado";
        } else {
            this.setCategoria("inválido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
