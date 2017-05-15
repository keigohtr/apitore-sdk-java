package com.apitore.banana.de.sciss.ws4j.common;


public enum PosDef {
  n ("n","noun"),
  v ("v","verb"),
  a ("a","adjective"),
  r ("r","adverb");

  private final String id;
  private final String description;
  private PosDef(final String id, final String description) {
    this.id = id;
    this.description = description;
  }
  public String getId() {
    return id;
  }
  public String getDescription() {
    return description;
  }

}
