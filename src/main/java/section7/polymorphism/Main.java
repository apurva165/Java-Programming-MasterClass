package section7.polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}


class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Shark eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "aliens attempt to take over";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "maze runner";
    }
}

class StarWar extends Movie {
    public StarWar() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forget");
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i= 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Name of the movie  = : " + movie.getName());
            System.out.println("plot of the movie  = : " + movie.plot());
        }

    }

    private static Movie randomMovie(){
       int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println(randomNumber + " : randomNumber");
        switch (randomNumber){
            case 1 :
                return new Jaws();
            case 2 :
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWar();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
