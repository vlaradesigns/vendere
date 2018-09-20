/*
 * SplashScreenActivity
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


public class SplashScreenActivity extends AppCompatActivity {

	private TextView vendereTextView;

	public static Intent newIntent(Context context) {

		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, SplashScreenActivity.class);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.splash_screen_activity);
		this.init();
	}

	private void init() {

		vendereTextView = this.findViewById(R.id.vendere_text_view);
		
		// Additional Activity initialization code can go here.
	}
}
