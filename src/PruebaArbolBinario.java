public class PruebaArbolBinario {

	public static void main(String[] args) {
		
		ArbolBinario ob =  new ArbolBinario();
		
		ob.agergarElemento(7);
		ob.agergarElemento(14);
		ob.agergarElemento(3);
		ob.agergarElemento(9);
		ob.agergarElemento(37);
		ob.agergarElemento(1);
		ob.agergarElemento(100);
		ob.recorridoPreorden(ob.nodoRaiz);//R-I-D  7-3-1-14-9-37
		System.out.println();
		ob.recorridoEnorden(ob.nodoRaiz);//I-R-D  1-3-7-9-14-37
		System.out.println();
		ob.recorridoPostorden(ob.nodoRaiz); //I-D-R => 1-3-9-37-14-7
		
		System.out.println();
		System.out.println(ob.mostrarDatoMayor());
		System.out.println(ob.mostrarDatoMenor());
		
		
		System.out.println(ob.buscarDato(100));
		
		System.out.println(ob.eliminarNodo(14));
		ob.recorridoPreorden(ob.nodoRaiz);
	}

}