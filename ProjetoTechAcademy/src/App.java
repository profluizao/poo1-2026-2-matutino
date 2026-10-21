import Dominio.*;

import DAO.*;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorDAO dao = new ColaboradorDAO();

        System.out.println("********** ANTES **********");
        for (Colaborador item : dao.Browse()) {
            item.exibir();
        }

        Colaborador colab = new Colaborador(0, "Lula", "95101", "Presidente da República");
        Colaborador novo = dao.Add(colab);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("********** ADD **********");
        for (Colaborador item : dao.Browse()) {
            item.exibir();
        }

        novo.setNome("Flávio");
        dao.Edit(novo);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("********** EDIT **********");
        for (Colaborador item : dao.Browse()) {
            item.exibir();
        }

        dao.Delete(novo);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("********** DELETE **********");
        for (Colaborador item : dao.Browse()) {
            item.exibir();
        }        

    }
}
