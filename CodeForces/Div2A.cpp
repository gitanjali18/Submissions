#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int a,b,c;int max=0;
	    cin>>a>>b>>c;
	    while(c>1&&b>0){
	        c-=2;
	        b-=1;
	        max+=3;
	    }
	    while(b>1&&a>0){
	        b-=2;
	        a-=1;
	        max+=3;
	    }
	    cout<<max<<endl;
	}
	return 0;
}
