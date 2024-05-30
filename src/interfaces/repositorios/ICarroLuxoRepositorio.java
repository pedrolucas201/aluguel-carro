package interfaces.repositorios;

import entidades.CarroLuxo;
import java.util.List;

public interface ICarroLuxoRepositorio {
    void adicionar(CarroLuxo carroLuxo);
    CarroLuxo buscarPorPlaca(String placa);
    List<CarroLuxo> listarTodos();
    void atualizar(CarroLuxo carroLuxo);
    void remover(String placa);
}
