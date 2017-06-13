package com.spring.issues.entitygraph;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

@SpringBootApplication
@EnableJpaRepositories
public class TestConfiguration {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(H2).build();
    }
}
