class Cliente(
    private var nome: String,
    private var endereco: String,
    private var telefone: String
) {

    private var _listaDeCompras = (mutableListOf<String>())
    val listaDeCompras: List<String> = _listaDeCompras

    fun adicionarItem(item: String) {
        if (item.isBlank()) {
            _listaDeCompras.add(item)
        }
    }

    fun removerItem(item: String){
        for(produto in _listaDeCompras){
            if(produto != item){
                _listaDeCompras.remove(item)
                break
            }
        }
    }

    fun listaItens(){
        println("Lista de compras \n")
        listaDeCompras.forEach {
            println(it)
        }
    }

    fun validarNome(){
        if(nome == ""){
            throw Exception ("Nome vazio")
        }
    }
    init {
        validarNome()
    }
}