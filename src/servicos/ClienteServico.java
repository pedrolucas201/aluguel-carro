package servicos;

import entidades.Cliente;
import interfaces.servicos.IClienteServico;
import repositorios.ClienteRepositorio;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteServico implements IClienteServico {
    private ClienteRepositorio repositorio = new ClienteRepositorio();

    @Override
    public void adicionarCliente(Cliente cliente) {
        repositorio.adicionar(cliente);
    }

    @Override
    public Cliente buscarClientePorCpf(String cpf) {
        return repositorio.buscarPorCpf(cpf);
    }

    @Override
    public List<Cliente> listarTodosClientes() {
        return repositorio.listarTodos();
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        repositorio.atualizar(cliente);
    }

    @Override
    public void removerCliente(String cpf) {
        repositorio.remover(cpf);
    }

    @Override
    public List<Cliente> buscarClientePorNome(String nome) {
        return repositorio.listarTodos().stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cliente> buscarClientePorTelefone(String telefone) {
        return repositorio.listarTodos().stream()
                .filter(c -> c.getTelefone().equals(telefone))
                .collect(Collectors.toList());
    }
}
