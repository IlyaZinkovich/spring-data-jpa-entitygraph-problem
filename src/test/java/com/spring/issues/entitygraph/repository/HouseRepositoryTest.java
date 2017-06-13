package com.spring.issues.entitygraph.repository;

import com.spring.issues.entitygraph.model.House;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseRepositoryTest {

    @Autowired
    private HouseRepository houseRepository;

    @Test
    @Sql(scripts = "/test-data.sql")
    public void test() {
        List<House> all = houseRepository.findAll();
        assertEquals(1, all.size());
    }

    @Test
    @Sql(scripts = "/test-data.sql")
    public void testQuery() {
        List<House> houses = houseRepository.findAllWithRoomsAndDoors();
        assertEquals(1, houses.size());
    }
}
