package Listas;

public class Listas {

    private String nombre;
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;

    public Listas() {
        this("Mi lista");
    }

    public Listas(String nombre) {
        this.nombre = nombre;
        primerNodo = ultimoNodo = null;
    }

    public int nNodos() {
        int n = 1;
        NodoLista aux = this.primerNodo;
        while (aux.getSigNodo() != null) {
            n++;
            aux = aux.getSigNodo();
        }
        return n;
    }

    public NodoLista getPrimerNodo() {
        return this.primerNodo;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public String imprimir() {
        String mensaje = "";
        if (this.estaVacia()) {
            System.out.println(this.nombre);
            return mensaje;
        }
        System.out.println(this.nombre);
        NodoLista aux = this.primerNodo;
        while (aux != null) {
            mensaje += "<-" + aux.getDato();
            aux = aux.getSigNodo();
        }
        return mensaje;
    }

    public void insertarAlFrente(Object dato) {
        if (this.estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(dato);
        } else {
            primerNodo = new NodoLista(dato, primerNodo);
        }
    }

    public void ingresarAlUltimo(Object dato) {
        if (this.estaVacia()) {
            primerNodo = ultimoNodo = new NodoLista(dato);
        } else {
            NodoLista aux = this.ultimoNodo;
            aux.setSigNodo(new NodoLista(dato));
            ultimoNodo = aux.getSigNodo();
        }
    }

    public void insertearDondeSea(Object dato, Object valor) {
        NodoLista aux = this.primerNodo;
        NodoLista prev;
        while (aux != null) {
            try {
                if (dato.equals(aux.getDato())) {
                    prev = aux.getSigNodo();
                    aux.setSigNodo(new NodoLista(valor));
                    aux.getSigNodo().setSigNodo(prev);
                }
            } catch (Exception ex) {

            }
            aux = aux.getSigNodo();
        }
    }

    public String busquedaSecuencial(Object dato) {
        NodoLista aux = this.primerNodo;
        while (aux != null) {
            if ((double)aux.getDato() == (double)dato) {
                return "dato : " + aux.getDato();
            }
            aux = aux.getSigNodo();
        }
        return "No se encontró el dato";
    }

    public void eliminarAlFrente() {
        NodoLista aux = this.primerNodo.getSigNodo();
        this.primerNodo = null;
        this.primerNodo = aux;
    }

    public void eliminarAlFinal() {
        NodoLista aux = this.primerNodo;
        if (aux.getSigNodo() != null) {
            while (aux.getSigNodo() != this.ultimoNodo) {
                aux = aux.getSigNodo();
            }
            aux.setSigNodo(null);
            aux = this.ultimoNodo;
        } else {
            aux = this.primerNodo.getSigNodo();
            this.primerNodo = null;
            this.primerNodo = aux;
        }

    }

    public void eliminarDondeSea(Object dato) {
        NodoLista aux = this.primerNodo;
        while (aux != null) {
            try {
                if(aux.getSigNodo() == null)
                {
                    this.eliminarAlFinal();
                }
                if (dato.equals(aux.getSigNodo().getDato())) {
                    NodoLista a = aux.getSigNodo().getSigNodo();
                    aux.setSigNodo(null);
                    aux.setSigNodo(a);
                }
            } catch (Exception ex) {

            }
            aux = aux.getSigNodo();
        }
    }

    public void eliminarPila(Object dato)
    {
        NodoLista aux = this.primerNodo;
        while (aux != null) {
            try {
                if (dato.equals(aux.getDato())) {
                    NodoLista anterior = aux.getSigNodo();
                    this.primerNodo = null;
                    this.primerNodo = anterior;
                }
            } catch (Exception ex) {

            }
            aux = aux.getSigNodo();
        }
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
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.ordenarBurbujaAscendenteMejoradoEnVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }

    public void ordenBurbujaDescendente() {
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.ordenarBurbujaDescendenteMejoradoEnVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }

    public void ordenBurbujaAscendenteMejorado(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.ordenarBurbujaAscendenteMejoradoEnVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }

    public void ordenBurbujaDescendentemejorado(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.ordenarBurbujaDescendenteMejoradoEnVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }

    public void ordenShellAscendente() {
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.ordenacionShellDelVectorAscendente();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }

    public void ordenShellDescendente() {
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.ordenacionShellDelVectorDescendente();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }

    public void ordenMergeAscendente(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.ordenacionMergeDelVectorAscendente();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }

    public void ordenMergeDescendente(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.ordenacionMergeDelVectorDescendente();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }

    public void ordenQuickSortAscendente(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.quickDelVector();
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }

    public void ordenQuickSortDescendente(){
        int cantidadNodos = this.nNodos();
        VectorOperaciones obj = new VectorOperaciones(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoLista aux = this.primerNodo;
        int indice = 0;
        while (aux != null) {
            if (indice < cantidadNodos) {
                auxVector[indice] = conversor(aux.getDato());
                indice++;
            }
            aux = aux.getSigNodo();
        }
        obj.copiarAlVector(auxVector);
        obj.quickSortDescending(obj.obtenerVector());
        indice = 0;
        auxVector = obj.obtenerVector();
        aux = this.primerNodo;
        while (aux != null) {
            if (indice < cantidadNodos) {
                aux.setDato(auxVector[indice]);
                indice++;
            }
            aux = aux.getSigNodo();
        }
    }
}
