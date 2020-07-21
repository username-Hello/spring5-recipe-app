package guru.springframework.Services;

import guru.springframework.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long id);
    
    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
