package Calculator;

public class Main {
    public static void main(String[] args) {
        calc dao  = new calc();
        MVCView view = new MVCView();
        MVCModel model = new MVCModel(dao);
        MVControler controler = new MVControler(view,model);

        view.start();

    }
}