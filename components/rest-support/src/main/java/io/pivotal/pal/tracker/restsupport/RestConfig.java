package io.pivotal.pal.tracker.restsupport;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestConfig {

//    @LoadBalanced
//    @Bean
//    public RestOperations restOperations() {
//        return new RestTemplate();
//    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //mapper.configure(DeserializationFeature. USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);

        return mapper;
    }
}
