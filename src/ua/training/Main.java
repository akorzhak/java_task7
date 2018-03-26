/*
 * Main
 *
 * Description: This source file is a part of Java program,
 * that counts the number of occurrences of the same
 * Integers in ArrayList.
 *
 * By: Alyona Korzhakova
 *
 * Created: 2018/03/26
 *
 * Updated: 2018/03/26
 */
package ua.training;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int nb = 0;
        ArrayList<Integer> array = new ArrayList<>();
        CountNumber numberMap = new CountNumber();

        while (nb < 10) {
            array.add(nb);
            array.add(nb++);
        }
        for (Integer key : array) {
            if (numberMap.containsNumber(key)) {
                numberMap.setNumberMap(key);
            } else {
                numberMap.setNumberMap(key, 1);
            }
        }
        System.out.println(numberMap.getNumberMap());
    }
}
