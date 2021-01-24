class ParkingSystem{
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1 && this.big > 0){
            big--;
            return true;
        }

        else if(carType == 2 && this.medium > 0){
            medium--;
            return true;
        }

        else if(carType == 3 && this.small > 0){
            small--;
            return true;
        }
        
        return false;
    }

    public static void main(String[] args){
        
    }
}