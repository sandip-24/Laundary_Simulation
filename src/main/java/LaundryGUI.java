import javax.swing.*;
import java.awt.*;

public class LaundryGUI extends JFrame {

          private final JLabel arrivedLabel = new JLabel("Customers Arrived: 0");
          private final JLabel servedLabel = new JLabel("Customers Served: 0");
          private final JLabel washerLabel = new JLabel("Washers in Use: 0 / 6");
          private final JLabel dryerLabel = new JLabel("Dryers in Use: 0 / 4");
          private final JLabel paymentLabel = new JLabel("Payment Queue: 0");
          private final JLabel statusLabel = new JLabel("Status: Simulation Running");

          public LaundryGUI() {

                    setTitle("Smart Laundry Facility");
                    setSize(500, 350);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setLocationRelativeTo(null);

                    JPanel panel = new JPanel();
                    panel.setLayout(new GridLayout(6, 1, 10, 10));
                    panel.setBorder(BorderFactory.createEmptyBorder(
                              20, 20, 20, 20
                    ));

                    Font font = new Font("Arial", Font.BOLD, 18);

                    arrivedLabel.setFont(font);
                    servedLabel.setFont(font);
                    washerLabel.setFont(font);
                    dryerLabel.setFont(font);
                    paymentLabel.setFont(font);
                    statusLabel.setFont(font);

                    panel.add(arrivedLabel);
                    panel.add(servedLabel);
                    panel.add(washerLabel);
                    panel.add(dryerLabel);
                    panel.add(paymentLabel);
                    panel.add(statusLabel);

                    add(panel);

                    setVisible(true);
          }


          public void updateArrived(int value) {
                    SwingUtilities.invokeLater(() ->
                              arrivedLabel.setText(
                                        "Customers Arrived: " + value
                              )
                    );
          }

          public void updateServed(int value) {
                    SwingUtilities.invokeLater(() ->
                              servedLabel.setText(
                                        "Customers Served: " + value
                              )
                    );
          }

          public void updateWashers(int value) {
                    SwingUtilities.invokeLater(() ->
                              washerLabel.setText(
                                        "Washers in Use: " + value + " / 6"
                              )
                    );
          }

          public void updateDryers(int value) {
                    SwingUtilities.invokeLater(() ->
                              dryerLabel.setText(
                                        "Dryers in Use: " + value + " / 4"
                              )
                    );
          }

          public void updatePaymentQueue(int value) {
                    SwingUtilities.invokeLater(() ->
                              paymentLabel.setText(
                                        "Payment Queue: " + value
                              )
                    );
          }

          public void updateStatus(String message) {
                    SwingUtilities.invokeLater(() ->
                              statusLabel.setText(
                                        "Status: " + message
                              )
                    );
          }
}