package Operaciones;

public class ListasCirculares {

    private String nombre;
    private NodoListaCirculares primerNodo;
    private NodoListaCirculares ultimoNodo;

    public ListasCirculares() {
        this("Mi lista");
    }

    public ListasCirculares(String nombre) {
        this.nombre = nombre;
        this.primerNodo = this.ultimoNodo = null;
    }

    public int nNodos() {
        int n = 0;
        NodoListaCirculares aux = this.primerNodo;
        do{
            n++;
            aux = aux.getSigNodo();
        }while (aux != this.primerNodo);
        return n;
    }

    public NodoListaCirculares getPrimerNodo() {
        return this.primerNodo;
    }

    public boolean estaVacia() {
        return this.primerNodo == null;
    }

    public String imprimir() {
        String mensaje = "";
        if (this.estaVacia()) {
            System.out.println(this.nombre);
            return mensaje;
        }
        System.out.println(this.nombre);
        NodoListaCirculares aux = this.primerNodo;
        do{
            mensaje += aux.getDato() + "->";
            aux = aux.getSigNodo();
        }
        while (aux != this.primerNodo);
        return mensaje;
    }

    public void insertarAlFrente(Object dato) {
        if (this.estaVacia()) {
            this.primerNodo = this.ultimoNodo = new NodoListaCirculares(dato);
        } else {
            this.primerNodo = new NodoListaCirculares(dato, this.primerNodo);
            this.ultimoNodo.setSigNodo(this.primerNodo);
        }
    }

    public void ingresarAlUltimo(Object dato) {
        if (this.estaVacia()) {
            this.primerNodo = this.ultimoNodo = new NodoListaCirculares(dato);
        } else {
            NodoListaCirculares aux = this.ultimoNodo;
            aux.setSigNodo(new NodoListaCirculares(dato));
            this.ultimoNodo = aux.getSigNodo();
            this.ultimoNodo.setSigNodo(this.primerNodo);
        }
    }

    public void insertearDondeSea(Object dato, Object valor) {
        NodoListaCirculares aux = this.primerNodo;
        NodoListaCirculares prev;
        do{
            if (dato.equals(aux.getDato())) {
                prev = aux.getSigNodo();
                aux.setSigNodo(new NodoListaCirculares(valor));
                aux.getSigNodo().setSigNodo(prev);
            }
            aux = aux.getSigNodo();
        }while (aux != this.primerNodo);
    }

    public String busquedaSecuencial(Object dato) {
        NodoListaCirculares aux = this.primerNodo;
        do{
            if ((double)aux.getDato() == (double)dato) {
                return "dato : " + aux.getDato();
            }
            aux = aux.getSigNodo();
        }while (aux != this.primerNodo);
        return "No se encontró el dato";
    }

    public void eliminarAlFrente() {
        NodoListaCirculares aux = this.primerNodo.getSigNodo();
        this.primerNodo = null;
        this.primerNodo = aux;
        this.ultimoNodo.setSigNodo(this.primerNodo);
    }

    public void eliminarAlFinal() {
        NodoListaCirculares aux = this.primerNodo;
        do{
            if(aux.getSigNodo() == this.ultimoNodo)
            {
                this.ultimoNodo = aux;
                aux.setSigNodo(this.primerNodo);
                break;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void eliminarDondeSea(Object dato) {
        NodoListaCirculares aux = this.primerNodo;
        do{
            if (dato.equals(this.ultimoNodo.getDato())) {
                this.eliminarAlFinal();
                break;
            }
            if(dato.equals(this.primerNodo.getDato()))
            {
                this.eliminarAlFrente();
                break;
            }
            if (dato.equals(aux.getSigNodo().getDato())) {
                NodoListaCirculares a = aux.getSigNodo().getSigNodo();
                aux.setSigNodo(null);
                aux.setSigNodo(a);
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    private double conversor(Object data){
        if(data instanceof Integer){
            return (double)((int)data);
        }
        return (double)data;
    }

    public void ordenBurbujaAscendente() {
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.ordenarBurbujaAscendenteMejoradoEnVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void ordenBurbujaDescendente() {
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.ordenarBurbujaDescendenteMejoradoEnVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void ordenBurbujaAscendenteMejorado(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.ordenarBurbujaAscendenteMejoradoEnVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void ordenBurbujaDescendentemejorado(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.ordenarBurbujaDescendenteMejoradoEnVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void ordenShellAscendente() {
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.ordenacionShellDelVectorAscendente();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void ordenShellDescendente() {
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.ordenacionShellDelVectorDescendente();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void ordenMergeAscendente(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.ordenacionMergeDelVectorAscendente();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void ordenMergeDescendente(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.ordenacionMergeDelVectorDescendente();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void ordenQuickSortAscendente(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.quickDelVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }

    public void ordenQuickSortDescendente(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaCirculares aux = this.primerNodo;
        int indice = 0;
        do{
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
        obj.copiarAlVector(auxVector);
        obj.quickSortDescending(obj.obtenerVector());
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        do{
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }while (aux != primerNodo);
    }
}
