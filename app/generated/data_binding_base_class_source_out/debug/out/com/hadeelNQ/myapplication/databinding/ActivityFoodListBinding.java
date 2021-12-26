// Generated by view binder compiler. Do not edit!
package com.hadeelNQ.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityFoodListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView changefood;

  @NonNull
  public final Button foodItemsEditButton;

  @NonNull
  public final ImageView foodItemsImg;

  @NonNull
  public final ImageView foodItemsImgDelete;

  @NonNull
  public final TextView foodItemsTvCalories;

  @NonNull
  public final TextView foodItemsTvCategory;

  @NonNull
  public final TextView foodItemsTvName;

  @NonNull
  public final LinearLayout laoyoutBack;

  @NonNull
  public final LinearLayout layoutApple;

  @NonNull
  public final LinearLayout layoutBanana;

  @NonNull
  public final LinearLayout layoutLogo;

  @NonNull
  public final LinearLayout layoutOrange;

  @NonNull
  public final LinearLayout layoutRice;

  @NonNull
  public final LinearLayout layoutSalmon;

  private ActivityFoodListBinding(@NonNull RelativeLayout rootView, @NonNull TextView changefood,
      @NonNull Button foodItemsEditButton, @NonNull ImageView foodItemsImg,
      @NonNull ImageView foodItemsImgDelete, @NonNull TextView foodItemsTvCalories,
      @NonNull TextView foodItemsTvCategory, @NonNull TextView foodItemsTvName,
      @NonNull LinearLayout laoyoutBack, @NonNull LinearLayout layoutApple,
      @NonNull LinearLayout layoutBanana, @NonNull LinearLayout layoutLogo,
      @NonNull LinearLayout layoutOrange, @NonNull LinearLayout layoutRice,
      @NonNull LinearLayout layoutSalmon) {
    this.rootView = rootView;
    this.changefood = changefood;
    this.foodItemsEditButton = foodItemsEditButton;
    this.foodItemsImg = foodItemsImg;
    this.foodItemsImgDelete = foodItemsImgDelete;
    this.foodItemsTvCalories = foodItemsTvCalories;
    this.foodItemsTvCategory = foodItemsTvCategory;
    this.foodItemsTvName = foodItemsTvName;
    this.laoyoutBack = laoyoutBack;
    this.layoutApple = layoutApple;
    this.layoutBanana = layoutBanana;
    this.layoutLogo = layoutLogo;
    this.layoutOrange = layoutOrange;
    this.layoutRice = layoutRice;
    this.layoutSalmon = layoutSalmon;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFoodListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFoodListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_food_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFoodListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.changefood;
      TextView changefood = ViewBindings.findChildViewById(rootView, id);
      if (changefood == null) {
        break missingId;
      }

      id = R.id.foodItems_edit_button;
      Button foodItemsEditButton = ViewBindings.findChildViewById(rootView, id);
      if (foodItemsEditButton == null) {
        break missingId;
      }

      id = R.id.foodItems_img;
      ImageView foodItemsImg = ViewBindings.findChildViewById(rootView, id);
      if (foodItemsImg == null) {
        break missingId;
      }

      id = R.id.foodItems_img_delete;
      ImageView foodItemsImgDelete = ViewBindings.findChildViewById(rootView, id);
      if (foodItemsImgDelete == null) {
        break missingId;
      }

      id = R.id.foodItems_tv_calories;
      TextView foodItemsTvCalories = ViewBindings.findChildViewById(rootView, id);
      if (foodItemsTvCalories == null) {
        break missingId;
      }

      id = R.id.foodItems_tv_category;
      TextView foodItemsTvCategory = ViewBindings.findChildViewById(rootView, id);
      if (foodItemsTvCategory == null) {
        break missingId;
      }

      id = R.id.foodItems_tv_name;
      TextView foodItemsTvName = ViewBindings.findChildViewById(rootView, id);
      if (foodItemsTvName == null) {
        break missingId;
      }

      id = R.id.laoyout_back;
      LinearLayout laoyoutBack = ViewBindings.findChildViewById(rootView, id);
      if (laoyoutBack == null) {
        break missingId;
      }

      id = R.id.layout_apple;
      LinearLayout layoutApple = ViewBindings.findChildViewById(rootView, id);
      if (layoutApple == null) {
        break missingId;
      }

      id = R.id.layout_banana;
      LinearLayout layoutBanana = ViewBindings.findChildViewById(rootView, id);
      if (layoutBanana == null) {
        break missingId;
      }

      id = R.id.layout_logo;
      LinearLayout layoutLogo = ViewBindings.findChildViewById(rootView, id);
      if (layoutLogo == null) {
        break missingId;
      }

      id = R.id.layout_orange;
      LinearLayout layoutOrange = ViewBindings.findChildViewById(rootView, id);
      if (layoutOrange == null) {
        break missingId;
      }

      id = R.id.layout_rice;
      LinearLayout layoutRice = ViewBindings.findChildViewById(rootView, id);
      if (layoutRice == null) {
        break missingId;
      }

      id = R.id.layout_salmon;
      LinearLayout layoutSalmon = ViewBindings.findChildViewById(rootView, id);
      if (layoutSalmon == null) {
        break missingId;
      }

      return new ActivityFoodListBinding((RelativeLayout) rootView, changefood, foodItemsEditButton,
          foodItemsImg, foodItemsImgDelete, foodItemsTvCalories, foodItemsTvCategory,
          foodItemsTvName, laoyoutBack, layoutApple, layoutBanana, layoutLogo, layoutOrange,
          layoutRice, layoutSalmon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
