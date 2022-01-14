package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
        User user = new User("ahmed@saadi.fr", "Ahmed", "FR", User.WeatherExpectation.COLDER, 30);

        @Test
        void getUserName() {
                assertEquals(user.getUserName(), "Ahmed");
        }

        @Test
        void getUserEmail() {
                assertEquals(user.getUserEmail(), "ahmed@saadi.fr");
        }

        @Test
        void getUserCountry() {
                assertEquals(user.getUserCountry(), "FR");
        }

        @Test
        void getWeatherExpectation() {
                assertEquals(user.getWeatherExpectation(), User.WeatherExpectation.COLDER);
        }

        @Test
        void getMinimumTemperatureDistance() {
                assertEquals(user.getMinimumTemperatureDistance(), 30);
        }
}