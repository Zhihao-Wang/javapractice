//数字字符串是否可转为整数值
public class IsValid {
    public boolean isValid(char[] chas){
        if(chas[0]!='-'&&(chas[0]<'0'||chas[0]>'9')){
            return false;
        }
        if(chas[0]=='-'&&(chas.length==1||chas[1]=='0')){
            return false;
        }
        if(chas[0]=='0'&&chas.length>1){
            return false;
        }
        for(int i=1;i<chas.length;i++){
            if(chas[i]<'0'||chas[i]>'9'){
                return false;
            }
        }
        return true;
    }

}
