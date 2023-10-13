package geometry.exeption;

import geometry.figur.Figur;

public class ExceptionCheckAll {

    public static void nullPointerAll(Figur side) throws NullPointer {

        if (side.A != null && side.A <= 0 ) {
            throw new NullPointer("Значение должно быть больше 0");
        }else if (side.H != null && side.H <= 0) {
            throw new NullPointer("Значение должно быть больше 0");
        } else if (side.C != null && side.C <= 0) {
            throw new NullPointer("Значение должно быть больше 0");
        }else if (side.R != null && side.R <= 0) {
            throw new NullPointer("Значение должно быть больше 0");
        }
    }
}
