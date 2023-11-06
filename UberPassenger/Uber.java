public class Uber <X, Y> {

    X x;
    Y y;

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Uber{" +
                "x=" + x +
                ", y=" + y +
                ", id='" + id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }

    private String id;

    private String status;

    public Uber(X x, Y y, String id, String status) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
