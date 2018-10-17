public class UniversalTranslator implements EarthCellPhone {
    private AlienCellPhone alienCellPhone;

    public UniversalTranslator(AlienCellPhone alienCellPhone) {
        this.alienCellPhone = alienCellPhone;
    }

    @Override
    public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {
        alienCellPhone.alienSendText(fileName);
    }

    @Override
    public void readMessage(String fileName) {
        alienCellPhone.alienReadText(fileName);
    }
}
