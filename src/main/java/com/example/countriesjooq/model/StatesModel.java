package com.example.countriesjooq.model;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StatesModel {
    private String countryUuid;
    private String stateUuid;
    private String statename;

}
