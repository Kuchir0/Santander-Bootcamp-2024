package edu.vitor.primeraaula;
public class MinhaClasse {
    public static void main (String [] args) {

        String primeiroNome = "Vitor";
        String segundoNome = "Luz";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome , String SegundoNome) {
        return primeiroNome.concat(" ").concat(SegundoNome);
    }
}

//comentarios 
/*variaveis com letras todas maiusculas não podem sofrer alteração de valor ex  BR = "Brasil"
Simbolos permitidos _ e $
Não pode começar com numero
Não pode ter espaço no nome da variavel 
Não pode conter as palavras reservadas da linguagem */

/* exemplo invalido 
int numero&um = 1 

exemplo valido
int numero$um = 1 */


/*declaração de variaveis
estrutura
Tipo NomeBemDefinido = atribuição (opcional em alguns casos) //

Exemplo
 int idade = 27;
 double altura = 1.85; */

/* declarando metodos
 estrutura
 TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

exemplo
 int somar (int numeroUm, int numero2)
 String FormatarCep (long cep) */