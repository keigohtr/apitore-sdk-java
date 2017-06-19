package com.apitore.banana.response.clustering;

import java.util.Comparator;

public class FactorEntityComparator implements Comparator<FactorEntity> {

  @Override
  public int compare(FactorEntity o1, FactorEntity o2) {
    if (o1.getSimilarity()>o2.getSimilarity())
      return -1;
    else if (o1.getSimilarity()<o2.getSimilarity())
      return 1;
    else
      return 0;
  }

}
