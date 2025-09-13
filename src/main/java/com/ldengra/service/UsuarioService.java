package com.ldengra.service;

import com.ldengra.dto.UsuarioDto;
import com.ldengra.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDto> getUsers() {

        return usuarioRepository.findAll();
    }

    public UsuarioDto createUser(UsuarioDto usuarioDto) {

        return usuarioRepository.save(usuarioDto);
    }

    public UsuarioDto updateUser(UsuarioDto usuarioDto) {

        usuarioDto.setNombre("Miriom");

        return usuarioDto;

    }
}
