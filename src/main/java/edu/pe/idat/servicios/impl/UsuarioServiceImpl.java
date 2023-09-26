package edu.pe.idat.servicios.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.entidades.Usuario;
import edu.pe.idat.entidades.UsuarioRol;
import edu.pe.idat.repositorio.RolRepository;
import edu.pe.idat.repositorio.UsuarioRepository;
import edu.pe.idat.servicios.UsuarioSerivice;

@Service
public class UsuarioServiceImpl implements UsuarioSerivice{
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RolRepository rolRepository;

	@Override
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
		Usuario usuarioLocal =usuarioRepository.findByUsername(usuario.getUsername());
		if(usuarioLocal !=null) {
			System.out.println("El usuario ya existe");
			throw new Exception("El usuario ya está presente");
		}
		else {
			for(UsuarioRol usuarioRol:usuarioRoles) {
				rolRepository.save(usuarioRol.getRol());
			}
			usuario.getUsuarioRoles().addAll(usuarioRoles);
			usuarioLocal=usuarioRepository.save(usuario);
			
		}
		return usuarioLocal;
	}

	@Override
	public Usuario obtenerUsuario(String username) {
		
		return usuarioRepository.findByUsername(username);
	}

	@Override
	public void eliminarUsuario(Long usuarioId) {
		usuarioRepository.deleteById(usuarioId);
		
	}

}
