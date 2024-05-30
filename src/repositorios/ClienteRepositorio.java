package repositorios;

import interfaces.repositorios.IClienteRepositorio;
import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio implements IClienteRepositorio {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente buscarPorCpf(String cpf) {
        return clientes.stream().filter(c -> c.getCpf().equals(cpf)).findFirst().orElse(null);
    }

    @Override
    public List<Cliente> listarTodos() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void atualizar(Cliente cliente) {
        Cliente existente = buscarPorCpf(cliente.getCpf());
        if (existente != null) {
            int index = clientes.indexOf(existente);
            clientes.set(index, cliente);
        }
    }

    @Override
    public void remover(String cpf) {
        clientes.removeIf(c -> c.getCpf().equals(cpf));
    }
}
