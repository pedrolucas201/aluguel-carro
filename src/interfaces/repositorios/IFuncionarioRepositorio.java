package interfaces.repositorios;

import entidades.Funcionario;
import java.util.List;

public interface IFuncionarioRepositorio {
    void adicionar(Funcionario funcionario);
    Funcionario buscarPorMatricula(String matricula);
    List<Funcionario> listarTodos();
    void atualizar(Funcionario funcionario);
    void remover(String matricula);
}
