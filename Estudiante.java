public class Estudiante {
    public String nombre;
    public int edad;
    public Estudiante(String _nombre, int _edad) {
        nombre = _nombre;
        edad = _edad;
    }
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Juan",15);
        Estudiante estudiante2 = new Estudiante("Reyes", 23);
    }
}

