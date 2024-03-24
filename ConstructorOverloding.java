class computer{
    String monitor;
    String keybord;
    String mouse;
    String cpu;
    String ram;

    computer(String monitor,String keybord,String mouse,String cpu,String ram){
        this.monitor=monitor;
        this.keybord=keybord;
        this.mouse=mouse;
        this.cpu=cpu;
        this.ram=ram;
    }
    computer(String monitor,String keybord,String mouse,String cpu){
        this.monitor=monitor;
        this.keybord=keybord;
        this.mouse=mouse;
        this.cpu=cpu;
      
    }
    computer(String monitor,String keybord,String mouse){
        this.monitor=monitor;
        this.keybord=keybord;
        this.mouse=mouse;
       
    }
    computer(String monitor,String keybord){
        this.monitor=monitor;
        this.keybord=keybord;
       
    }
    computer(String monitor){
        this.monitor=monitor;
    
    }
    computer(){
       
    }
}
public class ConstructorOverloding {
    public static void main(String[] args) {
        computer pc=new computer("LG", "RPM EURO GAMES", "ZEBRONICS", "AMD RYZEN", "CORSIA");
        computer pc2=new computer("LG", "RPM EURO GAMES", "ZEBRONICS", "AMD RYZEN");
        computer pc3=new computer("LG", "RPM EURO GAMES", "ZEBRONICS");
       
        
        System.out.println(pc.monitor);
        System.out.println(pc.keybord);
        System.out.println(pc.mouse);
        System.out.println(pc.cpu);
        System.out.println(pc.ram);
        System.out.println();
        System.out.println(pc2.cpu);
        System.out.println(pc2.keybord);
        System.out.println(pc2.monitor);
        System.out.println(pc2.mouse);
        System.out.println(pc2.ram);
        System.out.println();
        System.out.println(pc3.cpu);
        System.out.println(pc3.keybord);
        System.out.println(pc2.monitor);
        System.out.println(pc3.mouse);
        System.out.println(pc3.ram);
        
    }
    
}
