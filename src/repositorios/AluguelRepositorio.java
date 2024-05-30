package repositorios;

import entidades.Aluguel;
import interfaces.repositorios.IAluguelRepositorio;
import java.util.ArrayList;
import java.util.List;

public class AluguelRepositorio implements IAluguelRepositorio {
    private List<Aluguel> alugueis = new ArrayList<>();
    private int currentId = 1;

    @Override
    public void adicionar(Aluguel aluguel) {
        aluguel.setId(currentId++);
        alugueis.add(aluguel);
    }

    @Override
    public Aluguel buscarPorId(int id) {
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getId() == id) {
                return aluguel;
            }
        }
        return null;
    }

    @Override
    public List<Aluguel> listarTodos() {
        return new ArrayList<>(alugueis);
    }

    @Override
    public void atualizar(Aluguel aluguel) {
        int index = -1;
        for (int i = 0; i < alugueis.size(); i++) {
            if (alugueis.get(i).getId() == aluguel.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            alugueis.set(index, aluguel);
        }
    }

    @Override
    public void remover(int id) {
        alugueis.removeIf(aluguel -> aluguel.getId() == id);
    }
}
