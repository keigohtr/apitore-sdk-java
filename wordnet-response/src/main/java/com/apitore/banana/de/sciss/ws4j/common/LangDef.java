package com.apitore.banana.de.sciss.ws4j.common;


public enum LangDef {
  jpn ("jpn"),
  eng ("eng");

  private final String id;
  private LangDef(final String id) {
    this.id = id;
  }
  public String getId() {
    return id;
  }

}
