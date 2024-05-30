package entidades;

public class Carro {
    private String placa;
    private String modelo;
    private int ano;
    private double precoPorDia;
    private String nomeCarro;

    // Construtor
    public Carro(String placa, String modelo, String nomeCarro, int ano, double precoPorDia) {
        this.placa = placa;
        this.modelo = modelo;
        this.nomeCarro = nomeCarro;
        this.ano = ano;
        this.precoPorDia = precoPorDia;
    }

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    @Override
    public String toString() {
        return "Carro: " +
                "\nPlaca: " + placa +
                "\nModelo: " + modelo  +
                "\nNome: " + nomeCarro +
                "\nAno: " + ano +
                "\nPreço por Dia: " + precoPorDia +
                "\n";
    }

}
