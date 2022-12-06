package com.example.serviceshuffle.model;

import lombok.Data;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class Number {

    @NotNull
    @Min(1)
    @Max(1000)
    private int number;
}
