//Rafael Albino
//Bernardo
//Kássia
programa {
  inclua biblioteca Util
  funcao inicio() {
    const inteiro linha=10
    inteiro opcao, numeroVaga
    cadeia placa="", vaga[linha]
    zerarVagas(vaga, linha)

    faca{
      menu(vaga, linha)
      leia(opcao)

      escolha(opcao){
        caso 1:
          escreva("\nDigite a placa do veículo: ")
          leia(placa)

          escreva("Digite a vaga (1-10): ")
          leia(numeroVaga)
          enquanto(numeroVaga < 0 ou numeroVaga > 10){
            escreva("Escreva uma vaga entre 1 e 10: ")
            leia(numeroVaga)
          }

          vaga[numeroVaga-1] = placa
          escreva("\nPlaca ", placa, " registrada na vaga ", numeroVaga)
          Util.aguarde(3000)
          limpa()
        pare

        caso 2:
          escreva("\nDigite a placa do veículo: ")
          leia(placa)

          saidaPlaca(vaga, linha, placa)
          Util.aguarde(3000)
          limpa()
        pare

        caso 3:
        limpa()
        escreva("Vagas livres: ", numeroVagasDisponiveis(vaga, linha))
        Util.aguarde(2000)
        limpa()
        pare

        caso 4:
          escreva("Fim do programa!")
        pare
      }
    }enquanto(opcao != 4)
  }

  // ---↓ Funções ↓---

  funcao menu(cadeia vaga[], inteiro linha){
    escreva("= = = Estacionamento Senai = = =")
    verificarVagas(vaga, linha)
    escreva("\n1-Registrar Entrada veículo")
    escreva("\n2-Registrar Saída veículo")
    escreva("\n3-Listar vagas disponíveis")
    escreva("\n4-Sair")
    escreva("\nDigite: ")
  }

  funcao saidaPlaca(cadeia vaga[], inteiro linha, cadeia placa){
    para(inteiro i=0; i < linha; i++){
      se(vaga[i] == placa){
        vaga[i] = "Livre"
        escreva("\nPlaca ", placa, " removida! ")
      }senao{
        escreva("Placa ", placa, " não encontrada!")
        pare
      }
    }
  }

  funcao inteiro numeroVagasDisponiveis(cadeia vaga[], inteiro linha){
    inteiro contador=0
    para(inteiro i=0; i < linha; i++){
      se(vaga[i] == "Livre"){
        contador++
      }
    }
    retorne contador
  }

  funcao verificarVagas(cadeia vaga[], inteiro linha){
    escreva("\n")
    para(inteiro i=0; i<linha; i++){
      escreva(" ", vaga[i])
    }
  }

  funcao zerarVagas(cadeia vaga[], inteiro linha){
    para(inteiro i=0; i<linha; i++){
      vaga[i] = "Livre"
    }
  }
}
