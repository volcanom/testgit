/**
 * Created by macan on 2017-11-6.
 */

import java.util.*;

 public class App{
        public String generateUniqueKey(){
            String id = UUID.randomUUID().toString();
            return id;
        }

       public static void main(String[] args ) {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }
}
