package simulador;

public class Main {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco();
        cliente1.setNumConta(5730);
        cliente1.setDono("Alessandra Cruz");
        cliente1.abrirConta("CC");
        cliente1.depositar(3000f);
        cliente1.sacar(100f);
        //cliente1.sacar(2938f);
        cliente1.pagarMensal();
        cliente1.fecharConta();
        cliente1.estadoAtual();

        ContaBanco cliente2 = new ContaBanco();
        cliente2.setNumConta(6841);
        cliente2.setDono("Luka Males");
        cliente2.abrirConta("CP");
        cliente2.depositar(1000f);
        cliente2.sacar(500f);
        cliente2.sacar(630f);
        cliente2.pagarMensal();
        cliente2.fecharConta();
        cliente2.estadoAtual();

    }
}
