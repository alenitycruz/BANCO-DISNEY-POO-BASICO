package simulador;

public class Main {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        cb1.setNumConta(5730);
        cb1.setTipo("Conta Corrente");
        cb1.setDono("Alessandra Cruz");
        cb1.setSaldo(30000f);
        cb1.abrirConta();
    }
}
