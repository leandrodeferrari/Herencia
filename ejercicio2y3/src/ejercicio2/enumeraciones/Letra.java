
package ejercicio2.enumeraciones;

public enum Letra {
    
    A('A'), B('B'), C('C'), D('D'), E('E'), F('F');

    private Letra() {
    }

    private Letra(char letra) {
        this.letra = letra;
    }
    
    private char letra;

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
}
