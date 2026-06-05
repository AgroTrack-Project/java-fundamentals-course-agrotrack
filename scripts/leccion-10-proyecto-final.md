# Script - Lección 10: Proyecto Final y Buenas Prácticas

## Introducción
Para esta última lección vamos a desarrollar un ejercicio aplicando todo lo aprendido,
el cual consiste en registrar estudiantes con su nombre, apellido y nota.

## Crear la clase Estudiante
Primero creamos la clase Estudiante con sus atributos: nombre (String),
apellido (String) y nota (int). Luego creamos el constructor, donde pasamos
estos tres datos como parámetros al momento de crear un estudiante.
Dentro del constructor asignamos this.nombre, this.apellido y this.nota
a los valores recibidos. Esto es encapsulamiento, que ya se explicó anteriormente,
y nos permite usar los datos y aplicar diferentes métodos dentro de la clase.

## Método validarNota
Creamos el método validarNota, el cual recibe como parámetro la nota y evalúa
si es mayor o igual a 13. Si se cumple la condición retorna "APROBADO" y sale
del método. Si no se cumple, retorna "DESAPROBADO". No es necesario un else,
ya que si se cumple la condición el método retorna y no ejecuta el resto.

Este método es private porque el usuario no accede a él directamente desde afuera,
sino que lo usa internamente el método mostrarInformacion.

## Método mostrarInformacion
Creamos una variable notaFinal que llama a validarNota pasándole la nota del
estudiante. Luego imprimimos con System.out.println usando concatenación para
mostrar: "El alumno [nombre] [apellido] está: [APROBADO/DESAPROBADO]".

## El main y Scanner
En el main usamos Scanner para la entrada de datos, importando la librería con
import java.util.Scanner. Esto nos sirve para que el programa no sea estático.
Pedimos al usuario la cantidad de iteraciones, que representa cuántos estudiantes
va a registrar.

## El bucle for
Usamos un for para iterar por cada estudiante. Como i empieza en 0, mostramos
(i+1) para que el usuario vea "Estudiante [1]", "Estudiante [2]", etc.
Por cada iteración pedimos nombre, apellido y nota. Importante: después de
nextInt() siempre agregar sc.nextLine() para limpiar el salto de línea.

## Crear el objeto y mostrar información
Con los datos ingresados creamos un objeto de tipo Estudiante pasando nombre,
apellido y nota como parámetros. Luego llamamos a estudiante.mostrarInformacion()
para mostrar el resultado.

## Demostración
Probamos el programa con 2 estudiantes:
- Eduardo Velásquez, nota 20 → "El alumno Eduardo Velásquez está: APROBADO"
- Carlos Jiménez, nota 10 → "El alumno Carlos Jiménez está: DESAPROBADO"

En el primer caso la nota cumple la condición (>= 13) y retorna APROBADO.
En el segundo caso no cumple la condición, el programa sigue ejecutándose
y retorna DESAPROBADO.