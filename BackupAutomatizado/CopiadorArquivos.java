package BackupAutomatizado;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopiadorArquivos {

    public void copiar(String origem, String destino) throws IOException {
        Path source = Path.of(origem);
        Path target = Path.of(destino);

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
