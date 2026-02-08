package modelo;

public class Docente {
    private String numEmpleado;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String genero;
    private String area;
    private String calle;
    private String numero;
    private String colonia;
    private String municipio;
    private String estado;
    private String pais;
    private String codPostal;
    private String correo;
    private String gradoAcademico;
    private String licenciatura;
    private String maestria;
    private String doctorado;
    private String areaAdmin;
    private String dominioIngles;
    private String[] horarioEntrada;
    private String[] horarioSalida;
    private String rutaFoto;

    public Docente() {
        this.horarioEntrada = new String[6];
        this.horarioSalida = new String[6];
    }

    // Constructor con parámetros
    public Docente(String numEmpleado, String nombre, String apPaterno, String apMaterno) {
        this();
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    // Getters y Setters
    public String getNumEmpleado() { return numEmpleado; }
    public void setNumEmpleado(String numEmpleado) { this.numEmpleado = numEmpleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApPaterno() { return apPaterno; }
    public void setApPaterno(String apPaterno) { this.apPaterno = apPaterno; }

    public String getApMaterno() { return apMaterno; }
    public void setApMaterno(String apMaterno) { this.apMaterno = apMaterno; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getColonia() { return colonia; }
    public void setColonia(String colonia) { this.colonia = colonia; }

    public String getMunicipio() { return municipio; }
    public void setMunicipio(String municipio) { this.municipio = municipio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getCodPostal() { return codPostal; }
    public void setCodPostal(String codPostal) { this.codPostal = codPostal; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getGradoAcademico() { return gradoAcademico; }
    public void setGradoAcademico(String gradoAcademico) { this.gradoAcademico = gradoAcademico; }

    public String getLicenciatura() { return licenciatura; }
    public void setLicenciatura(String licenciatura) { this.licenciatura = licenciatura; }

    public String getMaestria() { return maestria; }
    public void setMaestria(String maestria) { this.maestria = maestria; }

    public String getDoctorado() { return doctorado; }
    public void setDoctorado(String doctorado) { this.doctorado = doctorado; }

    public String getAreaAdmin() { return areaAdmin; }
    public void setAreaAdmin(String areaAdmin) { this.areaAdmin = areaAdmin; }

    public String getDominioIngles() { return dominioIngles; }
    public void setDominioIngles(String dominioIngles) { this.dominioIngles = dominioIngles; }

    public String[] getHorarioEntrada() { return horarioEntrada; }
    public void setHorarioEntrada(String[] horarioEntrada) { this.horarioEntrada = horarioEntrada; }

    public String[] getHorarioSalida() { return horarioSalida; }
    public void setHorarioSalida(String[] horarioSalida) { this.horarioSalida = horarioSalida; }

    public String getRutaFoto() { return rutaFoto; }
    public void setRutaFoto(String rutaFoto) { this.rutaFoto = rutaFoto; }

    @Override
    public String toString() {
        return apPaterno + " " + apMaterno + ", " + nombre;
    }
}