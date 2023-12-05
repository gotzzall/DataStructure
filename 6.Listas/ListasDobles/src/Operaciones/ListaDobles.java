package Operaciones;

public class ListaDobles {

    private String nombre;
    private NodoListaDoble primerNodo;
    private NodoListaDoble ultimoNodo;

    public ListaDobles() {
        this("Mi lista");
    }

    public ListaDobles(String nombre) {
        this.nombre = nombre;
        primerNodo = ultimoNodo = null;
    }

    public boolean estaVaciaFrente() {
        return primerNodo == null;
    }

    public void insertarAlFrente(Object data) {
        if (this.estaVaciaFrente()) {
            this.primerNodo = this.ultimoNodo = new NodoListaDoble(data);
        } else {
            this.primerNodo.setAntNodo(new NodoListaDoble(data, null, this.primerNodo));
            this.primerNodo = this.primerNodo.getAntNodo();
        }
    }

    public void insertarAlFinal(Object data) {
        if (this.estaVaciaFrente()) {
            this.primerNodo = this.ultimoNodo = new NodoListaDoble(data);
        } else {
            this.ultimoNodo.setSigNodo(new NodoListaDoble(data, this.ultimoNodo, null));
            this.ultimoNodo = this.ultimoNodo.getSigNodo();
        }
    }

    public void insertearDondeSea(Object valorABuscar, Object valor) {
        NodoListaDoble aux = this.primerNodo;
        NodoListaDoble nodoAnterior;
        while (aux != null) {
            try {
                if (valorABuscar.equals(aux.getDato())) {
                    nodoAnterior = aux.getAntNodo();
                    aux.setAntNodo(null);
                    aux.setAntNodo(new NodoListaDoble(valor, nodoAnterior, aux));
                    aux.getAntNodo().getAntNodo().setSigNodo(aux.getAntNodo());
                }
            } catch (Exception ex) {

            }
            aux = aux.getSigNodo();
        }
    }

    public String imprimirPorIzquierda() {
        String mensaje = "";
        if (this.estaVaciaFrente()) {
            return this.nombre;
        }
        System.out.println(this.nombre);
        NodoListaDoble aux = this.primerNodo;
        while (aux != null) {
            mensaje += "<-" + aux.getDato() + "->";
            aux = aux.getSigNodo();
        }
        return mensaje;
    }

    public String imprimirPorDerecha() {
        String mensaje = "";
        if (this.estaVaciaFrente()) {
            return this.nombre;
        }
        System.out.println(this.nombre);
        NodoListaDoble aux = this.ultimoNodo;
        while (aux != null) {
            mensaje += "<-" + aux.getDato() + "->";
            aux = aux.getAntNodo();
        }
        return mensaje;
    }

    public void eliminarAlFrente() {
        NodoListaDoble aux = this.primerNodo.getSigNodo();
        aux.setAntNodo(null);
        this.primerNodo = aux;
    }

    public void eliminarAlFinal() {
        NodoListaDoble antes;
        NodoListaDoble despues;
        NodoListaDoble aux = this.ultimoNodo;
        antes = aux.getAntNodo();
        despues = aux.getSigNodo();
        this.ultimoNodo = null;
        this.ultimoNodo = antes;
        this.ultimoNodo.setSigNodo(despues);
    }
    
    public void eliminarDondeSea(Object dato)
    {
        NodoListaDoble ant;
        NodoListaDoble sig;
        NodoListaDoble aux = this.ultimoNodo;
        while (aux != null) {
            try {
                if (dato.equals(aux.getDato())) {
                    ant = aux.getAntNodo();
                    sig = aux.getSigNodo();
                    ant.setSigNodo(null);
                    sig.setAntNodo(null);
                    ant.setSigNodo(sig);
                    sig.setAntNodo(ant);
                }
            } catch (Exception ex) {

            }
            aux = aux.getAntNodo();
        }
        
    }

    private double conversor(Object data){
        if(data instanceof Integer){
            return (double)((int)data);
        }
        return (double)data;
    }

    public int nNodos() {
        int n = 1;
        NodoListaDoble aux = this.primerNodo;
        while (aux.getSigNodo() != null) {
            n++;
            aux = aux.getSigNodo();
        }
        return n;
    }

    
    public void ordenBurbujaAscendente() {
        int cantidadNodos = this.nNodos();
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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

    public void ordenBurbujaAscendenteMejorado() {
        int cantidadNodos = this.nNodos();
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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

    public void ordenBurbujaDescendentemejorado() {
        int cantidadNodos = this.nNodos();
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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

    public void ordenMergeAscendente() {
        int cantidadNodos = this.nNodos();
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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

    public void ordenMergeDescendente() {
        int cantidadNodos = this.nNodos();
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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

    public void ordenQuickSortAscendente() {
        int cantidadNodos = this.nNodos();
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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

    public void ordenQuickSortDescendente() {
        int cantidadNodos = this.nNodos();
        VectorOperacionesL2 obj = new VectorOperacionesL2(cantidadNodos);
        double[] auxVector = new double[cantidadNodos];
        NodoListaDoble aux = this.primerNodo;
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
    
    public String busquedaSecuencial(Object dato) {
        NodoListaDoble aux = this.primerNodo;
        while (aux != null) {
            if ((double)aux.getDato() == (double)dato) {
                return "dato : " + aux.getDato();
            }
            aux = aux.getSigNodo();
        }
        return "No se encontró el dato";
    }
}
