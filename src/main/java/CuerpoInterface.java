public interface CuerpoInterface {
    public void moverse();

    public interface Domestico {
        public void barrer();

        public void cocinar();
    }

    public interface Combate {
        public void combatir();

        public void retirarse();
    }

    interface Animal{
        String comer();
        String dormir();
    }

}
