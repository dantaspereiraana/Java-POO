package exercicio01;

public class Exercicio01 {

    public static void main(String[] args) {
        Caneca c1 = new Caneca ();
        
        c1.marca = "Pinacoteca de São Paulo";
        c1.cor = "Roxa";
        c1.capacidade = 0.5f;
        c1.cheio = true;
        c1.cheio();
        c1.status();
        c1.beber();
        
        System.out.println("--------------------------");
        
        Caneca c2 = new Caneca ();
        c2.marca = "Não informada.";
        c2.cor = "verde água";
        c2.capacidade = 0.35f;
        c2.cheio = false;
        c2.vazio ();
        c2.status();
        c2.beber();
        
    }
    
}
