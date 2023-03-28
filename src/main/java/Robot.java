public class Robot {
     Cabeza cabeza;
     Cuerpo cuerpo;

    public Cabeza getCabeza() {
        return cabeza;
    }

    public void setCabeza(Cabeza cabeza) {
        this.cabeza = cabeza;
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void changeBody(Cuerpo cuerpo){
        setCuerpo(cuerpo);
    }
}
