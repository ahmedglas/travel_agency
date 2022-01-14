package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {
        Destination destination = new Destination("France", 21);

        @Test
        void country() {
                assertEquals(destination.country(), "France");
        }

        @Test
        void temperature() {
                assertEquals(destination.temperature(), 21);
        }
}
