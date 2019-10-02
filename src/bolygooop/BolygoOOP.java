package bolygooop;

public class BolygoOOP {

    public static void main(String[] args) {
        Bolygo fold = Bolygo.FOLD;
        Bolygo b = Bolygo.NEPTUNUSZ;
        
        int tanarTomeg = 82;
        
        Bolygo[] bolygok = Bolygo.values();
        
        for (Bolygo bolygocska : bolygok) {
            System.out.println(bolygocska.name() +
                    " (Tömeg: " + bolygocska.getTomeg() +
                    ", Sugár: "  + bolygocska.getSugar() +
                    ", Gravitácó: " + bolygocska.getGravitacio() + ")");
            System.out.printf("%s --- %f\n", bolygocska.name(), bolygocska.getSuly(tanarTomeg));
        }
        
    }
    
}
