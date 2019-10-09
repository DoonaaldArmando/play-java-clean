package dominio.casosDeUso.compañia;

import dominio.modelo.accion.compañia.Listar;
import dominio.modelo.clases.Compañia;
import lombok.AllArgsConstructor;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.CompletionStage;

@AllArgsConstructor
public class ListarCompañia {

    private final Listar listar;


    public CompletionStage<Compañia> listarIdentificacion(BigInteger identificacion) {
        return this.listar.listarIdentificacion(identificacion);
    }

    public CompletionStage<List<Compañia>> listarTodos() {
        return this.listar.listarTodos();
    }

    private Boolean validacionSumaMayorDiezMil(BigInteger numero) {
        return Boolean.TRUE;
    }


}
