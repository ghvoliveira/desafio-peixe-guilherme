package models;

import java.util.LinkedHashMap;
import java.util.Map;

public enum TypeDeal {
    LOCAL(1),
    PRODUTO(2),
    VIAGEM(3);

    public final int id;

    TypeDeal(int id) {
        this.id = id;
    }

    public static Map<String, String> options(){
        LinkedHashMap<String, String> vals = new LinkedHashMap<String, String>();
        for (TypeDeal cType: TypeDeal.values()) {
            vals.put(cType.id(), cType.name());
        }
        return vals;
    }

    private String id() {
        return ""+this.id;
    }
};
