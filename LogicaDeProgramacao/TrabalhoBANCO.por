//Rafael Albino
//Bernardo
//Kássia
programa {
  inclua biblioteca Util
  funcao inicio() {
    const inteiro linha=4
    inteiro opcao
    logico permitido = falso
    cadeia conta[][] = {{"Rafael","123"},
                        {"Bernardo","234"},
                        {"Kássia","345"},
                        {"Roni","456"}}

    permitido = entrada(linha, conta)

    enquanto(permitido){
      
      leia(opcao)

      escolha(opcao){
        caso 1:
          escreva("Depositar")
        pare
        caso 2:
          escreva("Sacar")
        pare
        caso 3:
          escreva("Saldo")
        pare
        caso 4:
          limpa()
          escreva("Fim do programa!!!")
          permitido = falso
        pare
      }
    }
  }

  funcao menu(cadeia user){
    escreva("= = = Login Banco Senai = = =")
    escreva("\nBem-vindo ", user)
    escreva("\n1-Depositar")
    escreva("\n2-Sacar")
    escreva("\n3-Saldo")
    escreva("\n4-Sair")
    escreva("\nDigite: ")
  }

  funcao logico entrada(inteiro linha, cadeia conta[][]){
    cadeia user, senha
    escreva("= = = Login Banco Senai = = =")
    escreva("\n\nDigite o usuário: ")
    leia(user)

    escreva("Digite a senha: ")
    leia(senha)

    para(inteiro i=0; i < linha; i++){
      se(conta[i][0] == user e conta[i][1] == senha){
          escreva("Acesso Permitido!")
          Util.aguarde(3000)
          limpa()
          menu(user)
          retorne verdadeiro
      }
    }
    escreva("Acesso Negado!")
    retorne falso
  }
}
