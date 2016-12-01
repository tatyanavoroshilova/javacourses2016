package com.epam.javacourses2016.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Ввести строки из файла, записать в список.
 * Вывести строки в файл в обратном порядке.
 */
public class SolverTask1 {

    /**
     * Читает строки из исходного файла и сохраняет в выходной в обратном порядке.
     *
     * @param input  Файл с входными данными.
     * @param output Файл с выходными данными.
     * @return Список строк, прочитанных из входного файла в прямом порядке.
     */
    public List<String> reverseFile(File input, File output) {
        //TODO: realize solver of a task
        ArrayList<String> list = new ArrayList<String>();

        String s;
        try (FileReader fr = new FileReader(input); BufferedReader br = new BufferedReader(fr)) {
            while ((s = br.readLine()) != null) {
                list.add(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        Collections.reverse(list);

        try (FileWriter write = new FileWriter(output)) {
            for (String line : list) {
                write.write(line + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Collections.reverse(list);

        return list;
    }
}
