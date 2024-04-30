#include<stdio.h>
int main(void){
  char ch;
  printf("Input characters:");
  ch=getchar();
  while (ch!='\n'){
    if(ch>='A'&&ch<='Z'){
        ch=ch-'A'+'a';
    }else if(ch>='a'&&ch<='z'){
        ch=ch-'a'+'A';
    }
    putchar(ch);
    ch=getchar();

  }
    return 0;

}