package simulador;

public class ContaBanco {
    //atributos
    public String nomeBanco;
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
   // private boolean status;


    public ContaBanco() {
        this.setNomeBanco("Disney Bank");
        this.setSaldo(1000f);
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

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
/*
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }*/

    //metodos
    public void abrirConta(){
        System.out.println("Banco: " + this.getNomeBanco());
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Cliente: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());

    }
    public void fecharConta(){}
    public void depositar(){}
    public void sacar(){}
    public void pagarMensal(){}



}
