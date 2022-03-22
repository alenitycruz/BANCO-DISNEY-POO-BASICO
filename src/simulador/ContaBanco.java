package simulador;

public class ContaBanco {
    //atributos
    public String nomeBanco;
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //construtor
    public ContaBanco() {
        this.setNomeBanco("Disney Bank");
        this.setSaldo(0f);
        this.setStatus(false);
    }


    //métodos personalizados
    public void estadoAtual(){
        System.out.println("===========================================");
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Cliente: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //metodos
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("CC")) {
            this.setSaldo(50f);
        } else if(tipo.equals("CP")) {

            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso");

    }
    public void depositar(float valor){
        if (this.isStatus()){
            this.setSaldo(getSaldo()+valor);
            System.out.println("Deposito realizado com sucesso na conta de " + dono);
        } else {
            System.out.println("Impossivel depositar em uma conta fechada.");
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada por haver saldo positivo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada por haver débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    public void sacar(float valor){
        if (this.isStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo()-valor);
                System.out.println("Saque de $ " + valor + " (dólares) realizado na conta de " + dono);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }
    public void pagarMensal(){
        float mensal = 0f;
        if (this.getTipo() == "CC"){
            mensal = 12f;
        }else if (this.getTipo() == "CP") {
            mensal = 20f;
        }

        if (this.isStatus()){
            this.setSaldo(getSaldo()-mensal);
            System.out.println("Mensalidade paga com sucesso por " + getDono());
        }else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }



}
