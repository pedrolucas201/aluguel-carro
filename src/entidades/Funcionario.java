package entidades;

public class Funcionario extends Pessoa{
    private String matricula;
    private String cargo;
    private double salario;

    public Funcionario(String cpf, String nome, String telefone, String matricula, String cargo, double salario) {
        super(nome, cpf, telefone);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters e Setters


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionário: " +
                "\n   Nome: " + getNome() +
                "\n   CPF: " + getCpf() +
                "\n   Telefone: " + getTelefone() +
                "\n   Matrícula: " + matricula +
                "\n   Cargo: " + cargo +
                "\n   Salário: " + salario +
                "\n";
    }
}

