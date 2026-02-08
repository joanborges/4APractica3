public class Estudiante {
    private String nombre;
    private String apellido;
    private String matricula;
    private String fechaNacimiento;
    
    // Constructor
    public Estudiante(String nombre, String apellido, String matricula, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Getters and Setters
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
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}