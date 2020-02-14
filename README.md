# progra3

TP Obligatorio - Programaci�n 3 - UADE

Integrantes:
  - Tom�s Harte LU:1058032
  - Pedro Harte LU:1109413
  
Descripción:
- Se recibe una clase de Grafo implementada en Java.
- Se trabaj� exclusivamente con la implementaci�n de grafos por listas de adyacencia
- Se implementaron 2 algoritmos:
   - DFS: Recorrido de un grafo "bottom-up"
   - PRIM: Armado de un arbol de recubrimiento mínimo
   
Para la implementaci�n de los 2 algoritmos tuvimos que extender la clase de Grafo con los siguientes m�todos:
  - Vertices: 
    - Entrada: se recibe un Grafo.
    - Salida: se devuelve un arreglo de enteros con todos los vertices del grafo.
  - Adyacentes:
    - Entrada: Se recibe un Grafo y un Origen (vertice).
    - Salida: Se devuelven un arreglo de enteros con todos los vertices adyacentes al vertice origen proporcionado.
    
Algoritmos:

DFS:
  - Entrada: Se recibe un Grafo y un Origen (vertice) desde donde se iniciar� el recorrido del grafo.
  - Salida: El m�todo va recorriendo el grafo en forma recursiva y va imprimiendo en pantalla los v�rtices a medida que los va marcando.
  - Descripci�n:
  - Se localiza el v�rtice origen y se lo marca como "visitado".
  - Utilizando el m�todo "Adyacentes" se obtienen todos los v�rtices que est�n conectados con el nodo de origen.
  - Se recorren todos los v�rtices adyacentes y si todav�a no ha sido "visitado" se llama recursivamente al mismo m�todo pas�ndole como entrada el v�rtice actual como Origen.
        - Esto hace que la funci�n se vuelva a ejecutar para todos los adyacentes sucesivamente hasta que haya uno que no tiene m�s v�rtices por "visitar".
      - Se marca el origen como "marcado" y se imprime por pantalla.
      (al hacerse recursivamente se empieza a recorrer el grafo de forma "bottom-up").
  
PRIM: 
  - Entrada: Se recibe un Grafoo
  - Salida: Se genera un Grafo de Recubrimiento M�nimo en base al grafo proporcionado tomando en cuenta el peso de las aristas.
  - Descripci�n:
     - Se inicializa un nuevo grafo vac�o agregandole el primer v�rtice del grafo original.
     - Se van recorriendo todos los v�rtices del grafo original (siempre y cuando no est�n incluidos en el grafo nuevo).
     - Utilizando el m�todo de Adyacentes, se localizan los vertices adyacentes al nuevo grafo.
     - Por cada adyacente se obtienen las aristas y se van comparando los pesos de todas las aristas obtenidas hasta que nos quedamos con la de menor peso.
     - Se inserta el v�rtice adyacente que "gan�" (con la arista de menor peso) y se inserta la arista que lo conecta con el nuevo grafo.
     - Se repite el proceso con los dem�s v�rtices hasta que todos quedan conectados con el grafo nuevo.
     - Se retorna el nuevo Grafo de Recubrimiento m�nimo.
     
     
 Verificaci�n:
 
Se ejecuta el c�digo implementado desde una clase main en la que se utilizan tanto los m�todos de la clase Grafo prove�da como los m�todos desarrollados.
 - Se inicia generando un grafo insertandole:
    - 5 vertices {1,2,3,4,5}  (se imprimen los vertices por pantalla))
    - Aristas: 1-2; 1-3; 2-4; 2-5; 3-5; (se imprimen las aristas por pantalla)
 - Se ejecuta el algoritmo DFS pas�ndole el grafo como par�metro y el vertice 1 como el origen.
    - El algoritmo imprime como queda recorrido el grafo.
 - Se ejecuta el algoritmo PRIM pas�ndole el mismo grafo como par�metro.
    - Se devuelve el grafo de recubrimiento m�nimo.
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
 
