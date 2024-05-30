package servicos;

import entidades.Carro;
import interfaces.servicos.ICarroServico;
import repositorios.CarroRepositorio;
import java.util.List;
import java.util.stream.Collectors;

public class CarroServico implements ICarroServico {
    private CarroRepositorio repositorio = new CarroRepositorio();

    @Override
    public void adicionarCarro(Carro carro) {
        repositorio.adicionar(carro);
    }

    @Override
    public Carro buscarCarroPorPlaca(String placa) {
        return repositorio.buscarPorPlaca(placa);
    }

    @Override
    public List<Carro> listarTodosCarros() {
        return repositorio.listarTodos();
    }

    @Override
    public void atualizarCarro(Carro carro) {
        repositorio.atualizar(carro);
    }

    @Override
    public void removerCarro(String placa) {
        repositorio.remover(placa);
    }

    @Override
    public List<Carro> buscarCarroPorModelo(String modelo) {
        return repositorio.listarTodos().stream()
                .filter(c -> c.getModelo().equalsIgnoreCase(modelo))
                .collect(Collectors.toList());
    }

    @Override
    public List<Carro> buscarCarroPorAno(int ano) {
        return repositorio.listarTodos().stream()
                .filter(c -> c.getAno() == ano)
                .collect(Collectors.toList());
    }
}
