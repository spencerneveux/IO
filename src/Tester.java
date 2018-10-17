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

            //Create Universal Translator for Klingons
            UniversalTranslator ut = new UniversalTranslator(new KlingonText());
            EarthCellPhone e2 = ut;
            e2.readMessage("src/Klingon.txt");

            //Send valid Vulcan message
            et.sendMessage("Vulcan", "src/Vulcan.txt");

            //Create Universal Translator for Vulcans
            ut = new UniversalTranslator(new VulcanText());
            e2 = ut;
            e2.readMessage("src/Vulcan.txt");

            //Send unsupported language
            et.sendMessage("non-fed", "src/non-fed.txt");

        }
        catch (InvalidLanguageException ile) {
            System.out.println(ile.getMessage());
        }
    }
}
