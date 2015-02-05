package com.hannesdorfmann.androiddesignpatterns.adapter.model;

import com.hannesdorfmann.androiddesignpatterns.adapter.model.newbackend.CelsiusBackendAdapter;
import com.hannesdorfmann.androiddesignpatterns.adapter.model.newbackend.NewWeatherBackend;
import com.hannesdorfmann.androiddesignpatterns.adapter.model.oldbackend.OldWeatherBackend;

/**
 * A simple mock to simulate a weather service. It connects to a backend (mock).
 *
 * @author Hannes Dorfmann
 */
public class WeatherService {

  private OldWeatherBackend backend = new CelsiusBackendAdapter(new NewWeatherBackend());

  /**
   * Get the current weather
   */
  public double getCurrentTemperature() {
    return backend.getCurrentTemperatureCelsius();
  }
}
