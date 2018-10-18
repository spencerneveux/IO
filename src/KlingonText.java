import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KlingonText implements AlienCellPhone {
    /**
     * Null Constructor
     */
    public KlingonText() {}

    /**
     * Method to send alien text
     * @param fileName path of file to send
     */
    @Override
    public void alienSendText(String fileName) {
        try(Scanner in = new Scanner(new File(fileName))) {
            System.out.println("Klingon Message Sent");
        }
        catch (FileNotFoundException e) {
            System.out.println("File: " + fileName + " does not exist");
        }
    }

    /**
     * Method to read text from file
     * @param fileName path of file to read
     */
    @Override
    public void alienReadText(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            String translatedText = translateText(fileName);
            System.out.println("Klingon " + translatedText);
        }
        catch (FileNotFoundException e) {
            System.out.println("File: " + fileName + " not found");
        }
    }

    /**
     * Method to translate text to klingon language
     * @param filename path of file to translate
     * @return String of translated text
     */
    @Override
    public String translateText(String filename) {
        try (Scanner in = new Scanner(new File(filename))){
            String line = "";
            while (in.hasNextLine()) {
                line += in.nextLine();
            }

            char[] array = line.toCharArray();
            char[] translatedArray = new char[array.length];
            int index = 0;
            for (int i = array.length - 1; i>=0; i--) {
                translatedArray[index] = array[i];
                index++;
            }
            String translatedText = new String(translatedArray);
            return translatedText;
        }
        catch (FileNotFoundException e) {
            System.out.println("File: " + filename + " not found");
        }
        return null;
    }

    /**
     * Overriding tostring
     * @return String
     */
    @Override
    public String toString() {
        return ("KlingonText");
    }
}
