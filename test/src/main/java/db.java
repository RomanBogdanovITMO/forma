import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class db {

   /* // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://127.0.0.1:3306/zayav";
    private static final String user = "root";
    private static final String password = "1234";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String[] args) {


        String query = "INSERT INTO zayav.client (surname, name, patronymic) \n" +
                " VALUES ( , '', '');";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query

            // executing SELECT query
            stmt.executeUpdate(query);


        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) { *//*can't do anything *//* }
            try {
                stmt.close();
            } catch (SQLException se) { *//*can't do anything *//* }
            try {
                rs.close();
            } catch (SQLException se) { *//*can't do anything *//* }
        }
    }
    */

    private final SessionFactory sessionFactory;

    public db() {
        Configuration configuration = new Configuration()
                .configure("hiber.xml");
        Metadata metadata = new MetadataSources(createServiceRegistry(configuration))
                .addAnnotatedClass(Place.class)
                .getMetadataBuilder()
                .build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();

    }

    private static StandardServiceRegistry createServiceRegistry(Configuration configuration){
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        return serviceRegistry;
    }


    public void create(Place place) {
        try (Session session = sessionFactory.openSession()) {
                session.beginTransaction();
                session.save(place);
                session.getTransaction().commit();

        }
    }


}



