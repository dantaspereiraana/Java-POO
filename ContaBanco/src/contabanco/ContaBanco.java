
package contabanco;
public class ContaBanco {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setDono("Ana");
        p1.setTipo("cc");
        
        p1.pagMensal();
        p1.depositar(150);
        p1.estadoAtual();
    }
    
}
