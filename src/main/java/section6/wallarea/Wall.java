package section6.wallarea;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        if (width < 0 && height < 0) {
            this.width = 0;
            this.height = 0;
            System.out.println("else if cond");
            System.out.println(this.width);
            System.out.println(this.height);
        }
        else if (width < 0) {
            System.out.println("only width < 0");
            this.width = 0;
            this.height = height;
        } else if (height < 0) {
            System.out.println("only height <0");
            this.height = 0;
            this.width = width;
        }   else {
            System.out.println("else Conditon");
            System.out.println("Const width " + width);
            System.out.println("Const height " + height);
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getArea() {
        return this.width * this.height;
    }
}
