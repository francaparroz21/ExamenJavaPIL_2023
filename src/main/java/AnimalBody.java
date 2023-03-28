public class AnimalBody extends Body implements BodyInterface.Animal{

    @Override
     public void eat() {
        System.out.println("mmmmm estoy comiendo");
    }

    @Override
     public void sleep() {
        System.out.println("zZzZZzZZZZzzz");
    }
}
