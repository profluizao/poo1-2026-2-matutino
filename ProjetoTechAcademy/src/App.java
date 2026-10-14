import Dominio.AbsPessoa;

import FakeDB.ColaboradorFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorFakeDB fdb = new ColaboradorFakeDB();
        for (AbsPessoa item : fdb.getDados()) {
            item.exibir();
        }
    }
}
