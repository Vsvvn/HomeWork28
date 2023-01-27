package vs.recipe.service;

public interface IngredientFileService {
    boolean saveToFile(String json);

    String readFromFile();

    boolean cleanDataFile();
}