package week7;

public class Poem {
    private String name;
    private Integer linesCount;

    public Poem(String name, Integer linesCount) {
        setName(name);
        setLinesCount(linesCount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLinesCount() {
        return linesCount;
    }

    public void setLinesCount(Integer linesCount) {
        this.linesCount = linesCount;
    }
}
