class Complex
{
    int real;
    int imag;
    Complex(int r,int img)
    {
        real =  r;
        imag = img;
       
    }
    Complex()
    {
        real = 0;
        imag = 0;
    }
    public Complex add(Complex c)
    {
        Complex res = new Complex();
        res.real = this.real + c.real;
        res.real = this.imag + c.imag;
        return res;
    }
    public Complex mul(Complex c)
    {
        Complex res = new Complex();
        res.real = this.real * c.real;
        res.real = this.imag * c.imag;
        return res;
    }
    public void display()
    {
        System.out.println(real+"+i"+imag);
    }
    public void display1()
    {
        System.out.println(real+"+i"+imag);
    }
}
public class  Main
{
    public static void main(String args[])
    {
        Complex c1 = new Complex(12,12);
        Complex c2 = new Complex(1,2);
        Complex c3 = new Complex();
            c3 = c1.add(c2);
            c3.display();
        Complex c4 = new Complex();
            c4 = c1.mul(c2);
            c4.display1();
       
       
    }
}
