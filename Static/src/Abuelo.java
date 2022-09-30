public class Abuelo {
    String nombre;
    String primerAoellido;
    String segundoApellido;

    public Abuelo(String nombre, String primerAoellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerAoellido = primerAoellido;
        this.segundoApellido = segundoApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerAoellido() {
        return primerAoellido;
    }

    public void setPrimerAoellido(String primerAoellido) {
        this.primerAoellido = primerAoellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }


}
