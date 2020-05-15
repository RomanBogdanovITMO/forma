import javax.persistence.*;

@Entity
@Table(name = "Duran")
public class CoefDuran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double duran;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getDuran() {
        return duran;
    }

    public void setDuran(double duran) {
        this.duran = duran;
    }

    @Override
    public String toString() {
        return "CoefDuran{" +
                "id=" + id +
                ", duran=" + duran +
                '}';
    }
}
