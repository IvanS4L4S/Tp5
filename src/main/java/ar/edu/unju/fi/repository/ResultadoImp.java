package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Salas3444Tp5Application;
import ar.edu.unju.fi.model.Resultado;
@Repository("ResultadoImp")
public class ResultadoImp implements IResultado {

	@Autowired
	private Resultado resultado;
	private static Logger LOG = LoggerFactory.getLogger(Salas3444Tp5Application.class);
	
	@Override
	public void guardar() {
	// Acción ejecutada para guardar un objeto usuario en la BD
	LOG.info("Los Resultados fueron guardados "+resultado.getEquipo1()+", "+resultado.getEquipo2());	
	}

	@Override
	public Resultado mostrar() {
		// se recuperan todos los datos de la noticia
		LOG.info("Mostrar datos de los Resultados");
		return resultado;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto resultado de la bd
        LOG.info("Se eliminó el resultado de la bd");
	}

	@Override
	public Resultado modificar() {
		// se modificara los datos del resultado
		return resultado;
	}

}
