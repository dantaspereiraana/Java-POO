package contabanco;
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Método Construtor
    public void Conta () {
        saldo = 0;
        status = false;    
    } 
    
    public void estadoAtual () {
        System.out.println("Dono: " + this.getDono());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Saldo: " + this.getSaldo());
    }
    //Métodos Especiais
    public void abrirConta () {
        this.setStatus(true);
        if (tipo.equals("cc")) {
            this.setSaldo(this.getSaldo() + 50);
        } else if (tipo.equals("cp")) {
            this.setSaldo(this.getSaldo() + 150);
        }
    } 
    
    public void fecharConta () {
        if (this.getSaldo()> 0) {
            System.out.println("Saque os valores em conta antes de encerrar a conta.");
        } else if (this.getSaldo()<0) {
            System.out.println("Quite seus dépisto antes de encerrar a conta.");
        } else {
            System.out.println("Conta encerrada com sucesso.");
        }
    }
    public void depositar (int v) {
        if (this.getStatus() == true) {
            this.setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Conta encerrada!");
        }
    }
    
    public void sacar (int v) {
        if (status == true) {
            if (this.getSaldo()>= v) {
                this.setSaldo(getSaldo() - v);
                 System.out.println("Saque realizado com suceddo!");
            } else {
                 System.out.println("Seu saldo é insuficiente.");
            }
        } else {
             System.out.println("Essa conta já foi encerrada.");
        }
    }
    
    public void pagMensal() {
        int v = 0;
        if (tipo.equals("cc")) {
            v = 12;
        } else if (tipo.equals("cp")) {
            v = 20;
        }
        
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
        } else {
            System.out.println("Conta Encerrada.");
        }
    }
     
    //Métodos Getter e Setters 

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //usando "get" ao invés de "is" por motivos didáticos
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
