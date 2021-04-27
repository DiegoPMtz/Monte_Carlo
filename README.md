# Monte_Carlo
Programa que resuelve Integrales por el metodo de montecarlo

El programa solicita los datos para realizar una ecuacion simple, pide el argumento y la potencia seguido de la variable independiente de modo que el formato queda (x)X^y.

gracias a la funcion random se crean 10 numeros aleatorios y con estos tomando pares de numeros se calcula Xi y Y utilizando los valores a,b y M ingresados por el usuario.

Formula para calcular Xi = a + (1er numero pseudoaleatorio)(b-a).

Formula para calcular Y = (2do numero pseudoaleatorio)(M).

conseguidos estos numeros se utiliza Xi para calcular F(x) sustituyendo el valor de X en la funcion.

Se comprueba si Y<=F(x) en caso que lo sea, entonces a lado del resultado se muestra un SI, en caso contrario se mostrara un NO.
