package br.edu.ifpb;

import java.util.StringJoiner;

public class Conversor {

    public String converterHex(Integer decimal) {

        return Integer.toHexString(decimal);

    }

    public String converterBin(Integer decimal) {

        return Integer.toBinaryString(decimal);

    }

}
