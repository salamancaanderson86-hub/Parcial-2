// Archivo: NodoAnimal.java
public class NodoAnimal {
    // === Atributos ===
    int codigo;
    String raza;
    double peso;
    int edad;
    NodoAnimal izquierdo;
    NodoAnimal derecho;

    // === Constructor ===
    public NodoAnimal(int codigo, String raza, double peso, int edad) {
        this.codigo = codigo;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.izquierdo = null;
        this.derecho = null;
    }

    // === Getters y Setters ===
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    
    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }
    
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}

