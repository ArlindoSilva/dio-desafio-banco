import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Cliente arlindo = new Cliente();
        arlindo.setNome("Arlindo");
        Conta cc = new ContaCorrente(arlindo);
        Conta poupanca = new ContaPoupanca(arlindo);

        Cliente joao = new Cliente();
        joao.setNome("Joao");
        Conta corrente = new ContaCorrente(joao);
        Conta poupConta = new ContaPoupanca(joao);


        cc.depositar(50.0);
        cc.transferencia(20.0, poupanca);
        
        corrente.depositar(100);
        corrente.transferencia(70, poupConta);
        corrente.transferencia(20, cc);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        corrente.imprimirExtrato();
        poupConta.imprimirExtrato();



    }
}