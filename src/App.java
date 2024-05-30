import entidades.*;
import servicos.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {
    private static CarroServico carroServico = new CarroServico();
    private static ClienteServico clienteServico = new ClienteServico();
    private static AluguelServico aluguelServico = new AluguelServico();
    private static FuncionarioServico funcionarioServico = new FuncionarioServico();
    private static CarroLuxoServico carroLuxoServico = new CarroLuxoServico();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Sistema de Aluguel de Carros ===");
            System.out.println("1. Gerenciar Carros");
            System.out.println("2. Gerenciar Clientes");
            System.out.println("3. Gerenciar Aluguéis");
            System.out.println("4. Gerenciar Funcionários");
            System.out.println("5. Gerenciar Carros de Luxo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerenciarCarros(scanner);
                    break;
                case 2:
                    gerenciarClientes(scanner);
                    break;
                case 3:
                    gerenciarAlugueis(scanner);
                    break;
                case 4:
                    gerenciarFuncionarios(scanner);
                    break;
                case 5:
                    gerenciarCarrosLuxo(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void gerenciarCarros(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n=== Gerenciar Carros ===");
            System.out.println("1. Adicionar Carro");
            System.out.println("2. Buscar Carro por Placa");
            System.out.println("3. Listar Todos os Carros");
            System.out.println("4. Atualizar Carro");
            System.out.println("5. Remover Carro");
            System.out.println("6. Buscar Carro por Modelo");
            System.out.println("7. Buscar Carro por Ano");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Carro: ");
                    String nomeCarro = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Preço por Dia: ");
                    double precoPorDia = scanner.nextDouble();
                    Carro carro = new Carro(placa, modelo, nomeCarro, ano, precoPorDia);
                    carroServico.adicionarCarro(carro);
                    System.out.println("Carro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Placa: ");
                    placa = scanner.nextLine();
                    carro = carroServico.buscarCarroPorPlaca(placa);
                    if (carro != null) {
                        System.out.println(carro);
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;
                case 3:
                    List<Carro> carros = carroServico.listarTodosCarros();
                    carros.forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Placa do Carro a ser atualizado: ");
                    placa = scanner.nextLine();
                    carro = carroServico.buscarCarroPorPlaca(placa);
                    if (carro != null) {
                        System.out.print("Novo Modelo: ");
                        modelo = scanner.nextLine();
                        System.out.print("Novo Ano: ");
                        ano = scanner.nextInt();
                        System.out.print("Novo Preço por Dia: ");
                        precoPorDia = scanner.nextDouble();
                        carro.setModelo(modelo);
                        carro.setAno(ano);
                        carro.setPrecoPorDia(precoPorDia);
                        carroServico.atualizarCarro(carro);
                        System.out.println("Carro atualizado com sucesso!");
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Placa: ");
                    placa = scanner.nextLine();
                    carroServico.removerCarro(placa);
                    System.out.println("Carro removido com sucesso!");
                    break;
                case 6:
                    System.out.print("Modelo: ");
                    modelo = scanner.nextLine();
                    List<Carro> carrosPorModelo = carroServico.buscarCarroPorModelo(modelo);
                    carrosPorModelo.forEach(System.out::println);
                    break;
                case 7:
                    System.out.print("Ano: ");
                    ano = scanner.nextInt();
                    List<Carro> carrosPorAno = carroServico.buscarCarroPorAno(ano);
                    carrosPorAno.forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void gerenciarClientes(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n=== Gerenciar Clientes ===");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Buscar Cliente por CPF");
            System.out.println("3. Listar Todos os Clientes");
            System.out.println("4. Atualizar Cliente");
            System.out.println("5. Remover Cliente");
            System.out.println("6. Buscar Cliente por Nome");
            System.out.println("7. Buscar Cliente por Telefone");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    Cliente cliente = new Cliente(cpf, nome, endereco, telefone);
                    clienteServico.adicionarCliente(cliente);
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();
                    cliente = clienteServico.buscarClientePorCpf(cpf);
                    if (cliente != null) {
                        System.out.println(cliente);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 3:
                    List<Cliente> clientes = clienteServico.listarTodosClientes();
                    clientes.forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("CPF do Cliente a ser atualizado: ");
                    cpf = scanner.nextLine();
                    cliente = clienteServico.buscarClientePorCpf(cpf);
                    if (cliente != null) {
                        System.out.print("Novo Nome: ");
                        nome = scanner.nextLine();
                        System.out.print("Novo Endereço: ");
                        endereco = scanner.nextLine();
                        System.out.print("Novo Telefone: ");
                        telefone = scanner.nextLine();
                        cliente.setNome(nome);
                        cliente.setEndereco(endereco);
                        cliente.setTelefone(telefone);
                        clienteServico.atualizarCliente(cliente);
                        System.out.println("Cliente atualizado com sucesso!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();
                    clienteServico.removerCliente(cpf);
                    System.out.println("Cliente removido com sucesso!");
                    break;
                case 6:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    List<Cliente> clientesPorNome = clienteServico.buscarClientePorNome(nome);
                    clientesPorNome.forEach(System.out::println);
                    break;
                case 7:
                    System.out.print("Telefone: ");
                    telefone = scanner.nextLine();
                    List<Cliente> clientesPorTelefone = clienteServico.buscarClientePorTelefone(telefone);
                    clientesPorTelefone.forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void gerenciarAlugueis(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n=== Gerenciar Aluguéis ===");
            System.out.println("1. Adicionar Aluguel");
            System.out.println("2. Buscar Aluguel por ID");
            System.out.println("3. Listar Todos os Aluguéis");
            System.out.println("4. Atualizar Aluguel");
            System.out.println("5. Remover Aluguel");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("CPF do Cliente: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Placa do Carro: ");
                    String placa = scanner.nextLine();
                    System.out.print("Data de Início (AAAA-MM-DD): ");
                    LocalDate dataInicio = LocalDate.parse(scanner.nextLine());
                    System.out.print("Data de Fim (AAAA-MM-DD): ");
                    LocalDate dataFim = LocalDate.parse(scanner.nextLine());
                    Cliente cliente = clienteServico.buscarClientePorCpf(cpf);
                    Carro carro = carroServico.buscarCarroPorPlaca(placa);
                    if (cliente != null && carro != null) {
                        Aluguel aluguel = new Aluguel(cliente, carro, dataInicio, dataFim);
                        aluguelServico.adicionarAluguel(aluguel);
                        System.out.println("Aluguel adicionado com sucesso!");
                    } else {
                        System.out.println("Cliente ou Carro não encontrado.");
                    }
                    break;
                case 2:
                    System.out.print("ID do Aluguel: ");
                    int id = scanner.nextInt();
                    Aluguel aluguel = aluguelServico.buscarAluguelPorId(id);
                    if (aluguel != null) {
                        System.out.println(aluguel);
                    } else {
                        System.out.println("Aluguel não encontrado.");
                    }
                    break;
                case 3:
                    List<Aluguel> alugueis = aluguelServico.listarTodosAlugueis();
                    alugueis.forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("ID do Aluguel a ser atualizado: ");
                    id = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha
                    aluguel = aluguelServico.buscarAluguelPorId(id);
                    if (aluguel != null) {
                        System.out.print("Nova Data de Início (AAAA-MM-DD): ");
                        LocalDate novaDataInicio = LocalDate.parse(scanner.nextLine());
                        System.out.print("Nova Data de Fim (AAAA-MM-DD): ");
                        LocalDate novaDataFim = LocalDate.parse(scanner.nextLine());
                        aluguel.setDataInicio(novaDataInicio);
                        aluguel.setDataFim(novaDataFim);
                        aluguelServico.atualizarAluguel(aluguel);
                        System.out.println("Aluguel atualizado com sucesso!");
                    } else {
                        System.out.println("Aluguel não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("ID do Aluguel: ");
                    id = scanner.nextInt();
                    aluguelServico.removerAluguel(id);
                    System.out.println("Aluguel removido com sucesso!");
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void gerenciarFuncionarios(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n=== Gerenciar Funcionários ===");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Buscar Funcionário por Matrícula");
            System.out.println("3. Listar Todos os Funcionários");
            System.out.println("4. Atualizar Funcionário");
            System.out.println("5. Remover Funcionário");
            System.out.println("6. Buscar Funcionário por Nome");
            System.out.println("7. Buscar Funcionário por Salário Maior Que");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    Funcionario funcionario = new Funcionario(cpf, nome, telefone, matricula, cargo, salario);
                    funcionarioServico.adicionarFuncionario(funcionario);
                    System.out.println("Funcionário adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Matrícula: ");
                    matricula = scanner.nextLine();
                    funcionario = funcionarioServico.buscarFuncionarioPorMatricula(matricula);
                    if (funcionario != null) {
                        System.out.println(funcionario);
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;
                case 3:
                    List<Funcionario> funcionarios = funcionarioServico.listarTodosFuncionarios();
                    funcionarios.forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Matrícula do Funcionário a ser atualizado: ");
                    matricula = scanner.nextLine();
                    funcionario = funcionarioServico.buscarFuncionarioPorMatricula(matricula);
                    if (funcionario != null) {
                        System.out.print("Novo Nome: ");
                        nome = scanner.nextLine();
                        System.out.print("Novo Cargo: ");
                        cargo = scanner.nextLine();
                        System.out.print("Novo Salário: ");
                        salario = scanner.nextDouble();
                        funcionario.setNome(nome);
                        funcionario.setCargo(cargo);
                        funcionario.setSalario(salario);
                        funcionarioServico.atualizarFuncionario(funcionario);
                        System.out.println("Funcionário atualizado com sucesso!");
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Matrícula: ");
                    matricula = scanner.nextLine();
                    funcionarioServico.removerFuncionario(matricula);
                    System.out.println("Funcionário removido com sucesso!");
                    break;
                case 6:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    List<Funcionario> funcionariosPorNome = funcionarioServico.buscarFuncionarioPorNome(nome);
                    funcionariosPorNome.forEach(System.out::println);
                    break;
                case 7:
                    System.out.print("Salário: ");
                    salario = scanner.nextDouble();
                    List<Funcionario> funcionariosPorSalario = funcionarioServico.buscarFuncionarioPorSalarioMaiorQue(salario);
                    funcionariosPorSalario.forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void gerenciarCarrosLuxo(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n=== Gerenciar Carros de Luxo ===");
            System.out.println("1. Adicionar Carro de Luxo");
            System.out.println("2. Buscar Carro de Luxo por Placa");
            System.out.println("3. Listar Todos os Carros de Luxo");
            System.out.println("4. Atualizar Carro de Luxo");
            System.out.println("5. Remover Carro de Luxo");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.println("Nome: ");
                    String nomeCarro = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Preço por Dia: ");
                    double precoPorDia = scanner.nextDouble();
                    System.out.print("Taxa de Luxo: ");
                    double taxaDeLuxo = scanner.nextDouble();
                    CarroLuxo carroLuxo = new CarroLuxo(placa, modelo, nomeCarro, ano, precoPorDia, taxaDeLuxo);
                    carroLuxoServico.adicionarCarroLuxo(carroLuxo);
                    System.out.println("Carro de Luxo adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Placa: ");
                    placa = scanner.nextLine();
                    carroLuxo = carroLuxoServico.buscarCarroLuxoPorPlaca(placa);
                    if (carroLuxo != null) {
                        System.out.println(carroLuxo);
                    } else {
                        System.out.println("Carro de Luxo não encontrado.");
                    }
                    break;
                case 3:
                    List<CarroLuxo> carrosLuxo = carroLuxoServico.listarTodosCarrosLuxo();
                    carrosLuxo.forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Placa do Carro de Luxo a ser atualizado: ");
                    placa = scanner.nextLine();
                    carroLuxo = carroLuxoServico.buscarCarroLuxoPorPlaca(placa);
                    if (carroLuxo != null) {
                        System.out.print("Novo Modelo: ");
                        modelo = scanner.nextLine();
                        System.out.print("Novo Ano: ");
                        ano = scanner.nextInt();
                        System.out.print("Novo Preço por Dia: ");
                        precoPorDia = scanner.nextDouble();
                        System.out.print("Nova Taxa de Luxo: ");
                        taxaDeLuxo = scanner.nextDouble();
                        carroLuxo.setModelo(modelo);
                        carroLuxo.setAno(ano);
                        carroLuxo.setPrecoPorDia(precoPorDia);
                        carroLuxo.setTaxaDeLuxo(taxaDeLuxo);
                        carroLuxoServico.atualizarCarroLuxo(carroLuxo);
                        System.out.println("Carro de Luxo atualizado com sucesso!");
                    } else {
                        System.out.println("Carro de Luxo não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Placa: ");
                    placa = scanner.nextLine();
                    carroLuxoServico.removerCarroLuxo(placa);
                    System.out.println("Carro de Luxo removido com sucesso!");
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
