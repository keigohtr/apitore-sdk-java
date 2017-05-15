package com.apitore.banana.de.sciss.ws4j.common;


public enum LinkDef {
  also ("also","関連","当該synsetと相手synsetとの間に何らかの関連がある"),
  syns ("syns","同義語","当該synsetを言い表すのに使用される"),
  hype ("hype","上位語","当該synsetが相手synsetに包含される"),
  inst ("inst","例","当該synsetは相手synsetの例である"),
  hypo ("hypo","下位語","当該synsetが相手synsetを包含する"),
  hasi ("hasi","例あり","当該synsetは相手synsetを例として持つ"),
  mero ("mero","被構成要素","当該synsetが相手synsetによって構成される"),
  mmem ("mmem","被構成要素(構成員)","当該synsetが相手synsetという構成員によって構成される"),
  msub ("msub","被構成要素(物質・材料)","当該synsetが相手synsetという物質or材料によって構成される"),
  mprt ("mprt","被構成要素(部分)","当該synsetが相手synsetという部分によって構成される"),
  holo ("holo","構成要素","当該synsetが相手synsetを構成する"),
  hmem ("hmem","構成要素(構成員)","当該synsetが相手synsetの構成員である"),
  hsub ("hsub","構成要素(物質・材料)","当該synsetが相手synsetを構成する物質or材料である"),
  hprt ("hprt","構成要素(部分)","当該synsetが部分として相手synsetを構成する"),
  attr ("attr","属性","(a=形容詞のsynsetから見て)当該synsetが相手synsetという属性を表す際に使われる／(n=名詞のsynsetから見て)当該synsetという属性を表す際に相手synsetを使う"),
  sim  ("sim" ,"近似","当該synsetは表す意味が相手synsetと近似している"),
  enta ("enta","含意","当該synsetを行う場合、必ず相手synsetも行っている"),
  caus ("caus","引き起こし","当該synsetを行うと、相手synsetを引き起こす"),
  dmn  ("dmn" ,"被包含領域","当該synsetが相手synsetに属する"),
  dmnc ("dmnc","被包含領域(カテゴリ)","当該synsetが相手synsetのカテゴリに属する"),
  dmnu ("dmnu","被包含領域(語法)","当該synsetの用法が相手synsetの領域に限られる"),
  dmnr ("dmnr","被包含領域(地域)","当該synsetが相手synsetの地域に属するものである"),
  dmt  ("dmt" ,"包含領域","当該synsetに相手synsetが属する"),
  dmtc ("dmtc","包含領域(カテゴリ)","当該synsetが相手synsetが属するカテゴリである"),
  dmtu ("dmtu","包含領域(語法)","当該synsetの領域が相手synsetの用法を規定する"),
  dmtr ("dmtr","包含領域(地域)","当該synsetが相手synsetの属する地域である"),
  ants ("ants","反意語","当該synsetを反意する"),
  dfn  ("dfn" ,"定義","当該synsetの定義"),
  tran ("tran","翻訳","当該synsetの翻訳");

  private final String id;
  private final String label;
  private final String description;
  private LinkDef(final String id, final String label, final String description) {
    this.id = id;
    this.label = label;
    this.description = description;
  }
  public String getId() {
    return id;
  }
  public String getLabel() {
    return label;
  }
  public String getDescription() {
    return description;
  }

}
