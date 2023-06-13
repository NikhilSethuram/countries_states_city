package com.example.countriesjooq.repository;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.States;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StateRepository {

    @Autowired
    private DSLContext dslContext;

    public States getByID(String ID) {
        List<States> list1= dslContext.select().from(Tables.STATES).where(Tables.STATES.STATE_UUID.equal(ID))
                .fetchInto(States.class);
        return list1.get(0);
    }
}
