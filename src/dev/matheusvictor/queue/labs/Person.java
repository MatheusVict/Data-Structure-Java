package dev.matheusvictor.queue.labs;

public class Person implements Comparable<Person> {
    private String name;
    private int priority;

    public Person(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Person person) {
        if (this.priority > person.getPriority()) return 1;
        else if (priority < person.getPriority()) return -1;

        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
