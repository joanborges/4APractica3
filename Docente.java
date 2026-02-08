// Docente.java

public class Docente {
    private String registro; // Teacher registration number
    private String nombre;   // Teacher's name
    private String apellido; // Teacher's last name
    private String email;    // Teacher's email

    // Constructor
    public Docente(String registro, String nombre, String apellido, String email) {
        this.registro = registro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    // Getters
    public String getRegistro() {
        return registro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}