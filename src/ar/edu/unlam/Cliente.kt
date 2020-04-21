package ar.edu.unlam
/*
Normalmente un problema resuelto con la metodología
de programación orientada a objetos no interviene una sola clase,
sino que hay muchas clases que interactúan y se comunican.

Plantearemos problemas separando las actividades en dos clases.*/

/*Problema 1
Un banco tiene 3 clientes que pueden hacer depósitos y extracciones.
También el banco requiere que al final del día calcule
la cantidad de dinero que hay depositado.

Lo primero que hacemos es identificar las clases:
Podemos identificar la clase Cliente y la clase Banco.

Luego debemos definir las propiedades y los métodos de cada clase:
*/

fun main(){
    val bancoFrances = Banco()
    bancoFrances.operar()
    bancoFrances.depositosTotales()
}

class Banco{
    val cliente1:Cliente =Cliente(" Juan",15.000)
    val cliente2:Cliente =Cliente("Ana",18.000)
    val cliente3:Cliente = Cliente("Jose",20.000)

    fun operar(){
        cliente1.depositar(2.000)
        cliente2.depositar(2.000)
        cliente3.depositar(4.000)
        cliente3.extraer(1.000)

    }

    fun depositosTotales() {
        val total = cliente1.monto + cliente2.monto + cliente3.monto
        println("El total de dinero del banco es: $total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }

}
class Cliente(var nombre:String,var monto:Double) {

    fun depositar(monto:Double):Unit{
        this.monto+=monto
    }

    fun extraer(monto:Double):Unit{
        this.monto-=monto
    }

    fun imprimir():Unit{
        println("Mi nombre es $nombre y el monto es: $monto")
    }

}