package ejemplo.streams.car;

public class Car {

    private Integer id;
    private String type;
    private String make;
    private String model;
    private Integer engineCapacity;

    public Car(Integer id, String type, String make,
               String model, Integer engineCapacity) {

        this.id = id;
        this.type = type;
        this.make = make;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return STR."id='\{id}', type='\{type}', make='\{make}', model='\{model}', engineCapacity='\{engineCapacity}'";
    }
}
