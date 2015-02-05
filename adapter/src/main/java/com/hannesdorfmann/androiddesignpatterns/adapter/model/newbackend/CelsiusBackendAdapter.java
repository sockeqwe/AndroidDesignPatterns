package com.hannesdorfmann.androiddesignpatterns.adapter.model.newbackend;

import com.hannesdorfmann.androiddesignpatterns.adapter.model.oldbackend.OldWeatherBackend;

/**
 * @author Hannes Dorfmann
 */
public class CelsiusBackendAdapter extends OldWeatherBackend {

  private NewWeatherBackend newBackend;

  public CelsiusBackendAdapter(NewWeatherBackend newBackend) {
    this.newBackend = newBackend;
  }

  @Override public double getCurrentTemperatureCelsius() {
    double fahrenheit = newBackend.getCurrentTemperatureFahrenheit();
    double celsius = (fahrenheit - 32) * 5 / 9;
    return celsius;
  }
}
