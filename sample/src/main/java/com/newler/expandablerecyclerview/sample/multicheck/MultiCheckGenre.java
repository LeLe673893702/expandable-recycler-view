package com.newler.expandablerecyclerview.sample.multicheck;

import com.newler.expandablecheckrecyclerview.models.MultiCheckExpandableGroup;
import com.newler.expandablerecyclerview.sample.Artist;
import java.util.List;

public class MultiCheckGenre extends MultiCheckExpandableGroup {

  private int iconResId;

  public MultiCheckGenre(String title, List<Artist> items, int iconResId) {
    super(title, items);
    this.iconResId = iconResId;
  }

  public int getIconResId() {
    return iconResId;
  }
}

