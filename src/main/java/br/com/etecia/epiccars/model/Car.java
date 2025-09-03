package br.com.etecia.epiccars.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Long id;
    private String title;
    private String description;
    private String img;
    private int value;
    private Boolean status;
}
