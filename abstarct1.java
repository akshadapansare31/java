abstract class shape
{
      abstract void cal_area();
      abstract void cal_volume();
}
class sphere extends shape
{
      float r;
      sphere(float r)
      {
            this.r=r;
      }
      void cal_area()
      {
            float a=4*3.14f*r*r;
            System.out.println("area of sphere="+a);
      }
      void cal_volume()
      {
            float v=4/3*3.14f*r*r*r;
            System.out.println("volume of sphere="+v);
      }
}
class cone extends shape
{
      float r,h;
      cone(float r,float h)
      {
            this.r=r;
            this.h=h;
      }
      void cal_area()
      {
            float a=3.14f*r*(r+(h*h+r*r));
            System.out.println("area of cone="+a);
      }
       void cal_volume()
      {
            float a=3.14f*r*r*h/3;
            System.out.println("area of cone="+a);
      }
}
class md
{
      public static void main(String arg[])
      {
            sphere ob=new sphere(7.5f);
            ob.cal_area();
            ob.cal_volume();
            cone ob1=new cone(7.2f,3.4f);
            ob1.cal_area();
            ob1.cal_volume();
      }
}