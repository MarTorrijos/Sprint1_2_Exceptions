
## Descripción

Ejercicios pensados para practicar el uso de exceptions en Java

### Tecnologias usadas

- Java 23

- IntelliJ


***

## Nivel 1

<br>

EJERCICIO 1:

Crea una clase llamada "Producto" con los atributos nombre y precio, y otra clase llamada "Venta". Esta clase tiene como atributos una colección de productos y el precio total de la venta.

La clase "Venta", tiene un método llamado calcularTotal() que lanza la excepción personalizada "VentaVaciaException" y muestra por pantalla “Para hacer una venta primero debes agregar productos” si la colección de productos está vacía. Si la colección tiene productos, entonces debe recorrer la colección y guardar la suma de todos los precios de los productos en el atributo precio total de la venta.

La excepción personalizada "VentaVaciaException" debe ser hija de la clase Exception. En su constructor debemos pasar el mensaje “Para hacer una venta primero debes agregar productos” y cuando capturemos la excepción, debemos mostrarla por pantalla con el método getMessage() de la excepción.

Escribe el código necesario para generar y capturar una excepción de tipo "IndexOutOfBoundsException".

***

## Nivel 2

<br>

EJERCICIO 1:

Crea una clase llamada "Entrada". Esta clase debe servir para controlar las diferentes excepciones que pueden aparecer en Java al introducir datos por teclado utilizando la clase Scanner.

Lo primero que se debe hacer es instanciar un objeto de la clase Scanner y a partir de aquí, crear métodos estáticos para leer los diferentes tipos de datos desde el teclado.

Importante

Es importante que si en algún método se lanza una excepción, la tratemos y volvamos a pedir el dato al usuario hasta que esté bien introducido. Por ejemplo: Si se introduce un float con un punto en lugar de una coma, debe mostrar “Error de formato”. Hasta que el usuario no introduce un float bien formateado, debe seguir pidiendo el dato.

Todos los métodos reciben un String con el mensaje que se quiere mostrar al usuario, por ejemplo: “Introduce tu edad”, y retornan el dato oportuno introducido por el usuario en cada método, por ejemplo: un byte con la edad del usuario.

<br>


***


## Cómo ejecutarlo
Clona el repositorio o descarga el archivo zip, luego ábrelo en tu entorno de desarrollo integrado (IDE) preferido.
