public class App {


    static boolean iWillReview = true; 
    static boolean iwillNotFail = false;

    public static void main(String[] args) throws Exception {

        
        App myApp = new App();
      
        assert iWillReview == true: "I wil not babagsak";
     
        myApp.Study(); 

        assert iwillNotFail == true: "I will graduate";
   
    }

    void Study(){
        iwillNotFail = false; 
    }
}

