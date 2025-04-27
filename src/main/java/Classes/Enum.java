package Classes;

public enum Enum {

    // if youd ont assign any custom value to enum  default value  from 0 it will take lile for Monday-0 ,Tuesady-1
//    Monday,
//    Tuesday,
//    Wedenesday,
//    Thrusday,
//    Friday,
//    Saturday,
//    Sunday


    //Enum with custom value
    Monday(10,"1st Day of Work"),
    Tuesday(20,"2nd Day of Work"),
    Wednesday(30,"3rd Day of Work"),
    Thrusday(40,"4th Day of Work"),
    Friday(50,"5th Day of Work"),
    Saturday(60,"Weekend Holiday 1"),
    Sunday(70,"Weekend Holiday 1");




    private int val;

    private  String comment;

    Enum(int val,String comment){
        this.val=val;
        this.comment=comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }


}
