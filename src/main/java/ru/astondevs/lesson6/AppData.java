package ru.astondevs.lesson6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AppData {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void save(String filePath) throws IOException {
        File file = new File(filePath);
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            for (String h : header) {
                out.write(h + ";");
            }
            out.newLine();

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    out.write(data[i][j] + ";");
                }
                out.newLine();
            }
        }
    }


    public String[] load(String filePath) throws IOException {
        File file = new File(filePath);
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
            return lines.toArray(new String[lines.size()]);
        }
    }
}





