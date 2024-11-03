package projetoleitura;
public class Livro implements Leitura{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String título, String autor, int totPag, Pessoa dono) {
        this.titulo = título;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = dono;
    }

    
    public String detalhes() {
        return "INFORMAÇÕES DO LIVRO \n ----------------------- \n Título " + titulo +  "\n Autor: " + autor + "\n Total de Páginas: " + totPag + "\n Página atual: "+ pagAtual + "\n Está aberto: " + aberto + "\n Leitor: " + leitor.getNome();
    }

    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTítulo(String título) {
        this.titulo = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getDono() {
        return leitor;
    }

    public void setDono(Pessoa dono) {
        this.leitor = dono;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    public void folhear(int p) {
        if (p <= this.getTotPag()) {
            this.setPagAtual(p);
        } else {
            System.out.println("Opa! Essa página não existe.");
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

    @Override
    public void folhear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
         
}
