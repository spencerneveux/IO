import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EarthText implements EarthCellPhone {
    public EarthText(){}


    /**
     * Method to send message
     * @param languageType String value representing the language type
     * @param fileName File name of given message
     * @throws InvalidLanguageException exception that only supports earth, vulcan, klingon
     */
    @Override
    public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {
        try (Scanner in = new Scanner(new File(fileName))) {
            if (!(languageType.equals("Earth") || languageType.equals("Vulcan") || languageType.equals("Klingon"))) {
                throw new InvalidLanguageException("Language: " + languageType + " not supported");
            } else {
                System.out.println(languageType + " Message Sent");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File: " + fileName + " does not exist");
        }
    }

    /**
     * Method to read message from given text file
     * @param fileName the file path of message to be read
     */
    @Override
    public void readMessage(String fileName)  {
        try (Scanner in = new Scanner(new File(fileName))) {
            while(in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
