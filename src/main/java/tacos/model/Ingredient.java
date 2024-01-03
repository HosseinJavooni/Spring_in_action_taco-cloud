package tacos.model;

import lombok.Data;

import java.util.Objects;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    Objects objects;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
