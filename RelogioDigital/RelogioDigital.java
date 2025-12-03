package RelogioDigital;
import java.time.LocalTime;

public class RelogioDigital {

    public LocalTime getHoraAtual() {
        return LocalTime.now();
    }

    public void mostrarHora() {
        System.out.println(getHoraAtual());
    }
}
