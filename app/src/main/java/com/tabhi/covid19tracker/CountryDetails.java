package com.tabhi.covid19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class CountryDetails extends AppCompatActivity {
    private int countryPosition;

    TextView tvCountry,tvTotalCases,tvTodayCases,tvActive,tvTotalDeaths,tvTodayDeaths,tvRecovered,tvCritical,tvTotalTested,tvContinent,tvPopulation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);

        Intent intent = getIntent();
        countryPosition = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+ AffectedCountries.countryClassList.get(countryPosition).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvCountry = (TextView)findViewById(R.id.textViewDetailCountry);
        tvTotalCases = (TextView)findViewById(R.id.textViewTotalCountryCases);
        tvTodayCases = (TextView)findViewById(R.id.textViewTodayCountryCases);
        tvActive = (TextView)findViewById(R.id.textViewActiveCountryCases);
        tvTotalDeaths = (TextView)findViewById(R.id.textViewTotalCountryDeaths);
        tvTodayDeaths = (TextView)findViewById(R.id.textViewTodayCountryDeaths);
        tvRecovered = (TextView)findViewById(R.id.textViewRecoveredCountryCases);
        tvCritical = (TextView)findViewById(R.id.textViewCriticalCountryCases);
        tvTotalTested = (TextView)findViewById(R.id.textViewTotalTested);
        tvContinent = (TextView)findViewById(R.id.textViewCountryContinent);
        tvPopulation = (TextView)findViewById(R.id.textViewCountryPopulation);

        tvCountry.setText(AffectedCountries.countryClassList.get(countryPosition).getCountry());
        tvTotalCases.setText(AffectedCountries.countryClassList.get(countryPosition).getTotalcases());
        tvTodayCases.setText(AffectedCountries.countryClassList.get(countryPosition).getTodaycases());
        tvActive.setText(AffectedCountries.countryClassList.get(countryPosition).getActive());
        tvCritical.setText(AffectedCountries.countryClassList.get(countryPosition).getCritical());
        tvRecovered.setText(AffectedCountries.countryClassList.get(countryPosition).getRecovered());
        tvTotalDeaths.setText(AffectedCountries.countryClassList.get(countryPosition).getTotaldeaths());
        tvTodayDeaths.setText(AffectedCountries.countryClassList.get(countryPosition).getTodaydeaths());
        tvTotalTested.setText(AffectedCountries.countryClassList.get(countryPosition).getTotaltested());
        tvContinent.setText(AffectedCountries.countryClassList.get(countryPosition).getContinent());
        tvPopulation.setText(AffectedCountries.countryClassList.get(countryPosition).getPopulation());
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}