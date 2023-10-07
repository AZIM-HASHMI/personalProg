#include<stdio.h>
int main(){
    int fno=0,sno=0,tno=0,pos,i;
    printf("Enter the last number\n ");
    scanf("%d",&pos);
    scanf("%d%d",&fno,&sno");
    while(i<=pos){
        tno = fno+sno;
        printf("%d",tno);
        fno = sno;
        sno = fno;
        i++ }
    return 0;
    }