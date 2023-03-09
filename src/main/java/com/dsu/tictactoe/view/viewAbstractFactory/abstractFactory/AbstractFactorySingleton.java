package com.dsu.tictactoe.view.viewAbstractFactory.abstractFactory;

public class AbstractFactorySingleton{
    private static ViewsFactory view;


    private AbstractFactorySingleton(){

    }

    public static ViewsFactory getInstance(){
        if(view != null){
            return view;
        }
        return null;
    }

    public static void setView(int viewOption){
        switch (viewOption) {
            case 1:
                view = new Console1Factory();
                break;
            
            case 2:
                view = new Console2Factory();
                break;
        
            default:
                //Exception
                System.out.println("HUBO UN ERROR CREANDO LA FACTORY DE VISTAS");
                break;
        }
    }


    
}
