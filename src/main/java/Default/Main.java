package Default;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");
        Cliente ronaldo = new Cliente();
        ronaldo.setNome("Ronaldo");

        Conta cc = new ContaCorrente(bruno);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(bruno);
        cc.transferir(100,cp);
        Conta cc2 = new ContaCorrente(ronaldo);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Banco banco = new Banco("Bradesco", Arrays.asList(cc,cc2));
        banco.imprimirClientes(banco.listaClienteForEach());
        banco.imprimirClientes(banco.listaClienteForNormal());
        banco.imprimirClientes(banco.listaClienteStreamForEach());
        banco.imprimirClientes(banco.listaClienteStream());

    }
}
