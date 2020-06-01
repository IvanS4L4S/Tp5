package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;//cuota
import ar.edu.unju.fi.model.Equipo;//equipo
import ar.edu.unju.fi.model.Estadio;//estadio
import ar.edu.unju.fi.model.Noticia;//noticias
import ar.edu.unju.fi.model.Resultado;//resultado
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;//cuota
import ar.edu.unju.fi.service.IEquipoService;//equipo
import ar.edu.unju.fi.service.IEstadioService;//estadio
import ar.edu.unju.fi.service.INoticiaService;//noticias
import ar.edu.unju.fi.service.IResultadoService;//resultado
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Salas3444Tp5Application implements CommandLineRunner {
   //--usuario
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
	//--noticias
	@Autowired
	INoticiaService noticiaService;
	@Autowired
	Noticia noticia;
	
	
	//--Equipo
	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo  equipo;
	
	//--Cuota
	@Autowired
	ICuotaService cuotaservice;
	@Autowired
	Cuota cuota;
	
	//--Resultado
	@Autowired
	IResultadoService resultadoService;
	@Autowired
	Resultado resultado;
	
	//--estadio
	@Autowired
	IEstadioService estadioService;
	@Autowired
	Estadio estadio;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Salas3444Tp5Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// inicializado las variables de mi objeto usuario
		usuario.setApellido("Perez");
		usuario.setDireccion("Av Mitre 256");
		usuario.setDni(30215478);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1980, 11, 12));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
		
		// inicializado las variables de mi objeto noticia
		noticia.setFecha(LocalDate.now());
		noticia.setTitulo("Dia nublado");
		noticia.setResumen("El dia de hoy se presento un tiempo inestable");
		
		noticiaService.guardar();
		
		//inicializado las variables de mi objeto estadio
		estadio.setNombre("Marakana");
		estadio.setCapacidad(12013);
		estadio.setDireccion("AV favela n1");
		estadio.setFechaFuncion(LocalDate.of(2025, 06, 12));
		estadio.setCiudad("Rio");
		
		estadioService.guardar();
		
		
		// ******* las variables de mi objeto equipo ********
		
		//equipo.getEstadio(); //------------>°-°
		equipo.setNombre("PIKs");
		
		equipoService.guardar();
		
		//**** inicializado las variables de mi objeto resultado***
		//resultado.getEquipo1();
		//resultado.getEquipo2();
		resultado.setFecha(LocalDate.of(2023, 01, 14));
		resultado.setGolesEquipo1(3);
		resultado.setGolesEquipo2(1);
		
		resultadoService.guardar();
		
		
		//******* inicializado las variables de mi objeto cuota********
		cuota.setEstado("dddd");
		cuota.setFechaPago(LocalDate.of(2021, 03, 12));
		cuota.setId(342);
		cuota.setMonto(23000);
		cuota.setPeriodo("12 meses");
		//cuota.setUsuario();
		
		cuotaservice.guardar();
		
		
	}

}
