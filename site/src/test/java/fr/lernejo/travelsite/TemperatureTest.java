package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    Temperature temperature = new Temperature("2022-01-27", 9);

    @Test
    void getDate() {
        assertEquals(temperature.getDate(), "2022-01-27");
    }

    @Test
    void getTemperature() {
        assertEquals(temperature.getTemperature(), 9);
    }
}
