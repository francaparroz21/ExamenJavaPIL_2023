public class FightBody extends Body implements BodyInterface.Combat {

    @Override
    public void fight() {
        System.out.println("¡ESTOY COMBATIENDO!");
    }

    @Override
    public void retirarse() {
        System.out.println("Me retiro...");
    }
}

