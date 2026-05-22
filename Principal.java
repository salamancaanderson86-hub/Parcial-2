import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBST arbol = new ArbolBST();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n===========================================");
            System.out.println("  GanaderosCasanare S.A.S. - Inventario BST");
            System.out.println("===========================================");
            System.out.println("  1. Insertar un nuevo animal");
            System.out.println("  2. Modificar datos de un animal existente");
            System.out.println("  3. Consultar datos de un animal (por código)");
            System.out.println("  4. Listar inventario completo (recorrido inorden)");
            System.out.println("  5. Salir");
            System.out.println("-------------------------------------------");
            System.out.print("  Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Código chapeta: "); int cod = sc.nextInt(); sc.nextLine();
                    System.out.print("Raza: "); String raza = sc.nextLine();
                    System.out.print("Peso (kg): "); double peso = sc.nextDouble();
                    System.out.print("Edad (meses): "); int edad = sc.nextInt();
                    arbol.insertar(cod, raza, peso, edad);
                    System.out.println("Animal registrado exitosamente.");
                    break;
                case 2:
                    System.out.print("Código a modificar: "); int codMod = sc.nextInt();
                    System.out.print("Nuevo peso: "); double nPeso = sc.nextDouble();
                    System.out.print("Nueva edad: "); int nEdad = sc.nextInt();
                    if(arbol.modificar(codMod, nPeso, nEdad)) {
                        System.out.println("Datos actualizados.");
                    } else {
                        System.out.println("Error: Animal no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Código a buscar: "); int codBusq = sc.nextInt();
                    NodoAnimal encontrado = arbol.buscar(codBusq);
                    if(encontrado != null) {
                        System.out.println("Raza: " + encontrado.raza + " | Peso: " + encontrado.peso + "kg | Edad: " + encontrado.edad + " meses");
                    } else {
                        System.out.println("Animal no registrado.");
                    }
                    break;
                case 4:
                    System.out.println("--- Inventario Completo ---");
                    arbol.recorrerInorden();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
