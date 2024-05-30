package entidades;

import java.time.LocalDate;

public class Aluguel {
    private int id;
    private Cliente cliente;
    private Carro carro;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Aluguel (Cliente cliente, Carro carro, LocalDate dataInicio, LocalDate dataFim) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Aluguel(int id, Cliente cliente, Carro carro, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.cliente = cliente;
        this.carro = carro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Aluguel: " +
                "\nCliente: " + cliente +
                "\nCarro: " + carro +
                "\nData Início: " + dataInicio +
                "\nData Fim: " + dataFim +
                "\n";
    }

}
