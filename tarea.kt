fun calcularMontoRemesa(total: Double): Double {
    return when {
        total < 5.0 -> 0.0
        total <= 1005.05 -> (total - 5.0) / 1.00005
        total <= 10051.50505 -> total / 1.00505
        else -> total / 1.01505
    }
}

fun calcularComision(mr: Double): Double {
    return when {
        mr <= 1000.0 -> 5.0
        mr <= 10001.0 -> mr * 0.005
        else -> mr * 0.015
    }
}

fun main() {
    val montoTotal = 5000.0

    if (montoTotal < 5.0) {
        println("Error: El monto total debe ser mayor a 5 para cubrir la comisión base.")
        return
    }

    val mr = calcularMontoRemesa(montoTotal)
    val comision = calcularComision(mr)
    val itf = mr * 0.00005
    val totalVerificado = mr + comision + itf

    println("=== CALCULADORA DE REMESAS ===")
    println("Monto Total Ingresado (T) : $montoTotal")
    println("Monto de Remesa (mr)      : $mr")
    println("Comisión (C)              : $comision")
    println("Impuesto (ITF 0.005%)     : $itf")
    println("Verificación (mr+C+ITF)   : $totalVerificado")
}