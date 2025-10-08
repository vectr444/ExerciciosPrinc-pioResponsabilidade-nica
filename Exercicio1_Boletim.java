public class Boletim {
    private String nomeAluno;
    private java.util.List<Double> notas = new java.util.ArrayList<>();

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public String gerarSituacao() {
        double media = calcularMedia();
        return media >= 7 ? "Aprovado" : "Reprovado";
    }

    public void salvarEmArquivo() throws java.io.IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(nomeAluno + "_boletim.txt")) {
            writer.write("Aluno: " + nomeAluno + "\nMédia: " + calcularMedia() + "\n");
        }
    }

    public void enviarEmail(String email) {
        System.out.println("Enviando boletim para " + email);
    }
}
