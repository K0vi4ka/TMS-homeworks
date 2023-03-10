package by.tms.homeworks.hw.hw_03032023;

import java.util.Scanner;

public class AnimalMenu {

    public static void drawMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - создать животное");
        System.out.println("2 - вывести информацию");
        System.out.println("3 - изменить характеристики");
        System.out.println("4 - удалить животное");
        System.out.println("5 - выйти");
        int menuNum = scanner.nextInt();
        switch (menuNum) {
            case 1:
                createNewAnimal();
                break;
            case 2:
                findAnimal();
                break;
            case 3:
                updateAnimal();
                break;
            case 4:
                deleteAnimal();
                break;
            case 5:
                System.out.println("Вы вышли из программы");
                break;
            default:
                System.out.println("Ошибка нет такого пункта меню");
                drawMainMenu();
                break;
        }
    }

    public static void findAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введтие название картинки");
        String picture = scanner.nextLine();
        String info = "";
        for (int i = 0; i < Animal.getArrayIndex(); i++) {
            if (Animal.animalsArray[i].getPicture().equals(picture)) {
                info = Animal.animalsArray[i].getInfo(picture);
            }
        }
        if (info.isEmpty()) {
            System.out.println("Ошибка данное животное не найдено");
        } else {
            System.out.println(info);
        }
        drawMainMenu();
    }

    public static void createNewAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введтие следующие данные");
        System.out.print("Картинка: ");
        String picture = scanner.nextLine();
        System.out.print("\nЕда: ");
        String food = scanner.nextLine();
        System.out.print("\nГолод: ");
        int hunger = scanner.nextInt();
        System.out.print("\nГраницы: ");
        System.out.print("\nВысота: ");
        int height = scanner.nextInt();
        System.out.print("\nДлинна: ");
        int width = scanner.nextInt();
        System.out.print("\nРасположение: ");
        System.out.print("\nХ: ");
        int x = scanner.nextInt();
        System.out.print("\nУ: ");
        int y = scanner.nextInt();
        Animal animal = new AnotherAnimal(picture, food, hunger, new Animal.Boundaries(height, width), new Animal.Location(x, y));
        Animal.animalsArray[Animal.getArrayIndex()] = animal;
        drawMainMenu();
    }

    public static void deleteAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название картнки, которую вы хотите удалить");
        String picture = scanner.nextLine();
        boolean isDeleted = false;
        int endArrayIndex = 0;
        int deletedIndex = 0;

        for (int i = 0; i < Animal.getArrayIndex(); i++) {
            if (Animal.animalsArray[i].getPicture().equals(picture)) {
                deletedIndex = i;
                endArrayIndex = Animal.getArrayIndex();
                Animal.animalsArray[i] = null;
                isDeleted = true;
            }
        }
        if (isDeleted) {
            for (int i = deletedIndex; i < endArrayIndex; i++) {
                Animal temp = Animal.animalsArray[i + 1];
                Animal.animalsArray[i + 1] = Animal.animalsArray[i];
                Animal.animalsArray[i] = temp;
                System.out.println("work");
            }
        } else {
            System.out.println("Ошибка, данное животное не найдено ");
        }
        System.out.println(Animal.getArrayIndex());
        drawMainMenu();
    }

    public static void updateAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введтие картинку животног, которую вы хотели бы изменить");
        System.out.print("Картинка: ");
        boolean isImgFound = false;
        int animalIdx = 0;

        String picture = scanner.nextLine();
        for (int i = 0; i < Animal.getArrayIndex(); i++) {
            if (Animal.animalsArray[i].getPicture().equals(picture)) {
                isImgFound = true;
                Animal.animalsArray[i].setPicture(picture);
                animalIdx = i;
            }
        }
        if (isImgFound) {
            System.out.print("\nЕда: ");
            String food = scanner.nextLine();
            System.out.print("\nГолод: ");
            int hunger = scanner.nextInt();
            System.out.print("\nГраницы: ");
            System.out.print("\nВысота: ");
            int height = scanner.nextInt();
            System.out.print("\nДлинна: ");
            int width = scanner.nextInt();
            System.out.print("\nРасположение: ");
            System.out.print("\nХ: ");
            int x = scanner.nextInt();
            System.out.print("\nУ: ");
            int y = scanner.nextInt();
            Animal.animalsArray[animalIdx].setFood(food);
            Animal.animalsArray[animalIdx].setBoundaries(new Animal.Boundaries(width, height));
            Animal.animalsArray[animalIdx].setHunger(hunger);
            Animal.animalsArray[animalIdx].setLocation(new Animal.Location(x, y));
        } else {
            System.out.println("Извените, такого животного не найдено");
        }
        drawMainMenu();
    }
}
