package entidades;

public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "\n   Nome: " + getNome() +
                "\n   CPF: " + getCpf() +
                "\n   Endereço: " + getEndereco() +
                "\n   Telefone: " + getTelefone() +
                "\n";
    }
}