package NotesApp1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class NotesApp extends JFrame {
    JTextArea notesTextArea;

    public NotesApp() {
        setTitle("Notes App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        notesTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(notesTextArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveMenuItem = new JMenuItem("Save Note");
        JMenuItem loadMenuItem = new JMenuItem("Load Note");
        JMenuItem deleteMenuItem = new JMenuItem("Delete Note");
        JMenuItem loadTemplateMenuItem = new JMenuItem("Load Template");
        JMenuItem saveTemplateMenuItem = new JMenuItem("Save Template");

        saveMenuItem.addActionListener(e -> saveNote());
        loadMenuItem.addActionListener(e -> loadNote());
        deleteMenuItem.addActionListener(e -> deleteNote());
        loadTemplateMenuItem.addActionListener(e -> loadTemplate());
        saveTemplateMenuItem.addActionListener(e -> saveTemplate());

        fileMenu.add(saveMenuItem);
        fileMenu.add(loadMenuItem);
        fileMenu.add(deleteMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(saveTemplateMenuItem);
        fileMenu.add(loadTemplateMenuItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);
    }

    private void saveNote() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter writer = new FileWriter(fileChooser.getSelectedFile());
                writer.write(notesTextArea.getText());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadNote() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                FileReader reader = new FileReader(fileChooser.getSelectedFile());
                BufferedReader bufferedReader = new BufferedReader(reader);
                notesTextArea.read(bufferedReader, null);
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteNote() {
        notesTextArea.setText("");
    }
    
    
    private void saveTemplate() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter writer = new FileWriter(fileChooser.getSelectedFile());
                writer.write(notesTextArea.getText());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
     private void loadTemplate() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                FileReader reader = new FileReader(fileChooser.getSelectedFile());
                BufferedReader bufferedReader = new BufferedReader(reader);
                notesTextArea.read(bufferedReader, null);
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NotesApp notesApp = new NotesApp();
            notesApp.setVisible(true);
        });
    }
  }
