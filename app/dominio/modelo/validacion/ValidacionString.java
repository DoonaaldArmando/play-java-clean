package dominio.modelo.validacion;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidacionString {

    public static Boolean estaVacioONulo(String string) {

        if (string.isEmpty()) {
            return Boolean.TRUE;
        }

        if (Objects.isNull(string)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
