package com.apitore.banana.utils;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class UrlFormatter {

  public static String format(String endpoint, Map<String,String> params) {
      StringBuffer buffer = new StringBuffer();
      for (Iterator<Entry<String,String>> it = params.entrySet().iterator(); it.hasNext();) {
        Map.Entry<String,String> entry = it.next();
        String key = entry.getKey();
        buffer.append(String.format("%s={%s}", key,key));
        if (it.hasNext()) {
          buffer.append("&");
        }
      }
      return String.format("%s?%s", endpoint, buffer.toString());
  }

}
