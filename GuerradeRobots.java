public class GuerradeRobots {
    public String nombre;
    public int danho;
    public String tipo;
    public int vida;
    public String robot;
    public String n1;
    public int ataques;
    public GuerradeRobots(String nombre,int danho,String tipo,int vida,int ataques){
        this.nombre = nombre;
        this.danho = danho;
        this.tipo = tipo;
        this.vida = vida;
        this.ataques = ataques;
    }
    public void presentacion(){
        System.out.println("Bienvenidos ");
        System.out.println("Como robot tenemos a " + this.nombre);
        System.out.println("Tiene de daño principal " + this.danho);
        System.out.println("Su tipo es .... :" + this.tipo);
        System.out.println("Su vida es :" + this.vida);
        System.out.println("Su vida es :" + this.ataques);
    }
    public void ataque(){
        ataques = this.vida - this.danho;
    }
    public static void main(String[]args){
        GuerradeRobots robot1 = new GuerradeRobots("Robot asesino mortal epico",18,"Fuego",200,200);
        GuerradeRobots robot2 = new GuerradeRobots("Kairos",25,"Agua",125,200);
        GuerradeRobots robot3 = new GuerradeRobots("Kreitos",25,"Agua",125,200);
        robot1.ataque();
        robot1.presentacion();
        robot2.presentacion();
        robot3.presentacion();
    }
}
