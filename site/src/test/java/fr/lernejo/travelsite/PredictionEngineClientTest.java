package fr.lernejo.travelsite;



import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import org.mockito.Mockito;


class PredictionEngineClientTest {
        Temperature temp = new Temperature("2022-01-27", 7);
        Temperature temp1 = new Temperature("2022-01-28", 9);
        List < Temperature > List = new ArrayList < Temperature > ();

        @Test
        void getPrediction() {
                List.add(temp);
                List.add(temp1);
                Prediction expectedPrediction = new Prediction("France", List);

                Response < Prediction > expectedResponse = Response.success(expectedPrediction);
                Call < Prediction > call = Mockito.mock(Call.class);
        }
}