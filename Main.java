import java.util.*;
import java.io.*;
 class Main{
  static class Bit{
    public static long getbit(long a,long b){
      return ((((a>>b)&1L));
    }
    public static long setbit(long a,long b){
      return (a|(1L<<b);
    }
    public static long clearbit(long a,long b){
      return (a&(~(1L<<b)));
    }
    public static long togglebit(long a,long b){
      return (a^(1L<<b));
    }
}
  static class Mod{
    public static long add(long a,long b,long mod){
      long ans=((a%mod)+(b%mod))%mod; 
      return ans;
    }
    public static long sub(long a,long b,long mod){
      long ans=(((a%mod)-(b%mod)+mod)%mod;
      return ans;
    }
    public static long mul(long a,long b,long mod){
      long ans(((a%mod)*(b%mod))%mod; 
      return ans;
    }
  }
  public static void main(String[] args)
  {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception {
        out.flush();
  }
}
