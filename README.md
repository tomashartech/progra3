# progra3

TP Obligatorio - Programación 3 - UADE

Integrantes:
  - Tomás Harte LU:1058032
  - Pedro Harte LU:1109413
  
Descripción:
- Se recibe una clase de Grafo implementada en Java.
- Se implementaron 2 algoritmos:
   - DFS: Recorrido de un grafo "bottom-up"
   - PRIM: Armado de un arbol de recubrimiento mínimo
   
Para la implementación de los 2 algoritmos tuvimos que extender la clase de Grafo con los siguientes métodos:
  - Vertices: 
    - Entrada: se recibe un Grafo.
    - Salida: se devuelve un arreglo de enteros con todos los vertices del grafo.
  - Adyacentes:
    - Entrada: Se recibe un Grafo y un Origen (vertice).
    - Salida: Se devuelven un arreglo de enteros con todos los vertices adyacentes al vertice origen proporcionado.
    
Algoritmos:

DFS:
  - Entrada: Se recibe un Grafo y un Origen (vertice) desde donde se iniciará el recorrido del grafo.
  - Salida: El método va recorriendo el grafo en forma recursiva y va imprimiendo en pantalla los vértices a medida que los vá marcando.
  - Descripción:
      - Se localiza el vértice origen y se lo marca como "visitado".
      - Utilizando el método "Adyacentes" se obtienen todos los vértices que estén conectados con el nodo de origen.
      - Se recorren todos los vértices adyacentes y si todavía no ha sido "visitado" se llama recursivamente al mismo método pasándole como entrada el vértice actual como Origen.
        - Esto hace que la función se vuelva a ejecutar para todos los adyacentes sucesivamente hasta que haya uno que no tiene más vértices por "visitar".
      - Se marca el origen como "marcado" y se imprime por pantalla.
      (al hacerse recursivamente se empieza a recorrer el grafo de forma "bottom-up").
  
PRIM: 
  - Entrada: Se recibe un Grafo
  - Salida: Se genera un Grafo de Recubrimiento Mínimo en base al grafo proporcionado tomando en cuenta el peso de las aristas.
  - Descripción:
     - Se inicializa un nuevo grafo vacío agregandole el primer vértice del grafo original.
     - Se van recorriendo todos los vértices del grafo original (siempre y cuando no estén incluidos en el grafo nuevo).
     - Utilizando el método de Adyacentes, se localizan los vertices adyacentes al nuevo grafo.
     - Por cada adyacente se obtienen las aristas y se van comparando los pesos de todas las aristas obtenidas hasta que nos quedamos con la de menor peso.
     - Se inserta el vértice adyacente que ganó (con la arista de menor peso) y se inserta la arista que lo conecta con el nuevo grafo.
      - Se repite el proceso con los demás vértices hasta que todos quedan conectados con el grafo nuevo.
     - Se retorna el nuevo Grafo de Recubrimiento mínimo.
     
     
 Verificación:
 
Se ejecutó el código implementado desde una clase main en la que se utilizan tanto los métodos de la clase Grafo proveída como los métodos desarrollados.
 - Se inicia generando un grafo insertandole:
    - 5 vertices {1,2,3,4,5}  (se imprimen los vertices por pantalla)
    - Aristas: 1-2; 1-3; 2-4; 2-5; 3-5; (se imprimen las aristas por pantalla)
 - Se ejecuta el algoritmo DFS pasándole el grafo como parámetro y el vertice 1 como el origen.
    - El algoritmo imprime como queda recorrido el grafo.
 - Se ejecuta el algoritmo PRIM pasándole el mismo grafo como parámetro.
    - Se devuelve el grafo de recubrimiento mínimo.
    - Se imprime el nuevo grafo (vertices y aristas) para validarlo.
  
  Resultado devuelto por consola:
  ##### ARMANDO GRAFO #####
 
Vertices: 
1
2
3
4
5

Aristas de 1:
2 3 
Aristas de 2:
1 4 5 
Aristas de 3:
1 5 
Aristas de 4:
2 
Aristas de 5:
2 3 

##### EJERCICIO 1 #####
 
Recorrer el grafo DFS: 
 -> 4 -> 3 -> 5 -> 2 -> 1

##### EJERCICIO 2 #####
 
Arbol de Recubrimiento Mínimo PRIM:
 
Vertices: 
4
3
5
2
1

Aristas de 4:
2 
Aristas de 3:
5 
Aristas de 5:
3 2 
Aristas de 2:
4 5 1 
Aristas de 1:
2 
  
 FIN 
 
