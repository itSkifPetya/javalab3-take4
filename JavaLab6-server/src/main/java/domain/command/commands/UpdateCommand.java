package domain.command.commands;

import data.models.HumanBeingModel.Car;
import data.models.HumanBeingModel.Coordinates;
import data.models.HumanBeingModel.HumanBeing;
import data.models.HumanBeingModel.WeaponType;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class UpdateCommand implements Command {

    @Override
    public int getArgsCount() {
        return 1;
    }

    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        io.post(collection.elements().toString());
        String name;
        Coordinates coordinates;
        Boolean realHero;
        Boolean hasToothpick;
        double impactSpeed;
        String soundtrackName;
        long minutesOfWaiting;
        WeaponType weaponType;
        Car car;

        int coordX = 0;
        double coordY = 0.0;

        HumanBeing humanBeing;
        while (true) {
            try {
                // Ввод имени
                name = io.get("Введите имя: ");
                if (name == null || name.trim().isEmpty()) {
                    throw new IllegalArgumentException("Имя не может быть пустым.");
                }
                // Ввод X координаты
                while (true) {
                    try {
                        coordX = Integer.parseInt(io.get("Введите X координату (int): "));
                        break; // Выход из цикла, если ввод корректен
                    } catch (NumberFormatException e) {
                        io.post("Ошибка: Введите целое число (int).");
                    }
                }

                // Ввод Y координаты
                while (true) {
                    try {
                        coordY = Double.parseDouble(io.get("Введите Y координату (double): "));
                        break; // Выход из цикла, если ввод корректен
                    } catch (NumberFormatException e) {
                        io.post("Ошибка: Введите число с плавающей точкой (double).");
                    }
                }

                // Создание объекта Coordinates
                coordinates = new Coordinates(coordX, coordY);

                // Ввод realHero
                realHero = readBoolean(io, "Реальный герой (boolean)? (true/false): ");


                // Ввод hasToothpick
                hasToothpick = readBoolean(io, "Есть зубочистка (boolean)? (true/false): ");


                // Ввод impactSpeed
                while (true) {
                    try {
                        impactSpeed = Double.parseDouble(io.get("Введите скорость в момент аварии (double): "));
                        break; // Выход из цикла, если ввод корректен
                    } catch (NumberFormatException e) {
                        io.post("Ошибка: Введите число с плавающей точкой (double).");
                    }
                }

                // Ввод soundtrackName
                soundtrackName = io.get("Введите название трека: ");
                if (soundtrackName == null || soundtrackName.trim().isEmpty()) {
                    throw new IllegalArgumentException("Название трека не может быть пустым.");
                }

                // Ввод minutesOfWaiting
                while (true) {
                    try {
                        minutesOfWaiting = Long.parseLong(io.get("Введите время ожидания (long): "));
                        break; // Выход из цикла, если ввод корректен
                    } catch (NumberFormatException e) {
                        io.post("Ошибка: Введите целое число (long).");
                    }
                }

                // Ввод weaponType
                while (true) {
                    try {
                        weaponType = WeaponType.valueOf(io.get("Введите тип оружия: \nAXE\nPISTOL\nSHOTGUN\nMACHINE_GUN\nBAT\n"));
                        break; // Выход из цикла, если ввод корректен
                    } catch (IllegalArgumentException e) {
                        io.post("Ошибка: Введите один из доступных типов оружия.");
                    }
                }

                // Ввод car
                car = new Car(readBoolean(io, "Крутая машина (boolean)? (true/false): "));

                // Создание объекта HumanBeing
                humanBeing = HumanBeing.insertHumanBeing(Integer.valueOf(args[1]), name, coordinates, realHero, hasToothpick, impactSpeed, soundtrackName, minutesOfWaiting, weaponType, car);
                break; // Выход из основного цикла

            } catch (NullPointerException | IllegalArgumentException e) {
                io.post(e.getMessage());
            }
        }
        if (collection.get(humanBeing.getId()) == null) {
            io.post("Элемент с id %s не найден. Воспользуйтесь командой insert (см help)".formatted(humanBeing.getId()));
        } else {
            collection.replace(humanBeing.getId(), humanBeing);
        }
    }
    private boolean readBoolean(RequestManager io, String prompt) {
        while (true) {
            String input = io.get(prompt).toLowerCase();
            if (input.equals("true") || input.equals("false")) {
                return Boolean.parseBoolean(input);
            }
            io.post("Ошибка: введите 'true' или 'false'");
        }
    }
}
