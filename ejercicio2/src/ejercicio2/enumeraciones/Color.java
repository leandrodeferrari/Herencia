
package ejercicio2.enumeraciones;

public enum Color {
    
    BLANCO("blanco"), NEGRO("negro"), ROJO("rojo"), AZUL("azul"), GRIS("gris");
    
    private String color;

    private Color() {
    }

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
