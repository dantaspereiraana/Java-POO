package projetoleitura;
public class ProjetoLeitura {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro [3];
        
        p[0] = new Pessoa("Joana", 24, "Mulher");
        p[1] = new Pessoa ("Joaquin", 49, "Homem");
        
        l[0] = new Livro ("A Guerra dos Tronos", "George Martin", 564, p[0]);
        l[1] = new Livro ("Os Crimes ABC", "Agatha Christie", 257, p[1]);
        l[2] = new Livro ("Daisy Jones & The Six", "Taylor Jenkins Reid", 325, p[0]);    
        
        l[0].abrir();
        l[0].folhear(6);
        System.out.println(l[0].detalhes());
        
        l[1].abrir();
        l[1].folhear(6);
        System.out.println(l[1].detalhes());
        
        l[2].abrir();
        l[2].folhear(6);
        System.out.println(l[2].detalhes());
        
    }   
}
