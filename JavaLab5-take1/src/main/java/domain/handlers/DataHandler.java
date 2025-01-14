package domain.handlers;

import data.models.HumanBeingModel.HumanBeing;

import java.util.Hashtable;

public class DataHandler {
    private static DataHandler instance;
    private Hashtable<Integer, HumanBeing> dataset;
    private int[] ids = {};

    private DataHandler() {}

    public static DataHandler getDataHandler() {
        if (instance == null) {
            instance = new DataHandler();
        }
        return instance;
    }

    public Hashtable<Integer, HumanBeing> getHashtableFromString(String str) {
        Hashtable<Integer, HumanBeing> hashtable = new Hashtable<>();
        for (String x : str.split(";")) {

//            dataset.put();
        }
        return hashtable;
    }

    private int getLastId() {
        int id = 0;

        return id;
    }

    private HumanBeing getHumanBeingFromString(String str) {
        HumanBeing humanBeing = new HumanBeing();
        for (String field : str.split(",")) {

        }
        return humanBeing;
    }

}
