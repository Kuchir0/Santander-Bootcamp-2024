public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

/* Operadores
Símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações. */

/* Classificação do operadores
Atribuição
Representado pelo símbolo de igualdade "=". 

O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. em Java, 
definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição

//classe Operadores.java
String nome = "Vitor";
int idade = 27;
double peso = 68.5;
char sexo = 'M';
boolean doadorOrgao = false;
Date dataNascimento = new Date();
*/

/* Aritméticos
O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, 
podendo se tornar ou não uma expressão mais complexa.

Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão). 
//classe Operadores.java
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20/4); /* */

/* ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”. 

String nomeCompleto = "LINGUAGEM" + "JAVA";
		
* qual o resultado das expressoes abaixo?
String concatenacao ="?"; 

concatenacao = 1+1+1+"1";

concatenacao = 1+"1"+1+1;

concatenacao = 1+"1"+1+"1";

concatenacao = "1"+1+1+1;

concatenacao = "1"+(1+1+1);
*/

/* Unários
Esses operadores, são aplicados juntamente com um outro operador aritmético. 
Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

(-) Operador unário de valor negativo – nega um número ou expressão aritmética;

(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

(!) Operador unário lógico de negação – nega o valor de uma expressão booleana. 

EX: 
int numero = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++;
System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
System.out.println(numero ++);// ops algo de errado não está certo

System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
System.out.println(++ numero);

boolean verdadeiro = true;

System.out.println("Inverteu " + !verdadeiro); 
Muito cuidado com ordem de precedência, dos operadores unários! */
