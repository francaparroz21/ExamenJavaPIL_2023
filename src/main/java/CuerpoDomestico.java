public class CuerpoDomestico extends Cuerpo implements CuerpoInterface.Domestico{

    @Override
    public void barrer() {
        System.out.println("Estoy barriendo...");
    }

    @Override
    public void cocinar() {
        System.out.println("TSSSS... estoy cocinando.");
    }
}
