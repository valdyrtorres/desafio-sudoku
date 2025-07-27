package br.com.dio.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FinishGameStatusButton extends JButton {

    public FinishGameStatusButton(final ActionListener actionListener) {
        this.setText("Concluir");
        this.addActionListener(actionListener);
    }
}
