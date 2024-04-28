
package crud.sos;


public class atleta {
    
    private int edad;
    private String nombre;
    private String apellidos;
    private String deporte;
    private int fecha;
    
    public atleta (){}
    
    public atleta(int edad,String nombre,String apellidos, String deporte,int fecha){
    this.edad = edad; 
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.deporte = deporte;
    this.fecha = fecha;
}

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the deporte
     */
    public String getDeporte() {
        return deporte;
    }

    /**
     * @param deporte the deporte to set
     */
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
}
