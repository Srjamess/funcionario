package org.example.domain;

public class FuncionarioDomain {
    private int Id;
    private String Tipoid;
    private String Numerodocumento;
    private String Nombres;
    private String Apellidos;
    private String Estadocivil;
    private String Sexo;
    private String Direccion;
    private String Telefono;
    private String Fechanacimiento;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTipoid() {
        return Tipoid;
    }

    public void setTipoid(String tipoid) {
        Tipoid = tipoid;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getNumerodocumento() {
        return Numerodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        Numerodocumento = numerodocumento;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getEstadocivil() {
        return Estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        Estadocivil = estadocivil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getFechanacimiento() {
        return Fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        Fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return this.Nombres + " " + this.Apellidos;
    }
}
