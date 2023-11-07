package Programs;

 class SingletonClass {

     static SingletonClass singleton = null;

     private SingletonClass() {

     }


//    public SingletonClass getInstance(){
//        if(singleton==null){
//            singleton = new SingletonClass();
//        }
//        return singleton;
//    }

     public static SingletonClass getInstance() {
         if (singleton == null) {
             singleton = new SingletonClass();
         }
         return singleton;
     }

     public void doAction() {
         System.out.println("Doing something.....");
     }


 }
