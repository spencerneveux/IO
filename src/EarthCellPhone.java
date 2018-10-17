public interface EarthCellPhone {
    void sendMessage(String languageType, String fileName)
        throws InvalidLanguageException;
    void readMessage(String fileName);
}
