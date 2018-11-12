/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ksgomezp
 */
public class Interpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String romano = "III"; 
    Context context = new Context(romano);
    // Construimos el árbol 
   ArrayList<Expression> tree = new ArrayList<Expression>();          
   tree.add(new ThousandExpression());
   tree.add(new HundredExpression()); 
    tree.add(new TenExpression()); 
    tree.add(new OneExpression());
   // Lo interpretamos
    Iterator<Expression> it = tree.iterator(); 
    while(it.hasNext()){
      Expression exp = it.next(); 
      exp. interpret(context);
}

System.out.println(context.output);
}
    
}
