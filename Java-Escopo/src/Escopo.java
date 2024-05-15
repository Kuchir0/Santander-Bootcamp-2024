public class Escopo {
    
}

/* Escopo de Variáveis em Java:
O que é? O ambiente onde uma variável pode ser acessada.
Como funciona? A variável só existe dentro do bloco onde foi declarada.
Tipos de escopo:
Escopo de Classe: Acessível por todos os métodos da classe.
Escopo de Método: Acessível apenas dentro do método onde foi declarada.
Por que é importante? Saber o escopo de uma variável evita erros no código.
Em poucas palavras:

Variáveis só existem dentro do bloco onde foram declaradas.
Variáveis de classe são acessíveis por toda a classe.
Variáveis de método são acessíveis apenas dentro do método.
Saber o escopo é crucial para escrever código sem erros */

/* Ex:
public class Conta {
	//variavel da classe conta
	double saldo=10.0;
	
	public void sacar(Double valor) {
		//variavel local de método
		double novoSaldo = saldo - valor;
	}
	public void imprimirSaldo(){
		//disponível em toda classe
		System.out.println(saldo);
		//somente o método sacar conhece esta variavel
		System.out.println(novoSaldo);
	
	}
	public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
		
		return valorMontante;
	}
} */