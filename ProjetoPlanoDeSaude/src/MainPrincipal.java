/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31610714
 */
import java.util.Scanner;
import java.util.ArrayList;

public class MainPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean fechar = false;

        Scanner string = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        ArrayList<Operadora> operadora = new ArrayList<Operadora>();
        ArrayList<PlanoDeSaude> plano = new ArrayList<PlanoDeSaude>();
        ArrayList<Segurado> segurado = new ArrayList<Segurado>();
        ArrayList<Procedimento> procedimento = new ArrayList<Procedimento>();
        ArrayList<Local> local = new ArrayList<Local>();
        ArrayList<Autorizacao> autorizacao = new ArrayList<Autorizacao>();
        ArrayList<ItemDeProcedimento> item = new ArrayList<ItemDeProcedimento>();

        while (fechar == false) {
            System.out.println("===================MENU====================");
            System.out.println("1 - Inserir Operadora");
            System.out.println("2 - Inserir Plano de Saúde");
            System.out.println("3 - Inserir um Segurado/Comprar Plano de Saúde");
            System.out.println("4 - Inserir Procedimento");
            System.out.println("5 - Inserir Local");
            System.out.println("6 - Inserir uma Autorização para um Segurado");
            System.out.println("7 - Autorizar um Segurado");
            System.out.println("8 - Vizualizar Operadoras");
            System.out.println("9 - Vizualizar Planos de Saúde");
            System.out.println("10 - Vizualizar Segurados");
            System.out.println("11 - Vizualizar Autorizações");
            System.out.println("12 - Sair");
            System.out.println("============================================");
            System.out.println("Digite sua Opção: ");
            int opcMenu = num.nextInt();

            switch (opcMenu) {
                case 1:
                    System.out.print("Digite uma Operadora: ");
                    String nomeOperadora = string.nextLine();

                    Operadora oper = new Operadora(nomeOperadora);
                    operadora.add(oper);
                    
                    System.out.println("Operadora cadastrada com Sucesso!");
                    continue;

                case 2:
                    if (operadora.isEmpty()) {
                        System.out.print("NENHUMA OPERADORA CADASTRADA!!!");
                        System.out.print("Para Cadastrar um Plano de Saúde é necessário cadastrar uma Operadora.");
                    } else {

                        System.out.println("Para Inserir um Plano escolha uma Operadora: ");
                        for (int i = 0; i < operadora.size(); i++) {
                            System.out.println(i + " - " + operadora.get(i).getNome());

                        }
                        System.out.print("Digite o número da Operadora: ");
                        int opOper = num.nextInt();

                        System.out.print("Digite o nome do Plano de Saúde: ");
                        String nomeDoPlano = string.nextLine();
                        System.out.print("Digite o numero de Autorização: ");
                        int numAut = num.nextInt();
                        PlanoDeSaude p = new PlanoDeSaude(numAut, nomeDoPlano, operadora.get(opOper));
                        

                        operadora.get(opOper).addPlanos(p);
                        plano.add(p);
                        System.out.println("Plano de Saúde cadastrado com Sucesso!");
                    }

                    continue;
                case 3:
                    if (plano.isEmpty()) {
                        System.out.println("NENHUM PLANO DE SAÚDE CADASTRADO!!!");
                        System.out.println("Para cadastrar um Segurado é necessário que exista um Plano de Saúde.");
                    } else {

                        System.out.print("Digite o nome do Segurado: ");
                        String nomeSegurado = string.nextLine();
                        System.out.print("Digite o numero do CPF: ");
                        int cpf = num.nextInt();
                        Segurado s = new Segurado(nomeSegurado, cpf);
                        
                        System.out.println("Segurado cadastrado com Sucesso!");
                        System.out.println(" ");
                        System.out.println("Escolha uma Operadora para o Segurado: ");
                        for (int i = 0; i < operadora.size(); i++) {
                            System.out.println(i + " - " + operadora.get(i).getNome());
                        }
                        System.out.print("Digite sua opção: ");
                        int opOper2 = num.nextInt();

                        for (int i = 0; i < operadora.get(opOper2).getPlanos().size(); i++) {
                            System.out.print("Deseja comprar o plano '" + operadora.get(opOper2).getPlanos().get(i).getNome() + "' para o segurado " + s.getNome() + " :(1 - SIM | 2 - NÃO) : ");
                            int opc2 = num.nextInt();
                            if (opc2 == 1) {
                                plano.get(i).addSegurado(s);
                                s.addPlanoDeSaude(plano.get(i));
                                System.out.println("Plano de Saude Adquirido com Sucesso!!!");
                            }
                        }
                        segurado.add(s);
                    }

                    continue;
                case 4:
                    if (segurado.isEmpty()) {
                        System.out.println("NENHUM SEGURADO CADASTRADO!!!");
                        System.out.println("Para cadastrar um Procedimento é necessário cadastrar um Segurado.");
                    } else {

                        System.out.println("Os tipos de Procedimento são: ");
                        System.out.println("1 - Ambulatorial");
                        System.out.println("2 - Cirurgico");
                        System.out.print("Digite sua opção: ");
                        int opc2 = num.nextInt();

                        System.out.print("Entre com o nome do procedimento: ");
                        String nomeProcedimento = string.nextLine();
                        System.out.println(" ");
                        if (opc2 == 1) {
                            System.out.print("Entre com a quantidade de técnicos necessários para o procedimento: ");
                            int qtdTecnicos = num.nextInt();
                            Procedimento procedA = new Ambulatorial(qtdTecnicos, nomeProcedimento);
                            procedA.setNome(nomeProcedimento);

                            for (int i = 0; i < plano.size(); i++) {
                                System.out.print("Para adicionar o Procedimento (" + nomeProcedimento + ") no Plano de Saúde: " + plano.get(i).getNome() + ", Digite: (1 - SIM | 2 - NÃO) : ");
                                int opc4 = num.nextInt();

                                if (opc4 == 1) {
                                    plano.get(i).addProcedimento(procedA);
                                    procedA.addPlanoDeSaude(plano.get(i));
                                    System.out.println("O Procedimento (" + nomeProcedimento + ") foi adicionado no Plano de Saúde: " + plano.get(i).getNome());

                                }
                            }
                            procedimento.add(procedA);

                            System.out.println("Procedimento cadastrado com sucesso!");

                        } else {
                            if (opc2 == 2) {
                                System.out.print("Entre com a quantidade de técnicos necessários para o procedimento: ");
                                int qtdTecnicos = num.nextInt();
                                Procedimento procedC = new Cirurgico(qtdTecnicos, nomeProcedimento);
                                procedC.setNome(nomeProcedimento);

                                for (int i = 0; i < plano.size(); i++) {
                                    System.out.print("Para adicionar o Procedimento (" + nomeProcedimento + ") no Plano de Saúde: " + plano.get(i).getNome() + ", Digite: (1 - SIM | 2 - NÃO) : ");
                                    int opc4 = num.nextInt();
                                    System.out.println(" ");
                                    if (opc4 == 1) {
                                        plano.get(i).addProcedimento(procedC);
                                        procedC.addPlanoDeSaude(plano.get(i));
                                        System.out.println("O Procedimento (" + nomeProcedimento + ") foi adicionado no Plano de Saúde : " + plano.get(i).getNome());

                                    }
                                }
                                procedimento.add(procedC);

                                System.out.println("Procedimento cadastrado com sucesso!");
                            }
                        }
                    }

                    continue;

                case 5:
                    if (segurado.isEmpty()) {
                        System.out.println("NENHUM PROCEDIMENTO CADASTRADO");
                        System.out.println("Para inserir um Local é necessário cadastrar um Segurado");
                    } else {
                        System.out.println("1 - Clínica");
                        System.out.println("2 - Hospital");
                        System.out.print("Selecione o tipo do local que deseja cadastrar: ");
                        int opcLocal = num.nextInt();

                        System.out.print("Entre com o nome do local: ");
                        String nomeLocal = string.nextLine();

                        if (opcLocal == 1) {
                            System.out.print("Digite o nome do Médico responsável da Clínica: ");
                            String nomeMedico = string.nextLine();

                            System.out.print("Entre com o CEP da clínica: ");
                            int cep = num.nextInt();

                            Local l = new Clinica(nomeMedico, nomeLocal, cep);
                            int cont = 0;
                            for (int i = 0; i < procedimento.size(); i++) {
                                if (procedimento.get(i) instanceof Ambulatorial) {
                                    System.out.print("Deseja adicionar o procedimento (" + procedimento.get(i).getNome() + ") no local: " + nomeLocal + " ? (1 - SIM | 2 - NÃO) : ");
                                    int opLo = num.nextInt();
                                    System.out.println(" ");
                                    if (opLo == 1) {
                                        ((Clinica) l).addAmbulatorial((Ambulatorial) procedimento.get(i));
                                        ((Ambulatorial) procedimento.get(i)).addClinica(((Clinica) l));
                                        System.out.println("Procedimento (" + procedimento.get(i).getNome() + ") adicionado no local '" + nomeLocal + "' com sucesso!");

                                    }
                                    System.out.println(" ");
                                    cont = 1;
                                }
                            }

                            if (cont == 0) {
                                System.out.println("Nenhum procedimento cadastrado como ambulatorial!");
                                System.out.println(" ");
                            }
                            local.add(l);
                            System.out.println("Local cadastrado com sucesso!");

                            continue;
                        } else {
                            if (opcLocal == 2) {
                                System.out.print("Entre com a quantidade de médicos do hospital: ");
                                int qtdMedico = num.nextInt();
                                System.out.println(" ");

                                System.out.print("Entre com o CEP da clínica: ");
                                int cep = num.nextInt();
                                Local lH = new Hospital(qtdMedico, nomeLocal, cep);
                                int cont2 = 0;
                                for (int i = 0; i < procedimento.size(); i++) {
                                    if (procedimento.get(i) instanceof Cirurgico) {
                                        System.out.print("Deseja adicionar o procedimento (" + procedimento.get(i).getNome() + ") no local: " + nomeLocal + " ? (1 - SIM | 2 - NÃO) : ");
                                        int opLo = num.nextInt();

                                        if (opLo == 1) {
                                            ((Hospital) lH).addCirurgico((Cirurgico) procedimento.get(i));
                                            ((Cirurgico) procedimento.get(i)).addHospital(((Hospital) lH));
                                            System.out.println("Procedimento (" + procedimento.get(i).getNome() + ") adicionado no local '" + nomeLocal + "' com sucesso!");

                                        }
                                        System.out.println(" ");
                                        cont2 = 1;
                                    }

                                }
                                if (cont2 == 0) {
                                    System.out.println("Nenhum procedimento cadastrado como cirurgico!");
                                    System.out.println(" ");
                                }
                                local.add(lH);
                                System.out.println("Local cadastrado com sucesso!");
                                continue;

                            }
                        }
                    }
                case 6:
                    if (segurado.isEmpty()) {
                        System.out.println("NENHUM SEGURADO CADASTRADO!!!");
                        System.out.println("Para realizar uma Autorização é necessário cadastrar um Segurado.");
                    } else {
                        for (int i = 0; i < segurado.size(); i++) {
                            System.out.println(i + " - " + segurado.get(i).getNome());
                        }
                        System.out.println("Selecione o segurado no qual deseja criar uma autorização: ");
                        int opSeg2 = num.nextInt();
                        System.out.println(" ");

                        for (int i = 0; i < segurado.get(opSeg2).getPlanoDeSaude().size(); i++) {
                            System.out.println(i + " - " + segurado.get(opSeg2).getPlanoDeSaude().get(i).getNome());
                        }
                        System.out.println("Selecione o plano do segurado " + segurado.get(opSeg2).getNome() + " no qual deseja criar uma autorização: ");
                        int opPl = num.nextInt();

                        if (segurado.get(opSeg2).getPlanoDeSaude().get(opPl).getProcedimento().isEmpty()) {
                            System.out.println("Nenhum procedimento cadastrado no plano " + segurado.get(opSeg2).getPlanoDeSaude().get(opPl).getNome());
                            System.out.println("Cadastre um procedimento para fazer uma autorização!");
                            continue;
                        } else {
                            boolean sair1 = false;
                            System.out.print("Digite a data da autorização: ");
                            String data = string.nextLine();
                            Autorizacao a = new Autorizacao(data);

                            while (sair1 == false) {

                                for (int i = 0; i < segurado.get(opSeg2).getPlanoDeSaude().get(opPl).getProcedimento().size(); i++) {
                                    System.out.println(i + " - " + segurado.get(opSeg2).getPlanoDeSaude().get(opPl).getProcedimento().get(i).getNome());

                                }
                                System.out.print("Selecione o procedimento que deseja fazer uma autorização: ");
                                int opPr = num.nextInt();

                                System.out.print("Entre com a quantidade do procedimento selecionado: ");
                                int qtdProc = num.nextInt();
                                System.out.println(" ");

                                ItemDeProcedimento it = new ItemDeProcedimento(qtdProc);

                                a.addItemDeProcedimento(it);
                                it.addAutorizacao(a);
                                item.add(it);

                                System.out.print("Deseja adicionar outro item na autorização? (1 - SIM | 2 - NÃO): ");
                                int opcAut = num.nextInt();
                                System.out.println(" ");

                                if (opcAut == 2) {
                                    sair1 = true;
                                    autorizacao.add(a);
                                    segurado.get(opSeg2).addAutorizacao(a);
                                    a.addSegurado(segurado.get(opSeg2));
                                }

                            }

                            autorizacao.add(a);

                            System.out.println("Autoricação criada com sucesso!");
                            System.out.println("Estado: " + a.getEstado());
                            continue;

                        }

                    }
                case 7:
                    if (segurado.isEmpty()) {
                        System.out.println("NENHUM SEGURADO CADASTRADO!!!");
                        System.out.println("Para Autorizar um Segurado é necessário cadastrar um Segurado.");
                    } else {
                        for (int i = 0; i < segurado.size(); i++) {
                            System.out.println(i + " - " + segurado.get(i).getNome());
                        }
                        System.out.print("Selecione o segurado que deseja autorizar/negar uma autorização: ");
                        int opSeg3 = num.nextInt();

                        if (segurado.get(opSeg3).getAutorizacao().isEmpty()) {
                            System.out.println("Nenhuma autorização feita para esse segurado!");
                            continue;
                        } else {
                            for (int i = 0; i < segurado.get(opSeg3).getAutorizacao().size(); i++) {
                                System.out.println(i + " - " + segurado.get(opSeg3).getAutorizacao().get(i).getEstado() + " | Data: " + segurado.get(opSeg3).getAutorizacao().get(i).getDataDaAvaliação());
                            }
                            System.out.print("Selecione a autorização pendende que deseja autorizar/negar: ");
                            int opAu = num.nextInt();
                            System.out.println(" ");
                            System.out.println("1 - Autorizar");
                            System.out.println("2 - Negar");
                            System.out.print("Digite sua Opção: ");
                            int opcAut = num.nextInt();

                            if (opcAut == 1) {
                                segurado.get(opSeg3).getAutorizacao().get(opAu).autorizar();
                                System.out.println(segurado.get(opSeg3).getAutorizacao().get(opAu).getEstado());
                                continue;
                            } else {
                                segurado.get(opSeg3).getAutorizacao().get(opAu).negar();
                                System.out.println(segurado.get(opSeg3).getAutorizacao().get(opAu).getEstado());
                                continue;
                            }

                        }
                    }
                case 8:
                    if(operadora.isEmpty()){
                        System.out.println("NENHUMA OPERADORA CADASTRADA");
                    }else{
                        System.out.println("Operadoras Cadastradas: ");
                        for (int i = 0; i < operadora.size(); i++) {
                            System.out.println("- "+ operadora.get(i).getNome());
                            
                        }
                    }
                    continue;
                
                case 9:
                    if(plano.isEmpty()){
                        System.out.println("NENHUM PLANO DE SAÚDE CADASTRADO");
                    }else{
                        System.out.println("Planos de Saúde Cadastrados: ");
                        for (int i = 0; i < plano.size(); i++) {
                            System.out.println(plano.get(i).getNome()+ " - Número de Autorização: "+ plano.get(i).getNumDeAutorzacao()+ "| Operadora: "+plano.get(i).getOperadora().getNome());
                            
                        }
                        System.out.println(" ");
                    }
                    continue;
                
                case 10:
                    if(segurado.isEmpty()){
                        System.out.println("NENHUM SEGURADO CADASTRADO"); 
                    }else{
                        System.out.println("Segurados Cadastrados:");
                        for (int i = 0; i < segurado.size(); i++) {
                            for (int j = 0; j < segurado.get(i).getPlanoDeSaude().size(); j++) {
                              System.out.println(segurado.get(i).getNome()+" - CPF: "+ segurado.get(i).getCpf()+" |Plano de Saúde: "+segurado.get(i).getPlanoDeSaude().get(j).getNome());  
                                
                            }
                            
                            
                        }
                    }
                    continue;
                case 11:
                    if (segurado.isEmpty()) {
                                System.out.println("Nenhum segurado cadastrado!");
                            } else {
                                for (int i = 0; i < segurado.size(); i++) {
                                    System.out.println("Autorizações do segurado " + segurado.get(i).getNome() + " : ");
                                    for (int j = 0; j < segurado.get(i).getAutorizacao().size(); j++) {
                                        System.out.println(" ");
                                        System.out.println("Data: " + segurado.get(i).getAutorizacao().get(j).getDataDaAvaliação());
                                        System.out.println("Estado: "+segurado.get(i).getAutorizacao().get(j).getEstado());

                                    }
                                }
                    }
                case 12:
                    System.out.println("SISTEMA ENCERRADO");
                    break;

            }
            break;
        }
    }
}

