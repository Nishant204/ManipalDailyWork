#include<stdio.h>
#include<stdlib.h>
void Push();
void Pop();
void Display();

struct node
{
    int data;
    struct node *next;
};
struct node *top=NULL;

struct node* CreateNode()
{
    struct node * newnode;
    newnode= (struct node*)malloc(sizeof(struct node));
    printf("Enter the number to push into the stack\n");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    return newnode;
}
void Push()
{   
    if(top==NULL)
    {
        struct node *newnode = CreateNode();
        top= newnode;
    }
    else
    {
        struct node *newnode= CreateNode();
           newnode->next=top;
           top=newnode;
    }
}
void Pop()
{
    if(top==NULL)
    {
        printf("No data Available to POP");
    }
    else
    {
        struct node *temp;
        temp=top;
        if(top->next==NULL)
        {
            top=NULL;
            free(temp);
        }
        else
        {
            top=top->next;
            free(temp);
        }
        
    }
}
void Display()
{
  if(top==NULL)
  {
      printf("Sorry !!  No Data available to Display");
  }
  else
  {
      struct node *temp;
      temp=top;
      while(temp->next!=NULL)
      {
          printf("%d ",temp->data);
          temp=temp->next;
      }
       printf("%d  ",temp->data);
  }
}
int main()
{
    while(1)
    {
        int choice;
        printf("\nEnter your Choice Bellow\n ................\n");
        printf("1.Push Element\n");
        printf("2.Pop Element\n");
        printf("3.Display Element\n");
        printf("4.Exit stack operation\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: Push();
              break;
            case 2: Pop();
              break;
            case 3: Display();
              break;
            case 4: exit;
               break;
             default : printf("Sorry!! Invalid Input\n");
        }
    }
}