public class Consumer extends Thread {

    @Override
    public void run(){
        while(true){
            if(Main.avalible && Main.products.size() == Main.product_size){
                while(Main.products.size() != 0){
                    Main.products.remove();
                    System.out.println("ürün tüketildi " + Main.products.size());
                    Main.content--;
                }
                System.out.println("ürün tükendi...");
                Main.avalible = true;
               
                try {
                     Thread.currentThread();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
              
                
            }
        }
    }

}
