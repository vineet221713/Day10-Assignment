package Day10.Assigment.qustion1;

public class Demo {
    public Hotel provideFood(int amount){
            if(amount>1000){

                return new TajHotel();
            }else if(amount>200 && amount<1000){
                return new RoadSideHotel();
            }else{
                return null;
            }

    }

    public static void main(String[] args) {
        Demo d1=new Demo();
       Hotel hotel= d1.provideFood(400);
       if(hotel!=null){
           hotel.chickenBiryani();
           hotel.masalaDosa();
        if(hotel instanceof TajHotel){
            TajHotel taj  =(TajHotel)hotel;
            taj.welcomeDrink();
        }
       }
       else{
           System.out.println("ammount should be grater than 200");
       }
    }
}
