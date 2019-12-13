public class ArbolBinario {

	NodoArbol nodoRaiz;

	public ArbolBinario() {
		crearArbol();
	}

	// 1) Crear arbol
	public void crearArbol() {
		nodoRaiz = null;
	}


	public void agergarElemento(int dato) {
		NodoArbol nuevoNodo = new NodoArbol(dato);
		if (nodoRaiz == null) {
			nodoRaiz = nuevoNodo;
		} else {
			NodoArbol aux = nodoRaiz;
			NodoArbol nodoAnterior;
			while (aux != null) {
				nodoAnterior = aux;
				if (dato > aux.getDato()) { // derecha
					aux = aux.getNodoDer();
					if (aux == null)
						nodoAnterior.setNodoDer(nuevoNodo);
				} else { // izquierda
					aux = aux.getNodoIzq();
					if (aux == null)
						nodoAnterior.setNodoIzq(nuevoNodo);
				}
			}
		}
	}
	// metodo
		// R-I-D 7-3-1-14-9-37

	public void recorridoPreorden(NodoArbol nodoRaiz) {
		if (!(nodoRaiz == null)) {
			System.out.print(nodoRaiz.getDato() + " => ");
			recorridoPreorden(nodoRaiz.getNodoIzq());
			recorridoPreorden(nodoRaiz.getNodoDer());
		}
	}

	// I-R-D 1-3-7-9-14-37
	public void recorridoEnorden(NodoArbol nodoRaiz) {
		if (!(nodoRaiz == null)) {
			recorridoEnorden(nodoRaiz.getNodoIzq());
			System.out.print(nodoRaiz.getDato() + " => ");
			recorridoEnorden(nodoRaiz.getNodoDer());
		}
	}

	// I-D-R => 1-3-9-37-14-7
	public void recorridoPostorden(NodoArbol nodoRaiz) {
		if (!(nodoRaiz == null)) {
			recorridoPostorden(nodoRaiz.getNodoIzq());
			recorridoPostorden(nodoRaiz.getNodoDer());
			System.out.print(nodoRaiz.getDato() + " => ");
		}
	}

	public int mostrarDatoMayor() {
		int mayor = nodoRaiz.getDato();
		NodoArbol aux = nodoRaiz;
		while (aux != null) {
			if (mayor < aux.getDato()) {
				mayor = aux.getDato();
			}
			aux = aux.getNodoDer();
		}

		return mayor;

	}

	public int mostrarDatoMenor() {
		int menor = nodoRaiz.getDato();
		NodoArbol aux = nodoRaiz;
		while (aux != null) {
			if (menor > aux.getDato()) {
				menor = aux.getDato();
			}
			aux = aux.getNodoIzq();
		}

		return menor;
	}

	public boolean buscarDato(int dato) {
		NodoArbol aux = nodoRaiz;

		while (true) {
			
			if (aux.getDato() == dato) {

				return true;
			}
			if (dato <= aux.getDato()) {
				aux = aux.getNodoIzq();
			}else {
				aux = aux.getNodoDer();
			}
			
			if (aux == null) {
				break;
			}

		}
		return false;

	}

	public boolean eliminarNodo(int dato) {
		
		NodoArbol aux = nodoRaiz;
		NodoArbol anterior = null;
		while (true) {
			
			if (aux.getDato() == dato) {
				if (aux == nodoRaiz) {
					
				}
				anterior.setNodoDer(aux.getNodoDer());
				anterior.setNodoIzq(aux.getNodoIzq());
				aux=null;
				return true;
			}
			if (dato <= aux.getDato()) {
				anterior = aux;
				aux = aux.getNodoIzq();
			}else {
				anterior = aux;
				aux = aux.getNodoDer();
			}
			
			if (aux == null) {
				break;
			}

		}
		

		return false;
	}
		
	
}// class