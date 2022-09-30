public class Yo extends Padre{
    int celular;

    public Yo(String nombre, String primerAoellido, String segundoApellido, String CI, int celular) {
        super(nombre, primerAoellido, segundoApellido, CI);
        this.celular = celular;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }


}
