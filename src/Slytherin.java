public class Slytherin extends Hogwarts {

    private int cunningLevel;
    private int determinationLevel;
    private int ambitionLevel;
    private int resourcefulnessLevel;
    private int thirstForPowerLevel;

    public Slytherin(String nameSurname, int magicPower, int transgresionDistance, int cunningLevel,
                     int determinationLevel, int ambitionLevel, int resourcefulnessLevel, int thirstForPowerLevel) {
        super(nameSurname, magicPower, transgresionDistance);
        this.cunningLevel = cunningLevel;
        this.determinationLevel = determinationLevel;
        this.ambitionLevel = ambitionLevel;
        this.resourcefulnessLevel = resourcefulnessLevel;
        this.thirstForPowerLevel = thirstForPowerLevel;
    }

    public void printInformation() {
        printGeneralInformation();
        System.out.println("Особые навыки студента Слизерина: хитрость - " + getCunningLevel() +
                "; решительность - " + getDeterminationLevel() +
                "; амбициозность - " + getAmbitionLevel() +
                "; находчивость - " + getResourcefulnessLevel() +
                "; жажда власти - " + getThirstForPowerLevel() + ".");
        printSeparator();
    }
    public void scoringPoints(Slytherin [] slitherin) {

        for (int i = 0; i < slitherin.length; i++) {

            int summ = slitherin[i].ambitionLevel + slitherin[i].resourcefulnessLevel + slitherin[i].thirstForPowerLevel;

            System.out.println("Сумма балов у ученика " + slitherin[i].getNameSurname() + " равна - " + summ);

        }
    }

    public int getCunningLevel() {
        return cunningLevel;
    }

    public void setCunningLevel(int cunningLevel) {
        this.cunningLevel = cunningLevel;
    }

    public int getDeterminationLevel() {
        return determinationLevel;
    }

    public void setDeterminationLevel(int determinationLevel) {
        this.determinationLevel = determinationLevel;
    }

    public int getAmbitionLevel() {
        return ambitionLevel;
    }

    public void setAmbitionLevel(int ambitionLevel) {
        this.ambitionLevel = ambitionLevel;
    }

    public int getResourcefulnessLevel() {
        return resourcefulnessLevel;
    }

    public void setResourcefulnessLevel(int resourcefulnessLevel) {
        this.resourcefulnessLevel = resourcefulnessLevel;
    }

    public int getThirstForPowerLevel() {
        return thirstForPowerLevel;
    }

    public void setThirstForPowerLevel(int thirstForPowerLevel) {
        this.thirstForPowerLevel = thirstForPowerLevel;
    }
}
