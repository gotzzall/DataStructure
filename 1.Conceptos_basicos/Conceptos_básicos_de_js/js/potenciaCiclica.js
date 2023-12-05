const btn = document.getElementById("calcular");
const dispaly = document.getElementById("resp");
//566446
//4564646

btn.addEventListener("click",()=>{
    let base = document.getElementById("numero").value;
    let exponente = document.getElementById("exponente").value;
    console.log(base,exponente);
});

function numeroExponente(number, exponent) {
    if (exponent == 1) 
    {
        return number;
    }
    else
    {
        return number*numeroExponente(number, (exponent-1));
    }
}

function numeroElevado(number, exponent){
    for (let i = 1; i <= exponent; i++) {
        number = number * i;
    }
}





//btn.addEventListener("click", potencia);


// hacer un ciclo recursivo en número y la pontencia y se debe de multiplicar

// 3^3 = 3*3*3     5^2 = 5*5