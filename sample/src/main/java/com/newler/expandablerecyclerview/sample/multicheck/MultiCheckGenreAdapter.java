package com.newler.expandablerecyclerview.sample.multicheck;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.newler.expandablecheckrecyclerview.CheckableChildRecyclerViewAdapter;
import com.newler.expandablecheckrecyclerview.models.CheckedExpandableGroup;
import com.newler.expandablerecyclerview.models.ExpandableGroup;
import com.newler.expandablerecyclerview.sample.Artist;
import com.newler.expandablerecyclerview.sample.R;
import com.newler.expandablerecyclerview.sample.expand.GenreViewHolder;
import java.util.List;

public class MultiCheckGenreAdapter extends
    CheckableChildRecyclerViewAdapter<GenreViewHolder, MultiCheckArtistViewHolder> {

  public MultiCheckGenreAdapter(List<MultiCheckGenre> groups) {
    super(groups);
  }

  @Override
  public MultiCheckArtistViewHolder onCreateCheckChildViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.list_item_multicheck_artist, parent, false);
    return new MultiCheckArtistViewHolder(view);
  }

  @Override
  public void onBindCheckChildViewHolder(MultiCheckArtistViewHolder holder, int position,
      CheckedExpandableGroup group, int childIndex) {
    final Artist artist = (Artist) group.getItems().get(childIndex);
    holder.setArtistName(artist.getName());
  }

  @Override
  public GenreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.list_item_genre, parent, false);
    return new GenreViewHolder(view);
  }

  @Override
  public void onBindGroupViewHolder(GenreViewHolder holder, int flatPosition,
      ExpandableGroup group) {
    holder.setGenreTitle(group);
  }
}
