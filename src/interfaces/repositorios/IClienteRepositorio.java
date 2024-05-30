package interfaces.repositorios;

import entidades.Cliente;
import java.util.List;

public interface IClienteRepositorio {
    void adicionar(Cliente cliente);
    Cliente buscarPorCpf(String cpf);
    List<Cliente> listarTodos();
    void atualizar(Cliente cliente);
    void remover(String cpf);
}
