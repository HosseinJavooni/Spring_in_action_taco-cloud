package tacos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// @Getter
// @Setter
// @AllArgsConstructor
@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
