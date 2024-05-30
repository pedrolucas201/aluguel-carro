package repositorios;

import interfaces.repositorios.ICarroRepositorio;
import entidades.Carro;
import java.util.ArrayList;
import java.util.List;

public class CarroRepositorio implements ICarroRepositorio {
    private List<Carro> carros = new ArrayList<>();

    @Override
    public void adicionar(Carro carro) {
        carros.add(carro);
    }

    @Override
    public Carro buscarPorPlaca(String placa) {
        return carros.stream().filter(c -> c.getPlaca().equals(placa)).findFirst().orElse(null);
    }

    @Override
    public List<Carro> listarTodos() {
        return new ArrayList<>(carros);
    }

    @Override
    public void atualizar(Carro carro) {
        Carro existente = buscarPorPlaca(carro.getPlaca());
        if (existente != null) {
            int index = carros.indexOf(existente);
            carros.set(index, carro);
        }
    }

    @Override
    public void remover(String placa) {
        carros.removeIf(c -> c.getPlaca().equals(placa));
    }
}
