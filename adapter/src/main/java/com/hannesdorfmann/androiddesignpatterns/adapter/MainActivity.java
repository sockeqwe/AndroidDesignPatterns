package com.hannesdorfmann.androiddesignpatterns.adapter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.hannesdorfmann.androiddesignpatterns.adapter.model.WeatherService;

public class MainActivity extends ActionBarActivity {

  private WeatherService weatherService = new WeatherService();

  @InjectView(R.id.temperature)
  TextView temperatureView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);

    double celsius = weatherService.getCurrentTemperature();
    temperatureView.setText(celsius+ " °C");
  }

}
