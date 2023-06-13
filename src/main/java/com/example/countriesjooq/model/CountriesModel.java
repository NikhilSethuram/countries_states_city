package com.example.countriesjooq.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountriesModel {
    private String countryUuid;
    private String name;
}
