package com.apitore.banana.response.org.rome.comparator;

import java.util.Comparator;

import com.apitore.banana.response.org.rome.FeedEntryEntity;

/**
 * @author Keigo Hattori
 */
public class FeedEntryComparator implements Comparator<FeedEntryEntity> {

  @Override
  public int compare(FeedEntryEntity o1, FeedEntryEntity o2) {
    return o2.getPubDate().compareTo(o1.getPubDate());
  }

}
