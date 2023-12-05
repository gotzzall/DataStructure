/*function secuencia(n){
    if (n == 1) 
    {
        return 1;    
    }
    else
    {
        return 1+secuencia(n-1);
    }
}

function elevadoAlCuadrado(n)
{

}*/

/*function operacionGrande(posicion, x)
{
    if (posicion == 0)
    {
        return 1;
    }
    else
    {
        return (Math.pow(x,(3/(secuencia(posicion)*3))))/((secuencia(posicion)+2)-2)+operacionGrande(posicion-1);
    }
}

console.log(operacionGrande(1,5));*/

function serieUno()
{
    n = 3;
    x = 3.0
    den1 = 3.0;
    den2 = 1.0;

    r = serieUnoCiclica(x, n, den1, den2)
    return 0.0;
}

function serieUnoCiclica(x, n, deno1, deno2)
{
    i = 1;
    do
    {
        r += (Math.pow(x, 3.0/deno1))/deno2
        den1+=3;
        deno2+=2;
        i++;
    }
    while(i <= n);
    return r;
}


/////////////////////////////////////////////////////////////////

function calcular(n, x, d1, d2)
{
    if (i == n)
    {
        return Math.pow(x,(3.0/d1))/d2;
    }
    else
    {
        return Math.pow(x, (3.0/d1))/d2 + calcular(n, x, d1+3, d2+2, i++);
    }
}