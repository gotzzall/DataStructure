package Listas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Arrays;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

/**
 *
 * @author mr.gos
 */
public class VectorOperaciones {

    private double[] vector;
    private int longitud;

    // Constructor de la clase
    public VectorOperaciones(int tamanio) {
        vector = new double[tamanio];
        this.longitud = tamanio;
    }

    public double[] obtenerVector() {
        return vector;
    }

    // Obtiene la longitud del vector
    public int obtenerLongitud() {
        return this.longitud;
    }

    // Llena el vector
    public void llenarVector() {
        int i = 0;
        while (i < this.vector.length) {
            this.vector[i] = this.solicitarValor();
            i++;
        }
    }

    // Imprimir
    public String imprimirVector() {
        String cadena = "";
        for (double valor : this.vector) {
            cadena += valor + " | ";
        }
        return cadena;
    }

    // Impirmir vector, recibe un arreglo de parámetro
    public String imprimirVector(double[] valor) {
        String cadena = "";
        for (int i = 0; i < valor.length; i++) {
            cadena += valor[i] + " | ";
        }
        return cadena;
    }

    // Sumar los valores del arreglo
    public double sumarValoresDelVector() {
        double suma = 0.0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }

    public  String sumaDeVectores(double[] valor)
    {
        double[] resultado = new double[valor.length];
        for(int i = 0; i < valor.length; i++)
        {
            resultado[i] = valor[i]+vector[i];
        }
        return imprimirVector(resultado);
    }
    
    // Copiar arreglo sin retorno
    public void copiarAlVector(double[] vector) {
        for (int i = 0; i < this.vector.length; i++) {
            this.vector[i] = vector[i];
        }
    }

    // Busqueda secuencial, regresa un entero, la posición más 1
    public int busquedaSecuencialEnVector() {

        int buscador = -1;

            try {
                double numero = solicitarValor();
                for (int i = 0; i < vector.length; i++) {
                    if (vector[i] == numero) {
                        buscador = i + 1;
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un número entero");
            }
        return buscador;
    }

    private double solicitarValor() {
        boolean flag = true;
        double valor = 0;
        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor"));
                flag = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido");
            }
        } while (flag);
        return valor;
    }

    public void ordenarBurbujaAscendenteEnVector() {
        int tamanio = this.vector.length;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio - 1; j++) {
                if (this.vector[j] > this.vector[j + 1]) {
                    double temporal = this.vector[j];
                    this.vector[j] = this.vector[j + 1];
                    this.vector[j + 1] = temporal;
                }
            }
        }
    }

    public void ordenarBurbujaDescendenteEnVector() {
        int tamanio = this.vector.length;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio - 1; j++) {
                if (this.vector[j] < this.vector[j + 1]) {
                    double temporal = this.vector[j];
                    this.vector[j] = this.vector[j + 1];
                    this.vector[j + 1] = temporal;
                }
            }
        }
    }

    public void ordenarBurbujaAscendenteMejoradoEnVector() {
        int longitud = this.vector.length;
        boolean intercambio;

        for (int i = 0; i < longitud - 1; i++) {
            intercambio = false;
            for (int j = 0; j < longitud - 1 - i; j++) {
                if (this.vector[j] > this.vector[j + 1]) {
                    double temp = this.vector[j];
                    this.vector[j] = this.vector[j + 1];
                    this.vector[j + 1] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
    }

    public void ordenarBurbujaDescendenteMejoradoEnVector() {
        int longitud = this.vector.length;
        boolean intercambio;

        for (int i = 0; i < longitud - 1; i++) {
            intercambio = false;
            for (int j = 0; j < longitud - 1 - i; j++) {
                if (this.vector[j] < this.vector[j + 1]) {
                    double temp = this.vector[j];
                    this.vector[j] = this.vector[j + 1];
                    this.vector[j + 1] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
    }

    public int busquedaBinariaEnVector() {
        this.ordenarBurbujaAscendenteEnVector();
        double elemento = this.solicitarValor();
        int izquierda = 0;
        int derecha = longitud - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (vector[medio] == elemento) {
                return medio+1;
            }
            if (vector[medio] < elemento) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }

    public double promedioDelVector() {
        return this.sumarValoresDelVector() / (double) longitud;
    }

    public double modaDelVector() {
        this.ordenarBurbujaAscendenteEnVector();
        double moda = vector[0];
        int maxFrecuencia = 1;

        for (int i = 0; i < vector.length; i++) {
            double elementoActual = vector[i];
            int frecuenciaActual = 1;

            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] == elementoActual) {
                    frecuenciaActual++;
                }
            }

            if (frecuenciaActual > maxFrecuencia) {
                moda = elementoActual;
                maxFrecuencia = frecuenciaActual;
            }
        }

        return moda;
    }

    public double medianaDelVector() {
        this.ordenarBurbujaAscendenteEnVector();
        int n = this.longitud;
        if (n % 2 == 0) {
            int indiceMedio1 = n / 2 - 1;
            int indiceMedio2 = n / 2;
            return (vector[indiceMedio1] + vector[indiceMedio2]) / 2.0;
        } else {
            int indiceMedio = n / 2;
            return vector[indiceMedio];
        }
    }

    public double desviacionEstandarDelVector() {
        double promedio = this.promedioDelVector();
        double varianza = 0;
        double resultadoAlCuadrado = 0;
        for (int i = 0; i < longitud; i++) {
            varianza += Math.pow(vector[i] - promedio, 2);
        }
        resultadoAlCuadrado = (varianza / longitud);
        return Math.sqrt(resultadoAlCuadrado);
    }

    public void ordenacionMergeDelVectorAscendente() {
        ordenacionMergeSort(this.vector);
    }

    private void ordenacionMergeSort(double vec[]) {
        if (vec.length <= 1)
            return;
        int mitad = vec.length / 2;
        double izq[] = Arrays.copyOfRange(vec, 0, mitad);
        double der[] = Arrays.copyOfRange(vec, mitad, vec.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);
        combinarVector(vec, izq, der);
    }

    private void combinarVector(double v[], double izq[], double der[]) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < v.length; k++) {
            if (i >= izq.length) {
                v[k] = der[j];
                j++;
                continue;
            }
            if (j >= der.length) {
                v[k] = izq[i];
                i++;
                continue;
            }
            if (izq[i] < der[j]) {
                v[k] = izq[i];
                i++;
            } else {
                v[k] = der[j];
                j++;
            }
        }

    }
    
    public void ordenacionMergeDelVectorDescendente() {
        ordenacionMergeSortesDescendente(this.vector);
    }

    private void ordenacionMergeSortesDescendente(double vec[]) {
        if (vec.length <= 1)
            return;
        int mitad = vec.length / 2;
        double izq[] = Arrays.copyOfRange(vec, 0, mitad);
        double der[] = Arrays.copyOfRange(vec, mitad, vec.length);
        ordenacionMergeSortesDescendente(izq);
        ordenacionMergeSortesDescendente(der);
        combinarVectoresDescendente(vec, izq, der);
    }

    private void combinarVectoresDescendente(double v[], double izq[], double der[]) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < v.length; k++) {
            if (i >= izq.length) {
                v[k] = der[j];
                j++;
                continue;
            }
            if (j >= der.length) {
                v[k] = izq[i];
                i++;
                continue;
            }
            if (izq[i] > der[j]) {
                v[k] = izq[i];
                i++;
            } else {
                v[k] = der[j];
                j++;
            }
        }

    }

    public void ordenacionShellDelVectorAscendente() {

        int salto;
        double aux;
        int i;
        boolean cambios;

        for (salto = longitud / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < longitud; i++) 
                {
                    if (vector[i - salto] > vector[i]) { 
                        aux = vector[i]; 
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }
    
    public void ordenacionShellDelVectorDescendente() {

        int salto;
        double aux;
        int i;
        boolean cambios;

        for (salto = longitud / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < longitud; i++) 
                {
                    if (vector[i - salto] < vector[i]) { 
                        aux = vector[i]; 
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }

    public void quickDelVector()
    {
        quicksort(vector,0,longitud-1);
    }

    private void quicksort(double A[], int izq, int der) {

        double pivote = A[izq]; 
        int i = izq;
        int j = der;
        double aux;

        while (i < j) {
            while (A[i] <= pivote && i < j)
                i++;
            while (A[j] > pivote)
                j--; 
            if (i < j) {
                aux = A[i]; 
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j]; 
        A[j] = pivote;

        if (izq < j - 1)
            quicksort(A, izq, j - 1);
        if (j + 1 < der)
            quicksort(A, j + 1, der);
    }
    
    public void quickSortDescending(double[] arr) {
        quickSortDescending(arr, 0, arr.length - 1);
    }

    private void quickSortDescending(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionDescending(arr, low, high);
            quickSortDescending(arr, low, pivotIndex - 1);
            quickSortDescending(arr, pivotIndex + 1, high);
        }
    }

    private
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        int partitionDescending(double[] arr, int low, int high) {
        double pivot = arr[low];
        int i = low;
        for (int j = low + 1; j <= high; j++) {
            if (arr[j] > pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
        return i;
    }
}
