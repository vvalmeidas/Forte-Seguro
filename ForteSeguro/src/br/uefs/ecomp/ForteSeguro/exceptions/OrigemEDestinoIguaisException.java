/**
 * Componente Curricular: M�dulo Integrado de Programa��o
 * Autor: Valmir Vinicius
 * Autor: Iago Almeida
 * Data:  14/05/2016
 *
 * Declaro que este c�digo foi elaborado por mim de forma individual e
 * n�o cont�m nenhum trecho de c�digo de outro colega ou de outro autor, 
 * tais como provindos de livros e apostilas, e p�ginas ou documentos 
 * eletr�nicos da Internet. Qualquer trecho de c�digo de outra autoria que
 * uma cita��o para o  n�o a minha est� destacado com  autor e a fonte do
 * c�digo, e estou ciente que estes trechos n�o ser�o considerados para fins
 * de avalia��o. Alguns trechos do c�digo podem coincidir com de outros
 * colegas pois estes foram discutidos em sess�es tutorias.
 */
package br.uefs.ecomp.ForteSeguro.exceptions;

/**
 * Exce��o lan�ada ao tentar calcular um caminho m�nimo envolvendo destino e origem iguais.
 * 
 * @author Valmir Vinicius
 * @author Iago Almeida
 */
public class OrigemEDestinoIguaisException extends Exception {
   /**
    * Cria uma nova inst�ncia da exce��o com uma mensagem predefinida.
    */
    public OrigemEDestinoIguaisException() {
        super("O destino e a origem informados s�o iguais.");
    }
	
    /**
     * Cria uma nova inst�ncia da exce��o com uma mensagem predefinida e uma exce��o que a causou.
     * @param causa causa da exce��o
     */
    public OrigemEDestinoIguaisException(Throwable causa) {
	super("O destino e a origem informados s�o iguais.", causa);
    }
                
    
}
