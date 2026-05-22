public class ArbolBST {
    private NodoAnimal raiz;

    public ArbolBST() { 
        this.raiz = null; 
    }

    // === Método público de inserción ===
    public void insertar(int codigo, String raza, double peso, int edad) {
        NodoAnimal nuevo = new NodoAnimal(codigo, raza, peso, edad);
        if (this.raiz == null) {
            this.raiz = nuevo;
        } else {
            insertarRec(this.raiz, nuevo);
        }
    }

    // === Método privado recursivo de inserción ===
    private void insertarRec(NodoAnimal nodo, NodoAnimal nuevo) {
        if (nuevo.codigo < nodo.codigo) {
            if (nodo.izquierdo == null) {
                nodo.izquierdo = nuevo;
            } else {
                insertarRec(nodo.izquierdo, nuevo);
            }
        } else if (nuevo.codigo > nodo.codigo) {
            if (nodo.derecho == null) {
                nodo.derecho = nuevo;
            } else {
                insertarRec(nodo.derecho, nuevo);
            }
        }
    }

    // === Recorrido Inorden ===
    public void recorrerInorden() {
        if (raiz == null) {
            System.out.println("Inventario vacío.");
        } else {
            inordenRec(raiz);
        }
    }

    private void inordenRec(NodoAnimal n) {
        if (n != null) {
            inordenRec(n.izquierdo);
            System.out.println("Cód: " + n.codigo + " | Raza: " + n.raza + " | Peso: " + n.peso + "kg | Edad: " + n.edad + " meses");
            inordenRec(n.derecho);
        }
    }

    // === Búsqueda de un nodo por código de chapeta ===
    public NodoAnimal buscar(int codigo) {
        NodoAnimal actual = this.raiz;
        while (actual != null) {
            if (codigo == actual.codigo) {
                return actual;
            } else if (codigo < actual.codigo) {
                actual = actual.izquierdo;
            } else {
                actual = actual.derecho;
            }
        }
        return null; // Si no lo encuentra
    }

    // === Modificación de los datos de un nodo existente ===
    public boolean modificar(int codigo, double nuevoPeso, int nuevaEdad) {
        NodoAnimal nodo = buscar(codigo);
        if (nodo != null) {
            nodo.peso = nuevoPeso;
            nodo.edad = nuevaEdad;
            return true; // Se modificó con éxito
        }
        return false; // No se encontró la chapeta
    }
}
