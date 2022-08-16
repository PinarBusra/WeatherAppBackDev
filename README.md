# WeatherAppBackDev
backend development of Weather App

# To run this backend project , you must copy git address from github. Then  download project using the address from ide you want .(I prefer IntelIJ idea 2022.2 version).
# After that you must add sdk in your ide. In IntelIJ idea, you  can add  sdk this path File->Project Settings -> Project ->Sdk.
#I prefer jdk 18 but you can use 11+.
#Then click run button for project.
# I add a sample from postman for request end respond.
-- Request
 get ->   http://localhost:8090/byCity/Turkey/Ankara
 
 --Response 
 
 {
    "coord": {
        "lon": 32.8543,
        "lat": 39.9199
    },
    "weather": [
        {
            "id": 800,
            "main": "Clear",
            "description": "clear sky",
            "icon": "01n"
        }
    ],
    "base": "stations",
    "main": {
        "temp": 297.24,
        "feels_like": 296.78,
        "temp_min": 294.9,
        "temp_max": 297.71,
        "pressure": 1012,
        "humidity": 41
    },
    "visibility": 10000,
    "wind": {
        "speed": 2.57,
        "deg": 330
    },
    "clouds": {
        "all": 0
    },
    "dt": 1660677832,
    "sys": {
        "type": 2,
        "id": 267643,
        "country": "TR",
        "sunrise": 1660618867,
        "sunset": 1660668300
    },
    "timezone": 10800,
    "id": 323786,
    "name": "Ankara",
    "cod": 200
}
