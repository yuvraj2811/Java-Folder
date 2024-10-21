

public class ResourceInitializer {

    static boolean connected;
    static boolean loadingFiles;
    static boolean configSetting;

    static {
        System.out.println("---------------------Initilizing your Data Base-----------------------");
        System.out.println("Loading.......");
        connected=true;
        loadingFiles=true;
        configSetting=true;
        System.out.println("Intilizing sucessfully.....");
        System.out.println();
    }
    static void  display(){
        System.out.println("Connected sucessfully - "+connected);
        System.out.println("Loading files sucessfully - "+loadingFiles);
        System.out.println("Configuration settiing sucessfully - "+configSetting);
    }

    public static void main(String[] args) {
        ResourceInitializer.display();
    }
}
