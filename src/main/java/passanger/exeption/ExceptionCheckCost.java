package passanger.exeption;

public class ExceptionCheckCost {

    public static void nullPointerPlaces(Integer places) throws NullMatter {

        if (places != null &&places <= 0) {
            throw new NullMatter("Значение должно быть больше 0");
        }
    }

    public static void nullPointerWagons(Integer wagons) throws NullMatter {

        if (wagons != null && wagons <= 0) {
            throw new NullMatter("Значение должно быть больше 0");
        }
    }
}
