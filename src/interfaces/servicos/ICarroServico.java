package interfaces.servicos;

import entidades.Carro;
import java.util.List;

public interface ICarroServico {
    void adicionarCarro(Carro carro);
    Carro buscarCarroPorPlaca(String placa);
    List<Carro> listarTodosCarros();
    void atualizarCarro(Carro carro);
    void removerCarro(String placa);
    List<Carro> buscarCarroPorModelo(String modelo);
    List<Carro> buscarCarroPorAno(int ano);
}