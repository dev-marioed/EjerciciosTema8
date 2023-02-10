import java.math.BigInteger;

public class Persona {

    private int edad;
    private String nombre;

    private String celular="246-209-94-28";

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }

    public static void main(String[] comandos){

        Persona mario=new Persona();

        mario.setEdad(28);
        mario.setNombre("Mario el Capo");
        mario.setCelular("2462099428");

        System.out.println(mario);

    }
}

