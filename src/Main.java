public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Петрова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Сергей", "Сидоров", Gender.MALE, 175);

        Director director1 = new Director("Олег", "Смирнов", Gender.MALE, 10);
        Director director2 = new Director("Мария", "Кузнецова", Gender.FEMALE, 7);

        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show regularShow = new Show("Ревизор", 120, director1);

        Opera opera = new Opera(
                "Травиата",
                160,
                director2,
                musicAuthor,
                "Либретто оперы: ...",
                40
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                140,
                director1,
                musicAuthor,
                "Либретто балета: ...",
                choreographer
        );

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // 6) Для каждого спектакля вывести список актёров
        System.out.println();
        System.out.println("Актёры спектакля \"Ревизор\":");
        regularShow.printActors();

        System.out.println();
        System.out.println("Актёры спектакля \"Травиата\":");
        opera.printActors();

        System.out.println();
        System.out.println("Актёры спектакля \"Лебединое озеро\":");
        ballet.printActors();

        System.out.println();
        System.out.println("Замена в \"Ревизоре\": Иванов -> Сидоров");
        regularShow.replaceActorBySurname("Иванов", actor3);

        System.out.println("Актёры спектакля \"Ревизор\" после замены:");
        regularShow.printActors();

        System.out.println();
        System.out.println("Пробуем заменить несуществующего актёра в \"Травиате\":");
        opera.replaceActorBySurname("Несуществующий", actor1);

        System.out.println();
        System.out.println("Либретто \"Травиата\":");
        opera.printLibretto();

        System.out.println();
        System.out.println("Либретто \"Лебединое озеро\":");
        ballet.printLibretto();
    }
}
