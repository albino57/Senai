using System; // Equivale ao import (já vem implícito no .NET moderno)

namespace Lista_Exercicios_Vetores_Matrizes_Metodos // Equivale ao package
{
    public class PesquisaDeValores_1
    {
        // 'Main' com M maiúsculo e 'string' com s minúsculo
        public static void Main(string[] args)
        {
            int[] vetor = new int[10];

            for (int i = 0; i < 10; i++)
            {
                // Interpolação de string ($"...") é o jeito mais limpo de substituir o printf
                Console.Write($"Digite o {i + 1}º valor: ");
                
                // Equivalente ao scan.nextInt()
                vetor[i] = int.Parse(Console.ReadLine()!);
            }

            MostrarNumeros(vetor);
            ParImpar(vetor);
            Somar(vetor);
        }

        // Em C#, os colchetes do array sempre ficam no tipo: int[] vetor
        static void MostrarNumeros(int[] vetor)
        {
            Console.Write("\nOs números são: ");
            for (int i = 0; i < 10; i++)
            {
                Console.Write(vetor[i] + " ");
            }
        }

        static void ParImpar(int[] vetor)
        {
            int par = 0, impar = 0;
            // 'Length' com L maiúsculo (é uma propriedade, não um campo)
            for (int i = 0; i < vetor.Length; i++)
            {
                if (vetor[i] % 2 == 0)
                {
                    par++;
                }
                else
                {
                    impar++;
                }
            }
            Console.Write($"\nPares---------: {par}");
            Console.Write($"\nÍmpares-------: {impar}");
        }

        static void Somar(int[] vetor)
        {
            int soma = 0;
            for (int i = 0; i < vetor.Length; i++)
            {
                soma += vetor[i];
            }
            Console.Write($"\nSoma----------: {soma}");
        }
    }
}

/*
 * ------------------------------------------------------------------------
 * string > Console.ReadLine()!.Split(' '); // Lê a primeira palavra (equivale ao scan.next())
 * string > Console.ReadLine()!;            // Lê uma frase inteira até o ENTER (scan.nextLine())
 * char   > Console.ReadLine()!;            // Lê o primeiro caractere (scan.next().charAt(0))
 * ------------------------------------------------------------------------
 * // Equivalente ao Locale.setDefault(Locale.US) e pt-BR:
 * using System.Globalization;
 * CultureInfo.CurrentCulture = CultureInfo.InvariantCulture; // Ponto decimal (US)
 * CultureInfo.CurrentCulture = new CultureInfo("pt-BR");     // Vírgula decimal (BR)
 * ------------------------------------------------------------------------
 * Interpolação ($"...") em vez de printf:
 * {valor:F2} = float, double (2 casas decimais) | {num} = byte, short, int, long
 * {texto}    = string/bool                      | {letra} = char | \n = quebra de linha
 */