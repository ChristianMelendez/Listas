
import java.util.ArrayList;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class Lista2 {
    
    
    public static void main (String []args){
    List <String> nombrelista= new ArrayList<>();
    int i;
    nombrelista.add("Hola");
    nombrelista.add("Como");
    nombrelista.add("Estas");
    nombrelista.add("?");
    nombrelista.add("Leo");
    for(i=0;i<nombrelista.size();i++){
        System.out.println(nombrelista.get(i));
    
    }
    nombrelista.remove(0);
    for(i=0;i<nombrelista.size();i++){
        System.out.println(nombrelista.get(i));
    
    }
    nombrelista.clear();
        System.out.println(nombrelista.size());
    }
}
