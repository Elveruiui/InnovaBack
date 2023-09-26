package edu.pe.idat.servicios;

import java.util.Set;

import edu.pe.idat.entidades.Usuario;
import edu.pe.idat.entidades.UsuarioRol;

public interface UsuarioSerivice {
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
	
	public Usuario obtenerUsuario(String username);
	
	public void eliminarUsuario(Long usuarioId);
}
