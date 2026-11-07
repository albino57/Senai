programa {
  funcao inicio() {
    inteiro num
    escreva("Escreva um Nº: ")
    leia(num)

    tabuada(num)
  }

  funcao tabuada(inteiro num){
    inteiro conta
    escreva("Tabuada de ", num)

    para(inteiro i=0; i <=10; i++){
      conta = num * i
      escreva("\n", i, "x", num, " = ", conta)
    }
  }
}
