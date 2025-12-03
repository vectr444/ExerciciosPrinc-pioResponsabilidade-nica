package Boletim;
import java.util.ArrayList;
import java.util.List;

public class Boletim {
    private String nomeAluno;
    private List<Double> notas = new ArrayList<>();

    public Boletim(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        return notas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

    public String gerarSituacao() {
        double media = calcularMedia();
        return media >= 7 ? "Aprovado" : "Reprovado";
    }
}
