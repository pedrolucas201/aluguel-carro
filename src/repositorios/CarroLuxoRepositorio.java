package repositorios;

import interfaces.repositorios.ICarroLuxoRepositorio;
import entidades.CarroLuxo;
import java.util.ArrayList;
import java.util.List;

public class CarroLuxoRepositorio implements ICarroLuxoRepositorio {
    private List<CarroLuxo> carrosLuxo = new ArrayList<>();

    @Override
    public void adicionar(CarroLuxo carroLuxo) {
        carrosLuxo.add(carroLuxo);
    }

    @Override
    public CarroLuxo buscarPorPlaca(String placa) {
        return carrosLuxo.stream().filter(c -> c.getPlaca().equals(placa)).findFirst().orElse(null);
    }

    @Override
    public List<CarroLuxo> listarTodos() {
        return new ArrayList<>(carrosLuxo);
    }

    @Override
    public void atualizar(CarroLuxo carroLuxo) {
        CarroLuxo existente = buscarPorPlaca(carroLuxo.getPlaca());
        if (existente != null) {
            int index = carrosLuxo.indexOf(existente);
            carrosLuxo.set(index, carroLuxo);
        }
    }

    @Override
    public void remover(String placa) {
        carrosLuxo.removeIf(c -> c.getPlaca().equals(placa));
    }
}
