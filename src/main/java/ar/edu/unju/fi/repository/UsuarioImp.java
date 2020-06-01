package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Salas3444Tp5Application;
import ar.edu.unju.fi.model.Usuario;
@Repository("usuarioIMP")
public class UsuarioImp implements IUsuario {
   
	@Autowired
	private Usuario usuario;
	
	private static Logger LOG = LoggerFactory.getLogger(Salas3444Tp5Application.class);

	
	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto usuario en la BD
		LOG.info("El usuario fue guardado "+ usuario.getApellido()+", "+usuario.getNombre());

	}

	@Override
	public Usuario mostrar() {
		// se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto usuario de la bd
        LOG.info("Se eliminó el usuario de la bd");
	}

	@Override
	public Usuario modificar() {
		// se modificara los datos del usuario
		return usuario; // segun lo que entendi del PDF
	}

}
