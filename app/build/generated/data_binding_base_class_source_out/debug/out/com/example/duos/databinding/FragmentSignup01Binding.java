// Generated by view binder compiler. Do not edit!
package com.example.duos.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duos.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignup01Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText signup01PhoneNumberEt;

  @NonNull
  public final ImageView signup01PhoneNumberLineDoneIv;

  @NonNull
  public final ImageView signup01PhoneNumberLineIv;

  @NonNull
  public final TextView signup01PhoneNumberTv;

  @NonNull
  public final Button signup01PhoneNumberVerifyingBtn;

  @NonNull
  public final ImageView signup01PhoneNumberVerifyingCheckIv;

  @NonNull
  public final EditText signup01PhoneVerifyingEt;

  @NonNull
  public final ImageView signup01PhoneVerifyingLineIv;

  @NonNull
  public final TextView signup01PhoneVerifyingTimeTv;

  @NonNull
  public final TextView signup01PhoneVerifyingTv;

  @NonNull
  public final ImageView signupPhoneNumberEraseIv;

  private FragmentSignup01Binding(@NonNull ConstraintLayout rootView,
      @NonNull EditText signup01PhoneNumberEt, @NonNull ImageView signup01PhoneNumberLineDoneIv,
      @NonNull ImageView signup01PhoneNumberLineIv, @NonNull TextView signup01PhoneNumberTv,
      @NonNull Button signup01PhoneNumberVerifyingBtn,
      @NonNull ImageView signup01PhoneNumberVerifyingCheckIv,
      @NonNull EditText signup01PhoneVerifyingEt, @NonNull ImageView signup01PhoneVerifyingLineIv,
      @NonNull TextView signup01PhoneVerifyingTimeTv, @NonNull TextView signup01PhoneVerifyingTv,
      @NonNull ImageView signupPhoneNumberEraseIv) {
    this.rootView = rootView;
    this.signup01PhoneNumberEt = signup01PhoneNumberEt;
    this.signup01PhoneNumberLineDoneIv = signup01PhoneNumberLineDoneIv;
    this.signup01PhoneNumberLineIv = signup01PhoneNumberLineIv;
    this.signup01PhoneNumberTv = signup01PhoneNumberTv;
    this.signup01PhoneNumberVerifyingBtn = signup01PhoneNumberVerifyingBtn;
    this.signup01PhoneNumberVerifyingCheckIv = signup01PhoneNumberVerifyingCheckIv;
    this.signup01PhoneVerifyingEt = signup01PhoneVerifyingEt;
    this.signup01PhoneVerifyingLineIv = signup01PhoneVerifyingLineIv;
    this.signup01PhoneVerifyingTimeTv = signup01PhoneVerifyingTimeTv;
    this.signup01PhoneVerifyingTv = signup01PhoneVerifyingTv;
    this.signupPhoneNumberEraseIv = signupPhoneNumberEraseIv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignup01Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignup01Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_signup_01, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignup01Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.signup_01_phone_number_et;
      EditText signup01PhoneNumberEt = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneNumberEt == null) {
        break missingId;
      }

      id = R.id.signup_01_phone_number_line_done_iv;
      ImageView signup01PhoneNumberLineDoneIv = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneNumberLineDoneIv == null) {
        break missingId;
      }

      id = R.id.signup_01_phone_number_line_iv;
      ImageView signup01PhoneNumberLineIv = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneNumberLineIv == null) {
        break missingId;
      }

      id = R.id.signup_01_phone_number_tv;
      TextView signup01PhoneNumberTv = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneNumberTv == null) {
        break missingId;
      }

      id = R.id.signup_01_phone_number_verifying_btn;
      Button signup01PhoneNumberVerifyingBtn = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneNumberVerifyingBtn == null) {
        break missingId;
      }

      id = R.id.signup_01_phone_number_verifying_check_iv;
      ImageView signup01PhoneNumberVerifyingCheckIv = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneNumberVerifyingCheckIv == null) {
        break missingId;
      }

      id = R.id.signup_01_phone_verifying_et;
      EditText signup01PhoneVerifyingEt = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneVerifyingEt == null) {
        break missingId;
      }

      id = R.id.signup_01_phone_verifying_line_iv;
      ImageView signup01PhoneVerifyingLineIv = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneVerifyingLineIv == null) {
        break missingId;
      }

      id = R.id.signup_01_phone_verifying_time_tv;
      TextView signup01PhoneVerifyingTimeTv = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneVerifyingTimeTv == null) {
        break missingId;
      }

      id = R.id.signup_01_phone_verifying_tv;
      TextView signup01PhoneVerifyingTv = ViewBindings.findChildViewById(rootView, id);
      if (signup01PhoneVerifyingTv == null) {
        break missingId;
      }

      id = R.id.signup_phone_number_erase_iv;
      ImageView signupPhoneNumberEraseIv = ViewBindings.findChildViewById(rootView, id);
      if (signupPhoneNumberEraseIv == null) {
        break missingId;
      }

      return new FragmentSignup01Binding((ConstraintLayout) rootView, signup01PhoneNumberEt,
          signup01PhoneNumberLineDoneIv, signup01PhoneNumberLineIv, signup01PhoneNumberTv,
          signup01PhoneNumberVerifyingBtn, signup01PhoneNumberVerifyingCheckIv,
          signup01PhoneVerifyingEt, signup01PhoneVerifyingLineIv, signup01PhoneVerifyingTimeTv,
          signup01PhoneVerifyingTv, signupPhoneNumberEraseIv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
