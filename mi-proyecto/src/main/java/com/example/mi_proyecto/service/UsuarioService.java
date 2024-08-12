package com.example.mi_proyecto.service;

import com.example.mi_proyecto.model.Usuario;
import com.example.mi_proyecto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario obtenerPorId(String id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        usuarioRepository.deleteById(id);
    }
}
