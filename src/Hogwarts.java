public class Hogwarts {

    private int magicPower;
    private int transgresionDistance;
    private String nameSurname;


    public Hogwarts(String nameSurname, int magicPower, int transgresionDistance) {
        this.nameSurname = nameSurname;
        this.magicPower = magicPower;
        this.transgresionDistance = transgresionDistance;
    }

    public void printGeneralInformation() {
        System.out.println("Имя студента: " + getNameSurname() + ".");
        System.out.println("Общие навыки: сила магии - " + getMagicPower() +
                "; расстояние трансгрессии - " + getTransgresionDistance() + ".");
    }

    public void printSeparator() {
        System.out.println("---------");
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgresionDistance() {
        return transgresionDistance;
    }

    public void setTransgresionDistance(int transgresionDistance) {
        this.transgresionDistance = transgresionDistance;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
}
