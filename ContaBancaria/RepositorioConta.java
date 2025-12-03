package ContaBancaria;

public class RepositorioConta {

    public void salvar(ContaBancaria conta) {
        System.out.println("Salvando conta no banco de dados... Saldo: " + conta.getSaldo());
    }
}

