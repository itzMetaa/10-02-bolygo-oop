package bolygooop;

public class BolygoOOP {

    public static void main(String[] args) {
        Bolygo fold = Bolygo.FOLD;
        Bolygo b = Bolygo.NEPTUNUSZ;
        
        Bolygo[] bolygok = Bolygo.values();
        
        for (Bolygo bolygocska : bolygok) {
            System.out.println(bolygocska.name());
        }
        
    }
    
}
