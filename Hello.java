class Calculater {
    //Calculter calss blue print with which you can make instances (objects)
    public int add(int x, int y) {
        //add method
        return x + y;
    }

    public void mult(int x, int y) {
        System.out.println(x * y);
    }
}

class Hello
{
    public static void main(String a[])
    {
        int x = 6;
        int y = 7;
        //create instance of Calculater simply objects
        Calculater calc = new Calculater();
        // now object created in calc variable and we can use object method add also;
        int result = calc.add(x, y);
        System.out.println(result);
        calc.mult(4, 5);
        
    }
}