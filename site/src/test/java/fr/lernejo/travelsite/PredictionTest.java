package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PredictionTest {
        Temperature temp = new Temperature("2022-01-27", 7);
        Temperature temp1 = new Temperature("2022-01-28", 9);
        List < Temperature > List = new ArrayList < Temperature > ();

        @Test
        void getCountry() {
                List.add(temp);
                List.add(temp1);
                Prediction prediction = new Prediction("France", List);

                assertEquals(prediction.getCountry(), "France");
        }

        @Test
        void getTemperatures() {
                List.add(temp);
                List.add(temp1);
                Prediction prediction = new Prediction("France", List);

                assertEquals(prediction.getTemperatures(), List);
        }
}