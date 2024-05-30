package interfaces.servicos;

import entidades.Funcionario;
import java.util.List;

public interface IFuncionarioServico {
    void adicionarFuncionario(Funcionario funcionario);
    Funcionario buscarFuncionarioPorMatricula(String matricula);
    List<Funcionario> listarTodosFuncionarios();
    void atualizarFuncionario(Funcionario funcionario);
    void removerFuncionario(String matricula);
    List<Funcionario> buscarFuncionarioPorNome(String nome);
    List<Funcionario> buscarFuncionarioPorSalarioMaiorQue(double salario);
}