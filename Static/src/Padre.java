public class Padre extends Abuelo  {
    String CI;

    public Padre(String nombre, String primerAoellido, String segundoApellido, String CI) {
        super(nombre, primerAoellido, segundoApellido);
        this.CI = CI;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }


}
