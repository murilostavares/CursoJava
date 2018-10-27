//[X]Encapsulamento
//  private
//  pacote (N�o declara nada)
//  public
//  
//JavaBean (Padr�o Comunidade Java)
//*Nome de Classe
//	Come�ar com a primeira Letra mai�scula e as demais min�sculas.
//	Caso seja um nome composto a primeira letra de cada palavra deve ser mai�scula.
//	Ex: Contato, PessoaFisica, RelatorioPagamento
//*Nome de metodos e var�veis
//	Devem ser escritos em letra min�scula.
//	Caso seja um nome composto a primeira letra a partir da segunda palavra deve ficar com letra mai�scula.
//	Ex: nome, idade, dataPagamento,processar(), imprimirRelatorio()
//*Encapsulamento
//	propriedades (cariaveis de int�ncia ou de classe) devem possuir visibilidade privada (private)
//
// 	Cada propriedade deve ser exposta atrav�s da definid��o de m�todos de configura��o e acesso.
//
//	Os m�todos de configura��o e acesso devem possuir visibilidade p�blica (public)
//
// 	Todo m�todo de configura��o deve possuir o prefixo 'set' seguido do nome da propriedade. Os m�todos de configura��o devem posuuir o tipo de retorno void e precisam possuir exatamente um par�metro na listagem de par�metros, que deve ser do mesmo tipo da propriedade.
//	Todo m�todo de acesso deve possuir o prefixo 'get' seguido do nome da propriedade. (vazio)
//	Opcionalmente os m�todos de acesso de propriedades boolean podem utilizar o prefixo 'is'
//	Os m�todos de acesso devem possuir como tipo de retorno exatamente o mesmo tipo da propriedade e n�o devem possuir par�metros em sua listagem de par�metros.
//
// [X]Heran�a
//
// extends = � um (Ex. Vendedor � um Funcion�rio)
//
// Usa quest�es implementados;
//
//
//
// Usar anota��o "@Override" sinaliza as sobreescri��es
//-----------------------------------------------------------------------------------------------------------------------------
// Diagrama de Classes
//
//
//			 _______________________________
//			|NOME DA CLASSE Ex: Pessoa		|
//			|								|
//			|_______________________________|
//			|								|
//			|PROPRIEDADES					|
//			|	- Nome: String				|
//			|	- Idade: Int				|
//			|_______________________________|
//			|								|
//			|METODOS:						|
//			|	+ Comer: Void				|
//			|	+ Andar (Passos:int):Void	|
//			|								|
//			|_______________________________|
//
//
//
//+ PUBLICO
//- PRIVADO
//~ DEFAULT (PACKAGE)
//# PROTECT
//



// FELIPEDAROSAOLIVEIRA (GITHUB)



/*m�todo abstrato!
 * 
 * public abstract void
 * 
 * N�o � necessario corpo
 * Para um m�todo abstrato � necess�rio que a classe seja abstrata.
 * N�o pode mais instanciar a classe direto.
 * Tem que instacniar uma public 
 * Tem sempre que sobrescrever um abstract no heran�a
 * 
 * 
 * INTERFACE!
 * 
 * "Class", com m�todos 100% abstratos;
 * extends + implements
 * 
 * 
 */



