// Generated by view binder compiler. Do not edit!
package com.hadeelNQ.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hadeelNQ.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddFoodBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final EditText calory;

  @NonNull
  public final TextView changefood;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout laoyoutBack;

  @NonNull
  public final LinearLayout layoutAdd;

  @NonNull
  public final LinearLayout layoutBac;

  @NonNull
  public final LinearLayout layoutLength;

  @NonNull
  public final LinearLayout layoutLogo;

  @NonNull
  public final LinearLayout layoutWeight;

  @NonNull
  public final EditText name;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView5;

  private ActivityAddFoodBinding(@NonNull RelativeLayout rootView, @NonNull ImageView back,
      @NonNull EditText calory, @NonNull TextView changefood, @NonNull ImageView imageView2,
      @NonNull LinearLayout laoyoutBack, @NonNull LinearLayout layoutAdd,
      @NonNull LinearLayout layoutBac, @NonNull LinearLayout layoutLength,
      @NonNull LinearLayout layoutLogo, @NonNull LinearLayout layoutWeight, @NonNull EditText name,
      @NonNull TextView textView, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.back = back;
    this.calory = calory;
    this.changefood = changefood;
    this.imageView2 = imageView2;
    this.laoyoutBack = laoyoutBack;
    this.layoutAdd = layoutAdd;
    this.layoutBac = layoutBac;
    this.layoutLength = layoutLength;
    this.layoutLogo = layoutLogo;
    this.layoutWeight = layoutWeight;
    this.name = name;
    this.textView = textView;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddFoodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddFoodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_food, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddFoodBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.calory;
      EditText calory = ViewBindings.findChildViewById(rootView, id);
      if (calory == null) {
        break missingId;
      }

      id = R.id.changefood;
      TextView changefood = ViewBindings.findChildViewById(rootView, id);
      if (changefood == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.laoyout_back;
      LinearLayout laoyoutBack = ViewBindings.findChildViewById(rootView, id);
      if (laoyoutBack == null) {
        break missingId;
      }

      id = R.id.layout_add;
      LinearLayout layoutAdd = ViewBindings.findChildViewById(rootView, id);
      if (layoutAdd == null) {
        break missingId;
      }

      id = R.id.layout_bac;
      LinearLayout layoutBac = ViewBindings.findChildViewById(rootView, id);
      if (layoutBac == null) {
        break missingId;
      }

      id = R.id.layout_length;
      LinearLayout layoutLength = ViewBindings.findChildViewById(rootView, id);
      if (layoutLength == null) {
        break missingId;
      }

      id = R.id.layout_logo;
      LinearLayout layoutLogo = ViewBindings.findChildViewById(rootView, id);
      if (layoutLogo == null) {
        break missingId;
      }

      id = R.id.layout_weight;
      LinearLayout layoutWeight = ViewBindings.findChildViewById(rootView, id);
      if (layoutWeight == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new ActivityAddFoodBinding((RelativeLayout) rootView, back, calory, changefood,
          imageView2, laoyoutBack, layoutAdd, layoutBac, layoutLength, layoutLogo, layoutWeight,
          name, textView, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
