package vs.recipe.service;
public interface RecipeFileService {


    boolean saveToFile(String json);

    String readFromFile();

    boolean cleanDataFile();
}
