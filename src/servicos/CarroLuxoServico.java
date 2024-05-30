package servicos;

import entidades.CarroLuxo;
import interfaces.servicos.ICarroLuxoServico;
import repositorios.CarroLuxoRepositorio;
import java.util.List;

public class CarroLuxoServico implements ICarroLuxoServico {
    private CarroLuxoRepositorio repositorio = new CarroLuxoRepositorio();

    @Override
    public void adicionarCarroLuxo(CarroLuxo carroLuxo) {
        repositorio.adicionar(carroLuxo);
    }

    @Override
    public CarroLuxo buscarCarroLuxoPorPlaca(String placa) {
        return repositorio.buscarPorPlaca(placa);
    }

    @Override
    public List<CarroLuxo> listarTodosCarrosLuxo() {
        return repositorio.listarTodos();
    }

    @Override
    public void atualizarCarroLuxo(CarroLuxo carroLuxo) {
        repositorio.atualizar(carroLuxo);
    }

    @Override
    public void removerCarroLuxo(String placa) {
        repositorio.remover(placa);
    }
}
