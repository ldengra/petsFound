package com.ldengra.repository;

import com.ldengra.dto.UsuarioDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioDto, Long> {
}
