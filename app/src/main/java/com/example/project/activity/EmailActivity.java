/*
 * EmailActivity
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


public class EmailActivity extends AppCompatActivity {

	private TextView whatSYourEmailAdTextView;
	private View buttonButton;

	public static Intent newIntent(Context context) {

		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, EmailActivity.class);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.email_activity);
		this.init();
	}

	private void init() {

		whatSYourEmailAdTextView = this.findViewById(R.id.what_syour_email_ad_text_view);
		
		buttonButton = this.findViewById(R.id.button_button);
		// Configure Button component
		buttonButton.setOnClickListener(view -> {
			onButtonPressed();
		});
		
		// Additional Activity initialization code can go here.
	}

	private void onButtonPressed() {

		this.startPasswordActivity();
	}

	private void startPasswordActivity() {

		this.startActivity(PasswordActivity.newIntent(this));
	}
}
