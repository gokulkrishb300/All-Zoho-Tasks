public class Parenthesis {
    public static void main(String[] args) {
        String str="2(3(abc)4(def))3(ghi)",str1="",str2="",str3="",str4="";
        int close=0,check=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==')'){
                close++;
            }
            if(str.charAt(i)=='('){
                close--;
            }
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                for(int j=i;str.charAt(j)!='(';j--){
                    str1=str.charAt(j)+str1;
                    i=j-1;
                }
                close--;
                check=1;
            }
            if(str.charAt(i)>='0'&&str.charAt(i)<='9' && close!=0){
                for(int j=0;j<str.charAt(i)-'0';j++){
                    str2=str1+str2;
                }
                str1="";
                check=0;
            }

            if(str.charAt(i)>='0'&&str.charAt(i)<='9' && close==0){
                    if(check==0){
                        for (int j = 0; j < str.charAt(i) - '0'; j++) {
                            str3 = str3 + str1;
                        }
                        str4=str4+str1;
                    }
                    else {
                        for (int j = 0; j < str.charAt(i) - '0'; j++) {
                            str3 = str3 + str2;
                        }
                        str4=str3+str4;
                    }

                    str3="";
            }

            }
        System.out.println(str4);
        }

    }

