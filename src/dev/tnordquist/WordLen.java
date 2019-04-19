package dev.tnordquist;

import java.util.HashMap;
import java.util.Map;

/**
 * CodingBat:Given an array of strings, return a Map<String, Integer> containing a key for every
 * different string in the array, and the value is that string's length.
 */
public class WordLen {

  public Map<String, Integer> wordLen(String[] strings) {

    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < strings.length; ++i) {

      if (!(map.containsKey(strings[i]))) {
        map.put(strings[i], strings[i].length());
      }

    }
    return map;
  }

}
