package function;

import java.util.function.Supplier;

public class SupplierExample {

    public static String getConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    public static Supplier<String> getConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
}
