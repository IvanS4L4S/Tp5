package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Salas3444Tp5Application;
import ar.edu.unju.fi.model.Cuota;//preguntar

@Repository("CuotaIPM")
public class CuotaImp implements ICuota {

	@Autowired
	private Cuota cuota;
	
	private static Logger LOG = LoggerFactory.getLogger(Salas3444Tp5Application.class);
	
	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto usuario en la BD
		LOG.info("La cuota del usuario con su estado  fue guardado " + cuota.getUsuario()+", "+cuota.getEstado());

	}

	@Override
	public Cuota mostrar() {
		// se recuperan todos los datos de la cuota
			LOG.info("Mostrar los datos del usuario");
	       return cuota;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto cuota de la bd
        LOG.info("Se eliminó la cuota de la bd");
	}

	@Override
	public Cuota modificar() {
		// se modificara los datos de cuota
		return cuota; // segun lo que entendi del PDF
	}

}
