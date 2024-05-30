package servicos;

import entidades.Funcionario;
import interfaces.servicos.IFuncionarioServico;
import repositorios.FuncionarioRepositorio;
import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioServico implements IFuncionarioServico {
    private FuncionarioRepositorio repositorio = new FuncionarioRepositorio();

    @Override
    public void adicionarFuncionario(Funcionario funcionario) {
        repositorio.adicionar(funcionario);
    }

    @Override
    public Funcionario buscarFuncionarioPorMatricula(String matricula) {
        return repositorio.buscarPorMatricula(matricula);
    }

    @Override
    public List<Funcionario> listarTodosFuncionarios() {
        return repositorio.listarTodos();
    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) {
        repositorio.atualizar(funcionario);
    }

    @Override
    public void removerFuncionario(String matricula) {
        repositorio.remover(matricula);
    }

    @Override
    public List<Funcionario> buscarFuncionarioPorNome(String nome) {
        return repositorio.listarTodos().stream()
                .filter(f -> f.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
    }

    @Override
    public List<Funcionario> buscarFuncionarioPorSalarioMaiorQue(double salario) {
        return repositorio.listarTodos().stream()
                .filter(f -> f.getSalario() > salario)
                .collect(Collectors.toList());
    }
}
