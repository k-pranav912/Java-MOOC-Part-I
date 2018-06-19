public class Reformatory {
    
    private int timesWeightMeasured;

    public int weight(Person person) {
        // return the weight of the person
        this.timesWeightMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.timesWeightMeasured;
    }

}
