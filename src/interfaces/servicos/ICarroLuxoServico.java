package interfaces.servicos;

import entidades.CarroLuxo;
import java.util.List;

public interface ICarroLuxoServico {
    void adicionarCarroLuxo(CarroLuxo carroLuxo);
    CarroLuxo buscarCarroLuxoPorPlaca(String placa);
    List<CarroLuxo> listarTodosCarrosLuxo();
    void atualizarCarroLuxo(CarroLuxo carroLuxo);
    void removerCarroLuxo(String placa);
}
