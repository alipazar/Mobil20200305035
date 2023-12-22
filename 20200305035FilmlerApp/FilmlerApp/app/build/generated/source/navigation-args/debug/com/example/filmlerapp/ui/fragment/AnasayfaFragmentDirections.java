package com.example.filmlerapp.ui.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.filmlerapp.R;
import com.example.filmlerapp.data.entity.Filmler;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AnasayfaFragmentDirections {
  private AnasayfaFragmentDirections() {
  }

  @NonNull
  public static DetayGecis detayGecis(@NonNull Filmler film) {
    return new DetayGecis(film);
  }

  public static class DetayGecis implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private DetayGecis(@NonNull Filmler film) {
      if (film == null) {
        throw new IllegalArgumentException("Argument \"film\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("film", film);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public DetayGecis setFilm(@NonNull Filmler film) {
      if (film == null) {
        throw new IllegalArgumentException("Argument \"film\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("film", film);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("film")) {
        Filmler film = (Filmler) arguments.get("film");
        if (Parcelable.class.isAssignableFrom(Filmler.class) || film == null) {
          __result.putParcelable("film", Parcelable.class.cast(film));
        } else if (Serializable.class.isAssignableFrom(Filmler.class)) {
          __result.putSerializable("film", Serializable.class.cast(film));
        } else {
          throw new UnsupportedOperationException(Filmler.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.detayGecis;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Filmler getFilm() {
      return (Filmler) arguments.get("film");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      DetayGecis that = (DetayGecis) object;
      if (arguments.containsKey("film") != that.arguments.containsKey("film")) {
        return false;
      }
      if (getFilm() != null ? !getFilm().equals(that.getFilm()) : that.getFilm() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getFilm() != null ? getFilm().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "DetayGecis(actionId=" + getActionId() + "){"
          + "film=" + getFilm()
          + "}";
    }
  }
}
