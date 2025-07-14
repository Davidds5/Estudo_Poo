package application;

public class Task {
    private int id;
    private String title;
    private String description;
    private boolean completed;

    public Task(){}

    public Task(int id, String description, String title){
        this.id = id;
        this.description = description;
        this.title = title;
        this.completed = false;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public void marcaConcluido(){
        this.completed = true;
    }

    public String toString(){
        return String.format("Id: %d | Title: %s | Description %s | completed: %b ", id, title, description,
                (completed ? "Concluido" : "Pendente") );

    }
}
