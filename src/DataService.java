public class DataService {
    private static DataService instance;
    public static DataService getInstance(){
        if(instance == null){
            instance = new DataService();
        }
        return instance;
    }

    private DataService(){
        /* Extraction du CSV */
    }
    
}
