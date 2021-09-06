package fes.aragon.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bean implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private String saludo = "Holaaa";
	private String operacion = "";

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getOperacion() {
		for(int i = 0; i <= 10; i++) {
			operacion+= 4*i + "\n";
		}
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
	
}
