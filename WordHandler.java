public class WordHandler {
    String text;
    public WordHandler(String text){
        this.text = text;
    }

    public int countWords() {
        int wordsQuantity = text.split("\\s").length;
        return wordsQuantity;
    }

    public int countCharacters() {
        int charactersQuantity = text.length();
        return charactersQuantity;
    }

    public int countCharactersJ() {
        int quantity = 0;
        for (int i = 0; i < this.text.length(); i++) {
            if (this.text.charAt(i) == 'j') {
                quantity++;
            }
        }
        return quantity;
    }

    public int countWordsOneFiveLetters() {
        String[] palavras = this.text.split("\\s+");
        int contador = 0;
        for (String palavra : palavras) {
            if (palavra.length() >= 1 && palavra.length() <= 5) {
                contador++;
            }
        }
        return contador;
    }


}
