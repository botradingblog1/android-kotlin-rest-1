# Android Sample app for making REST calls with HttpsURLConnection and Kotlin Coroutines (Kotlin)

## Overview
This project is a sample app for exploring device sensors for my [blog post on justmobiledev.com](http://justmobiledev.com/exploring-device-sensors-with-kotlin/).
It implements asynchronous sensor data collection for light, temperature and gyroscope and displays the results.

## Supporting material
For a step-by-step tutorial, please see my [blog post on making REST calls with HttpURLConnection and Kotlin coroutines](https://mobiledeveloperblog.com/kickstart-making-rest-calls-with-kotlin-coroutines-in-android/).

## Getting Started
1. Cone the project from GitHub

```
	git clone https://github.com/justmobiledev/android-kotlin-rest-1.git
```
2. Build the project in AndroidStudio
3. Deploy on simulator or device.

## Versions used
* Android Studio 4.1.1
* Android API 29
* view model and livedata 2.2.0
* klaxon 5.0.1

## Implementation
* Configuring your app for making REST calls by setting the internet permission
* Use HttpsURLConnection to make a Get call
* Launch a HTTP request from a background thread using Kotlin coroutines
* Use ViewModel and LiveData to update the UI.

## Sample App Usage
1. Select the 'Fetch' button to launch a Get request
2. The response info is displayed in the UI.