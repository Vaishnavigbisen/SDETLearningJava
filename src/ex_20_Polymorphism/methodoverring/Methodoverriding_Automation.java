package ex_20_Polymorphism.methodoverring;

public class Methodoverriding_Automation {
    public static void main(String[] args){


    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting the IE browser.");
    }
}

class ChromeTC extends CommonToAll{
      @Override
    void openBrowser(){
          System.out.println("Starting Chrome, Better Browser!!");
      }
}

class FirefoxTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Firefox, Better Browser!!");
    }
}