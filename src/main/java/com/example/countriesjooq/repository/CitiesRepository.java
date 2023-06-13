package com.example.countriesjooq.repository;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Cities;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CitiesRepository {

    @Autowired
    private DSLContext dslContext;

    public Cities getByID(String ID) {
        List<Cities> list1= dslContext.select().from(Tables.CITIES).where(Tables.CITIES.CITY_UUID.equal(ID))
                .fetchInto(Cities.class);
        return list1.get(0);
    }
}
