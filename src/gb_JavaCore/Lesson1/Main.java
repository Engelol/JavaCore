package gb_JavaCore.Lesson1;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {new Human("Tom"), new Cat("Loky"), new Wolf("Tor")};
        Obstacle[] obstacles = {new Cross(390), new Wall(2), new Water(2)};

        Team team = new Team("Winners", competitors);

        System.out.println("============created new team============");
        System.out.println(team.getTeamName());

        System.out.println("============greeting team members============");
        team.showResults();

        // new Course
        Course course = new Course(obstacles);

        System.out.println("============team goes to course============");
        course.doIt(team);

        System.out.println("============show team Results============");
        team.showResults();

        System.out.println("============team members finished course============");
        team.showMembersFinishedCourse();
    }
}