package Progra3_TPO.src;


public class AlgoritmosTP {
	
	//Método para obtener todos los vértices de un grafo
	public static int[] vertices(GrafoDinamic grafo) {
		int[] v = new int[grafo.cantidad];
		NodoGrafo n = grafo.nodo;
		for(int i=0; i<= grafo.cantidad-1; i++) {
			v[i]=n.valor;
			n=n.sig ;
		}
		return v;
	}
	
	//Método para obtener todos los vértices adyacentes a un vertice específicado
	public static NodoGrafo[] Adyacentes(GrafoDinamic grafo, int v) {
		//Obtengo todos los vértices del grafo
		int[] vertices = AlgoritmosTP.vertices(grafo);
		//Inicializo un nuevo arreglo de vértices en donde guardaré los adyacentes
		NodoGrafo[] ady = new NodoGrafo[grafo.cantidad];
		for(int i=0; i<ady.length; i++) {
			ady[i]=null;
		}
		//Recorro todos los vértices y si existe una arista que los conecte se agrega
		//el vértice al arreglo
		for(int i=0, j=0; i<vertices.length; i++) {
			if (grafo.existeArista(v, vertices[i])){
				ady[j] = grafo.encontrarNodo(vertices[i]);
				j++;
			}
		}
		return ady;
	}	
	
	//Método para recorrer el grafo en forma DFS (Bottom-Up)
	public static void RecorrerDFS(GrafoDinamic grafo, int o) {
		//Busco el nodo origen desde el cual se va a comenzar a recorrer
		NodoGrafo origen = grafo.encontrarNodo(o);
		origen.Visitado = true;
		//Obtengo todos los vértices adyacentes al origen
		NodoGrafo[] ady = AlgoritmosTP.Adyacentes(grafo, origen.valor);
		//Recorro los vértices adyacentes y ejecuto la función recursiva para
		//aquellos que no hayan sido visitados todavía
		for(int i=0; ady[i]!=null; i++) {
			if (!ady[i].Visitado) {
				RecorrerDFS(grafo, ady[i].valor);		
			} 
		}
		//marco al vértice recorrido y lo imprimo por pantalla
		if(!origen.marcado) {
			origen.marcado = true;
			System.out.print(" -> " + origen.valor);
		}
	}
	
	//método para buscar el recubrimiento de costo mínimo con PRIM
	public static GrafoDinamic recubrimientoPRIM(GrafoDinamic grafo) {
		//Genero un nuevo grafo para ir armando el recubrimiento
		GrafoDinamic gMin = new GrafoDinamic();
		gMin.inicializarGrafo(10);
		//Obtengo los vertices del grafo original
		int[] vertices = AlgoritmosTP.vertices(grafo);	
		//Recorro todos los vertices
		for(int i=0; i<vertices.length; i++) {		
			//Agrego el vertice al nuevo grafo
			gMin.agregarVertice(vertices[i]);
			//Obtengo los vertices adyacentes para localizar las aristas
			NodoGrafo[] ady = AlgoritmosTP.Adyacentes(grafo, vertices[i]);
			//Defino variables auxiliares
			int pesoAux = 99;
			int verticeAux = 99;
			//comparo los pesos de todas las aristas que conectan el vertice
			for(int j=0; ady[j]!=null; j++) {
				if(grafo.pesoArista(vertices[i],ady[j].valor) < pesoAux) {
					pesoAux = grafo.pesoArista(vertices[i],ady[j].valor);
					verticeAux = ady[j].valor;
				}
			}
			//Agrego el nuevo vértice al grafo y la arista de menor peso que lo conecta
			gMin.agregarVertice(verticeAux);
			if(!gMin.existeArista(vertices[i], verticeAux)) {
				gMin.agregarArista(vertices[i], verticeAux, pesoAux);
			}
		}
		return gMin;
	}	
	
}
