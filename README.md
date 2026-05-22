# Parcial 2 - Sistema de Inventario Ganadero (BST)
# Anderson Arley Salamanca Jarro

Este repositorio contiene la solución desarrollada para el segundo parcial de la asignatura de Estructuras de Datos. Consiste en una implementación nativa en Java de un **Árbol Binario de Búsqueda (BST)**, diseñado para optimizar la gestión del inventario de reses de la empresa *GanaderosCasanare S.A.S.*

El objetivo principal de esta evaluación es resolver los problemas de rendimiento ocasionados por el uso de estructuras de almacenamiento lineal. Al migrar el sistema a un árbol binario, se demuestra una mejora significativa en la eficiencia de las operaciones de búsqueda, inserción y modificación de registros, logrando una complejidad temporal promedio de `O(log n)`.

## Funcionalidades del Sistema

El programa se ejecuta mediante consola y expone un menú interactivo con las siguientes operaciones solicitadas en el caso de estudio:

- **Insertar un nuevo animal:** Registra una res en el sistema utilizando el código numérico de su chapeta electrónica como clave de ordenamiento (nodo). Además, almacena atributos como raza, peso y edad.
  
  <img width="407" height="187" alt="image" src="https://github.com/user-attachments/assets/a9e63079-0f84-4d0b-8cca-fde5fbf49dde" />

- **Modificar datos:** Permite localizar rápidamente a un animal mediante su código para actualizar sus métricas dinámicas (peso y edad).
  
  <img width="391" height="162" alt="image" src="https://github.com/user-attachments/assets/4853e0e4-1694-407c-b593-e50b4eab4008" />
  

- **Consultar un animal:** Realiza una búsqueda binaria por el código de chapeta y retorna la información detallada del animal de manera inmediata.
  
  <img width="425" height="121" alt="image" src="https://github.com/user-attachments/assets/a0307d53-e20e-4ba8-bddf-c260ea98812c" />
  

- **Listar el inventario completo:** Ejecuta un recorrido *Inorden* sobre el árbol para imprimir todos los registros organizados de forma ascendente según su identificador.
  
  <img width="510" height="141" alt="image" src="https://github.com/user-attachments/assets/8d1eb0fc-fc36-4e7a-9fe1-b23ceeeb18f3" />

## Menu Principal
  <img width="534" height="189" alt="image" src="https://github.com/user-attachments/assets/ad0ac25c-db61-4146-87bc-37be3d1052fb" />


## Tecnologías y Conceptos Aplicados
* **Java:** Programación orientada a objetos y uso de algoritmos recursivos.
* **Estructuras de Datos Dinámicas:** Construcción de la clase Nodo y la lógica del árbol desde cero, prescindiendo de librerías externas.
* **Interfaz en Consola:** Manejo de entradas y validaciones básicas utilizando la clase `Scanner`.

## Ejecución 
- El codigo se ejecuta por medio de la clase **Principal.java**
