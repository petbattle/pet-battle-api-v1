package app.petbattle;

import io.quarkus.mongodb.panache.ProjectionFor;

@ProjectionFor(Cat.class)
public class CatId {
    public Integer count;
    public Boolean vote;
}
