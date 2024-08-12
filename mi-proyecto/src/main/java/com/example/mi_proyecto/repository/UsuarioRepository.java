package com.example.mi_proyecto.repository;
import com.example.mi_proyecto.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UsuarioRepository extends MongoRepository<Usuario, String>{
}
