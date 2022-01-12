package com.naole.tacos;


import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Taco {

   @NotNull
   @Size(min = 5, message = "Name must be at least 5 characters long")
   private String designName;

   @NotNull
   @Size(min = 1, message = "You must choose at least 1 ingredient")
   private Set<Ingredient> ingredients;

   public void addIngredient(Ingredient ingredient) {
       this.ingredients.add(ingredient);
   }
}



