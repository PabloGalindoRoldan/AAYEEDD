**RESPUESTAS**

### 1.4

Como comparten una interfaz, en la utilización no se diferencian en absoluto. Sin embargo, al analizar sus implementaciones, la que utiliza listas enlazadas resulta un poco más compleja.

La lista de enteros sobre arreglos se estructura manipulando directamente el índice del elemento a incorporar o modificar. En cambio, la lista enlazada requiere recorrer la estructura para encontrar el nodo que se desea manipular.

### 1.6.A

Al ser una clase abstracta, admite que se le proporcione comportamiento (implementación) a ciertos métodos, el cual será heredado por las subclases. Sin embargo, como los métodos del ejercicio no están implementados, si no estuvieran declarados como abstractos, la clase podría haber sido directamente una interfaz.

### 1.6.B

* **Al principio:** Es una operación de complejidad $\mathcal{O}(1)$.
* **Al medio:** Es $\mathcal{O}(n)$, ya que en el peor de los casos se deben recorrer los nodos hasta la posición deseada.
* **Al final:** Es $\mathcal{O}(1)$, debido a que la lista mantiene una referencia al último nodo (`fin`). Una vez verificado el estado de la lista, se agrega el elemento al final y se actualiza el tamaño.

### 1.6.C

Normalmente, las listas comienzan su indexación en la posición $0$. Sin embargo, esto depende de la implementación elegida. En este caso particular, se utilizó la posición $1$ como base.

### 2.1

Sí, se podrían resolver los problemas del ejercicio 1. La lista genérica simplemente no define un tipo de dato concreto al ser declarada, sino que trabaja con un parámetro de tipo.

### 2.4.A

Al no estar definido un tipo de dato concreto en la lista genérica, no se pueden invocar métodos específicos de la clase `Estudiante` de forma directa. Por ello, se debe sobrescribir el método `toString()` en `Estudiante` para imprimir sus datos correctamente. De esta manera, la lista puede reutilizarse para cualquier tipo de objeto.

### 2.4.B

El nodo se define mediante un parámetro de tipo `T`, el cual adopta el tipo de dato con el que se instancia la estructura, y contiene una referencia a otro nodo del mismo tipo como `siguiente`. El nodo se instancia internamente al invocar métodos como `agregarFinal(T elem)` o cualquier otra variante de inserción.

### 2.4.C

El método `elemento(int pos)` devuelve el objeto almacenado en la posición solicitada. Por ejemplo, al ejecutar:

```

System.out.println(lista.elemento(3));

```

Se imprime por consola la representación en texto obtenida a través del método `toString()` del objeto ubicado en la tercera posición.

### 2.4.D

Se agregó el método abstracto `tusDatos()` en la clase base `ListaGenerica` y su correspondiente implementación en `ListaEnlazadaGenerica`. Asimismo, se completó la implementación del método requerido por la consigna.

### 4

Para verificar el balanceo de una expresión, es conveniente utilizar una estructura de datos tipo **Stack (Pila)**.