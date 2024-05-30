package servicos;

import entidades.Aluguel;
import interfaces.repositorios.IAluguelRepositorio;
import interfaces.servicos.IAluguelServico;
import repositorios.AluguelRepositorio;
import java.util.List;

public class AluguelServico implements IAluguelServico {
    private IAluguelRepositorio repositorio = new AluguelRepositorio();

    @Override
    public void adicionarAluguel(Aluguel aluguel) {
        repositorio.adicionar(aluguel);
    }

    @Override
    public Aluguel buscarAluguelPorId(int id) {
        return repositorio.buscarPorId(id);
    }

    @Override
    public List<Aluguel> listarTodosAlugueis() {
        return repositorio.listarTodos();
    }

    @Override
    public void atualizarAluguel(Aluguel aluguel) {
        repositorio.atualizar(aluguel);
    }

    @Override
    public void removerAluguel(int id) {
        repositorio.remover(id);
    }
}
