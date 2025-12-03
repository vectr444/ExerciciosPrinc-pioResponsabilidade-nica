package BackupAutomatizado;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompactadorArquivos {

    public void compactarPastaParaZip(String pastaOrigem, String destinoZip) throws IOException {
        Path origem = Path.of(pastaOrigem);

        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(destinoZip))) {
            Files.walk(origem)
                 .filter(path -> !Files.isDirectory(path))
                 .forEach(path -> {
                     String entryName = origem.relativize(path).toString();
                     try {
                         zipOut.putNextEntry(new ZipEntry(entryName));
                         Files.copy(path, zipOut);
                         zipOut.closeEntry();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 });
        }
    }
}

