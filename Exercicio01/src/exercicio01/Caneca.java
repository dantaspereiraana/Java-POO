package exercicio01;

public class Caneca {
    String marca;
    String cor;
    float capacidade;
    boolean cheio;
    String material = "Ceramica";
    
    void status (){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Capacidade: " + this.capacidade + "L");
        System.out.println("Material: " + this.material);
        System.out.println("Está cheio? " + this.cheio);
    }
    
    void beber () {
        if (this.cheio == false) {
            System.out.println("Opa! Você precisa encher a caneca!");
        } else {
            System.out.println("Bebendo...");
        }
        
    }
    
    void cheio () {
        this.cheio = true;
    }
    
    void vazio () {
        this.cheio = false;
    }
}
