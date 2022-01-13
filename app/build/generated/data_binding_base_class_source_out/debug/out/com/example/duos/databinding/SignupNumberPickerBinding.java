// Generated by view binder compiler. Do not edit!
package com.example.duos.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duos.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SignupNumberPickerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout signup02NpLinearLayoutLl;

  @NonNull
  public final NumberPicker signupNumberPickerDay;

  @NonNull
  public final NumberPicker signupNumberPickerMonth;

  @NonNull
  public final NumberPicker signupNumberPickerYear;

  private SignupNumberPickerBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout signup02NpLinearLayoutLl, @NonNull NumberPicker signupNumberPickerDay,
      @NonNull NumberPicker signupNumberPickerMonth, @NonNull NumberPicker signupNumberPickerYear) {
    this.rootView = rootView;
    this.signup02NpLinearLayoutLl = signup02NpLinearLayoutLl;
    this.signupNumberPickerDay = signupNumberPickerDay;
    this.signupNumberPickerMonth = signupNumberPickerMonth;
    this.signupNumberPickerYear = signupNumberPickerYear;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SignupNumberPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SignupNumberPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.signup_number_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SignupNumberPickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout signup02NpLinearLayoutLl = (LinearLayout) rootView;

      id = R.id.signup_number_picker_day;
      NumberPicker signupNumberPickerDay = ViewBindings.findChildViewById(rootView, id);
      if (signupNumberPickerDay == null) {
        break missingId;
      }

      id = R.id.signup_number_picker_month;
      NumberPicker signupNumberPickerMonth = ViewBindings.findChildViewById(rootView, id);
      if (signupNumberPickerMonth == null) {
        break missingId;
      }

      id = R.id.signup_number_picker_year;
      NumberPicker signupNumberPickerYear = ViewBindings.findChildViewById(rootView, id);
      if (signupNumberPickerYear == null) {
        break missingId;
      }

      return new SignupNumberPickerBinding((LinearLayout) rootView, signup02NpLinearLayoutLl,
          signupNumberPickerDay, signupNumberPickerMonth, signupNumberPickerYear);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
