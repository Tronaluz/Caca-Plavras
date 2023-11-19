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
        WordHandler wordHandler = new WordHandler("Não tenha medo de assumir que há matérias na faculdade que você não gostou ou que, simplesmente, não se saiu tão bem assim. Como vimos, a faculdade é apenas um pedacinho do iceberg e há muitos caminhos para cada um. Você pode não gostar tanto assim de programação e simplesmente amar qualquer outra área, é normal. Apenas entenda que isso não será um bixo de 7 cabeças e avante!");
        assertEquals(150, wordHandler.countCharacters());
    }

    @Test
    public void testCountCharactersJ() {
        WordHandler wordHandler = new WordHandler("Quem não passou pela pressão que a faculdade impõe, não está a vivenciando direito. Mas saiba seus limites, respire fundo e, como disse acima, vá no seu tempo. Não tente conciliar, por exemplo, um estágio, duas graduações, uma especialização, certificação e inglês tudo ao mesmo tempo. Assuma seus limites e vá, novamente, em seu tempo. Tá tudo bem em ir devagar também.");
        assertEquals(2, wordHandler.countCharactersJ());
    }

    @Test
    public void testCountWordsOneFiveLetters() {
        WordHandler wordHandler = new WordHandler("Cada um possui suas afinidades e não é por que alguém foi para determinada área que você também se dará bem. O tenha simplesmente como um exemplo de força e determinação, mas não se deixe moldar pelos gostos particulares de ninguém.");
        assertEquals(6, wordHandler.countWordsOneFiveLetters());
    }
}
