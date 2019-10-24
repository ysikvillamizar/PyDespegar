package co.com.accenture.certificacion.despegar.models;

import co.com.accenture.certificacion.despegar.integrations.Conexion;

public class FillData {



	
	    private String nombre;
	    private String apellido;
	    private String cedula;

	   /* public LoginModel(String username, String password){
	        this.username = username;
	        this.password = password;
	    }*/

	    public FillData(){
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}
	    
	    
	 
	

	
	
}
