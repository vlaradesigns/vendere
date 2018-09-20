/*
 * MarketplaceActivity
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


public class MarketplaceActivity extends AppCompatActivity {

	private TextView yourLocalMarketPlTextView;
	private View fill1Button;
	private TextView recentListingsTextView;
	private TextView vcd4321TextView;
	private TextView textViewTextView;
	private TextView sooyunTextView;
	private TextView artdeptTextView;
	private TextView titleTextView;
	private TextView descriptionTextView;
	private TextView vcd4321TwoTextView;
	private TextView textViewTwoTextView;
	private TextView sooyunTwoTextView;
	private TextView artdeptTwoTextView;
	private TextView titleTwoTextView;
	private TextView descriptionTwoTextView;
	private TextView vcd4321ThreeTextView;
	private TextView textViewThreeTextView;
	private TextView sooyunThreeTextView;
	private TextView artdeptThreeTextView;
	private TextView titleThreeTextView;
	private TextView descriptionThreeTextView;
	private TextView vcd4321FourTextView;
	private TextView textViewFourTextView;
	private TextView sooyunFourTextView;
	private TextView artdeptFourTextView;
	private TextView titleFourTextView;
	private TextView descriptionFourTextView;
	private View filterBtnButton;

	public static Intent newIntent(Context context) {

		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, MarketplaceActivity.class);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.marketplace_activity);
		this.init();
	}

	private void init() {

		yourLocalMarketPlTextView = this.findViewById(R.id.your_local_market_pl_text_view);
		
		fill1Button = this.findViewById(R.id.fill1_button);
		// Configure Fill 1 component
		fill1Button.setOnClickListener(view -> {
			onFill1Pressed();
		});
		
		recentListingsTextView = this.findViewById(R.id.recent_listings_text_view);
		
		vcd4321TextView = this.findViewById(R.id.vcd4321_text_view);
		
		textViewTextView = this.findViewById(R.id.text_view_text_view);
		
		sooyunTextView = this.findViewById(R.id.sooyun_text_view);
		
		artdeptTextView = this.findViewById(R.id.artdept_text_view);
		
		titleTextView = this.findViewById(R.id.title_text_view);
		
		descriptionTextView = this.findViewById(R.id.description_text_view);
		
		vcd4321TwoTextView = this.findViewById(R.id.vcd4321_two_text_view);
		
		textViewTwoTextView = this.findViewById(R.id.text_view_two_text_view);
		
		sooyunTwoTextView = this.findViewById(R.id.sooyun_two_text_view);
		
		artdeptTwoTextView = this.findViewById(R.id.artdept_two_text_view);
		
		titleTwoTextView = this.findViewById(R.id.title_two_text_view);
		
		descriptionTwoTextView = this.findViewById(R.id.description_two_text_view);
		
		vcd4321ThreeTextView = this.findViewById(R.id.vcd4321_three_text_view);
		
		textViewThreeTextView = this.findViewById(R.id.text_view_three_text_view);
		
		sooyunThreeTextView = this.findViewById(R.id.sooyun_three_text_view);
		
		artdeptThreeTextView = this.findViewById(R.id.artdept_three_text_view);
		
		titleThreeTextView = this.findViewById(R.id.title_three_text_view);
		
		descriptionThreeTextView = this.findViewById(R.id.description_three_text_view);
		
		vcd4321FourTextView = this.findViewById(R.id.vcd4321_four_text_view);
		
		textViewFourTextView = this.findViewById(R.id.text_view_four_text_view);
		
		sooyunFourTextView = this.findViewById(R.id.sooyun_four_text_view);
		
		artdeptFourTextView = this.findViewById(R.id.artdept_four_text_view);
		
		titleFourTextView = this.findViewById(R.id.title_four_text_view);
		
		descriptionFourTextView = this.findViewById(R.id.description_four_text_view);
		
		filterBtnButton = this.findViewById(R.id.filter_btn_button);
		// Configure filter_btn component
		filterBtnButton.setOnClickListener(view -> {
			onFilterBtnPressed();
		});
		
		// Additional Activity initialization code can go here.
	}

	private void onFilterBtnPressed() {


	}

	private void onFill1Pressed() {


	}
}
