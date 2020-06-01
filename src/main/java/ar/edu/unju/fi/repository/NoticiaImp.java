package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Salas3444Tp5Application;
import ar.edu.unju.fi.model.Noticia;
@Repository("NoticiasImp")
public class NoticiaImp implements INoticia {

	
	@Autowired
	private Noticia noticia;
	private static Logger LOG = LoggerFactory.getLogger(Salas3444Tp5Application.class);
	
	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto usuario en la BD
		LOG.info("La noticia fue guardada "+ noticia.getTitulo()+", "+noticia.getFecha());

	}

	@Override
	public Noticia mostrar() {
		// se recuperan todos los datos de la noticia
		LOG.info("Mostrar datos de la noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto noticia de la bd
        LOG.info("Se eliminó la noticia de la bd");
	}

	@Override
	public Noticia modificar() {
		// se modificara los datos de la noticia
		return noticia;
	}

}
