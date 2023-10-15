#include<stdio.h>
#include<conio.h>
void main(){
    int i,j;
    int a[3][3] = {{1,2,3},{1,3,4},{2,4,5}};
    for(i=0;i<=2;i++){
        for(j=0;j<=2;j++){
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }
    return 0;   
    }