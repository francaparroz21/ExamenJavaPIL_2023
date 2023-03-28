public class CuerpoAnimal extends Cuerpo implements CuerpoInterface.Animal{

    @Override
     public String comer() {
        return "mmmmm estoy comiendo";
    }

    @Override
     public String dormir() {
        return "zZzZZzZZZZzzz";
    }
}
