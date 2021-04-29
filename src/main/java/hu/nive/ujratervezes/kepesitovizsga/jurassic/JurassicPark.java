package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private MariaDbDataSource dataSource;

    public JurassicPark(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation()
    {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select breed from dinosaur where actual > expected ORDER BY breed asc;")
        ) {
            List<String> result = new ArrayList<>();
            while (rs.next()) {
                String breed = rs.getString("breed");
                result.add(breed);
            }
            return result;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select dinosaurs", se);
        }
    }

}
