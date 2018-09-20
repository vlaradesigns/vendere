/*
 * IntroActivity
 * VENDERE
 *
 * Created by Victor Lara.
 * Copyright © 2018 chumStudios. All rights reserved.
 */

package com.example.project.activity;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.project.R;
import java.util.*;
import android.widget.TextView;
import android.widget.Button;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v4.view.animation.PathInterpolatorCompat;


public class IntroActivity extends AppCompatActivity {

	private TextView welcomeToVendereTextView;
	private TextView anExclusiveMarketpTextView;
	private TextView logInTextView;
	private View signUpButton;
	private View buttonCopyButton;

	public static Intent newIntent(Context context) {

		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, IntroActivity.class);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.intro_activity);
		this.init();
	}

	private void init() {

		welcomeToVendereTextView = this.findViewById(R.id.welcome_to_vendere_text_view);
		
		anExclusiveMarketpTextView = this.findViewById(R.id.an_exclusive_marketp_text_view);
		
		logInTextView = this.findViewById(R.id.log_in_text_view);
		
		signUpButton = this.findViewById(R.id.sign_up_button);
		// Configure Sign Up component
		signUpButton.setOnClickListener(view -> {
			onSignUpPressed();
		});
		
		buttonCopyButton = this.findViewById(R.id.button_copy_button);
		// Configure Button Copy component
		buttonCopyButton.setOnClickListener(view -> {
			onButtonCopyPressed();
		});
		
		// Additional Activity initialization code can go here.
	}

	private void onButtonCopyPressed() {

		this.startAnimationGroupTwo();
		this.startEmailActivity();
	}

	private void onSignUpPressed() {


	}

	private void startEmailActivity() {

		this.startActivity(EmailActivity.newIntent(this));
	}

	private void startAnimationGroupOne() {

		startGroup1Animation1();
	}

	private void startGroup1Animation1() {

		Animator animator1 = AnimatorInflater.loadAnimator(this, R.animator.animation_group_one_animation_element_one);
		AnimatorSet animatorSet = new AnimatorSet();
		animatorSet.playTogether(animator1);
		animatorSet.setTarget(anExclusiveMarketpTextView);
		animatorSet.start();
	}

	private void startAnimationGroupTwo() {

		startGroup2Animation1();
	}

	private void startGroup2Animation1() {

		Keyframe kf1 = Keyframe.ofFloat(0.0f, 3000f);
		Keyframe kf2 = Keyframe.ofFloat(0.6f, -25f);
		Keyframe kf3 = Keyframe.ofFloat(0.75f, 10f);
		Keyframe kf4 = Keyframe.ofFloat(0.9f, -5f);
		Keyframe kf5 = Keyframe.ofFloat(1.0f, 0f);

		PropertyValuesHolder pvh1 = PropertyValuesHolder.ofKeyframe(View.TRANSLATION_Y, kf1, kf2, kf3, kf4, kf5);

		Animator animator1 = ObjectAnimator.ofPropertyValuesHolder(buttonCopyButton, pvh1);
		animator1.setDuration(1000);
		animator1.setInterpolator(PathInterpolatorCompat.create(0.215f, 0.61f, 0.61f, 1.0f));

		Keyframe kf6 = Keyframe.ofFloat(0.0f, 0f);
		Keyframe kf7 = Keyframe.ofFloat(0.6f, 1f);
		Keyframe kf8 = Keyframe.ofFloat(1.0f, 1f);

		PropertyValuesHolder pvh2 = PropertyValuesHolder.ofKeyframe(View.ALPHA, kf6, kf7, kf8);

		Animator animator2 = ObjectAnimator.ofPropertyValuesHolder(buttonCopyButton, pvh2);
		animator2.setDuration(1000);
		animator2.setInterpolator(PathInterpolatorCompat.create(0.215f, 0.61f, 0.61f, 1.0f));

		AnimatorSet animatorSet = new AnimatorSet();
		animatorSet.playTogether(animator1, animator2);
		animatorSet.setTarget(buttonCopyButton);
		animatorSet.start();
	}
}
