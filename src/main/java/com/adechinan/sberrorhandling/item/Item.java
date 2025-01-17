package com.adechinan.sberrorhandling.item;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String body;
}
