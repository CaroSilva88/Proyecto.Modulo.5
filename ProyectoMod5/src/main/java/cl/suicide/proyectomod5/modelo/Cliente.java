package cl.suicide.proyectomod5.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	private int rutcliente;
	private String clinombre;
	private String cliapellido;
	private String clitelefono;
	private String afp;
	private int clisistemasalud;
	private String clidireccion;
	private String clicomuna;
	private int cliedad;
	private int run_cliente;
	
	
	/*****************************
	 * CONSTRUCTOR SIN PARAMETROS
	 *****************************/
	
	public Cliente() {
		super();
	}
	/********************************
	 * CONSTRUCTOR CON PARAMETROS
	 ********************************/
	
	public Cliente(int rutcliente, String clinombre, String cliapellido, String clitelefono, String afp,
			int clisistemasalud, String clidireccion, String clicomuna, int cliedad, int run_cliente) {
		super();
		this.rutcliente = rutcliente;
		this.clinombre = clinombre;
		this.cliapellido = cliapellido;
		this.clitelefono = clitelefono;
		this.afp = afp;
		this.clisistemasalud = clisistemasalud;
		this.clidireccion = clidireccion;
		this.clicomuna = clicomuna;
		this.cliedad = cliedad;
		this.run_cliente = run_cliente;
	}
	/**************************
	 * GETTERS Y SETTERS
	 **************************/
	public int getRutcliente() {
		return rutcliente;
	}
	public void setRutcliente(int rutcliente) {
		this.rutcliente = rutcliente;
	}
	public String getClinombre() {
		return clinombre;
	}
	public void setClinombre(String clinombre) {
		this.clinombre = clinombre;
	}
	public String getCliapellido() {
		return cliapellido;
	}
	public void setCliapellido(String cliapellido) {
		this.cliapellido = cliapellido;
	}
	public String getClitelefono() {
		return clitelefono;
	}
	public void setClitelefono(String clitelefono) {
		this.clitelefono = clitelefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public int getClisistemasalud() {
		return clisistemasalud;
	}
	public void setClisistemasalud(int clisistemasalud) {
		this.clisistemasalud = clisistemasalud;
	}
	public String getClidireccion() {
		return clidireccion;
	}
	public void setClidireccion(String clidireccion) {
		this.clidireccion = clidireccion;
	}
	public String getClicomuna() {
		return clicomuna;
	}
	public void setClicomuna(String clicomuna) {
		this.clicomuna = clicomuna;
	}
	public int getCliedad() {
		return cliedad;
	}
	public void setCliedad(int cliedad) {
		this.cliedad = cliedad;
	}
	public int getRun_cliente() {
		return run_cliente;
	}
	public void setRun_cliente(int run_cliente) {
		this.run_cliente = run_cliente;
	}
	
	
}
