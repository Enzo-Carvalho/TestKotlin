import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {

    var cliente1 = Cliente("Neymar","Rua paris", "40028922")

    @BeforeEach
    fun adicionarNaLista(){
        cliente1.adicionarItem("pepsi")
        cliente1.adicionarItem("cocacola")
        cliente1.adicionarItem("guarana")
        cliente1.adicionarItem("fanta")
    }

    @Test
    fun adicionarItemTeste() {
        var erro = false

        try {
            val clienteTest = Cliente("", "lkdsjf", "askldjf")
        }catch (e: Exception){
            erro = true
        }
        assertTrue(erro)
    }

    @Test
    fun removerItemTeste(){
        cliente1.removerItem("guarana")

        assertFalse(cliente1.listaDeCompras.contains("guarana"))
    }

}