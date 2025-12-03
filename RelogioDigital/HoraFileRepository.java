package RelogioDigital;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class HoraFileRepository {

    private final String nomeArquivo;

    public HoraFileRepository(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void salvarHora(LocalTime hora) {
        try (FileWriter f = new FileWriter(nomeArquivo)) {
            f.write(hora.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
