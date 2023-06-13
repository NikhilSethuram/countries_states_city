package com.example.countriesjooq.model;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CitiesModel {
    private String stateUuid;
    private String cityUuid;
    private String cityname;
}
