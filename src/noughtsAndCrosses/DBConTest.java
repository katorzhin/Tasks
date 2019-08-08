package noughtsAndCrosses;

import java.sql.*;

public class DBConTest {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest?serverTimezone=UTC", "root", "root");

        // getting Statement object to execute query
        Statement stmt = connection.createStatement();


        String sql = "CREATE TABLE IF NOT EXISTS `mydbtest`.`game` (\n" +
                "  `player` VARCHAR(45) NOT NULL,\n" +
                "  `turn` VARCHAR(45) NOT NULL);\n";
        stmt.executeUpdate(sql);
//        stmt.execute("INSERT INTO game (player, turn)\n" +
//                "VALUES ('X', 'A1');");
        String preparedSQL ="INSERT INTO game (player, turn) VALUES (?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(preparedSQL);
        preparedStatement.setString(1, "O");
        preparedStatement.setString(2, "B2");
        preparedStatement.executeUpdate();
//        // executing SELECT query
//        ResultSet rs = stmt.executeQuery("SELECT * from users;");
//
//        while (rs.next()) {
//            int age = rs.getInt("age");
//            String name = rs.getString("name");
//            String email = rs.getString("email");
//            System.out.println("Age is:"+age+" name is:" +name+" email is:"+email);
//        }
        stmt.close();
        connection.close();
    }
}