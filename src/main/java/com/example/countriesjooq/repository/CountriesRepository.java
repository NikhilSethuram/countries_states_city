package com.example.countriesjooq.repository;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Countries;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountriesRepository {

    @Autowired
    private DSLContext dslContext;

    public List<Countries> getCountries() {
        return dslContext.selectFrom(Tables.COUNTRIES).fetchInto(Countries.class);
    }

    public Countries getByID(String ID) {
        List<Countries> list1= dslContext.select().from(Tables.COUNTRIES).where(Tables.COUNTRIES.COUNTRY_UUID.equal(ID))
                .fetchInto(Countries.class);
        return list1.get(0);
    }
}
