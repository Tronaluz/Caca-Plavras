import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordHandlerTest {

    @Test
    public void testCountWords() {
        WordHandler wordHandler = new WordHandler("Este é um exemplo de texto");
        assertEquals(5, wordHandler.countWords());
    }

    @Test
    public void testCountCharacters() {
        WordHandler wordHandler = new WordHandler("Este é um exemplo de texto");
        assertEquals(29, wordHandler.countCharacters());
    }

    @Test
    public void testCountCharactersJ() {
        WordHandler wordHandler = new WordHandler("Este é um exemplo de texto");
        assertEquals(1, wordHandler.countCharactersJ());
    }

    @Test
    public void testCountWordsOneFiveLetters() {
        WordHandler wordHandler = new WordHandler("Este é um exemplo de texto");
        assertEquals(3, wordHandler.countWordsOneFiveLetters());
    }
}
