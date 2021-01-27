//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Calculator;

import javax.swing.JTextField;

public class MVCModel {
    private calc calcDAO;

    public MVCModel(calc calcDAO) {
        this.calcDAO = calcDAO;
    }

    public void addOne(JTextField textField) {
        this.calcDAO.addOne(textField);
    }

    public void addTwo(JTextField textField) {
        this.calcDAO.addTwo(textField);
    }

    public void addThree(JTextField textField) {
        this.calcDAO.addThree(textField);
    }

    public void addFour(JTextField textField) {
        this.calcDAO.addFour(textField);
    }

    public void addFive(JTextField textField) {
        this.calcDAO.addFive(textField);
    }

    public void addSix(JTextField textField) {
        this.calcDAO.addSix(textField);
    }

    public void addSeven(JTextField textField) {
        this.calcDAO.addSeven(textField);
    }

    public void addEight(JTextField textField) {
        this.calcDAO.addEight(textField);
    }

    public void addNine(JTextField textField) {
        this.calcDAO.addNine(textField);
    }

    public void addZero(JTextField textField) {
        this.calcDAO.addZero(textField);
    }

    public void Remove(JTextField textField) {
        this.calcDAO.Remove(textField);
    }

    public void addPlus(JTextField textField) {
        this.calcDAO.addPlus(textField);
    }

    public void addMinus(JTextField textField) {
        this.calcDAO.addMinus(textField);
    }

    public void ClearALl(JTextField textField) {
        this.calcDAO.ClearAll(textField);
    }

    public void addDivide(JTextField textField) {
        this.calcDAO.addDivide(textField);
    }

    public void addMultiply(JTextField textField) {
        this.calcDAO.addmultiply(textField);
    }

    public void squared(JTextField textField) {
        this.calcDAO.squared(textField);
    }

    public void cubed(JTextField textField) {
        this.calcDAO.cubed(textField);
    }

    public void sqrt(JTextField textField) {
        this.calcDAO.squareRoot(textField);
    }

    public void cbrt(JTextField textField) {
        this.calcDAO.cubeRoot(textField);
    }

    public void addEqual(JTextField textField) {
        this.calcDAO.addEquals(textField);
    }

    public void addDot(JTextField textField) {
        this.calcDAO.addDot(textField);
    }

    public void quadratic() {
        this.calcDAO.quadratic();
    }
}
