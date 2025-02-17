package hu.soter;

import hu.soter.idomok.FaIdom;
import hu.soter.idomok.Gomb;

import java.util.ArrayList;

public class FaIdomokProgram {
    ArrayList<FaIdom> lista;

    public FaIdomokProgram(ArrayList<FaIdom> lista) {
        this.lista = new ArrayList<>();
    }

    public ArrayList<FaIdom> getLista() {
        return new ArrayList<>(lista);
    }

    public void ujIdom(Gomb gomb) {

    }
}
