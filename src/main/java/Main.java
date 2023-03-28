public class Main {
    public static void main(String[] args) {

        //Creamos el robot y seteamos su respectiva cabeza y su cuerpo domestico.
        Robot robot = new Robot();
        robot.setCabeza(new Cabeza("Rubio","Blanco","Marron"));
        robot.setCuerpo(new CuerpoAcuatico());

        //Hacemos que se mueva el robot.
        robot.getCuerpo().moverse();

        //Cambiamos cuerpo del robot por el de combate acuatico.
        robot.setCuerpo(new CuerpoAcuatico());

        //Vemos que tambien se puede mover
        robot.getCuerpo().moverse();

        robot.setCuerpo(new CuerpoAcuatico());
        robot.cuerpo.

    }
}
