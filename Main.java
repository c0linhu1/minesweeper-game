public class Main implements Runnable {

    GUI gui = new GUI();    //gui object
    public static void main(String[] args) {
        new Thread(new Main()).start();  // when run  - new thread is started - create main method running run method 
    }

    @Override
    public void run() {
        while(true) {
            gui.repaint();   
            if(gui.resetter = true) {
                gui.checkVictoryStatus();
              //  System.out.println("Victory:"+  gui.victory + ", Deafeat:" + gui.defeat);
            }
        }
    }
}