import java.sql.*;
public class database {
    private static final String DB_URL = "jdbc:sqlite:budget.db";
    public database() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                System.out.println("Database connected");
                createTable(conn);
            }
        }
        catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
    private void createTable(Connection conn) throws SQLException {
            String sql = "CREATE TABLE IF NOT EXISTS transactions (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "date TEXT, " +
                        "category TEXT, " +
                        "amount REAL)";
            try(Statement stat = conn.createStatement()) {
                stat.executeUpdate(sql);
                System.out.println("Table Created Successfully");
            } 
    }
    public void addTransaction(String date, String category, double amount){
        String sql = "INSERT INTO transactions (date, category, amount) VALUES (?,?,?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
            PreparedStatement stat = conn.prepareStatement(sql)) {
                stat.setString(1, date);
                stat.setString(2, category);
                stat.setDouble(3, amount);
                stat.executeUpdate();
                System.out.println("Transaction ADDED");
            } catch(SQLException e) {
                System.out.println("failed connection");
                e.printStackTrace();
            }
    }
    

    public void printAllTransactions() {
        String sql = "SELECT * FROM transactions";
        try( Connection conn = DriverManager.getConnection(DB_URL);
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql)) {
        
        System.out.println(" \n Transactions in database:");
        while(rs.next()) {
            int id = rs.getInt("id");
            String date = rs.getString("date");
            String category = rs.getString("category");
            double amount = rs.getDouble("amount");
            System.out.printf("ID: %d | Date: %s | Category: %s | Amount: %.2f%n", id, date, category, amount);
        }
        } catch(SQLException e) {
            System.out.println("Failed to Retrieve Transactions");
            e.printStackTrace();
        }
    }




}
