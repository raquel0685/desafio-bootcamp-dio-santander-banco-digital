public class ContaCorrente extends Conta {

    public void chequeEspecial(){
        if(this.saldo <= 0){
            System.out.println("Você possui limite de cheque especial disponível!");
        }

    }
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#Extrato Conta Corrente:#");
        imprimirInformacoesComuns();
        chequeEspecial();


    }
}