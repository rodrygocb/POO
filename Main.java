
package avpoo;

import avpoo.aVALIACAO;
import avpoo.fILME;
import avpoo.oPINIOES;

/**
 *
 * @author Rodrigo Costa
 */
public class Main {
    public static void main(String[] args) {
        fILME senhor_dos_aneis_1 = new fILME(1, "O Senhor dos Anéis: A Sociedade do Anel / A Irmandade do Anel",
        "aventura\n" + "épico\n" + "fantasia",
                
        "O filme narra a procura do Senhor do Escuro Sauron pelo Um Anel. O anel que atualmente está em posse do hobbit Frodo Bolseiro (Elijah Wood). O destino da Terra-média está em risco, e ele depende apenas de Frodo e mais oito companheiros que formam a Sociedade do Anel que agora rumam para a Montanha da Perdição, na Terra de Mordor, o único local onde o anel pode ser destruído.");
        
        aVALIACAO senhor_dos_aneis_1_1 = new aVALIACAO(1, "Joaozinho", 5, "Excelente filme.");
        
        aVALIACAO senhor_dos_aneis_1_2 = new aVALIACAO(1, "Mariazinha", 4, "muito sensacional.");
        
        aVALIACAO senhor_dos_aneis_1_3 = new aVALIACAO(1, "Mario", 1, "Tem muitos monstros não gostei");
        
        aVALIACAO[] arrAvalicaoSenhor1 = {senhor_dos_aneis_1_1, senhor_dos_aneis_1_2, senhor_dos_aneis_1_3};
        oPINIOES opnioesSenhor1 = new oPINIOES(arrAvalicaoSenhor1);
        
        
        
        
        
        
        
        
        
        
        
        
        fILME senhor_dos_aneis_2 = new fILME(2, "O Senhor dos Anéis: As Duas Torres",
        "aventura, épico, fantasia",
        "Seguindo o exemplo de The Lord of the Rings: The Fellowship of the Ring (no Brasil, A Sociedade do Anel e em Portugal, A Irmandade do Anel), conquistou a crítica, atingindo 95% de aprovação no Rotten Tomatoes, mais do que o antecessor que chegou a 91%. Também agradou o público, faturando mais de US$ 951 milhões mundialmente, sendo US$ 342 milhões somente nos Estados Unidos. Atualmente ocupa a vigésima segunda maior bilheteria de todos os tempos.");
        
        aVALIACAO senhor_dos_aneis_2_1 = new aVALIACAO(2, "JULIO", 1, "muITO BOM.");
        
        aVALIACAO senhor_dos_aneis_2_2 = new aVALIACAO(2, "CHICO", 3, "EXCELENTE.");
        
        aVALIACAO senhor_dos_aneis_2_3 = new aVALIACAO(2, "INGRID", 4, "NUNCA ASSISTI NADA IGUAL.");
        
        aVALIACAO[] arraVALIACAOSenhor2 = {senhor_dos_aneis_2_1, senhor_dos_aneis_2_2, senhor_dos_aneis_2_3};
        oPINIOES opnioesSenhor2 = new oPINIOES(arraVALIACAOSenhor2);

        
        
        
        
        
        
        
        
        
        
        
        fILME senhor_dos_aneis_3 = new fILME(3, "O Senhor dos Anéis: O Retorno do Rei / O Regresso do Rei", 
        "aventura, épico, fantasia",
        "Frodo e Sam aproximam-se ainda mais de Mordor com a finalidade de destruir the One Ring. Gandalf, Aragorn, Legolas e Gimli acompanhados do rei de Rohan e sua comitiva, chegam em Isengard onde encontram-se com Merry e Pippin e partem levando o Palantír. À noite, no palácio de Meduseld, Pippin o pega e a usa, revelando sua mente a Sauron. Gandalf parte com o hobbit para Minas Tirith, onde não consegue convencer o regente Denethor a acender os Faróis e pedir socorro aos aliados.");
        
        aVALIACAO senhor_dos_aneis_3_1 = new aVALIACAO(2, "JUDITY", 4, "AMEI O FILME.");
        
        aVALIACAO senhor_dos_aneis_3_2 = new aVALIACAO(2, "Tom Beasley", 2, "NÃO GOSTEI DESSE FILME.");
        
        aVALIACAO senhor_dos_aneis_3_3 = new aVALIACAO(2, "Ênio Gabriel", 5, "MUITO SURPREENDENTE.");
        
        aVALIACAO[] arraVALIACAOSenhor3 = {senhor_dos_aneis_3_1, senhor_dos_aneis_3_2, senhor_dos_aneis_3_3};
        oPINIOES opnioesSenhor3 = new oPINIOES(arraVALIACAOSenhor3);
    }
}

