package BackupAutomatizado;

import java.time.LocalDateTime;

public class GerenciadorLog {

    public void registrar(String mensagem) {
        // Simples exemplo: log no console
        System.out.println(LocalDateTime.now() + " - " + mensagem);
    }
}
