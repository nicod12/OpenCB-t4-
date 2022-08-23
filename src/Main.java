public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Alfredo");
        System.out.println(cliente.getNombre());
        cliente.setEdad(44);
        System.out.println(cliente.getEdad());
        cliente.setTelefono(123123123);
        System.out.println(cliente.getTelefono());
        cliente.setCredito(0);
        System.out.println(cliente.isCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Oscar");
        System.out.println(trabajador.getNombre());
        trabajador.setEdad(33);
        System.out.println(trabajador.getEdad());
        trabajador.setTelefono(123345667);
        System.out.println(trabajador.getTelefono());
        trabajador.setSalario(true);
        System.out.println(trabajador.getSalario());
    }
    
}

 class Persona {

    int edad;
    String nombre;
    int telefono;

    public Persona(){

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

}

class Cliente extends Persona {

    int credito;

    public Cliente(){}

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int isCredito() {
        return credito;
    }
}

class Trabajador extends Persona {

    boolean salario;

    public Trabajador(){}


    public void setSalario(boolean salario) {
        this.salario = salario;
    }

    public boolean getSalario() {
        return salario;
    }


}