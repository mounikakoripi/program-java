import java.util.Random;
class PasswordGen{
  private static final String CHAR_LOWER="abcdefghijklmnopqrstuwxyz";
  private static final String CHAR_UPPER=CHAR_LOWER.toUpperCase();
  private static final String NUMBER="0123456789";
  private static final String SPECIAL_CHARACTERS="!@#$%^&*";
  private static final String PASSWORD_ALLOW_BASE=CHAR_LOWER+CHAR_UPPER+NUMBER+SPECIAL_CHARACTERS;
  private static final Random random =new Random();
  public static void main(String[] args){
    int length=10;
    System.out.println(generatePassword(length));
  }
      
    public static String generatePassword(int length){
      if(length<1){
        throw new IllegalArgumentException();
      }
    StringBuilder sb=new StringBuilder(length);
    for(int i=0;i<length;i++){
      int rndCharAt=random.nextInt(PASSWORD_ALLOW_BASE.length());
      char rndChar=PASSWORD_ALLOW_BASE.charAt(rndCharAt);
      sb.append(rndChar);
       }
    return sb.toString();
    }
}




