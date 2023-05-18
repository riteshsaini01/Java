int n=num;
        int r=0, sum=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum + r*r*r;
            
            
        } 
        System.out.println(sum);
        System.out.println(sum==n);
        if(n==sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }