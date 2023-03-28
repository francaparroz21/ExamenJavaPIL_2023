public class CuerpoAcuatico extends CuerpoCombate implements CuerpoInterface.Combate{

    @Override
    public void retirarse() {
        super.retirarse();
        System.out.println("En el agua...");
    }

    @Override
    public void combatir() {
        super.combatir();
        System.out.println("¡COMBATIENDO EN EL AGUA!");
    }
}
