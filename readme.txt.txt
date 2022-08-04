----------------------------------------------------------------------------------------------------------------
TRABALHO PRÁTICO INDIVIDUAL: 01 (Java) - Disciplina: Técnicas de Programação (Prof. Wendley) - Semestre 2019.2
Aluno: Raniery Alves Vasconcelos
Matrícula: 473532
Curso: Engenharia de Computação - Universidade Federal do Ceará (Campus Sobral)
---------------------------------------------------------------------------------------------------------------
OBS: Se você chegar a enfrentar em algum momento algum problema que afirme que o nome da pasta "TRABALHO PRÁTICO INDIVIDUAL 01 - Raniery Alves Vasconcelos (473532)" é longa demais, por favor, fique à vontade para renomear o nome desta pasta para algo mais curto. Fique atento que caso você renomeie a pasta, você terá que adaptar os passos que envolvem o nome original da pasta.

### Explicação para a execução do código até a tela inicial
#Passo 1: Descompactar o arquivo .zip "TRABALHO PRÁTICO INDIVIDUAL 01 - Raniery Alves Vasconcelos (473532)" (se você está lendo este texto, você provavelmente já fez o passo 1 com sucesso).

#Passo 2: No sistema operacional Windows (o processo deve ser semelhante em outros sistemas operacionais), faça o seguinte:
		2.1 - Método 1 (executável): Após executar o passo 1, siga este diretório: "(...)\TRABALHO PRÁTICO INDIVIDUAL 01 - Raniery Alves Vasconcelos (473532)\Trabalho1\dist"
			2.1.1 - Abra o arquivo executável Jar chamado "Trabalho1". 
			2.1.2 - Agora você pode testar o executável (Jar) deste trabalho.

		2.2 - Método 2 (por compilação): Abra o software NetBeans instalado em seu dispositivo.
			2.2.1 - Então, no canto superior esquerdo de sua tela, clique em "Arquivo/File".
			2.2.2 - Com o menu de "Arquivo/File" aberto, clique em "Abrir Projeto/Open Project".
			2.2.3 - Navegue até a pasta "TRABALHO PRÁTICO INDIVIDUAL 01 - Raniery Alves Vasconcelos (473532)" (extraída do .zip). Claro, está implícito que você irá navegar até o local onde a pasta citada anteriormente está.
			2.2.4 - Selecione "Trabalho1" e clique em "Abrir Projeto/Open Project".
			2.2.5 - Com o projeto "Trabalho1" aberto dentro do seu NetBeans, execute o programa clicando no botão com a seta verde apontando para a direita ("Run Project" - Atalho: F6).
			2.2.6 - Com o programa em execução, você pode testá-lo à vontade.

### Funcionalidades deste software
# Este trabalho em Java tem três tipos de conta: Conta-corrente, conta-poupança e conta-especial (uma de cada tipo).
# O software deste trabalho executa nestas contas as operações bancárias (listadas abaixo) que normalmente são executadas em contas bancárias.
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