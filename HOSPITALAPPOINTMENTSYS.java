import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class HOSPITALAPPOINTMENTSYS {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hospital Appointment Booking System");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel title = new JLabel("City Hospital Appointment Booking");
        title.setBounds(80, 20, 400, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(title);

        JLabel nameLabel = new JLabel("Patient Name:");
        nameLabel.setBounds(50, 80, 120, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(180, 80, 200, 25);
        frame.add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 120, 120, 25);
        frame.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(180, 120, 200, 25);
        frame.add(ageField);

        JLabel doctorLabel = new JLabel("Select Doctor:");
        doctorLabel.setBounds(50, 160, 120, 25);
        frame.add(doctorLabel);

        String doctors[] = {"Cardiologist", "Dermatologist", "Neurologist"};
        JComboBox<String> doctorBox = new JComboBox<>(doctors);
        doctorBox.setBounds(180, 160, 200, 25);
        frame.add(doctorBox);

        JLabel dateLabel = new JLabel("Appointment Date:");
        dateLabel.setBounds(50, 200, 150, 25);
        frame.add(dateLabel);

        JTextField dateField = new JTextField("DD/MM/YYYY");
        dateField.setBounds(180, 200, 200, 25);
        frame.add(dateField);

        JButton submitButton = new JButton("Book Appointment");
        submitButton.setBounds(150, 260, 180, 35);
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String age = ageField.getText();
                String doctor = doctorBox.getSelectedItem().toString();
                String date = dateField.getText();

                if(name.isEmpty() || age.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields!");
                } else {

                    try {
                        // Load Driver
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        // Connect Database
                        Connection con = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/hospital_db",
                                "root",
                                ""
                        );

                        // Insert Query
                        String query = "INSERT INTO appointments(patient_name, age, doctor, appointment_date) VALUES (?, ?, ?, ?)";

                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(1, name);
                        ps.setInt(2, Integer.parseInt(age));
                        ps.setString(3, doctor);
                        ps.setString(4, date);

                        ps.executeUpdate();
                        con.close();

                        JOptionPane.showMessageDialog(frame, "Appointment Saved Successfully!");

                        nameField.setText("");
                        ageField.setText("");
                        dateField.setText("");

                    } catch(Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(frame, "Database Error!");
                    }
                }
            }
        });

        frame.setVisible(true);
    }
}