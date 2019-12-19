package app.model;

import app.entities.Transaction;
import app.entities.User;
import app.entities.Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance;

    static {
        try {
            instance = new Model();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Car> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() throws IOException {
        model = new ArrayList<>();
        model = Car.readFromFile();
        ArrayList<Transaction> model1 = new ArrayList<Transaction>();





    }

    public void add(Car car) throws IOException {
        model.add(car);



    }
    public List<String> list() {

        return model.stream()
                .map(Car::toString)
                .collect(Collectors.toList());
    }


}
