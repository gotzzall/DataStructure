function fact(n){
    //caso base
    //si se usa solo una línea, se pueden evitar las llaver
    //buscar disminuir la variable para que no sea infinito
    //Siempre se regresa el control a la funcion
    if (n==1) return 1;
    
    return n*fact(n-1);
}

