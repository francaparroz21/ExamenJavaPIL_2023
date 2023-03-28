public class Main {
    public static void main(String[] args) {

        //Creamos el robot y seteamos su respectiva cabeza y su cuerpo domestico.
        Robot robot1 = new Robot();
        robot1.setHead(new Head("Rubio","Blanco","Marrones"));
        robot1.setBody(new DomesticBody());

        //Creamos robot con cuerpo aereo.
        Robot robot2 = new Robot();
        robot2.setHead(new Head("Castaño","Blanco","Verdes"));
        robot2.setBody(new AerialFightBody());

        //Creamos robot con cuerpo animal.
        Robot robot3 = new Robot();
        robot3.setHead(new Head("Blanco","Negro","Negros"));
        robot3.setBody(new AnimalBody());

    }
}
