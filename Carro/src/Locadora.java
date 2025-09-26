import java.util.ArrayList;

public class Locadora {
    private ArrayList<Carro> carros;
    private ArrayList<Cliente> clientes;

    public Locadora() {
        carros = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void cadastrarCarro(Carro c) {
        carros.add(c);
        System.out.println("Carro cadastrado com sucesso!");
    }

    public void cadastrarCliente(Cliente c) {
        clientes.add(c);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void alugarCarro(String modelo) {
        for (Carro c : carros) {
            if (c.getModelo().equalsIgnoreCase(modelo)) {
                if (c.isDisponivel()) {
                    c.setDisponivel(false);
                    System.out.println("Carro alugado com sucesso!");
                    return;
                } else {
                    System.out.println("Carro já está alugado!");
                    return;
                }
            }
        }
        System.out.println("Carro não encontrado!");
    }

    public void devolverCarro(String modelo) {
        for (Carro c : carros) {
            if (c.getModelo().equalsIgnoreCase(modelo)) {
                if (!c.isDisponivel()) {
                    c.setDisponivel(true);
                    System.out.println("Carro devolvido com sucesso!");
                    return;
                } else {
                    System.out.println("Esse carro já estava disponível!");
                    return;
                }
            }
        }
        System.out.println("Carro não encontrado!");
    }

    public void listarCarrosDisponiveis() {
        System.out.println("=== Carros Disponíveis ===");
        for (Carro c : carros) {
            if (c.isDisponivel()) {
                System.out.println(c);
            }
        }
    }
}
