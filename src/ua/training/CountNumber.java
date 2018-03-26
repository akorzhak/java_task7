/*
 * CountNumber
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

import java.util.HashMap;

/**
 * CountNumber class
 * Creates HashMap and records the number of
 * Integers occurrences of ArrayList.
 */
public class CountNumber {

    HashMap<Integer, Integer> numberMap = new HashMap<>();

    public String getNumberMap() {
        return numberMap.toString();
    }

    public void setNumberMap(Integer key, Integer value) {
        numberMap.put(key, value);
    }

    public void setNumberMap(Integer key) {
        Integer value = numberMap.get(key);
        value++;
        numberMap.replace(key, value);
    }

    public boolean containsNumber(Integer key) {
        return numberMap.containsKey(key);
    }
}
