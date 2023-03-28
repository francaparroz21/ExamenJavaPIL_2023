public class AerialFightBody extends FightBody implements BodyInterface.Combat {
    @Override
    public void fight() {
        super.fight();
        System.out.println("¡EN EL AIRE!");
    }

    @Override
    public void retirarse() {
        super.retirarse();
        System.out.println("Volando...");
    }
}
