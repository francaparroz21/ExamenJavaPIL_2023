public class CuerpoCombate extends Cuerpo implements CuerpoInterface.Combate{

    @Override
    public void combatir() {
        System.out.println("¡ESTOY COMBATIENDO!");
    }

    @Override
    public void retirarse() {
        System.out.println("Me retiro...");
    }
}
