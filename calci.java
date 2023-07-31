Interface Calci
{
public getsum(int n1,int n2);
}
 
class CalciImpl implements Calci
{
public int getsum(int n1,int n2)
{
return n1+n2;
}
}