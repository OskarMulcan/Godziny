package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        WpisywankoGodziny wpisywankoGodziny = new WpisywankoGodziny();
        int c;
        do {
            System.out.println("\n1. Dodaj zadanie \n2. Wyświetl zadania \n3. Wyjdź z programu");
            c = scanner.nextInt();
            switch(c) {
                case 1: {
                    System.out.println("Początek zadania (godzina, minuta, sekunda): ");
                    String godzina = scanner.next();
                    if (wpisywankoGodziny.sprawdzanko(godzina) == false) {
                        System.out.println("Błąd: musisz podać sześć liczb, spróbuj ponownie!");
                        break;
                    }
                    int hour = 0, minute = 0, second = 0, day = 0;
                    wpisywankoGodziny.setTime(hour, minute, second, day, godzina);
                    System.out.println("Czas na wykonanie zadania (godziny, minuty, sekundy): ");
                    String czas = scanner.next();
                    if (wpisywankoGodziny.sprawdzanko(czas) == false) {
                        System.out.println("Błąd: musisz podać sześć liczb, spróbuj ponownie!");
                        break;
                    }
                    int hour1 = 0, minute1 = 0, second1 = 0, day1 = 0;
                    wpisywankoGodziny.setTime(hour1, minute1, second1, day1, czas);
                    int hour2, minute2, second2, day2;
                    hour2 = hour + hour1;
                    minute2 = minute + minute1;
                    second2 = second + second1;
                    day2 = day + day1;
                    wpisywankoGodziny.naprawianko(hour2, minute2, second2, day2);
                    System.out.println("Wprowadź nazwę zadania: ");
                    String nazwa = scanner.next();
                    System.out.println("Zadanie zostało dodane pomyślnie! \n" + nazwa + "\nGodzina rozpoczęcia: "
                            + hour + ":" + minute + ":" + second + " (dzień " + day + ")\n Czas na wykonanie zadania: "
                            + hour1 + ":" + minute1 + ":" + second1 + " (" + day + " dni)\n Godzina zakończenia:  "
                            + hour2 + ":" + minute2 + ":" + second2 + " (dzień " + day2 + ")");
                    break;
                }
                case 2: {
                    System.out.println("Ta funkcja dodana zostanie w kolejnej wresji programu");
                    break;
                }
                case 3: {
                    break;
                }
            }

        } while (c == 1 | c == 2);
    }
}
