package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class DestinationControllerTest {

        @Test
        void test_getTravels_fail_user_does_not_exist(@Autowired MockMvc mockMvc) throws Exception {
                mockMvc
                        .perform(MockMvcRequestBuilders.get("/api/travels"))
                        .andExpect(MockMvcResultMatchers.status().is4xxClientError());
        }

        @Test
        void test_getTravels(@Autowired MockMvc mockMvc) throws Exception {
                User user = new User("ahmed@saadi.fr", "Ahmed", "FR", User.WeatherExpectation.WARMER, 20);

                mockMvc.perform(MockMvcRequestBuilders.post("/api/inscription").content(asJsonString(user)).contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
                mockMvc.perform(MockMvcRequestBuilders.get("/api/travels?userName=Ahmed")).andExpect(MockMvcResultMatchers.status().isOk());
        }

        public static String asJsonString(final Object obj) {
                try {
                        return new ObjectMapper().writeValueAsString(obj);
                } catch (Exception e) {
                        throw new RuntimeException(e);
                }
        }
}
