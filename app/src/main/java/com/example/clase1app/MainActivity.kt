package com.example.clase1app

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.clase1app.ui.theme.Clase1AppTheme

class MainActivity : ComponentActivity() {

    companion object {
        // Constantes globales (Actividad A1)
        private const val APP_NAME_CONST = "Clase1App"
        private const val APP_VERSION_CONST = "1.0.0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        // tareaA1()
        // tareaA2()
        //tareaA3()
         //tareaA4()
         //tareaA5()
         //tareaA6()
         //tareaA7()
        //tareaA8()
         //tareaA9()
        //tareaA10()
         tareaA11()

        setContent {
            Clase1AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    // ---------- A1: Variables y constantes ----------
    fun tareaA1() {
        Log.d("A1", "--- Ejecutando Tarea A1 ---")
        val APP_NAME = APP_NAME_CONST
        val APP_VERSION = APP_VERSION_CONST

        var contador = 0
        var mensaje = "Hola"
        val PI = 3.14159
        val DIAS_SEMANA = 7

        Log.d("A1", "Nombre app: $APP_NAME")
        Log.d("A1", "Versión: $APP_VERSION")
        Log.d("A1", "$mensaje, contador=$contador")
        Log.d("A1", "PI=$PI, días=$DIAS_SEMANA")

        contador = 5
        mensaje = "Cambio de mensaje"
        Log.d("A1", "$mensaje, contador=$contador (modificado)")
    }

    // ---------- A2: Tipos numéricos ----------
    fun tareaA2() {
        Log.d("A2", "--- Ejecutando Tarea A2 ---")
        val numInt = 100
        val numLong = 10_000_000_000L
        val numFloat = 19.99f
        val numDouble = 29.999999999999

        Log.d("A2", "Int: $numInt")
        Log.d("A2", "Long: $numLong")
        Log.d("A2", "Float: $numFloat")
        Log.d("A2", "Double: $numDouble")

        val sumaIntLong = numInt + numLong
        val multiFloatDouble = numFloat * numDouble
        Log.d("A2", "Suma Int + Long: $sumaIntLong (Tipo: ${sumaIntLong::class.simpleName})")
        Log.d("A2", "Multiplicación Float * Double: $multiFloatDouble (Tipo: ${multiFloatDouble::class.simpleName})")
    }

    // ---------- A3: if como expresión ----------
    fun calificar(nota: Int): String = if (nota >= 60) "Aprobado" else "Desaprobado"

    fun tareaA3() {
        Log.d("A3", "--- Ejecutando Tarea A3 ---")
        Log.d("A3", "Nota 75: ${calificar(75)}")
        Log.d("A3", "Nota 50: ${calificar(50)}")
        Log.d("A3", "Nota 90: ${calificar(90)}")
        Log.d("A3", "Nota 60: ${calificar(60)}")
        Log.d("A3", "Nota 45: ${calificar(45)}")
    }

    // ---------- A4: when con rangos ----------
    fun clasificarEdad(edad: Int): String {
        return when (edad) {
            in 0..12 -> "Niño"
            in 13..17 -> "Adolescente"
            in 18..59 -> "Adulto"
            in 60..Int.MAX_VALUE -> "Mayor"
            else -> "Edad inválida"
        }
    }

    fun tareaA4() {
        Log.d("A4", "--- Ejecutando Tarea A4 ---")
        Log.d("A4", "Edad 5: ${clasificarEdad(5)}")
        Log.d("A4", "Edad 15: ${clasificarEdad(15)}")
        Log.d("A4", "Edad 30: ${clasificarEdad(30)}")
        Log.d("A4", "Edad 70: ${clasificarEdad(70)}")
        Log.d("A4", "Edad -1: ${clasificarEdad(-1)}")
    }

    // ---------- A5: Bucles while y for ----------
    fun generarTablaMultiplicarWhile(numero: Int) {
        Log.d("A5", "--- Tabla de Multiplicar del $numero (while) ---")
        var i = 1
        while (i <= 10) {
            Log.d("A5", "$numero x $i = ${numero * i}")
            i++
        }
    }

    fun generarTablaMultiplicarFor(numero: Int) {
        Log.d("A5", "--- Tabla de Multiplicar del $numero (for) ---")
        for (i in 1..10) {
            Log.d("A5", "$numero x $i = ${numero * i}")
        }
    }

    fun tareaA5() {
        val numeroTabla = 7
        generarTablaMultiplicarWhile(numeroTabla)
        generarTablaMultiplicarFor(numeroTabla)
    }

    // ---------- A6: Colecciones ----------
    data class Producto(val id: Int, val nombre: String, val precio: Double, val stock: Int)

    fun tareaA6() {
        Log.d("A6", "--- Ejecutando Tarea A6 ---")
        val productos = listOf(
            Producto(1, "Laptop", 1200.00, 10),
            Producto(2, "Teclado", 75.50, 0),
            Producto(3, "Ratón", 25.00, 5),
            Producto(4, "Monitor", 300.00, 0),
            Producto(5, "Webcam", 50.00, 12)
        )

        val nombresConStock = productos.filter { it.stock > 0 }.map { it.nombre }
        Log.d("A6", "Nombres de productos con stock: $nombresConStock")

        val totalPrecios = productos.sumOf { it.precio }
        Log.d("A6", "Suma total de precios de todos los productos: $totalPrecios")

        val productosSinStock = productos.count { it.stock == 0 }
        Log.d("A6", "Cantidad de productos sin stock: $productosSinStock")
    }

    // ---------- A7: Null safety ----------
    fun aEnteroSeguro(s: String): Int? = s.toIntOrNull()

    fun tareaA7() {
        val cadenaValida = "123"
        val cadenaInvalida = "abc"
        val cadenaVacia = ""

        val numero1 = aEnteroSeguro(cadenaValida) ?: 0
        val numero2 = aEnteroSeguro(cadenaInvalida) ?: -1
        val numero3 = aEnteroSeguro(cadenaVacia) ?: 99

        Log.d("A7", "Cadena '$cadenaValida' a entero seguro: ${aEnteroSeguro(cadenaValida)}")
        Log.d("A7", "Cadena '$cadenaInvalida' a entero seguro: ${aEnteroSeguro(cadenaInvalida)}")
        Log.d("A7", "Cadena '$cadenaVacia' a entero seguro: ${aEnteroSeguro(cadenaVacia)}")

        Log.d("A7", "Con operador Elvis - '$cadenaValida': $numero1")
        Log.d("A7", "Con operador Elvis - '$cadenaInvalida': $numero2")
        Log.d("A7", "Con operador Elvis - '$cadenaVacia': $numero3")
    }

    // ---------- A8: Funciones puras ----------
    fun esPrimo(n: Int): Boolean {
        if (n <= 1) return false
        if (n <= 3) return true
        if (n % 2 == 0 || n % 3 == 0) return false
        var i = 5
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) return false
            i += 6
        }
        return true
    }

    fun fibonacci(n: Int): List<Int> {
        if (n <= 0) return emptyList()
        if (n == 1) return listOf(0)
        val sequence = mutableListOf(0, 1)
        while (sequence.size < n) {
            sequence.add(sequence[sequence.lastIndex] + sequence[sequence.lastIndex - 1])
        }
        return sequence
    }

    fun tareaA8() {
        val fib10 = fibonacci(10)
        Log.d("A8", "Secuencia Fibonacci (n=10): $fib10")
        Log.d("A8", "7 es primo: ${esPrimo(7)}")
        Log.d("A8", "13 es primo: ${esPrimo(13)}")
        Log.d("A8", "10 es primo: ${esPrimo(10)}")
        Log.d("A8", "1 es primo: ${esPrimo(1)}")
    }

    // ---------- A9: Clases vs Data class ----------
    class Persona(val nombre: String, var edad: Int) {
        fun cumplirAnios() {
            edad++
            Log.d("A9", "$nombre ha cumplido $edad años.")
        }
        fun presentacion(): String = "Hola, mi nombre es $nombre y tengo $edad años."
    }

    data class Usuario(val id: Int, val nombre: String, val email: String)

    fun tareaA9() {
        val persona1 = Persona("Ana", 25)
        val persona2 = Persona("Ana", 25)
        Log.d("A9", persona1.presentacion())
        persona1.cumplirAnios()
        Log.d("A9", persona1.presentacion())
        Log.d("A9", "Persona1 == Persona2 (Clase regular): ${persona1 == persona2}")

        val usuario1 = Usuario(1, "Carlos", "carlos@example.com")
        val usuario2 = Usuario(1, "Carlos", "carlos@example.com")
        val usuario3 = usuario1.copy(email = "carlos_nuevo@example.com")

        Log.d("A9", "Usuario1: $usuario1")
        Log.d("A9", "Usuario2: $usuario2")
        Log.d("A9", "Usuario3 (copy): $usuario3")
        Log.d("A9", "Usuario1 == Usuario2 (Data class): ${usuario1 == usuario2}")
        Log.d("A9", "Usuario1 == Usuario3 (Data class): ${usuario1 == usuario3}")
    }

    // ---------- A10: Extensiones ----------
    fun List<Double>.media(): Double = if (isEmpty()) 0.0 else sum() / size
    fun String.capitalizarPrimera(): String =
        if (isEmpty()) "" else substring(0, 1).uppercase() + substring(1)

    fun tareaA10() {
        val notas = listOf(8.5, 9.0, 7.0, 9.5)
        Log.d("A10", "La media de las notas es: ${notas.media()}")

        val texto = "hola mundo kotlin"
        Log.d("A10", "Capitalizado: ${texto.capitalizarPrimera()}")

        val textoVacio = ""
        Log.d("A10", "Capitalizado (vacío): ${textoVacio.capitalizarPrimera()}")
    }

    // ---------- A11: Mini reporte declarativo ----------
    fun tareaA11() {
        val nums = (1..20).toList()
        val numerosPares = nums.filter { it % 2 == 0 }
        val sumaPares = numerosPares.sum()
        val promedioPares = numerosPares.average()

        Log.d("A11", "Números pares del 1 al 20: $numerosPares")
        Log.d("A11", "Suma de los números pares: $sumaPares")
        Log.d("A11", "Promedio de los números pares: $promedioPares")
    }
}

// -------- UI Compose mínima --------
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // también puedes loguear aquí
    Log.d("UI", "Greeting ejecutado con name=$name")
    Text(text = "Hello $name!", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Clase1AppTheme {
        Greeting("Android")
    }
}
