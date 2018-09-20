/*
 * ProfileActivity
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


public class ProfileActivity extends AppCompatActivity {

	private TextView textViewTextView;
	private TextView registerTextView;
	private TextView addProfilePicTextView;
	private TextView completeProfileTextView;
	private View buttonCopyButton;

	public static Intent newIntent(Context context) {

		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, ProfileActivity.class);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.profile_activity);
		this.init();
	}

	private void init() {

		textViewTextView = this.findViewById(R.id.text_view_text_view);
		
		registerTextView = this.findViewById(R.id.register_text_view);
		
		addProfilePicTextView = this.findViewById(R.id.add_profile_pic_text_view);
		
		completeProfileTextView = this.findViewById(R.id.complete_profile_text_view);
		
		buttonCopyButton = this.findViewById(R.id.button_copy_button);
		// Configure Button Copy component
		buttonCopyButton.setOnClickListener(view -> {
			onButtonCopyPressed();
		});
		
		// Additional Activity initialization code can go here.
	}

	private void onButtonCopyPressed() {

		this.startMarketplaceActivity();
	}

	private void startMarketplaceActivity() {

		this.startActivity(MarketplaceActivity.newIntent(this));
	}
}
