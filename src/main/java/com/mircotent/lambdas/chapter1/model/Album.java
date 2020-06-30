package com.mircotent.lambdas.chapter1.model;

import java.util.List;

/**
 * @author yuzhezhu
 * @date 2020/06/29
 **/
public final class Album {

  private String name;
  private List<Track> tracks;
  private List<Artist> musicians;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Track> getTracks() {
    return tracks;
  }

  public void setTracks(List<Track> tracks) {
    this.tracks = tracks;
  }

  public List<Artist> getMusicians() {
    return musicians;
  }

  public void setMusicians(List<Artist> musicians) {
    this.musicians = musicians;
  }
}
