package Default;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Banco {

    private String nome;
    private List<Conta> contas;

    public List listaClienteForEach() {
        List<Cliente> clientes = new ArrayList<>();
        for (Conta conta : this.contas) {
            clientes.add(conta.cliente);
        }
        return clientes;

    }

    public List listaClienteForNormal() {
        List<Cliente> clientes = new ArrayList<>();
        for (int i = 0; i < this.contas.size(); i++) {
            clientes.add(contas.get(i).cliente);
        }
        return clientes;
    }

    public List listaClienteStream() {
        return this.contas.stream().map(conta -> conta.cliente).collect(Collectors.toList());
    }


    public List listaClienteStreamForEach() {
        List<Cliente> clientes = new ArrayList<>();
        this.contas.stream().forEach(conta -> clientes.add(conta.cliente));
        return clientes;
    }
    
    public void imprimirClientes(List<Cliente> clientes){
        //        clientes.forEach(cliente -> System.out.println(cliente.nome));
        for (Cliente cliente: clientes) {
            System.out.println(cliente.nome);
        }

    }
}
