package interfaces.servicos;

import entidades.Aluguel;
import java.util.List;

public interface IAluguelServico {
    void adicionarAluguel(Aluguel aluguel);
    Aluguel buscarAluguelPorId(int id);
    List<Aluguel> listarTodosAlugueis();
    void atualizarAluguel(Aluguel aluguel);
    void removerAluguel(int id);
}
