package edu.pe.idat.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pe.idat.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
