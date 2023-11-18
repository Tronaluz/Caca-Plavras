public class Test {
    test('espera que a função contaPalavras retorne 5', () => {
 const texto = 'Este é um exemplo de texto';
 const palavras = contaPalavras(texto);
        expect(palavras).toBe(5);
    });

