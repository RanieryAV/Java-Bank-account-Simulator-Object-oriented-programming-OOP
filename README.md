# Java-Bank-account-Simulator-Object-oriented-programming-OOP
#### O objetivo deste projeto é praticar o paradigma de programação de Programação Orientada a Objetos(POO)/Object-oriented programming (OOP) na linguagem Java.
#### OBS.: Instruções de uso deste software estão no arquivo "readme.txt.txt".
## Funcionalidades deste software
#### Este trabalho em Java tem três tipos de conta: Conta-corrente, conta-poupança e conta-especial (uma de cada tipo).
#### O software deste trabalho executa nestas contas as operações bancárias (listadas abaixo) que normalmente são executadas em contas bancárias.
	Operações das contas:
		*Contas.java*
			String nome;
			int numero;
			double saldo;
			getNome();
			setNome(String nome);
			getNumero();
			setNumero(int numero);
			getSaldo();
			depositar(double valor);
			sacar(double valor);
			transferir(int conta1, int conta2, valor);
			tipoConta();

		*ContaPoupanca.java*
			(herda as características de Contas.java)
			reajustar(double taxa);
			reajustar();
			tipoConta();

		*ContaEspecial.java*
			(herda as características de Contas.java)
			int limite;
			descontar(double multa);
			tipoConta();

#### OBS. 2: Este projeto foi feito somente para fins de aprendizado de programação e não pode ser vendido nem comercializado.
