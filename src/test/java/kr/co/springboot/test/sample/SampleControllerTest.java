package kr.co.springboot.test.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@JsonTest
public class SampleControllerTest {

    @Autowired
    WebTestClient webTestClient;
//    JacksonTester<Sample>
//    WebTestClient webTestClient;
//    TestRestTemplate testRestTemplate;
//    MockMvc mockMvc;

    @MockBean
    SampleService mockSampleService;

    @Test
    public void hello() throws Exception {
//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("hello keesun"))
//                .andDo(print());

        when(mockSampleService.getName()).thenReturn("whiteship");

        webTestClient.get().uri("/").exchange().expectStatus().isOk()
                .expectBody(String.class).isEqualTo("hello whiteship");
//        String result = testRestTemplate.getForObject("/", String.class);
//        assertThat(result).isEqualTo("hello whiteship");
    }
}
