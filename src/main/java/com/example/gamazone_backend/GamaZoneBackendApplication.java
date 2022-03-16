package com.example.gamazone_backend;

import com.example.gamazone_backend.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class GamaZoneBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamaZoneBackendApplication.class, args);
    }

}
