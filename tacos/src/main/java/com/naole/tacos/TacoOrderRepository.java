package com.naole.tacos;

import javax.validation.Valid;

import org.springframework.data.repository.CrudRepository;

public interface TacoOrderRepository extends CrudRepository<Ingredient, String> {

    void save(@Valid TacoOrder order);
    
}
