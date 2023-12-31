package com.example.filmlerapp.ui.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.example.filmlerapp.data.entity.Filmler;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetayFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetayFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetayFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static DetayFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetayFragmentArgs __result = new DetayFragmentArgs();
    bundle.setClassLoader(DetayFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("film")) {
      Filmler film;
      if (Parcelable.class.isAssignableFrom(Filmler.class) || Serializable.class.isAssignableFrom(Filmler.class)) {
        film = (Filmler) bundle.get("film");
      } else {
        throw new UnsupportedOperationException(Filmler.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (film == null) {
        throw new IllegalArgumentException("Argument \"film\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("film", film);
    } else {
      throw new IllegalArgumentException("Required argument \"film\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetayFragmentArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    DetayFragmentArgs __result = new DetayFragmentArgs();
    if (savedStateHandle.contains("film")) {
      Filmler film;
      film = savedStateHandle.get("film");
      if (film == null) {
        throw new IllegalArgumentException("Argument \"film\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("film", film);
    } else {
      throw new IllegalArgumentException("Required argument \"film\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Filmler getFilm() {
    return (Filmler) arguments.get("film");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("film")) {
      Filmler film = (Filmler) arguments.get("film");
      if (Parcelable.class.isAssignableFrom(Filmler.class) || film == null) {
        __result.set("film", Parcelable.class.cast(film));
      } else if (Serializable.class.isAssignableFrom(Filmler.class)) {
        __result.set("film", Serializable.class.cast(film));
      } else {
        throw new UnsupportedOperationException(Filmler.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetayFragmentArgs that = (DetayFragmentArgs) object;
    if (arguments.containsKey("film") != that.arguments.containsKey("film")) {
      return false;
    }
    if (getFilm() != null ? !getFilm().equals(that.getFilm()) : that.getFilm() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getFilm() != null ? getFilm().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetayFragmentArgs{"
        + "film=" + getFilm()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DetayFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Filmler film) {
      if (film == null) {
        throw new IllegalArgumentException("Argument \"film\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("film", film);
    }

    @NonNull
    public DetayFragmentArgs build() {
      DetayFragmentArgs result = new DetayFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setFilm(@NonNull Filmler film) {
      if (film == null) {
        throw new IllegalArgumentException("Argument \"film\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("film", film);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Filmler getFilm() {
      return (Filmler) arguments.get("film");
    }
  }
}
