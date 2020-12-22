/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duncan
 */
interface Component
{
    void showPrice();
}

class Leaf implements Component{
int price;
String name;
    @Override
    public void showPrice() {
        
    }
    
}

class Composite implements Component
{

    @Override
    public void showPrice() {
   List <Component> components = new ArrayList<>();
   
    }
    
}