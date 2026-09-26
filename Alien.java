public abstract class Alien {
    protected int numEyes;
    protected String skinColor;
    protected String nativeLanguage;

    // Constructor requiring values for each data field
    public Alien(int numEyes, String skinColor, String nativeLanguage) {
        this.numEyes = numEyes;
        this.skinColor = skinColor;
        this.nativeLanguage = nativeLanguage;
    }

    // toString method returns a complete description
    @Override
    public String toString() {
        return "Eyes: " + numEyes + 
               ", Skin Color: " + skinColor + 
               ", Language: " + nativeLanguage;
    }
}