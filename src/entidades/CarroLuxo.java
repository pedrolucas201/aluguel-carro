package entidades;

public class CarroLuxo extends Carro {
    private double taxaDeLuxo;
    private double motoristaIncluso;

    // Construtor
    public CarroLuxo(String placa, String modelo, String nomeCarro, int ano, double precoPorDia, double motoristaIncluso) {
        super(placa, modelo, nomeCarro, ano, precoPorDia);
        this.motoristaIncluso = motoristaIncluso;
    }

    // Getters e Setters


    public double getTaxaDeLuxo() {
        return taxaDeLuxo;
    }

    public double getMotoristaIncluso() {
        return motoristaIncluso;
    }

    public double isMotoristaIncluso() {
        return motoristaIncluso;
    }

    public void setMotoristaIncluso(double motoristaIncluso) {
        this.motoristaIncluso = motoristaIncluso;
    }

    public void setTaxaDeLuxo(double taxaDeLuxo) {
        this.taxaDeLuxo = taxaDeLuxo;
    }

}
