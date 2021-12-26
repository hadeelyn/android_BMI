// Generated by view binder compiler. Do not edit!
package com.hadeelNQ.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hadeelNQ.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView TextView02;

  @NonNull
  public final TextView TextView03;

  @NonNull
  public final TextView textView01;

  @NonNull
  public final TextView textView04;

  private CustomItemBinding(@NonNull LinearLayout rootView, @NonNull TextView TextView02,
      @NonNull TextView TextView03, @NonNull TextView textView01, @NonNull TextView textView04) {
    this.rootView = rootView;
    this.TextView02 = TextView02;
    this.TextView03 = TextView03;
    this.textView01 = textView01;
    this.textView04 = textView04;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TextView02;
      TextView TextView02 = ViewBindings.findChildViewById(rootView, id);
      if (TextView02 == null) {
        break missingId;
      }

      id = R.id.TextView03;
      TextView TextView03 = ViewBindings.findChildViewById(rootView, id);
      if (TextView03 == null) {
        break missingId;
      }

      id = R.id.textView01;
      TextView textView01 = ViewBindings.findChildViewById(rootView, id);
      if (textView01 == null) {
        break missingId;
      }

      id = R.id.textView04;
      TextView textView04 = ViewBindings.findChildViewById(rootView, id);
      if (textView04 == null) {
        break missingId;
      }

      return new CustomItemBinding((LinearLayout) rootView, TextView02, TextView03, textView01,
          textView04);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
