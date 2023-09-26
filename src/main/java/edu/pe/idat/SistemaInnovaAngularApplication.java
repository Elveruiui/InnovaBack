package edu.pe.idat;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.pe.idat.entidades.Rol;
import edu.pe.idat.entidades.Usuario;
import edu.pe.idat.entidades.UsuarioRol;
import edu.pe.idat.servicios.UsuarioSerivice;

@SpringBootApplication
public class SistemaInnovaAngularApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioSerivice usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaInnovaAngularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Usuario usuario=new Usuario();
		
		usuario.setNombre("Elver Yupanqui");
		usuario.setTipocliente("Natural-DNI");
		usuario.setDocumento("74743166");
		usuario.setEmail("elvercito123@gmail.com");
		usuario.setUsername("elvercito");
		usuario.setPassword("123456");
		usuario.setTelefono("987654321");
		usuario.setPerfil("foto.png");
		
		Rol rol=new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");
		
		Set<UsuarioRol> usuarioRoles =new HashSet<>();
		UsuarioRol usuarioRol =new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);
		
		Usuario usuarioGuardado =usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());*/
		
		
	}
	
	

}
