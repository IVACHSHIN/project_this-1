public class MyClass {
    // Поля класса 
    double Re, Im;

    public double getIm() {
        return Im;
    }

    public double getRe() {
        return Re;
    }

    void set(double Re, double Im) {
        // Использование ссылки this:
        this.Re = Re;
        this.Im = Im;
        
            // Инструкция перехода на новую строку \n:
            System.out.println("Значения полей:\nRe = " + this.Re+" и Im = " + this.Im);
        }

    public void get() {
    }
}
