package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Salas3444Tp5Application;

import ar.edu.unju.fi.model.Equipo;
@Repository
public class EquipoImp implements IEquipo {

	
	 
	@Autowired
	private Equipo equipo;
	
	private static Logger LOG = LoggerFactory.getLogger(Salas3444Tp5Application.class);
	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto usuario en la BD
	LOG.info("El equipo fue guardado, jugado en el estadio "+ equipo.getNombre()+", "+equipo.getEstadio());

	}

	@Override
	public Equipo mostrar() {
		// se recuperan todos los datos del equipo
		LOG.info("Mostrar datos del equipo");
	   return equipo;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto equipo de la bd
        LOG.info("Se eliminó el equipo de la bd");
	}

	@Override
	public Equipo modificar() {
		// se modificara los datos del equipo
		return equipo;
	}

}
