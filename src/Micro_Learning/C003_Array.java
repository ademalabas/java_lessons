package Micro_Learning;

public class C003_Array {

    public static void main(String[] args) {
String strs []={"A","B"};
int index =0;
for (String s:strs) {
    strs[index].concat("element"+index);
    index++;
}
for (index=0; index<strs.length; index++){
    System.out.print(strs[index]);
}



    }

}
