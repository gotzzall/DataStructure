function facRec(n){
    if(n==0){
        return 0;
    }else{
        if(n==1){
            return 1;
        }else{
            return facRec(n-1)+facRec(n-2);
        }
    }
}

const salida=`El fivonacci de: ${facRec(7)}`;

console.log(salida);