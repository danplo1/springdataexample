package pl.danplo.springdataexample;

import javax.persistence.*;

@Entity
@Table(name="MyCar")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mark;

    @Transient //nie zapisuje danego pola do bazy danych, pomija go
    private String model;

    @Enumerated(EnumType.STRING) //ORDINAL strategia domyślna, na podstawie kolejności w enumie zapisuje wartość do kolumny
    //STRING - dane zapisane jako string
    private Color color;


    public Car(String mark, String model, Color color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public Car() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}
