import java.time.Duration;
import java.time.LocalTime;

public class Expediente {

    private static final Duration CARGA_HORARIA = Duration.ofHours(8);

    public static void main(String[] args) {
        var horarioEntrada = LocalTime.of(8, 55);
        var horarioPausa = LocalTime.of(12, 29);
        var horarioVoltaPausa = LocalTime.of(13, 51);

        var duracaoPausa = Duration.between(horarioPausa, horarioVoltaPausa);

        System.out.println("Horário de saída: " + horarioEntrada.plus(CARGA_HORARIA.plus(duracaoPausa)));
    }
}
