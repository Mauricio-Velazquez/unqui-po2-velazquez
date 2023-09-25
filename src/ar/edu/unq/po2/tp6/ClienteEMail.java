package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class ClienteEMail {
	
	private ServidorPop servidor;
	private String nombreUsuario;
	private String passUsuario;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor = servidor;
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = pass;
		inbox = new ArrayList<Correo>();
		borrados = new ArrayList<Correo>();
		this.servidor.conectar(this.nombreUsuario, passUsuario);
	}
		
	public void borrarCorreo(Correo correo){
		inbox.remove(correo);
		borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return borrados.size();
	}
	
	public int contarInbox(){
		return inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		servidor.recibirNuevos(nombreUsuario, passUsuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = Correo.crearCorreo(asunto, destinatario, cuerpo);
		servidor.enviar(correo);
	}

}
