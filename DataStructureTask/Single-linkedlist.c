
#include<stdio.h>
#include<stdlib.h>
struct node{
   int data;
   struct node *next;
};
void insertAtEnd();
void insertAtBegin();
void insertInBetween();
void DisplayList();
void DeleteNode();
struct node *head=NULL;

void insertAtEnd()
{
 struct node *newnode;
 newnode = (struct node*) malloc(sizeof(struct node));
 printf("Enter the data of the element to be inserted\n");
 scanf("%d", &newnode->data);
 newnode->next=NULL;
 if (head==NULL)
 {
  head=newnode;
 }
 else
 {
   struct node *temp;
   temp=head;
   while (temp->next!=NULL)
   {
    temp=temp->next;
   }
   temp->next=newnode;   
 }
 
}
void insertAtBegin()
{
  if(head==NULL)
  {
      insertAtEnd();
  }
  else
  {
     struct node *newnode;
     newnode = (struct node *) malloc(sizeof(struct node));
     printf("enter the data of the node\n");
     scanf("%d",&newnode->data);
     newnode->next=head;
     head=newnode;
  }
}
void insertInBetween()
{
    if(head==NULL)
    {
        printf("Sorry Try to create NodeList To Insert in Between!!  No data available to compare and insert\n");
    }
    else
    {
     struct node *newnode , *temp, *temp2;
     int nodedata;
     printf("Enter the node data after Which you want to Insert\n");
     scanf("%d",& nodedata);
     newnode = (struct node *) malloc(sizeof(struct node));
     printf("enter the data of the node\n");
     scanf("%d",&newnode->data);
     newnode->next=NULL;
     temp2=temp=head;
     while (temp->data!=nodedata)
     {  
         if(temp->next==NULL)
             break;
       temp2=temp=temp->next;
     }
     if(temp->next==NULL && temp->data!=nodedata)
     {
         printf("No Such data entered is found!!  Please give input Correctly\n");
     }
     if(temp->data == nodedata)
     {
        newnode->next= temp->next; 
        temp2->next=newnode;
     }
    }

}
void DisplayList()
  {
  if (head==NULL)
  {
    printf("No node to print in the list\n");
  }
  else{
    struct node *temp;
    temp=head;
    while(temp->next!=NULL)
    {
    printf("%d ",temp->data);
    temp=temp->next;
    }
    printf("%d",temp->data);
  }
}
 void DeleteNode()
 {
     if(head==NULL)
     {
         printf("Sorry!! No such data or node availabe to delete \n");
     }
     else
     {   struct node *temp,*temp2;
         int unwanted;
         printf("enter the node data you want to delete\n");
         scanf("%d",& unwanted);
         temp2=temp=head;
         while(temp->data!=unwanted)
         {   
             if(temp->next==NULL)
               break;
            temp2=temp=temp->next;
         }
         if(temp->data != unwanted && temp->next==NULL)
         {
             printf("Sorry!! No such data or node availabe to delete \n");
         }
         if(temp->data == unwanted)
         {
             temp2->next=temp->next;
               free(temp);
         }
   }
 
  
}
int main()
{ int ch=1;
  while(ch)
  {
    int choice ;
    printf("\n Enter your choice\n");
    scanf("%d", & choice);
    switch (choice)
    {
    case 1 :  insertAtEnd();
      break;
    case 2 : insertAtBegin(); 
      break;
    case 3 : insertInBetween();
      break;
    case 4 : DisplayList();
      break;
    case 5 : DeleteNode();
     break;
    case 6 : exit(0);
      break;
    default: printf("Invalid Input!! , Please input Valid choice\n");
    
    }
  }
return 0;
}