import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordHandlerTest {

    @Test
    public void testCountWords() {
        WordHandler wordHandler = new WordHandler("Mas afinal, o que é Sistemas de Informação? Bacharelado em Sistemas de Informação é o curso que mais se assemelha à Ciências da Computação, trazendo uma forte diferença: há mais disciplinas ligadas à administração e gestão de negócios.");
        assertEquals(14, wordHandler.countWords());
    }

    @Test
    public void testCountCharacters() {
        WordHandler wordHandler = new WordHandler("Mas afinal, o que é Sistemas de Informação? Bacharelado em Sistemas de Informação é o curso que mais se assemelha à Ciências da Computação, trazendo uma forte diferença: há mais disciplinas ligadas à administração e gestão de negócios.");
        assertEquals(150, wordHandler.countCharacters());
    }

    @Test
    public void testCountCharactersJ() {
        WordHandler wordHandler = new WordHandler("Mas afinal, o que é Sistemas de Informação? Bacharelado em Sistemas de Informação é o curso que mais se assemelha à Ciências da Computação, trazendo uma forte diferença: há mais disciplinas ligadas à administração e gestão de negócios.");
        assertEquals(2, wordHandler.countCharactersJ());
    }

    @Test
    public void testCountWordsOneFiveLetters() {
        WordHandler wordHandler = new WordHandler("Mas afinal, o que é Sistemas de Informação? Bacharelado em Sistemas de Informação é o curso que mais se assemelha à Ciências da Computação, trazendo uma forte diferença: há mais disciplinas ligadas à administração e gestão de negócios.");
        assertEquals(6, wordHandler.countWordsOneFiveLetters());
    }
}
