package mx.edu.utng.asociacionesEjemplo;

import java.util.ArrayList;
import java.util.List;

import mx.edu.utng.asociacionesEjemplo.Dedicatoria;
import mx.edu.utng.asociacionesEjemplo.Destinatario;
import mx.edu.utng.asociacionesEjemplo.Fondo;
import mx.edu.utng.asociacionesEjemplo.Imagen;
import mx.edu.utng.asociacionesEjemplo.Remitente;
/**
 * 
 * @author Juana Cristina Rodríguez Vázquez
 *
 */
public class TarjetaAnimada extends Tarjeta {

	private List<Imagen> imagens;
	private List<Fondo> fondos;
	private List<Dedicatoria> dedicatorias;
	private String codigo;

	public TarjetaAnimada(List<Remitente> remitentes, List<Destinatario> destinatarios, List<Imagen> imagens,
			List<Fondo> fondos) {

		super(remitentes, destinatarios);
		this.dedicatorias = new ArrayList<Dedicatoria>();
		this.imagens = imagens;
		this.fondos = fondos;
		// TODO Auto-generated constructor stub
	}
	
}
