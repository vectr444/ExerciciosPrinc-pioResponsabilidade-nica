package Boletim;
import java.io.FileWriter;
import java.io.IOException;

public class BoletimFileRepository {

    public void salvarEmArquivo(Boletim boletim) throws IOException {
        String nomeArquivo = boletim.getNomeAluno() + "_boletim.txt";

        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("Aluno: " + boletim.getNomeAluno() + "\n");
            writer.write("Média: " + boletim.calcularMedia() + "\n");
            writer.write("Situação: " + boletim.gerarSituacao() + "\n");
        }
    }
}