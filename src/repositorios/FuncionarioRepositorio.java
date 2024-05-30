package repositorios;

import interfaces.repositorios.IFuncionarioRepositorio;
import entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepositorio implements IFuncionarioRepositorio {
    private List<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public void adicionar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public Funcionario buscarPorMatricula(String matricula) {
        return funcionarios.stream().filter(f -> f.getMatricula().equals(matricula)).findFirst().orElse(null);
    }

    @Override
    public List<Funcionario> listarTodos() {
        return new ArrayList<>(funcionarios);
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        Funcionario existente = buscarPorMatricula(funcionario.getMatricula());
        if (existente != null) {
            int index = funcionarios.indexOf(existente);
            funcionarios.set(index, funcionario);
        }
    }

    @Override
    public void remover(String matricula) {
        funcionarios.removeIf(f -> f.getMatricula().equals(matricula));
    }
}
