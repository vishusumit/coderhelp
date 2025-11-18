class One{
   public static void main(String[]str){
      Scanner obj= new Scanner(System.in);
      int n=obj.nextInt();
      int sum=0;
      System.out.println("entre the natural numbers"); 
      for(int i= 1; i<=n;i++){
         sum=sum+i;
      }
   }
}