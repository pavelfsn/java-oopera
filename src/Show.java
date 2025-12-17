import java.util.ArrayList;

public class Show {

    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector() {
        System.out.println("Режиссёр: " + director.getName() + " " + director.getSurname());
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor actor) {
        for (Actor added : listOfActors) {
            boolean sameName = added.getName().equals(actor.getName());
            boolean sameSurname = added.getSurname().equals(actor.getSurname());
            boolean sameHeight = added.getHeight() == actor.getHeight();

            if (sameName && sameSurname && sameHeight) {
                System.out.println("Такой актёр уже добавлен: " + actor.getSurname());
                return;
            }
        }
        listOfActors.add(actor);
    }

    public void replaceActorBySurname(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден.");
    }
}
