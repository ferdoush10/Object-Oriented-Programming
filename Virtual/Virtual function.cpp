#include <iostream>  
using namespace std;  
class A  
{  
   int x=5;  
    public:  
    void display()  
    {  
        std::cout << "Value of x is : " << x<<std::endl;  
    }  
};  
class B: public A  
{  
    int y = 10;  
    public:  
    void display()  
    {  
        std::cout << "Value of y is : " <<y<< std::endl;  
    }  
};  
int main()  
{  
    A *a;  
    B b;  
    a = &b;  
   a->display();  
    return 0;  
}  

Output:

Value of x is : 5

In the above example, * a is the base class pointer. The pointer can only access the base class members but not the members of the derived class.
 Although C++ permits the base pointer to point to any object derived from the base class, it cannot directly access the members of the derived class. 
Therefore, there is a need for virtual function which allows the base pointer to access the members of the derived class.

#include <iostream>    
{    
 public:    
 virtual void display()    
 {    
  cout << "Base class is invoked"<<endl;    
 }    
};    
class B:public A    
{    
 public:    
 void display()    
 {    
  cout << "Derived Class is invoked"<<endl;    
 }    
};    
int main()    
{    
 A* a;    //pointer of base class    
 B b;     //object of derived class    
 a = &b;    
 a->display();   //Late Binding occurs    
}    

Output:

Derived Class is invoked  
