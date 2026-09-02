# Trabajo Práctico 2:

## Ejercicio 2:

2.a.- Los recorridos principales en profundidad para árboles generales son Preorden (se procesa la raíz y luego se
recorren recursivamente los subárboles de izquierda a derecha) y Postorden (se recorren recursivamente todos los
subárboles de izquierda a derecha y al final se procesa la raíz). Se puede hacer InOrder si se toma como el objeto de la
"izquierda" al primer hijo, después la raiz, y después la derecha.

2.b.- Es un recorrido a lo ancho (BFS - Breadth-First Search). Se visitan los nodos nivel por nivel, de arriba hacia
abajo y de izquierda a derecha dentro de cada nivel. Se suele implementar utilizando una cola.

2.c.- Sí existe diferencia en cuanto a la implementación, ya que en el árbol general la recursión no hace 2 llamadas
fijas (izquierda y derecha) como en el arbol binario, sino que itera sobre una lista o estructura de N hijos.

2.d.- Un árbol general puede ser ordenado o no (según si cumple un criterio de búsqueda sobre las claves), pero la
estructura posicional misma impone una secuencia entre los hermanos, por lo que tiene una nocion de "orden estructural",
entre los hermanos.

2.e.- En un arbol general el grado del nodo y del arbol puede ser variable, en un arbol binario el grado del arbol es 2
siempre. Todo Árbol Binario puede verse conceptualmente como un árbol general restringido a grado máximo 2 (aunque
formalmente un árbol binario no es un simple árbol general ordenado, ya que distingue explícitamente entre subárbol
izquierdo y subárbol derecho incluso si un nodo tiene un solo hijo).

