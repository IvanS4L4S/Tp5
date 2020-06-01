  package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Salas3444Tp5Application;
import ar.edu.unju.fi.model.Estadio;
@Repository("EstadioImp")
public class EstadioImp implements IEstadio {
 
	@Autowired
	private Estadio estadio;
	
	private static Logger LOG = LoggerFactory.getLogger(Salas3444Tp5Application.class);
	
	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto estadio en la BD
		LOG.info("El estadio fue guardado "+ estadio.getNombre()+", "+estadio.getCiudad());

	}

	@Override
	public Estadio mostrar() {
		// se recuperan todos los datos del estadio
		LOG.info("Mostrar datos del Estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto estadio de la bd
        LOG.info("Se eliminó el estadio de la bd");
	}

	@Override
	public Estadio modificar() {
		// se modificara los datos del estadio
		return estadio;
	}

}
