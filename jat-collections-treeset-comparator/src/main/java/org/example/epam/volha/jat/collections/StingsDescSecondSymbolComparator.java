package org.example.epam.volha.jat.collections;

import java.util.Comparator;

public class StingsDescSecondSymbolComparator implements Comparator<String> {

  @Override
  public int compare(String s1, String s2) {
    return -(s1.substring(1)).compareTo(s2.substring(1));
  }
}
