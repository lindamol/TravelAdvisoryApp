package com.example.traveladvisoryapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonService {


/*   public ArrayList<Country> parseCountriesAPIJson(String jsonCities){
        //
        ArrayList<Country> allCountriesFromAPI = new ArrayList<>(0);
        try {//
            JSONArray jsonArray = new JSONArray(jsonCities);
            for (int i = 0 ; i< jsonArray.length(); i++){
//                String cityName = jsonArray.getString(i);
//                City newCity = new City(jsonArray.getString(i));
                allCountriesFromAPI.add(new Country(jsonArray.getString(i)));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return allCountriesFromAPI;
    }*/
public ArrayList<Country> parseCountriesAPIJson(String jsonCountries){
    ArrayList<Country> allCountriesFromAPI = new ArrayList<>(0);
    try {
        JSONArray jsonArray = new JSONArray(jsonCountries);
        for (int i = 0 ; i< jsonArray.length(); i++){ // Iterate through the whole array
            JSONObject jsonObject = jsonArray.getJSONObject(i);//From inside array I need to get each object
            String countryName = jsonObject.getString("name");//From each object,extract the string using key
            allCountriesFromAPI.add(new Country(countryName)); //Add to the ArrayList
        }
    } catch (JSONException e) {
        e.printStackTrace();
    }

    return allCountriesFromAPI;
}

//    public WeatherData parseWeatherAPIData(String jsonWeatherString){
//        WeatherData weatherData = new WeatherData();
//        try {
//            JSONObject jsonObject = new JSONObject(jsonWeatherString);// root
//            JSONArray weatherArray = jsonObject.getJSONArray("weather");
//            JSONObject weatherObject = weatherArray.getJSONObject(0);
//            String des = weatherObject.getString("description");
//            String icon = weatherObject.getString("icon");
//            JSONObject mainObject = jsonObject.getJSONObject("main");
//            Double temp = mainObject.getDouble("temp");
//            weatherData = new WeatherData(temp,des,icon);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        return  weatherData;
//    }

    //
}

