import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBBDD {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://${DB_HOST}/prueva";
    private static final String USUARIO = "${DB_USER}";
    private static final String CLAVE = "${DB_PASSWORD}";

    public static Connection Conexion() {
        Connection conex = null;

        try {
            Class.forName(DRIVER);
            conex = DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos.\n"
                    + e.getMessage().toString());
        }
        return conex;
    }

    public static void main(String[] args) {
        Connection conex = null;
        conex = Conexion();

        if (conex != null) {
            System.out.println("Conectado correctamente");
        } else {
            System.out.println("No has podido conectarte");
        }

    }
}
