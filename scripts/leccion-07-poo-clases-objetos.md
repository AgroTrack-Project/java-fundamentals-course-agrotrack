# Script - Lección 7: Clases, Objetos, Constructores y Métodos

## Introducción

En esta lección vamos a empezar con uno de los temas más importantes de Java: la programación orientada a objetos, también conocida como POO.

Hasta ahora hemos trabajado con variables, condicionales, bucles y métodos. Pero cuando queremos representar elementos del mundo real, como un estudiante, una mascota, un producto o un personaje de videojuego, necesitamos una forma más ordenada de agrupar sus datos y acciones.

Para eso usamos clases y objetos.

## ¿Qué es una clase?

Una clase es como un molde o una plantilla.

Por ejemplo, si queremos representar a un estudiante, podemos pensar que todo estudiante tiene datos como nombre, edad y grado.

En Java, esa idea se puede convertir en una clase llamada `Estudiante`.

```java
class Estudiante {
    String nombre;
    int edad;
    String grado;
}
```

En este ejemplo, `Estudiante` es la clase.

Dentro de la clase hemos colocado tres atributos:

- `nombre`, que es de tipo `String`.
- `edad`, que es de tipo `int`.
- `grado`, que también es de tipo `String`.

Los atributos son características que tendrá cada objeto creado a partir de esta clase.

## ¿Qué es un objeto?

Un objeto es una versión real creada a partir de una clase.

Si la clase `Estudiante` es el molde, entonces podemos crear estudiantes concretos, por ejemplo:

```java
Estudiante estudiante1 = new Estudiante();
```

Aquí estamos creando un objeto llamado `estudiante1`.

Sin embargo, todavía hay un problema: el estudiante existe, pero sus datos están vacíos.

Para asignarle valores, podríamos hacerlo así:

```java
estudiante1.nombre = "Ana";
estudiante1.edad = 16;
estudiante1.grado = "Quinto de secundaria";
```

Con esto, el objeto `estudiante1` ya tiene información.

El problema es que si tenemos muchos estudiantes, escribir cada dato por separado puede volverse repetitivo.

Para resolver eso usamos un constructor.

## ¿Qué es un constructor?

Un constructor es una parte especial de la clase que se ejecuta cuando creamos un objeto.

Sirve para darle valores iniciales al objeto desde el primer momento.

Por ejemplo, podemos crear un constructor para la clase `Estudiante`.

```java
class Estudiante {
    String nombre;
    int edad;
    String grado;

    Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }
}
```

El constructor tiene el mismo nombre que la clase: `Estudiante`.

Dentro de los paréntesis recibe tres datos:

```java
String nombre, int edad, String grado
```

Estos datos llegan desde el momento en que creamos el objeto.

Luego usamos `this` para guardar esos valores en los atributos del objeto.

Por ejemplo:

```java
this.nombre = nombre;
```

Esto significa: el atributo `nombre` de este objeto recibirá el valor del parámetro `nombre`.

Gracias al constructor, ahora podemos crear un estudiante directamente con sus datos.

```java
Estudiante estudiante1 = new Estudiante("Ana", 16, "Quinto de secundaria");
```

## Crear más de un objeto

Una de las ventajas de las clases es que podemos crear varios objetos usando el mismo molde.

Por ejemplo:

```java
Estudiante estudiante1 = new Estudiante("Ana", 16, "Quinto de secundaria");
Estudiante estudiante2 = new Estudiante("Luis", 15, "Cuarto de secundaria");
```

Ambos objetos son de tipo `Estudiante`.

La diferencia es que cada uno tiene sus propios datos.

`estudiante1` representa a Ana, mientras que `estudiante2` representa a Luis.

## ¿Qué es un método dentro de una clase?

Además de atributos, una clase también puede tener métodos.

Un método representa una acción o comportamiento.

Por ejemplo, un estudiante puede mostrar su información.

Para eso creamos un método llamado `mostrarInformacion`.

```java
void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Grado: " + grado);
}
```

Este método imprime en consola los datos del estudiante.

Como el método está dentro de la clase, puede usar directamente los atributos `nombre`, `edad` y `grado`.

## Clase completa

Ahora juntamos todo lo anterior.

Tenemos la clase `Estudiante`, sus atributos, su constructor y su método para mostrar información.

```java
class Estudiante {
    String nombre;
    int edad;
    String grado;

    Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Grado: " + grado);
    }
}
```

Con esta clase ya podemos crear objetos y mostrar sus datos.

## Uso en el método main

Ahora usamos la clase `Estudiante` dentro del método `main`.

```java
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 16, "Quinto de secundaria");
        Estudiante estudiante2 = new Estudiante("Luis", 15, "Cuarto de secundaria");

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}
```

Primero creamos dos objetos:

```java
Estudiante estudiante1 = new Estudiante("Ana", 16, "Quinto de secundaria");
Estudiante estudiante2 = new Estudiante("Luis", 15, "Cuarto de secundaria");
```

Luego llamamos al método `mostrarInformacion()` para cada estudiante.

```java
estudiante1.mostrarInformacion();
estudiante2.mostrarInformacion();
```

Al ejecutar el programa, veremos la información de ambos estudiantes.
