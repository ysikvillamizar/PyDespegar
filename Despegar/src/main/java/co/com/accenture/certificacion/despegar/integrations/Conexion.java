package co.com.accenture.certificacion.despegar.integrations;
import java.sql.*;
import java.util.ArrayList;

public class Conexion {
	
	
	
	    private String driver ="com.mysql.jdbc.Driver";
	    private String stringConnection="jdbc:mysql://localhost/datos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    private String usuername="root";
	    private String password = "";
	    public Connection con;
	    ArrayList<String> listaUsuario = new ArrayList<String>();

	    public Conexion() {
	        try {
	            con = DriverManager.getConnection(stringConnection,usuername,password);
	       }
	        catch (SQLException e){
	            System.out.println(e);
	        }
	    }
	    public Connection getConnection(){
	        return con;
	    }
	    public ArrayList getDatos() {
	        try {

	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery("SELECT * FROM misdatos");
	            while (rs.next()){
	                this.listaUsuario.add(rs.getString("NOMBRE"));
	                this.listaUsuario.add(rs.getString("APELLIDO"));
	                this.listaUsuario.add(rs.getString("cedula"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return listaUsuario;
	    }

	    


}
