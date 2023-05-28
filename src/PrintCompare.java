public class PrintCompare {

    public static void  compareGryffindor(Gryffindor firstStudent, Gryffindor secondStudent) {
        int sumFirstStudent = firstStudent.getNobilityLevel() + firstStudent.getHonorLevel() + firstStudent.getBraveryLevel();
        int sumSecondStudent = secondStudent.getNobilityLevel() + secondStudent.getHonorLevel() + secondStudent.getBraveryLevel();

        if (sumFirstStudent > sumSecondStudent) {
            System.out.println(firstStudent.getNameSurname() +
                    " лучший Гриффиндорец, чем " + secondStudent.getNameSurname() + ".");
        } else if (sumSecondStudent > sumFirstStudent) {
            System.out.println(secondStudent.getNameSurname() +
                    " лучший Гриффиндорец, чем " + firstStudent.getNameSurname() + ".");
        } else {
            System.out.println(firstStudent.getNameSurname() +
                    " и " + secondStudent.getNameSurname() + " одинаково хороши.");
        }
    }

    public static void  compareHufflepuff(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int sumFirstStudent = firstStudent.getLoyaltyLevel() + firstStudent.getDiligenceLevel() +
                firstStudent.getHonestyLevel();
        int sumSecondStudent = secondStudent.getLoyaltyLevel() + secondStudent.getDiligenceLevel() +
                secondStudent.getHonestyLevel();

        if (sumFirstStudent > sumSecondStudent) {
            System.out.println(firstStudent.getNameSurname() + " лучший Пуффендуец, чем " +
                    secondStudent.getNameSurname() + ".");
        } else if (sumSecondStudent > sumFirstStudent) {
            System.out.println(secondStudent.getNameSurname() + " лучший Пуффендуец, чем " +
                    firstStudent.getNameSurname() + ".");
        } else {
            System.out.println(firstStudent.getNameSurname() + " и " +
                    secondStudent.getNameSurname() + " одинаково хороши.");
        }
    }

    public static void  compareRavenclaw(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int sumFirstStudent = firstStudent.getWisdomLevel() + firstStudent.getWitLevel() +
                firstStudent.getIntelligenceLevel() + firstStudent.getCreativityLevel();
        int sumSecondStudent = secondStudent.getWisdomLevel() + secondStudent.getWitLevel() +
                secondStudent.getIntelligenceLevel() + secondStudent.getCreativityLevel();

        if (sumFirstStudent > sumSecondStudent) {
            System.out.println(firstStudent.getNameSurname() + " лучший Когтевранец, чем " +
                    secondStudent.getNameSurname() + ".");
        } else if (sumSecondStudent > sumFirstStudent) {
            System.out.println(secondStudent.getNameSurname() + " лучший Когтевранец, чем " +
                    firstStudent.getNameSurname() + ".");
        } else {
            System.out.println(firstStudent.getNameSurname() + " и " +
                    secondStudent.getNameSurname() + " одинаково хороши.");
        }
    }

    public static void  compareSlytherin(Slytherin firstStudent, Slytherin secondStudent) {
        int sumFirstStudent = firstStudent.getCunningLevel() + firstStudent.getResourcefulnessLevel() +
                firstStudent.getThirstForPowerLevel() + firstStudent.getDeterminationLevel() +
                firstStudent.getAmbitionLevel();
        int sumSecondStudent = secondStudent.getCunningLevel() + secondStudent.getResourcefulnessLevel() +
                secondStudent.getThirstForPowerLevel() + secondStudent.getDeterminationLevel() +
                secondStudent.getAmbitionLevel();

        if (sumFirstStudent > sumSecondStudent) {
            System.out.println(firstStudent.getNameSurname() + " лучший Слизеринец, чем " +
                    secondStudent.getNameSurname() + ".");
        } else if (sumSecondStudent > sumFirstStudent) {
            System.out.println(secondStudent.getNameSurname() + " лучший Слизеринец, чем " +
                    firstStudent.getNameSurname() + ".");
        } else {
            System.out.println(firstStudent.getNameSurname() + " и " +
                    secondStudent.getNameSurname() + " одинаково хороши.");
        }
    }

    public static void compareHogwarts(Hogwarts firstStudent, Hogwarts secondStudent) {

        if (firstStudent.getMagicPower() > secondStudent.getMagicPower()
                && firstStudent.getTransgresionDistance() > secondStudent.getTransgresionDistance()) {
            System.out.println(firstStudent.getNameSurname() +
                    " обладает большей силой магии и расстоянием трансгрессии чем " + secondStudent.getNameSurname());
        } else if (secondStudent.getMagicPower() > firstStudent.getMagicPower()
                && secondStudent.getTransgresionDistance() > firstStudent.getTransgresionDistance()) {
            System.out.println(secondStudent.getNameSurname() +
                    " обладает большей силой магии и расстоянием трансгрессии чем " + firstStudent.getNameSurname());
        } else if (firstStudent.getMagicPower() > secondStudent.getMagicPower() &&
                secondStudent.getTransgresionDistance() > firstStudent.getTransgresionDistance()) {
            System.out.println(firstStudent.getNameSurname() + " обладает большей силой магии, чем " +
                    secondStudent.getNameSurname() + ", но меньшим расстоянием трансгрессии.");
        } else if (secondStudent.getMagicPower() > firstStudent.getMagicPower() &&
                firstStudent.getTransgresionDistance() > secondStudent.getTransgresionDistance()) {
            System.out.println(firstStudent.getNameSurname() + " обладает большей силой магии, чем " +
                    secondStudent.getNameSurname() + ", но меньшим расстоянием трансгрессии.");
        } else {
            System.out.println("Сила магии и расстояние трансгрессии у " + firstStudent.getNameSurname() +
                    " и " + secondStudent.getNameSurname() + " равны.");
        }

    }

}
