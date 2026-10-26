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

6.- Eliminar caracteres duplicados
Para detectar caracteres repetidos, se utiliza el metodo resultado.indexOf(charString), el cual busca el caracter dentro del StringBuilder. Si devuelve -1, es que no ha aparecido el caracter y se le agrega con el metodo .append(). Si hay un caracter repetido, devuelve cualquier otro numero e ignora el duplicado
En si, el metodo .indexof() realiza varias busquedas sobre el StringBuilder, es decir, revisa los elementos uno por uno, pero este metodo esta dentro de un solo for, por lo que la solucion solo hace 1 recorrido.

10.- Editor de texto: clases y visibilidad

1. ¿Por qué los atributos del editor deben ser privados?
R: Para que cumplan con el encapsulamiento, y asi se evita que otras clases modifiquen las cadenas de texto

2. ¿Qué diferencia hay entre un método public y uno private?
R: Si un metodo es public, entonces se puede acceder a el desde cualquier otra clase.
Si es private, entonces solo es accesible dentro de la misma clase en la que fue declarado.

3. Si quitas public de un método, ¿qué acceso tiene y puede llamarlo PruebaEditor desde el mismo
paquete?
R: Si se quita el public, Java lo que hace es cambiar al acceso por defecto (package-private). 
Si, PruebaEditor puede llamarlo ya que este nivel de acceso permite que coexista dentro del mismo paquete

4. ¿En qué se diferencia el acceso de paquete de protected?
R: El acceso de paquete (package-private) solo permite la visibilidad a clases dentro del mismo paquete.
protected permite el acceso a otras clases del mismo paquete y a cualquier subclase en otros paquetes a traves de la herencia.