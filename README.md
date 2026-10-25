# Practica-3
ola

1.- Referencias e inmutabilidad de String
En cada instrucciòn primero compara si las cadenas son iguales 
en a == b da false porque el newString de b reserva espacio en memoria e ignora el StringPool de Java, aunque se llame igual que "a"
en a == c da true porque ambos Strings dan como resultado "Java" y esta guardado en el StringPool. "c" concatena "Ja" + "va" en el compilador antes de ejecutarlo
en a == d da false porque "d" primero es "Ja". En el StringPool, primero se guarda como "Ja", pero despues se expresa como d += va, como si fuera: d = d + "va"
pero esto da a lugar a que "a" no es la misma que "d".
El StringPool es una region en Java que guarda las cadenas ya creadas anteriormente y verifica si hay objetos de cadenas diferentes que comparten el mismo texto para
no crear duplicados y optimizar el uso de memoria y rendimiento.
La diferencia entre "==" y "equals()" es que el primero compara si dos variables apuntan al mismo espacio en memoria y en el caso de objetos String, da true si ambos
objetos apuntan a la misma referencia. equals() por otro lado solo compara el contendio de dos variables.

2.- Operaciones e índices en StringBuilder
Salidas:
E-A
3
21
delete (1, 4) no elimina cuatro caracteres, lo que hace es que solo elimina los indices del 1 al 3, el 4 es solo es excluyente basicamente.
length() regresa el numero de caracteres que estan en el objeto: E-A son tres caracteres.
capacity() es el espacio reservado en memoria para guardar texto en StringBuilder. El valor por defecto es 16, pero la cadena inicialmente era de 5, por lo que ahora se suman y da 21.

3.- Referencias Compartidas
Salidas:
mundo: Esta es la variable a, que al principio se inicializo como "Hola", despues se le hizo a.append(" mundo") para agregarle contenido a la variable: ahora se llama: Hola mundo. Dado que anteriormente se declaró a la variable b y se copio la misma referencia que la variable a, al hacer b.delete(0, 5), se eliminó todo el texto que iba desde el indice 0 hasta el indice 4.
mundo: Esta es la variable b que copia la misma referencia que la variable a.
Hola: Esta es la variable c, inicializada como un objeto completamente nuevo en la memoria, que ojo, no es la misma referencia que la variable a aunque contengan el mismo texto.
true: Apunta a la misma referencia en memoria
true: .equals() se comporta igual que == en el caso de objetos
false: a y c son direcciones diferentes en la memoria.

**El esquema esta en una foto del repositorio, el archivo se llama: "SchRefsShared.png"**

