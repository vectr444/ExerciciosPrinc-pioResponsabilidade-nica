package RelogioDigital;
import java.time.LocalTime;

public class RelogioService {

    private final RelogioDigital relogioDigital;
    private final HoraFileRepository horaFileRepository;
    private final Alarme alarme;

    public RelogioService(RelogioDigital relogioDigital,
                          HoraFileRepository horaFileRepository,
                          Alarme alarme) {
        this.relogioDigital = relogioDigital;
        this.horaFileRepository = horaFileRepository;
        this.alarme = alarme;
    }

    public void mostrarHoraAtual() {
        relogioDigital.mostrarHora();
    }

    public void salvarHoraAtual() {
        LocalTime horaAtual = relogioDigital.getHoraAtual();
        horaFileRepository.salvarHora(horaAtual);
    }

    public void dispararAlarme() {
        alarme.tocar();
    }
}
