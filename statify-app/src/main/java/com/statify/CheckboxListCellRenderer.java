package com.statify;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.ListCellRenderer;
import javax.swing.JList;

public class CheckboxListCellRenderer extends JCheckBox implements ListCellRenderer {
    public Component getListCellRendererComponent(JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {

        setComponentOrientation(list.getComponentOrientation());
        setFont(list.getFont());
        setBackground(list.getBackground());
        setForeground(list.getForeground());
        setSelected(isSelected);
        setEnabled(list.isEnabled());
        setText(value == null ? "" : value.toString());

        return this;
    }
}
