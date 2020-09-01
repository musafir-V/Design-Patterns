public class ChocolateBoiler {
    private boolean isEmpty;
    private boolean isBoiled;
    private static ChocolateBoiler uniqueInstance = null;

    private ChocolateBoiler() {
        this.isEmpty = true;
        this.isBoiled = false;
    }

    private ChocolateBoiler(boolean isBoiled, boolean isEmpty) {
        this.isBoiled = isBoiled;
        this.isEmpty = isEmpty;
    }

    public boolean getIsBoiled() {
        return this.isBoiled;
    }

    public boolean getIsEmpty() {
        return this.isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty=isEmpty;
    }

    public void setIsBoiled(boolean isBoiled) {
        this.isBoiled = isBoiled;
    } 

    public static ChocolateBoiler getInstance() {
        if(uniqueInstance == null) {
            // We can have locking mechanism to get locking done so that mulitple threads 
            // can't hinder the construction of single object
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public static ChocolateBoiler getInstance(boolean isBoiled, boolean isEmpty) {
        if(uniqueInstance == null) {
            // We can have locking mechanism to get locking done so that mulitple threads 
            // can't hinder the construction of single object
            uniqueInstance = new ChocolateBoiler(isBoiled, isEmpty);
        }
        return uniqueInstance;
    }

    public void fill() {
        if(this.isEmpty) {
            this.isEmpty = false;
            this.isBoiled = false;
        }
    }

    public void drain() {
        if(this.isBoiled && !this.isEmpty) {
            this.isBoiled = false;
            this.isEmpty = true;
        }
    }
}