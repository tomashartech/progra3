package Progra3_TPO.src;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n##### ARMANDO GRAFO #####\n ");
		
		//Inicializo el grafo
		GrafoDinamic grafo = new GrafoDinamic();
		grafo.inicializarGrafo(5);
		
		//Agrego vertices al grafo
		grafo.agregarVertice(5);
		grafo.agregarVertice(4);
		grafo.agregarVertice(3);
		grafo.agregarVertice(2);
		grafo.agregarVertice(1);
		
		//verifico e imprimo los vertices del grafo
		System.out.println("Vertices: ");
		int[] vertices = AlgoritmosTP.vertices(grafo);
		for(int i=0; i<vertices.length; i++) {
			System.out.println(vertices[i]);
		}
		
		//Agrego aristas al grafo
		grafo.agregarArista(1, 2, 10);
		grafo.agregarArista(2, 1, 10);
		grafo.agregarArista(1, 3, 20);
		grafo.agregarArista(3, 1, 20);
		//grafo.agregarArista(1, 4, 10);
		//grafo.agregarArista(4, 1, 10);
		//grafo.agregarArista(1, 5, 10);
		//grafo.agregarArista(5, 1, 10);
		//grafo.agregarArista(2, 3, 10);
		//grafo.agregarArista(3, 2, 10);
		grafo.agregarArista(2, 4, 40);
		grafo.agregarArista(4, 2, 40);
		grafo.agregarArista(2, 5, 20);
		grafo.agregarArista(5, 2, 20);
		grafo.agregarArista(3, 5, 10);
		grafo.agregarArista(5, 3, 10);
		//grafo.agregarArista(4, 5, 10);
		//grafo.agregarArista(5, 4, 10);
		
		//verifico e imprimo las aristas entre cada vertice
		NodoGrafo[] ady;
		for(int i=0; i<vertices.length; i++) {
			ady = AlgoritmosTP.Adyacentes(grafo, vertices[i]);
			System.out.println("\nAristas de " + vertices[i] + ":");
			for(int j=0; ady[j]!=null; j++) {
				System.out.print(ady[j].valor +" ");
			}
		}		
		
		System.out.println("\n\n##### EJERCICIO 1 #####\n ");

		//recorrer el grafo en forma DFS especificando el origen
		System.out.println("Recorrer el grafo DFS: ");
		AlgoritmosTP.RecorrerDFS(grafo, 1);
		
		System.out.println("\n\n##### EJERCICIO 2 #####\n ");

		//generar un grafo de recubrumiento mínimo con PRIM
		System.out.println("Arbol de Recubrimiento Mínimo PRIM:\n ");
		GrafoDinamic prim = AlgoritmosTP.recubrimientoPRIM(grafo);
		
		//valido el nuevo grafo (vertices y aristas)
		System.out.println("Vertices: ");
		vertices = AlgoritmosTP.vertices(prim);
		for(int i=0; i<vertices.length; i++) {
			System.out.println(vertices[i]);
		}
		for(int i=0; i<vertices.length; i++) {
			ady = AlgoritmosTP.Adyacentes(prim, vertices[i]);
			System.out.println("\nAristas de " + vertices[i] + ":");
			for(int j=0; ady[j]!=null; j++) {
				System.out.print(ady[j].valor +" ");
			}
		}
	}

}
