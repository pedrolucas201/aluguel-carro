package interfaces.servicos;

import entidades.Cliente;
import java.util.List;

public interface IClienteServico {
    void adicionarCliente(Cliente cliente);
    Cliente buscarClientePorCpf(String cpf);
    List<Cliente> listarTodosClientes();
    void atualizarCliente(Cliente cliente);
    void removerCliente(String cpf);
    List<Cliente> buscarClientePorNome(String nome);
    List<Cliente> buscarClientePorTelefone(String telefone);
}