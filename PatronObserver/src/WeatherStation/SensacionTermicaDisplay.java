/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherStation;

/**
 *
 * @author JLuis
 */
public class SensacionTermicaDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public SensacionTermicaDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        
    }
    
}
