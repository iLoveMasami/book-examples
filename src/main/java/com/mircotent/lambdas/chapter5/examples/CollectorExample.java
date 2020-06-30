package com.mircotent.lambdas.chapter5.examples;

import com.mircotent.lambdas.chapter1.model.Artist;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yuzhezhu
 * @date 2020/06/29
 **/
public class CollectorExample {

  public static void main(String[] args) {

  }

  public String formatArtistNameByStream(List<Artist> artists) {
    return artists.stream().map(Artist::getName).collect(Collectors.joining(",", "[", "]"));
  }

}
