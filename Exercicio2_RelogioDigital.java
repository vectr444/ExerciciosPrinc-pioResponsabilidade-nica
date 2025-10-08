public class RelogioDigital {
    public void mostrarHora() {
        System.out.println(java.time.LocalTime.now());
    }

    public void salvarHoraEmArquivo() {
        try (java.io.FileWriter f = new java.io.FileWriter("hora.txt")) {
            f.write(java.time.LocalTime.now().toString());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public void tocarAlarme() {
        System.out.println("BEEP! Alarme tocando!");
    }
}
