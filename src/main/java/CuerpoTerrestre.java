public class CuerpoTerrestre extends CuerpoCombate{
    @Override
    public void combatir() {
        super.combatir();
        System.out.println("¡EN LA TIERRA!");
    }

    @Override
    public void retirarse() {
        super.retirarse();
        System.out.println("Me retiro caminando...");
    }
}
