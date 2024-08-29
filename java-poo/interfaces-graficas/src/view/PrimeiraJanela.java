package view;

import javax.swing.*;
import java.awt.*;

public class PrimeiraJanela extends JFrame {
    public void PrimeiraJanela() {
        initComponents();
    }

    private void initComponents() {
        setPreferredSize(new Dimension(500, 500));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
    }
}

