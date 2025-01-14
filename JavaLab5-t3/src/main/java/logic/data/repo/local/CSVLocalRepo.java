package logic.data.repo.local;

import logic.DIO.Repo;
import logic.data.model.HumanBeing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

public class CSVLocalRepo implements Repo {
    private FileWriter fileWriter;
    private static CSVLocalRepo instance;
    private String fileName = "FileName";

    private CSVLocalRepo() {}
    // Реализация singleton класса
    public static CSVLocalRepo getInstance() {
        if (instance == null) {
            instance = new CSVLocalRepo();
        }
        return instance;
    }

    public void fileWriterInit(String fileName) {
        try {
            fileWriter = new FileWriter(fileName + ".csv");
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    @Override
    public void writeData(Hashtable<Integer, HumanBeing> humanBeings) {
        again:
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            // TODO: ТУДУ ЁПТА, ТУТ НИЧЕ НЕ ГОТОВО
        } catch (NullPointerException | IOException e) {
            System.out.println(e);
            System.out.println(humanBeings);
            fileWriterInit(fileName);
            break again;
        }
    }

    @Override
    public Hashtable<Integer, HumanBeing> getData() {
        return null;
    }
}
