public class Hufflepuff extends Hogwarts {

    private int diligenceLevel;
    private int loyaltyLevel;
    private int honestyLevel;

    public Hufflepuff(String nameSurname, int magicPower, int transgresionDistance, int diligenceLevel, int loyaltyLevel, int honestyLevel) {
        super(nameSurname, magicPower, transgresionDistance);
        this.diligenceLevel = diligenceLevel;
        this.loyaltyLevel = loyaltyLevel;
        this.honestyLevel = honestyLevel;
    }
    public void printInformation() {
        printGeneralInformation();
        System.out.println("Особые навыки студента Пуффендуя: трудолюбие - " + getDiligenceLevel() +
                "; верность - " + getLoyaltyLevel() +
                "; честность - " + getHonestyLevel() + ".");
        printSeparator();
    }

    public int getDiligenceLevel() {
        return diligenceLevel;
    }

    public void setDiligenceLevel(int diligenceLevel) {
        this.diligenceLevel = diligenceLevel;
    }

    public int getLoyaltyLevel() {
        return loyaltyLevel;
    }

    public void setLoyaltyLevel(int loyaltyLevel) {
        this.loyaltyLevel = loyaltyLevel;
    }

    public int getHonestyLevel() {
        return honestyLevel;
    }

    public void setHonestyLevel(int honestyLevel) {
        this.honestyLevel = honestyLevel;
    }
}
