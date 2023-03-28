public class DomesticBody extends Body implements BodyInterface.Domestic {

    @Override
    public void barrer() {
        System.out.println("Estoy barriendo...");
    }

    @Override
    public void cook() {
        System.out.println("TSSSS... estoy cocinando.");
    }
}
