/*
 * PasswordActivity
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


public class PasswordActivity extends AppCompatActivity {

	private TextView chooseAPasswordTextView;
	private TextView registerCopyTextView;
	private View buttonCopy2Button;

	public static Intent newIntent(Context context) {

		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, PasswordActivity.class);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.password_activity);
		this.init();
	}

	private void init() {

		chooseAPasswordTextView = this.findViewById(R.id.choose_apassword_text_view);
		
		registerCopyTextView = this.findViewById(R.id.register_copy_text_view);
		
		buttonCopy2Button = this.findViewById(R.id.button_copy2_button);
		// Configure Button Copy 2 component
		buttonCopy2Button.setOnClickListener(view -> {
			onButtonCopy2Pressed();
		});
		
		// Additional Activity initialization code can go here.
	}

	private void onButtonCopy2Pressed() {

		this.startProfileActivity();
	}

	private void startProfileActivity() {

		this.startActivity(ProfileActivity.newIntent(this));
	}
}
