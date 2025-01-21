package com.forohub.domain.topico;

import com.forohub.domain.curso.DatosRespuestaCurso;
import com.forohub.domain.respuesta.DatosRegistroRespuesta;
import com.forohub.domain.usuario.DatosRespuestaUsuario;

import java.time.LocalDateTime;
import java.util.List;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        DatosRespuestaCurso curso,
        Estado status,
        LocalDateTime fecha,
        DatosRespuestaUsuario autor,
        String mensaje,
        List<DatosRegistroRespuesta> respuestas

) {
}
