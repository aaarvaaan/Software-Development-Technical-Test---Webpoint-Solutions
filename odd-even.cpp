#include<iostream>

using namespace std;

int main()
{
    int n=0, s=0;
    cout<<"enter the how many number you want to enter : ";
    cin>>n;
    int a[n];
    cout<<"enter the numbers : ";
    for(int i =0;i<n;i++)
    {
        cin>>a[i];

        if(a[i] % 2 ==0 )
            s+=1;
        else if (a[i] % 5 == 0)
            s+=5;
        else 
            s+=3;
    }
    cout<<endl<<s;
    return 0;
}
