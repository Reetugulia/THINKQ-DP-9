package com.abstractassign;
abstract class Machine {
    
    void rotate() {
        System.out.println("Machine rotating.");
    }

  
    abstract void crush();
}
abstract class Mixer extends Machine {
  
    @Override
    void crush() {
        System.out.println("Mixer crushing.");
    }

    
    void blend() {
        System.out.println("Mixer blending.");
    }
}

class Juicer extends Machine {
  
    @Override
    void crush() {
        System.out.println("Juicer crushing.");
    }

   
    void filter() {
        System.out.println("Juicer filtering.");
    }
}
class Blender extends Mixer
{
    void crush() {
        System.out.println("blender crushing.");
    }
    void filter() {
        System.out.println("blender filtering.");
    }
    

}
public class AbsractMixer {
    public static void main(String[] args) {
      
        Juicer myJuicer = new Juicer();
        myJuicer.crush();
        myJuicer.rotate();
        myJuicer.filter();
        
        System.out.println();

        Machine machine = new Juicer();
        machine.crush();
        Blender b1=new Blender();
        b1.crush();
        b1.blend();
        Mixer mix=new Blender();
        mix.blend();
        mix.crush();
        
        
        
        
       //how we initialise it Mixer
        

       
      


      
        //if part left

}
}
