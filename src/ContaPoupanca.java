public class ContaPoupanca extends Conta{


    @Override
    public void imprimirExtrato() {
        System.out.println("-----------Extrato Poupanca-----------");
        ExtratoNotype();
    }
}
