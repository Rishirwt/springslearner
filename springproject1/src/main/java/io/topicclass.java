package io;

public class topicclass {

    private String id;
    private String name;
    private String description;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public topicclass() {

        this.id = id;
        this.name = name;
        this.description = description;
    }
    public topicclass(String id, String name, String description) {

        this.id = id;
        this.name = name;
        this.description = description;
    }


}
