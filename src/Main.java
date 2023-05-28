public class Main {
    public static void main(String[] args) {

        Gryffindor garry = new Gryffindor ("Гарри Поттер", 100, 68,
                90, 47, 77);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 98, 88,
                67, 39, 95);
        Gryffindor ron = new Gryffindor("Рон Уизли", 69, 89,
                84, 79, 30);
        Slytherin drako = new Slytherin("Драко Малфой", 66, 80,
                48, 66, 29, 7, 50);
        Slytherin gracham = new Slytherin("Грэхэм Монтегю", 60, 70,
                41, 40, 39, 9, 60);
        Slytherin gregory = new Slytherin("Грегори Гойл", 66, 80,
                70, 50, 10, 30, 50);
        Hufflepuff zacharia = new Hufflepuff("Захария Смит", 60, 50,
                10, 30, 25);
        Hufflepuff sadrick = new Hufflepuff("Седрик Диггори", 70, 15,
                20, 50, 35);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 80, 30,
                30, 40, 45);
        Ravenclaw chzou = new Ravenclaw("Чжоу Чанг", 70, 20, 67,
                40, 30, 9);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 30, 10, 44,
                42, 5, 33);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 20, 40, 30,
                45, 66, 15);

        germiona.printInformation();
        gregory.printInformation();
        sadrick.printInformation();
        padma.printInformation();

        PrintCompare.compareGryffindor(garry, germiona);
        PrintCompare.compareSlytherin(drako, gregory);
        PrintCompare.compareHogwarts(garry, drako);


    }


    }


