package interfaces.repositorios;

import entidades.Carro;
import java.util.List;

public interface ICarroRepositorio {
    void adicionar(Carro carro);
    Carro buscarPorPlaca(String placa);
    List<Carro> listarTodos();
    void atualizar(Carro carro);
    void remover(String placa);
}
