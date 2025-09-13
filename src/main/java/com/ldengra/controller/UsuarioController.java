package com.ldengra.controller;

import com.ldengra.dto.UsuarioDto;
import com.ldengra.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/getusers")
    public List<UsuarioDto> getUsers() {

        return usuarioService.getUsers();
    }

    @PostMapping("/createuser")
    public UsuarioDto createUser(@RequestBody UsuarioDto usuarioDto) {

        return usuarioService.createUser(usuarioDto);

    }

    @PutMapping("/updateuser")
    public UsuarioDto updateUser(@RequestBody UsuarioDto usuarioDto) {

        return usuarioService.updateUser(usuarioDto);

    }

    @DeleteMapping("/delete")
    public UsuarioDto delete(@RequestBody UsuarioDto usuarioDto) {

        return null;
    }


}
