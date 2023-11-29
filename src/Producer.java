public class Producer extends Thread{
    @Override 
    public void run(){
        while(true){
            if( Main.avalible && Main.products.isEmpty()){
                Main.avalible = false;
                    while(Main.product_size > Main.products.size()){
                            Main.products.add(Main.content);
                            System.out.println("ürün üretildi : " + Main.products.size());
                            Main.content++;
                    }
                System.out.println("Depo doldu...");
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