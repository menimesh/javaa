

//Make a class “Rectangle” with attributes length and breadth. The class contains methods computeArea() and displayArea().
//  Write a program with main() method that creates two objects of Rectangle class and find their areas and display area of 
// larger rectangle.
class Rectangle{
 int ans1;
 int ans;
    int computeArea(int l,int b)
    {
ans=l*b;

return ans;
  }
  int computeAreaa(int l,int b)
  {
      ans1=l*b;
      return ans1;
  }
}
class RectangleDemo{
public static void main(String[] args) {
    Rectangle ob=new Rectangle(); 
    Rectangle obb=new Rectangle();

   
    ob.computeArea(3, 4);
    obb.computeAreaa(7, 5);
    if(ob.ans>ob.ans1)

  System.out.println(ob.ans);
    else
    {
        System.out.println(ob.ans1);
    }}}
