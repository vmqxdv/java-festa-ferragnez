package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

  static String formatStringForCheck(String str) {
    return str.toLowerCase().replaceAll("\\s+", "");
  }

  public static void main(String[] args) {
    String[] guestsArr = {
        "Dua Lipa",
        "Paris Hilton",
        "Manuel Agnelli",
        "J-ax",
        "Francescto Totti",
        "Ilary Blasi",
        "Bebe Vio",
        "Luis",
        "Pardis Zarei",
        "Martrina Maccherone",
        "Rachel Zeilic"
    };

    System.out.println("Benvenuto alla festa dei Ferragnez! Per favore forniscimi il tuo nome:");

    Scanner in = new Scanner(System.in);

    String userName = in.nextLine();

    boolean isUserFound = false;

    // Soluzione con for
    // for (int i = 0; i < guestsArr.length; i++) {
    // if
    // (formatStringForCheck(guestsArr[i]).equals(formatStringForCheck(userName))) {
    // isUserFound = true;
    // break;
    // }
    // }

    // Soluzione con while
    int index = 0;
    while (!isUserFound && index < guestsArr.length) {
      if (formatStringForCheck(guestsArr[index]).equals(formatStringForCheck(userName)))
        isUserFound = true;

      index++;
    }

    if (isUserFound) {
      System.out.println("Oh eccoti qua, puoi entrare.");
    } else
      System.out.println("Spiacente, non sei sulla lista. Non puoi entrare.");

    in.close();
  }
}