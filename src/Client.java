public abstract class Client {
    protected String username;
    protected String password;
    protected int instancesNumber;

    public Client(String username, String password, int instancesNumber){
        this.username = username;
        this.password = password;
        this.instancesNumber = instancesNumber;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public int getInstancesNumber(){
        return instancesNumber;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setInstancesNumber(int instancesNumber){
        this.instancesNumber = instancesNumber;
    }

    public abstract int grantInstances();
}
