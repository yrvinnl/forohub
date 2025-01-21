package com.forohub.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DatosRespuestaUsuario(
        Long id,
        String nombre,
        String email,
        String perfil
) {
}
