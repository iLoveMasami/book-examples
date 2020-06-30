package com.mircotent.lambdas.chapter1.model;

import java.util.List;

/**
 * @author yuzhezhu
 * @date 2020/06/29
 **/
public final class Artist {

  private String name;
  private List<Artist> members;
  private String origin;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Artist> getMembers() {
    return members;
  }

  public void setMembers(List<Artist> members) {
    this.members = members;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }
}
