public class Gryffindor extends Hogwarts {

    private int nobilityLevel;
    private int honorLevel;
    private int braveryLevel;

    public Gryffindor(String nameSurname, int magicPower, int transgresionDistance, int nobilityLevel, int honorLevel, int braveryLevel) {
        super(nameSurname, magicPower, transgresionDistance);
        this.nobilityLevel = nobilityLevel;
        this.honorLevel = honorLevel;
        this.braveryLevel = braveryLevel;
    }

    public void printInformation() {
        printGeneralInformation();
        System.out.println("Особые навыки студента Гриффиндора: благородство - " + getNobilityLevel() +
                "; честь - " + getHonorLevel() +
                "; храбрость - " + getBraveryLevel() + ".");
        printSeparator();
    }

    public int getNobilityLevel() {
        return nobilityLevel;
    }

    public void setNobilityLevel(int nobilityLevel) {
        this.nobilityLevel = nobilityLevel;
    }

    public int getHonorLevel() {
        return honorLevel;
    }

    public void setHonorLevel(int honorLevel) {
        this.honorLevel = honorLevel;
    }

    public int getBraveryLevel() {
        return braveryLevel;
    }

    public void setBraveryLevel(int braveryLevel) {
        this.braveryLevel = braveryLevel;
    }
}
