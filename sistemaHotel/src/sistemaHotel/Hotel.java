package sistemaHotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opMainMenu = 0, opClientMenu = 0, opQuartoMenu = 0, opHospedagemMenu = 0, i = 0;
		int selecClienteEdit = 0, opDadoCliEdit = 0, selecClientRemove = 0, opConfirmClientRemove = 0;
		int selecQuartoEdit = 0, opDadoQtoEdit = 0, selecQuartoRemove = 0, opConfirmQtoRemove = 0;
		int selecClienteCheck = 0, selecQuartoCheck = 0, selecHospedeOut = 0;
		String confirmaCheckOut = "";
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Quarto> quartos = new ArrayList<>();
		ArrayList<Hospedagem> hospedes = new ArrayList<>();
		
		do {
			System.out.println("================================================");
			System.out.println("                  HOTEL SERENO                  ");
			System.out.println("================================================");
			System.out.println("");
			System.out.println(" 1 - MENU CLIENTES");
			System.out.println(" 2 - MENU QUARTOS");
			System.out.println(" 3 - MENU HOSPEDAGEM");
			System.out.println(" 0 - SAIR DO SISTEMA");
			System.out.println("");
			System.out.println("================================================");
			System.out.println("Selecione a opcao desejada: ");
			opMainMenu = teclado.nextInt();
			
			switch (opMainMenu) {
			case 1:
				System.out.println("=================================================");
				System.out.println("       HOTEL SERENO - MENU CLIENTES");
				System.out.println("=================================================");
				System.out.println("");
				System.out.println(" 1 - CADASTRAR CLIENTE");
				System.out.println(" 2 - EDITAR CLIENTE");
				System.out.println(" 3 - LISTAR CLIENTES");
				System.out.println(" 4 - EXCLUIR CLIENTE");
				System.out.println(" 9 - RETORNA MENU PRINCIPAL");
				System.out.println("");
				System.out.println("=================================================");
				System.out.println("Selecione a opcao desejada: ");
				opClientMenu = teclado.nextInt();
				teclado.nextLine();
				if (opClientMenu == 9) {
					break;
					}
				switch (opClientMenu) {
				case 1:
					Cliente cli = new Cliente();
					System.out.println("=================================================");
					System.out.println("    HOTEL SERENO - MENU CLIENTES - CADASTRO");
					System.out.println("=================================================");
					System.out.println("");
					System.out.print("Informe o Nome: ");
					cli.setNome(teclado.nextLine());
					System.out.print("Informe a data de nascimento:");
					cli.setDtNasc(teclado.nextLine());
					System.out.print("Informe o telefone: ");
					cli.setFone(teclado.nextLine());
					System.out.print("Informe o seu email: ");
					cli.setEmail(teclado.nextLine());
					System.out.print("Informe a cidade: ");
					cli.setCidade(teclado.nextLine());
					System.out.print("Informe a UF: ");
					cli.setUf(teclado.nextLine());
					System.out.print("E fumante? (S/N): ");
					cli.setFumante(teclado.nextLine());
					clientes.add(cli);
					break;
				case 2:
					System.out.println("=================================================");
					System.out.println("     HOTEL SERENO - MENU CLIENTES - EDITAR");
					System.out.println("=================================================");
					System.out.println("");
					for (i=0; i<clientes.size(); i++) {
						System.out.println(i + " - " + clientes.get(i).getNome());
					}
					System.out.println("Digite o código do cliente que voce deseja editar: ");
					selecClienteEdit = teclado.nextInt();
					System.out.println("Selecione o parametro que deseja editar no menu abaixo: ");
					System.out.println("  1  -  NOME");
					System.out.println("  2  -  DATA DE NASCIMENTO");
					System.out.println("  3  -  TELEFONE");
					System.out.println("  4  -  EMAIL");
					System.out.println("  5  -  CIDADE");
					System.out.println("  6  -  UF");
					System.out.println("  7  -  FUMANTE");
					System.out.println("  8  -  Editar cadastro completo");
					System.out.println("--------------------------------------------------");
					System.out.println("Digite a opcao correspondente:");
					opDadoCliEdit = teclado.nextInt();
					teclado.nextLine();
					switch (opDadoCliEdit) {
					case 1: {
						System.out.print("Informe o Nome: ");
						clientes.get(selecClienteEdit).setNome(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					}
					case 2: {
						System.out.print("Informe a data de nascimento:");
						clientes.get(selecClienteEdit).setDtNasc(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					}
					case 3: {
						System.out.print("Informe o telefone: ");
						clientes.get(selecClienteEdit).setFone(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					}
					case 4: {
						System.out.print("Informe o seu email: ");
						clientes.get(selecClienteEdit).setEmail(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					}
					case 5: {
						System.out.print("Informe a cidade: ");
						clientes.get(selecClienteEdit).setCidade(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					}
					case 6: {
						System.out.print("Informe a UF: ");
						clientes.get(selecClienteEdit).setUf(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					}
					case 7: {
						System.out.print("E fumante? (S/N): ");
						clientes.get(selecClienteEdit).setFumante(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					}
					case 8: {
						System.out.print("Informe o Nome: ");
						clientes.get(selecClienteEdit).setNome(teclado.nextLine());
						System.out.print("Informe a data de nascimento:");
						clientes.get(selecClienteEdit).setDtNasc(teclado.nextLine());
						System.out.print("Informe o telefone: ");
						clientes.get(selecClienteEdit).setFone(teclado.nextLine());
						System.out.print("Informe o seu email: ");
						clientes.get(selecClienteEdit).setEmail(teclado.nextLine());
						System.out.print("Informe a cidade: ");
						clientes.get(selecClienteEdit).setCidade(teclado.nextLine());
						System.out.print("Informe a UF: ");
						clientes.get(selecClienteEdit).setUf(teclado.nextLine());
						System.out.print("E fumante? (S/N): ");
						clientes.get(selecClienteEdit).setFumante(teclado.nextLine());
						System.out.println("");
						System.out.println("***** CADASTRO ALTERADO COM SUCESSO *****");
						break;
					}
					}
					break;
				case 3: {
					System.out.println("=================================================");
					System.out.println("     HOTEL SERENO - MENU CLIENTES - LISTA");
					System.out.println("=================================================");
					System.out.println("");
					for (i = 0; i < clientes.size(); i++) {
//						System.out.println("ID Cliente: " + clientes.get(i));
						System.out.println("Nome: " + clientes.get(i).getNome());
						System.out.println("Data de nascimento: " + clientes.get(i).getDtNasc());
						System.out.println("E-mail: " + clientes.get(i).getEmail());
						System.out.println("Cidade/UF: " + clientes.get(i).getCidade() + "/" + clientes.get(i).getUf());
						System.out.println("Fumante (S/N): " + clientes.get(i).getFumante());
						System.out.println("Acomodacao: Quarto/Suite " + clientes.get(i).getAcomodacao());
						System.out.println("--------------------------------------------------");
						
					}
				}
				break;
				
				case 4: {
					System.out.println("=================================================");
					System.out.println("     HOTEL SERENO - MENU CLIENTES - EXCLUIR");
					System.out.println("=================================================");
					System.out.println("");
					for (i=0; i<clientes.size(); i++) {
						System.out.println(i + " - " + clientes.get(i).getNome());
					}
					System.out.println("Digite o codigo do cliente que voce deseja EXCLUIR: ");
					selecClientRemove = teclado.nextInt();
					System.out.println("VOCE CONFIRMA A EXLUSAO DO CLIENTE: " + clientes.get(selecClientRemove).getNome() + " (1 - Sim / 2 - Nao)?");
					opConfirmClientRemove = teclado.nextInt();
					if (opConfirmClientRemove == 1) {
						clientes.remove(selecClientRemove);
						System.out.println("***** CLIENTE EXCLUIDO COM SUCESSO *****");
					} else { 
						System.out.println("*******  OPERACAO CANCELADA  *******");
					}
				}
				break;
				}
				break;

			case 2:
				System.out.println("=================================================");
				System.out.println("       HOTEL SERENO - MENU QUARTOS");
				System.out.println("=================================================");
				System.out.println("");
				System.out.println(" 1 - CADASTRAR QUARTO");
				System.out.println(" 2 - EDITAR QUARTO");
				System.out.println(" 3 - LISTAR QUARTO");
				System.out.println(" 4 - EXCLUIR QUARTO");
				System.out.println(" 9 - RETORNAR AO MENU PRINCIPAL");
				System.out.println("");
				System.out.println("=================================================");
				opQuartoMenu = teclado.nextInt();
				teclado.nextLine();
				if (opQuartoMenu == 9) {
					break;
				}
				switch (opQuartoMenu) {
				case 1: 
					Quarto quarto = new Quarto();
					System.out.println("=================================================");
					System.out.println("     HOTEL SERENO - MENU QUARTOS - CADASTRO");
					System.out.println("=================================================");
					System.out.println("");
					System.out.print("Qual o nome do quarto/suite?:");
					quarto.setNome(teclado.nextLine());
					System.out.print("Qual o numero do quarto?");
					quarto.setNumero(teclado.nextLine());
					System.out.print("Qual a posicao do quarto?");
					quarto.setPosicao(teclado.nextLine());
					System.out.print("Defina valor da diaria: ");
					quarto.setValorDiaria(teclado.nextLine());
					System.out.print("Defina a capacidade de hospedes no quarto: ");
					quarto.setCapacidade(teclado.nextLine());
					System.out.print("Aceita fumantes?(S/N)");
					quarto.setFumante(teclado.nextLine());
					quartos.add(quarto);
//					System.out.println(quarto);
					break;
				case 2:
					System.out.println("=================================================");
					System.out.println("     HOTEL SERENO - MENU QUARTOS - EDITAR");
					System.out.println("=================================================");
					System.out.println("");
					for (i = 0; i < quartos.size(); i++) {
						System.out.println(i + " - " + quartos.get(i).getNome() + " - " + quartos.get(i).getNumero());
					}
					System.out.println("Digite o codigo do quarto que voce deseja editar: ");
					selecQuartoEdit = teclado.nextInt();
					System.out.println("Selecione o parametro que deseja editar no menu abaixo: ");
					System.out.println("  1  -  NOME QUARTO/SUITE");
					System.out.println("  2  -  NUMERO QUARTO/SUITE");
					System.out.println("  3  -  POSICAO");
					System.out.println("  4  -  VALOR DIARIA");
					System.out.println("  5  -  CAPACIDADE");
					System.out.println("  6  -  FUMANTE");
					System.out.println("  7  -  Editar cadastro completo");
					System.out.println("Digite a opcao correspondente:");
					opDadoQtoEdit = teclado.nextInt();
					teclado.nextLine();
					switch (opDadoQtoEdit) {
					case 1: 
						System.out.println("Insira o Nome do Quarto/Suite: ");
						quartos.get(selecQuartoEdit).setNome(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					case 2:
						System.out.println("Insira o numero do Quarto / Suite: ");
						quartos.get(selecQuartoEdit).setNumero(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					case 3:
						System.out.println("Informe a posicao do Quarto / Suite: ");
						quartos.get(selecQuartoEdit).setPosicao(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					case 4:
						System.out.println("Informe o valor da diaria: ");
						quartos.get(selecQuartoEdit).setValorDiaria(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					case 5: 
						System.out.println("Informe a capacidade: ");
						quartos.get(selecQuartoEdit).setCapacidade(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					case 6:
						System.out.println("Informe se e quarto para fumantes (S/N): ");
						quartos.get(selecQuartoEdit).setFumante(teclado.nextLine());
						System.out.println("");
						System.out.println("***** INFORMACAO ALTERADA COM SUCESSO *****");
						break;
					case 7: 
						System.out.println("Insira o Nome do Quarto/Suite: ");
						quartos.get(selecQuartoEdit).setNome(teclado.nextLine());
						System.out.println("Insira o numero do Quarto / Suite: ");
						quartos.get(selecQuartoEdit).setNumero(teclado.nextLine());
						System.out.println("Informe a posicao do Quarto / Suite: ");
						quartos.get(selecQuartoEdit).setPosicao(teclado.nextLine());
						System.out.println("Informe o valor da diaria: ");
						quartos.get(selecQuartoEdit).setValorDiaria(teclado.nextLine());
						System.out.println("Informe a capacidade: ");
						quartos.get(selecQuartoEdit).setCapacidade(teclado.nextLine());
						System.out.println("Informe se e quarto para fumantes (S/N): ");
						quartos.get(selecQuartoEdit).setFumante(teclado.nextLine());
						System.out.println("");
						System.out.println("***** CADASTRO ALTERADO COM SUCESSO *****");
						break;
					}
					break;
					
				case 3:
					System.out.println("=================================================");
					System.out.println("     HOTEL SERENO - MENU QUARTOS - LISTAR");
					System.out.println("=================================================");
					System.out.println("");
					for (i = 0; i < quartos.size(); i++) {
						System.out.println("Nome do Quarto/Suite: " + quartos.get(i).getNome());
						System.out.println("Quarto/Suite num: " + quartos.get(i).getNumero());
						System.out.println("Posicao: " +  quartos.get(i).getPosicao());
						System.out.println("Valor da diaria: " + quartos.get(i).getValorDiaria());
						System.out.println("Capacidade maxima de hospedes: " + quartos.get(i).getCapacidade() + " pessoas");
						System.out.println("Aceita Fumantes: " + quartos.get(i).getFumante());
						System.out.println("Hospede acomodado: " + quartos.get(i).getHospede());
						System.out.println("-------------------------------------------------");
					}
					break;	
				
				case 4: 
					System.out.println("=================================================");
					System.out.println("     HOTEL SERENO - MENU QUARTOS - EXCLUIR");
					System.out.println("=================================================");
					System.out.println("");
					for (i = 0; i < quartos.size(); i++) {
						System.out.println(i + quartos.get(i).getNome() + " - num: " + quartos.get(i).getNumero());
					}
					System.out.println("Digite o codigo do quarto que voce deseja EXCLUIR:");
					selecQuartoRemove = teclado.nextInt();
					System.out.println("VOCE CONFIRMA A EXCLUSAO DO QUARTO/SUITE " + quartos.get(selecQuartoRemove).getNumero() + "? (1 - Sim / 2 - Nao)");
					opConfirmQtoRemove = teclado.nextInt();
					if (opConfirmQtoRemove == 1) {
						quartos.remove(selecQuartoRemove);
						System.out.println("***** QUARTO EXCLUIDO COM SUCESSO ******");
					} else {
						System.out.println("*******  OPERACAO CANCELADA  *******");
					}
					break;
			}
			break;
				
			case 3:
				System.out.println("=================================================");
				System.out.println("       HOTEL SERENO - MENU HOSPEDAGEM");
				System.out.println("=================================================");
				System.out.println("");
				System.out.println(" 1 - REALIZAR CHECK IN");
				System.out.println(" 2 - REALIZAR CHECK OUT");
				System.out.println(" 3 - LISTAR QUARTOS VAGOS");
				System.out.println(" 4 - LISTAR QUARTOS OCUPADOS");
				System.out.println(" 9 - RETORNAR AO MENU PRINCIPAL");
				System.out.println("");
				System.out.println("=================================================");
				opHospedagemMenu = teclado.nextInt();
				teclado.nextLine();
				if (opHospedagemMenu == 9) {
					break;
				}
				
				switch (opHospedagemMenu) {
				case 1:
					Hospedagem check = new Hospedagem();
					System.out.println("=================================================");
					System.out.println("    HOTEL SERENO - MENU HOSPEDAGEM - CHECK-IN");
					System.out.println("=================================================");
					System.out.println("");
					System.out.println("Selecione o cliente para fazer Check-in:");
					for (i=0; i<clientes.size(); i++) {
						System.out.println(i + " - " + clientes.get(i).getNome());
					}
					System.out.print("Digite a opcao correspondente:");
					selecClienteCheck = teclado.nextInt();
					System.out.println("");
					System.out.println("Selecione o quarto para acomoda-lo: ");
					for (i = 0; i < quartos.size(); i++) {
						if (quartos.get(i).getHospede() == null) {
							System.out.println(i + " - " + quartos.get(i).getNome() + " - " + quartos.get(i).getNumero() + " Fumante: " + quartos.get(i).getFumante());
						}
					}
					System.out.print("Digite a opcao correspondente:");
					selecQuartoCheck = teclado.nextInt();
					if ((clientes.get(selecClienteCheck).clienteFumante == true) && (quartos.get(selecQuartoCheck).quartoFumante == true)) {
						check.setCliente(clientes.get(selecClienteCheck).getNome());
						check.setQuarto(quartos.get(selecQuartoCheck).getNumero());
						clientes.get(selecClienteCheck).setAcomodacao(quartos.get(selecQuartoCheck).getNumero());
						quartos.get(selecQuartoCheck).setHospede(clientes.get(selecClienteCheck).getNome());
						System.out.println("****** CHECK-IN EFETUADO COM SUCESSO ******");
						System.out.println("O Sr(a). " + clientes.get(selecClienteCheck).getNome() + " foi acomodado no quarto " + quartos.get(selecQuartoCheck).getNumero());
						hospedes.add(check);
//						System.out.println(hospedes);
					} else if((clientes.get(selecClienteCheck).clienteFumante == false) && (quartos.get(selecQuartoCheck).quartoFumante == false)) {
						check.setCliente(clientes.get(selecClienteCheck).getNome());
						check.setQuarto(quartos.get(selecQuartoCheck).getNumero());
						clientes.get(selecClienteCheck).setAcomodacao(quartos.get(selecQuartoCheck).getNumero());
						quartos.get(selecQuartoCheck).setHospede(clientes.get(selecClienteCheck).getNome());
						System.out.println("****** CHECK-IN EFETUADO COM SUCESSO ******");
						System.out.println("O Sr(a). " + clientes.get(selecClienteCheck).getNome() + " foi acomodado no quarto " + quartos.get(selecQuartoCheck).getNumero());
						hospedes.add(check);
					} else if ((clientes.get(selecClienteCheck).clienteFumante == false) && (quartos.get(selecQuartoCheck).quartoFumante == true)) {
						System.out.println("****** SELECIONE UM QUARTO PARA NAO FUMANTES ******");
						break;
					} else if ((clientes.get(selecClienteCheck).clienteFumante == true) && (quartos.get(selecQuartoCheck).quartoFumante == false)) {
						System.out.println("****** SELECIONE UM QUARTO PARA FUMANTES ******");
						break;
					}
					break;
					
				case 2:
					System.out.println("=================================================");
					System.out.println("   HOTEL SERENO - MENU HOSPEDAGEM - CHECK-OUT");
					System.out.println("=================================================");
					System.out.println("");
					System.out.println("Selecione o cliente para fazer Check-out:");
					for (i = 0; i < hospedes.size(); i++) {
						System.out.println(i + " - " + hospedes.get(i).getCliente() + " - Quarto/Suite: " + hospedes.get(i).getQuarto());
					}
					selecHospedeOut = teclado.nextInt();
					teclado.nextLine();
					System.out.println("Confirma a saida do hospede " + hospedes.get(selecHospedeOut).getCliente() + " do quarto/suite " + hospedes.get(selecHospedeOut).getQuarto() + "?(S/N)");
					confirmaCheckOut = teclado.nextLine();
					if (confirmaCheckOut.equals("s")) {
						for (i = 0; i < clientes.size(); i++) {
							if (clientes.get(i).getAcomodacao() == hospedes.get(selecHospedeOut).getQuarto()) {
								clientes.get(i).setAcomodacao(null);
							}
						}
						for (i = 0; i < quartos.size(); i++) {
							if (quartos.get(i).getHospede() == hospedes.get(selecHospedeOut).getCliente()) {
								quartos.get(i).setHospede(null);
							}
						}
						hospedes.remove(selecHospedeOut);
						System.out.println("****** CHECK-OUT EFETUADO COM SUCESSO ******");
					} else if (confirmaCheckOut.equals("n")) {
						System.out.println("******   OPERACAO CANCELADA   ******");
						break;
					}
					break;
					
				case 3:
					System.out.println("=================================================");
					System.out.println("HOTEL SERENO - MENU HOSPEDAGEM - QUARTOS VAGOS");
					System.out.println("=================================================");
					System.out.println("");
					for (i = 0; i < quartos.size(); i++) {
						if (quartos.get(i).getHospede() == null) {
							System.out.println(i + " - " + quartos.get(i).getNome() + " - " + quartos.get(i).getNumero() + " Fumante: " + quartos.get(i).getFumante());
						}
					}
					break;
					
				case 4:
					System.out.println("=================================================");
					System.out.println("HOTEL SERENO - MENU HOSPEDAGEM - QUARTOS OCUPADOS");
					System.out.println("=================================================");
					System.out.println("");
					for (i = 0; i < hospedes.size(); i++) {
						System.out.println("Quarto/Suite: " + hospedes.get(i).getQuarto() + " / Hospede: Sr(a) " + hospedes.get(i).getCliente());
					}
					break;
				}
				
			}
			
			
		} while (opMainMenu != 0);
		teclado.close();
	}
		
}
