public class Tester {
    public static void main(String[] args)  {
        EarthText et = new EarthText();
        try {
            //Send valid Earth to Earth message
            et.sendMessage("Earth", "src/Earth.txt");
            //Read Valid Earth message
            et.readMessage("src/Earth.txt");
            //Send invalid Earth to Earth message
            et.sendMessage("Earth", "Earth.txt2");
            //Send valid klingon message
            et.sendMessage("Klingon", "src/Klingon.txt");
        }
        catch (InvalidLanguageException ile) {
            System.out.println(ile.getMessage());
        }
    }
}
