package interfaces.repositorios;

import entidades.Aluguel;
import java.util.List;

public interface IAluguelRepositorio {
    void adicionar(Aluguel aluguel);
    Aluguel buscarPorId(int id);
    List<Aluguel> listarTodos();
    void atualizar(Aluguel aluguel);
    void remover(int id);
}
