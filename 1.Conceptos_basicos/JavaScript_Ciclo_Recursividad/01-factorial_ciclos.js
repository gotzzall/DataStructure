function factFor(n){
    let fact=1;
    for (let i = 1; i < n; i++) {
        fact*=i;
    }

    return fact;
}

const factForFlecha=(n)=>{
    let fact=1;
    for (let i = 1; i <= n; i++) {
        fact*=i;
    }

    return fact;
}

const factWhile=(n)=>{
    let fac=1;
    let con=1;
    while(con<=n){
        fac*=con;
        con+=1;
    }
}

const fac1=factFor(5);
const fact2=factForFlecha(10);
const fact3=factWhile(5);

const salida=`El factorial utilizando una función clásica es: ${fac1},
El factorial utilizando una función de flecha es: ${fact2},
El factorial utilizando while es: ${fact3}`;

console.log(salida);