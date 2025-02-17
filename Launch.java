import javax.swing.SwingUtilities;

public class Launch {
    public static void main(String[] args) {
        // gui myGui = new gui();
        // database myDatabase = new database();

       // myDatabase.addTransaction("2025-02-6", "shopping", 225.00);
       // myDatabase.addTransaction("2025-02-5", "shopping", 155.00);
       // myDatabase.printAllTransactions();
        SwingUtilities.invokeLater(() -> new budget());
    }
}