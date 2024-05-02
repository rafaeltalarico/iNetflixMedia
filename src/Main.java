public class Main {
    public static void main(String[] args){
        Movie movie = new Movie("Shrek Forever", 103, "Shrek Forever Movie Synopsis");
        FamilyClient familyClient = new FamilyClient("twopeople", "onepays");
        System.out.println("Sinopse do filme: " + movie.getSynopsis());
        System.out.println("Duração do filme: " + movie.getDurationInMinutes());
        System.out.println("Número de instâncias para a conta familiar: " + familyClient.getInstancesNumber());
        System.out.println("Senha: " + familyClient.getPassword());

    }

}
