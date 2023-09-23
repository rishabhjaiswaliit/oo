class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("some engine",5);
        Airplane a1 = new Airplane("boeing",engine,"old model");
        Airplane a2 = null;

        System.out.println(a1);
        try{
            a2 = a1.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}


class Airplane implements Cloneable{
    String company;
    Engine eng;
    String model;

    public Airplane(String company,Engine eng,String model){
        this.company = company;
        this.eng = eng;
        this.model = model;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setEngine(Engine eng){
        this.eng = eng;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String toString(){
        return "company"+this.company+"  engine"+this.eng+"  model"+this.model;
    }
    public Object clone1() throws CloneNotSupportedException {
        Engine engine_clone = (Engine)eng.clone();
        return new Airplane(company,engine_clone,model);
    }

    public Airplane clone2() throws CloneNotSupportedException {
        return new Airplane(company, eng.clone(), model);
    }

    public Airplane clone() throws CloneNotSupportedException {

        // WRONG: return new Airplane(company, eng, model); // this and clone will share eng
        // OK: return new Airplane(company, new Engine(eng.name, eng.numEngines), model);
        // OK: return new Airplane(company, eng.clone(), model); // assuming eng.clone is a proper clone
        // WRONG: return (Airplane)super.clone(); // shallow copy
        Airplane airplane = (Airplane)super.clone();
        airplane.setEngine(eng.clone()); // OR OK: airplane.setEngine(new Engine(eng.name, eng.numEngines));
        return airplane;
    }
}

class Engine implements Cloneable{
    String name;
    int numEngines;
    public Engine(String name,int numEngines){
        this.name = name;
        this.numEngines = numEngines;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setnumEngines(int numEngines){
        this.numEngines = numEngines;
    }
    public Object clone1() throws CloneNotSupportedException {
        return new Engine(name, numEngines);
    }
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
    public String toString(){
        return "engine name"+this.name+"  numengines"+this.numEngines;
    }
}

