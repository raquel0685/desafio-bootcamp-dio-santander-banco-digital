public class Main {
    public static void main(String[] args) {
        Cliente eu = new Cliente();
        eu.setNome("Eu");

        Conta cc = new ContaCorrente(eu);
        cc.depositar(100);

        ContaPoupanca cp = new ContaPoupanca(eu);
        cc.transferir(100,cp);

        cp.transferir(50,cc);

        Cliente nos = new Cliente();
        nos.setNome("Nós");

        IConta cc1 = new ContaCorrente(nos);
        cc1.depositar(300);

        Cliente ixi = new Cliente();
        ixi.setNome("Ixi");
        Conta cc2 = new ContaCorrente(ixi);


        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc1.imprimirExtrato();
        cc2.imprimirExtrato();

    }
}
