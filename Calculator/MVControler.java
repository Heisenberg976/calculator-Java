package Calculator;

import javax.swing.*;

public class MVControler implements FireListener {
    private MVCView view;
    private MVCModel model;

    MVControler(MVCView view, MVCModel model) {
        this.view = view;
        this.model = model;
        this.view.setListener(this);
    }


    @Override
    public void Fireone(JTextField textField) {
        model.addOne(textField);
    }

    @Override
    public void Firetwo(JTextField textField) {
        model.addTwo(textField);
    }

    @Override
    public void FireThree(JTextField textField) {
        model.addThree(textField);
    }

    @Override
    public void FireFour(JTextField textField) {
        model.addFour(textField);
    }

    @Override
    public void FireFive(JTextField textField) {
        model.addFive(textField);
    }

    @Override
    public void FireSix(JTextField textField) {
        model.addSix(textField);
    }

    @Override
    public void FireSeven(JTextField textField) {
        model.addSeven(textField);
    }


    @Override
    public void FireEight(JTextField textField) {
        model.addEight(textField);
    }

    @Override
    public void FireNine(JTextField textField) {
        model.addNine(textField);
    }

    @Override
    public void FireZero(JTextField textField) {
        model.addZero(textField);
    }

    @Override
    public void FireaddPlus(JTextField textField) {
        model.addPlus(textField);
    }

    @Override
    public void FireaddMinus(JTextField textField) {
        model.addMinus(textField);
    }

    @Override
    public void FireaddMuliply(JTextField textField) {
        model.addMultiply(textField);
    }

    @Override
    public void FireRemove(JTextField textField) {
        model.Remove(textField);
    }

    @Override
    public void FireaddDivide(JTextField textField) {
        model.addDivide(textField);
    }

    @Override
    public void FireClearAll(JTextField textField) {
        model.ClearALl(textField);
    }

    @Override
    public void FireCubed(JTextField textField) {
        model.cubed(textField);
    }

    @Override
    public void Firesqrt(JTextField textField) {
        model.sqrt(textField);
    }

    @Override
    public void Firecbrt(JTextField textField) {
        model.cbrt(textField);
    }

    @Override
    public void FireSquared(JTextField textField) {
        model.squared(textField);
    }


    @Override
    public void addEquals(JTextField textField) {
        model.addEqual(textField);
    }

    @Override
    public void addDot(JTextField textField) {
        model.addDot(textField);
    }

    @Override
    public void Firequadratic() {
        model.quadratic();
    }



}
