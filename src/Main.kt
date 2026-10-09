
// QUESTÃO 1 - Sistema de Cupons Avançado
fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10.0
        "PROMO20" -> valor - 20.0
        else -> valor
    }
}

// QUESTÃO 2 - Auditoria de Entregas
fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val enderecoFinal = endereco ?: "Endereço Desconhecido"

        if (enderecoFinal == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }
}

// QUESTÃO 3 - Validação de Perfil de Streaming
fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

// QUESTÃO 4 - Processamento de Transações Pix
fun processarTransacoes() {
    val transacoes: List<Double?> = listOf(
        50.0, null, 120.5, null, 10.0
    )

    var total = 0.0

    for (transacao in transacoes) {
        if (transacao != null) {
            total += transacao
        } else {
            println("Transação ignorada")
        }
    }

    println("Total processado: R$ $total")
}

// QUESTÃO 5 - Classificação de Feedback de Motoristas
fun avaliarMotorista(nota: Int?) {
    val notaFinal = nota ?: 0

    when (notaFinal) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota inválida.")
    }
}

// QUESTÃO 6 - Função Lambda para Cálculo de Gorjeta
val calcularGorjeta: (Double?) -> Double = {
    if (it == null || it < 0.0) {
        0.0
    } else {
        it
    }
}

// QUESTÃO 7 - Limpeza de Banco de Dados de Usuários
fun limparEmails(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        if (email == null || (email?.length ?: 0) == 0) {
            contasInvalidas++
            println("E-mail inválido. Conta marcada para deleção.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

// FUNÇÃO PRINCIPAL - Testes das 7 questões
fun main() {
    println("===== QUESTÃO 1 =====")
    println("Desconto PROMO10: R$ ${calcularDesconto(100.0, "PROMO10")}")
    println("Desconto PROMO20: R$ ${calcularDesconto(100.0, "PROMO20")}")
    println("Sem cupom: R$ ${calcularDesconto(100.0, null)}")

    println("\n===== QUESTÃO 2 =====")
    auditarEntregas(
        listOf("Rua das Flores, 10", null, "Av. Brasil, 200")
    )

    println("\n===== QUESTÃO 3 =====")
    validarBioInfantil("Olá, eu gosto de desenhos!")
    validarBioInfantil("Esta é uma biografia muito longa que ultrapassa cinquenta caracteres.")

    println("\n===== QUESTÃO 4 =====")
    processarTransacoes()

    println("\n===== QUESTÃO 5 =====")
    avaliarMotorista(5)
    avaliarMotorista(4)
    avaliarMotorista(2)
    avaliarMotorista(null)

    println("\n===== QUESTÃO 6 =====")
    println("Gorjeta nula: ${calcularGorjeta(null)}")
    println("Gorjeta negativa: ${calcularGorjeta(-5.0)}")
    println("Gorjeta válida: ${calcularGorjeta(15.0)}")

    println("\n===== QUESTÃO 7 =====")
    limparEmails(
        listOf(
            "ana@email.com",
            null,
            "",
            "joao@email.com"
        )
    )
}

