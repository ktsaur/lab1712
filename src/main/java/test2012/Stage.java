package test2012;

public abstract class Stage {
    protected String name;
    protected Status status;

    public Stage(String name) {
        this.name = name;
        this.status = Status.Запланирован;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract void execute();//метод для вывода выполнения статуса
}


