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
